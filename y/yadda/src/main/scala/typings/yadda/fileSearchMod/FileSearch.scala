package typings.yadda.fileSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSearch extends js.Object {
  def each(fn: js.Function1[/* file */ String, Unit]): Unit = js.native
  def list(): js.Array[String] = js.native
}

object FileSearch {
  @scala.inline
  def apply(each: js.Function1[/* file */ String, Unit] => Unit, list: () => js.Array[String]): FileSearch = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each), list = js.Any.fromFunction0(list))
    __obj.asInstanceOf[FileSearch]
  }
  @scala.inline
  implicit class FileSearchOps[Self <: FileSearch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEach(value: js.Function1[/* file */ String, Unit] => Unit): Self = this.set("each", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: () => js.Array[String]): Self = this.set("list", js.Any.fromFunction0(value))
  }
  
}


package typings.yadda.fileSearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSearch extends js.Object {
  def each(fn: js.Function1[/* file */ String, Unit]): Unit
  def list(): js.Array[String]
}

object FileSearch {
  @scala.inline
  def apply(each: js.Function1[/* file */ String, Unit] => Unit, list: () => js.Array[String]): FileSearch = {
    val __obj = js.Dynamic.literal(each = js.Any.fromFunction1(each), list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[FileSearch]
  }
}


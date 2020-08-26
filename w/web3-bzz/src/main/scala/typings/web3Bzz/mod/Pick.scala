package typings.web3Bzz.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pick extends js.Object {
  def data(): js.Promise[_] = js.native
  def directory(): js.Promise[_] = js.native
  def file(): js.Promise[_] = js.native
}

object Pick {
  @scala.inline
  def apply(data: () => js.Promise[_], directory: () => js.Promise[_], file: () => js.Promise[_]): Pick = {
    val __obj = js.Dynamic.literal(data = js.Any.fromFunction0(data), directory = js.Any.fromFunction0(directory), file = js.Any.fromFunction0(file))
    __obj.asInstanceOf[Pick]
  }
  @scala.inline
  implicit class PickOps[Self <: Pick] (val x: Self) extends AnyVal {
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
    def setData(value: () => js.Promise[_]): Self = this.set("data", js.Any.fromFunction0(value))
    @scala.inline
    def setDirectory(value: () => js.Promise[_]): Self = this.set("directory", js.Any.fromFunction0(value))
    @scala.inline
    def setFile(value: () => js.Promise[_]): Self = this.set("file", js.Any.fromFunction0(value))
  }
  
}


package typings.tusJsClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSource extends js.Object {
  var size: Double = js.native
  def close(): Unit = js.native
  def slice(start: Double, end: Double): js.Promise[SliceResult] = js.native
}

object FileSource {
  @scala.inline
  def apply(close: () => Unit, size: Double, slice: (Double, Double) => js.Promise[SliceResult]): FileSource = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), size = size.asInstanceOf[js.Any], slice = js.Any.fromFunction2(slice))
    __obj.asInstanceOf[FileSource]
  }
  @scala.inline
  implicit class FileSourceOps[Self <: FileSource] (val x: Self) extends AnyVal {
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
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlice(value: (Double, Double) => js.Promise[SliceResult]): Self = this.set("slice", js.Any.fromFunction2(value))
  }
  
}


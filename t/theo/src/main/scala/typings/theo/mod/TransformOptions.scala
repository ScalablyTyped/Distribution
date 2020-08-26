package typings.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformOptions[T /* <: String */] extends js.Object {
  var data: js.UndefOr[String] = js.native
  var file: String = js.native
  var `type`: js.UndefOr[Transform | T] = js.native
}

object TransformOptions {
  @scala.inline
  def apply[/* <: java.lang.String */ T](file: String): TransformOptions[T] = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformOptions[T]]
  }
  @scala.inline
  implicit class TransformOptionsOps[Self <: TransformOptions[_], /* <: java.lang.String */ T] (val x: Self with TransformOptions[T]) extends AnyVal {
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
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setType(value: Transform | T): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}


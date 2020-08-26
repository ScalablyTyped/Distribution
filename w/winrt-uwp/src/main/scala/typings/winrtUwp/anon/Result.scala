package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Foundation.Numerics.Matrix4x4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /** If a correlation exists, this will be set to a 4x4 transform matrix that changes basis from the infrared frame source coordinate system to the target entity coordinate system. */ var result: Matrix4x4 = js.native
  /** True if a correlation exists, otherwise false. */ var returnValue: Boolean = js.native
}

object Result {
  @scala.inline
  def apply(result: Matrix4x4, returnValue: Boolean): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
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
    def setResult(value: Matrix4x4): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}


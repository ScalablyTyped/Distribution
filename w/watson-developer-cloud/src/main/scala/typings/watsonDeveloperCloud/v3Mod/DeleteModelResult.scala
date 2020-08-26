package typings.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*************************
  * model interfaces
  ************************/
/** DeleteModelResult. */
@js.native
trait DeleteModelResult extends js.Object {
  /** "OK" indicates that the model was successfully deleted. */
  var status: String = js.native
}

object DeleteModelResult {
  @scala.inline
  def apply(status: String): DeleteModelResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelResult]
  }
  @scala.inline
  implicit class DeleteModelResultOps[Self <: DeleteModelResult] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}


package typings.winrtUwp.Windows.Gaming.XboxLive.Storage

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait GameSaveBlobInfoGetResult extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: GameSaveErrorStatus = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var value: IVectorView[GameSaveBlobInfo] = js.native
}

object GameSaveBlobInfoGetResult {
  @scala.inline
  def apply(status: GameSaveErrorStatus, value: IVectorView[GameSaveBlobInfo]): GameSaveBlobInfoGetResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSaveBlobInfoGetResult]
  }
  @scala.inline
  implicit class GameSaveBlobInfoGetResultOps[Self <: GameSaveBlobInfoGetResult] (val x: Self) extends AnyVal {
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
    def setStatus(value: GameSaveErrorStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: IVectorView[GameSaveBlobInfo]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}


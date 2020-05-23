package typings.winrtUwp.Windows.Gaming.XboxLive.Storage

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
trait GameSaveContainerInfoGetResult extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: GameSaveErrorStatus
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var value: IVectorView[GameSaveContainerInfo]
}

object GameSaveContainerInfoGetResult {
  @scala.inline
  def apply(status: GameSaveErrorStatus, value: IVectorView[GameSaveContainerInfo]): GameSaveContainerInfoGetResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GameSaveContainerInfoGetResult]
  }
}


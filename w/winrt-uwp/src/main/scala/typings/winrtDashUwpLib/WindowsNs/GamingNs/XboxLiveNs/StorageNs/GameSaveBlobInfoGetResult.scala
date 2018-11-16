package typings
package winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveBlobInfoGetResult")
@js.native
abstract class GameSaveBlobInfoGetResult () extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: GameSaveErrorStatus = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var value: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[GameSaveBlobInfo] = js.native
}


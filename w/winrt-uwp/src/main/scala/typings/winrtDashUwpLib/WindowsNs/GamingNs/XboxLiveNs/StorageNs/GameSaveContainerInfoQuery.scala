package typings
package winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveContainerInfoQuery")
@js.native
abstract class GameSaveContainerInfoQuery () extends js.Object {
  /**
                       * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                       * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                       */
  def getContainerInfoAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[GameSaveContainerInfoGetResult] = js.native
  /**
                       * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                       * @param startIndex This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                       * @param maxNumberOfItems This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                       * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                       */
  def getContainerInfoAsync(startIndex: scala.Double, maxNumberOfItems: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[GameSaveContainerInfoGetResult] = js.native
  /**
                       * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                       * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
                       */
  def getItemCountAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Double] = js.native
}


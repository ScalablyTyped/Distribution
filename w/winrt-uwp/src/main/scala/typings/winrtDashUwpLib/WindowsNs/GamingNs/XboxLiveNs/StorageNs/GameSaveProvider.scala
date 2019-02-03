package typings
package winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveProvider")
@js.native
abstract class GameSaveProvider () extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var containersChangedSinceLastSync: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var user: winrtDashUwpLib.WindowsNs.SystemNs.User = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param name This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def createContainer(name: java.lang.String): GameSaveContainer = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def createContainerInfoQuery(): GameSaveContainerInfoQuery = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param containerNamePrefix This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def createContainerInfoQuery(containerNamePrefix: java.lang.String): GameSaveContainerInfoQuery = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param name This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def deleteContainerAsync(name: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[GameSaveOperationResult] = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getRemainingBytesInQuotaAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Double] = js.native
}

/* static members */
@JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveProvider")
@js.native
object GameSaveProvider extends js.Object {
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param user This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param serviceConfigId This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getForUserAsync(user: winrtDashUwpLib.WindowsNs.SystemNs.User, serviceConfigId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveProviderGetResult
  ] = js.native
  /**
    * This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param user This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @param serviceConfigId This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    * @return This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime.
    */
  def getSyncOnDemandForUserAsync(user: winrtDashUwpLib.WindowsNs.SystemNs.User, serviceConfigId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[
    winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveProviderGetResult
  ] = js.native
}


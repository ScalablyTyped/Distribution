package typings
package winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GameSaveErrorStatus extends js.Object

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@JSGlobal("Windows.Gaming.XboxLive.Storage.GameSaveErrorStatus")
@js.native
object GameSaveErrorStatus extends js.Object {
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait abort
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait blobNotFound
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait containerNotInSync
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait containerSyncFailed
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait invalidContainerName
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noAccess
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noXboxLiveInfo
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait objectExpired
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait ok
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait outOfLocalStorage
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait providedBufferTooSmall
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait quotaExceeded
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait updateTooBig
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait userCanceled
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait userHasNoXboxLiveInfo
    extends winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus
  
  val abort: abort with java.lang.String = js.native
  val blobNotFound: blobNotFound with java.lang.String = js.native
  val containerNotInSync: containerNotInSync with java.lang.String = js.native
  val containerSyncFailed: containerSyncFailed with java.lang.String = js.native
  val invalidContainerName: invalidContainerName with java.lang.String = js.native
  val noAccess: noAccess with java.lang.String = js.native
  val noXboxLiveInfo: noXboxLiveInfo with java.lang.String = js.native
  val objectExpired: objectExpired with java.lang.String = js.native
  val ok: ok with java.lang.String = js.native
  val outOfLocalStorage: outOfLocalStorage with java.lang.String = js.native
  val providedBufferTooSmall: providedBufferTooSmall with java.lang.String = js.native
  val quotaExceeded: quotaExceeded with java.lang.String = js.native
  val updateTooBig: updateTooBig with java.lang.String = js.native
  val userCanceled: userCanceled with java.lang.String = js.native
  val userHasNoXboxLiveInfo: userHasNoXboxLiveInfo with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus with java.lang.String
  ] = js.native
}


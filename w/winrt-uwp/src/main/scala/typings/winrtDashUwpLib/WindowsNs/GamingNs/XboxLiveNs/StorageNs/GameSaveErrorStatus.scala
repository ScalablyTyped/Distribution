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
  
  /* 1 */ val abort: abort with scala.Double = js.native
  /* 9 */ val blobNotFound: blobNotFound with scala.Double = js.native
  /* 11 */ val containerNotInSync: containerNotInSync with scala.Double = js.native
  /* 12 */ val containerSyncFailed: containerSyncFailed with scala.Double = js.native
  /* 2 */ val invalidContainerName: invalidContainerName with scala.Double = js.native
  /* 3 */ val noAccess: noAccess with scala.Double = js.native
  /* 10 */ val noXboxLiveInfo: noXboxLiveInfo with scala.Double = js.native
  /* 14 */ val objectExpired: objectExpired with scala.Double = js.native
  /* 0 */ val ok: ok with scala.Double = js.native
  /* 4 */ val outOfLocalStorage: outOfLocalStorage with scala.Double = js.native
  /* 8 */ val providedBufferTooSmall: providedBufferTooSmall with scala.Double = js.native
  /* 7 */ val quotaExceeded: quotaExceeded with scala.Double = js.native
  /* 6 */ val updateTooBig: updateTooBig with scala.Double = js.native
  /* 5 */ val userCanceled: userCanceled with scala.Double = js.native
  /* 13 */ val userHasNoXboxLiveInfo: userHasNoXboxLiveInfo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus with scala.Double
  ] = js.native
}


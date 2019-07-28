package typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs

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
  sealed trait abort extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait blobNotFound extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait containerNotInSync extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait containerSyncFailed extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait invalidContainerName extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noAccess extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait noXboxLiveInfo extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait objectExpired extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait ok extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait outOfLocalStorage extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait providedBufferTooSmall extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait quotaExceeded extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait updateTooBig extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait userCanceled extends GameSaveErrorStatus
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  @js.native
  sealed trait userHasNoXboxLiveInfo extends GameSaveErrorStatus
  
  /* 1 */ val abort: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.abort with Double = js.native
  /* 9 */ val blobNotFound: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.blobNotFound with Double = js.native
  /* 11 */ val containerNotInSync: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.containerNotInSync with Double = js.native
  /* 12 */ val containerSyncFailed: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.containerSyncFailed with Double = js.native
  /* 2 */ val invalidContainerName: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.invalidContainerName with Double = js.native
  /* 3 */ val noAccess: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.noAccess with Double = js.native
  /* 10 */ val noXboxLiveInfo: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.noXboxLiveInfo with Double = js.native
  /* 14 */ val objectExpired: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.objectExpired with Double = js.native
  /* 0 */ val ok: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.ok with Double = js.native
  /* 4 */ val outOfLocalStorage: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.outOfLocalStorage with Double = js.native
  /* 8 */ val providedBufferTooSmall: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.providedBufferTooSmall with Double = js.native
  /* 7 */ val quotaExceeded: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.quotaExceeded with Double = js.native
  /* 6 */ val updateTooBig: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.updateTooBig with Double = js.native
  /* 5 */ val userCanceled: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.userCanceled with Double = js.native
  /* 13 */ val userHasNoXboxLiveInfo: typings.winrtDashUwp.WindowsNs.GamingNs.XboxLiveNs.StorageNs.GameSaveErrorStatus.userHasNoXboxLiveInfo with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GameSaveErrorStatus with Double] = js.native
}


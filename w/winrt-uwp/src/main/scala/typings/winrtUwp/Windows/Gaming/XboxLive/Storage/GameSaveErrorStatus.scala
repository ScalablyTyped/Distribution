package typings.winrtUwp.Windows.Gaming.XboxLive.Storage

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GameSaveErrorStatus with Double] = js.native
  /* 1 */ @js.native
  object abort extends TopLevel[abort with Double]
  
  /* 9 */ @js.native
  object blobNotFound extends TopLevel[blobNotFound with Double]
  
  /* 11 */ @js.native
  object containerNotInSync extends TopLevel[containerNotInSync with Double]
  
  /* 12 */ @js.native
  object containerSyncFailed extends TopLevel[containerSyncFailed with Double]
  
  /* 2 */ @js.native
  object invalidContainerName extends TopLevel[invalidContainerName with Double]
  
  /* 3 */ @js.native
  object noAccess extends TopLevel[noAccess with Double]
  
  /* 10 */ @js.native
  object noXboxLiveInfo extends TopLevel[noXboxLiveInfo with Double]
  
  /* 14 */ @js.native
  object objectExpired extends TopLevel[objectExpired with Double]
  
  /* 0 */ @js.native
  object ok extends TopLevel[ok with Double]
  
  /* 4 */ @js.native
  object outOfLocalStorage extends TopLevel[outOfLocalStorage with Double]
  
  /* 8 */ @js.native
  object providedBufferTooSmall extends TopLevel[providedBufferTooSmall with Double]
  
  /* 7 */ @js.native
  object quotaExceeded extends TopLevel[quotaExceeded with Double]
  
  /* 6 */ @js.native
  object updateTooBig extends TopLevel[updateTooBig with Double]
  
  /* 5 */ @js.native
  object userCanceled extends TopLevel[userCanceled with Double]
  
  /* 13 */ @js.native
  object userHasNoXboxLiveInfo extends TopLevel[userHasNoXboxLiveInfo with Double]
  
}


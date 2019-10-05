package typings.winrtDashUwp.Windows.System.UserProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AccountPictureKind extends js.Object

/** Allows you to request a specific image type when using GetAccountPicture . */
@JSGlobal("Windows.System.UserProfile.AccountPictureKind")
@js.native
object AccountPictureKind extends js.Object {
  /** Indicates you want the large image for the user's account. */
  @js.native
  sealed trait largeImage extends AccountPictureKind
  
  /** Indicates you want the small image for the user's account. */
  @js.native
  sealed trait smallImage extends AccountPictureKind
  
  /** Indicates you want the video for the user's account. */
  @js.native
  sealed trait video extends AccountPictureKind
  
  /* 1 */ val largeImage: typings.winrtDashUwp.Windows.System.UserProfile.AccountPictureKind.largeImage with Double = js.native
  /* 0 */ val smallImage: typings.winrtDashUwp.Windows.System.UserProfile.AccountPictureKind.smallImage with Double = js.native
  /* 2 */ val video: typings.winrtDashUwp.Windows.System.UserProfile.AccountPictureKind.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccountPictureKind with Double] = js.native
}


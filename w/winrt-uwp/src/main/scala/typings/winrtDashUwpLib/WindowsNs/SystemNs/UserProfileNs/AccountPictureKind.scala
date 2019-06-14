package typings
package winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs

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
  sealed trait largeImage
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.AccountPictureKind
  
  /** Indicates you want the small image for the user's account. */
  @js.native
  sealed trait smallImage
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.AccountPictureKind
  
  /** Indicates you want the video for the user's account. */
  @js.native
  sealed trait video
    extends winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.AccountPictureKind
  
  /* 1 */ val largeImage: largeImage with scala.Double = js.native
  /* 0 */ val smallImage: smallImage with scala.Double = js.native
  /* 2 */ val video: video with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.AccountPictureKind with scala.Double
  ] = js.native
}


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
  
  val largeImage: largeImage with java.lang.String = js.native
  val smallImage: smallImage with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SystemNs.UserProfileNs.AccountPictureKind with java.lang.String
  ] = js.native
}


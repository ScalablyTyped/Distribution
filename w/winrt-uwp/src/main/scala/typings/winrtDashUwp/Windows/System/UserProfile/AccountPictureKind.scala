package typings.winrtDashUwp.Windows.System.UserProfile

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.System.UserProfile.AccountPictureKind.largeImage
import typings.winrtDashUwp.Windows.System.UserProfile.AccountPictureKind.smallImage
import typings.winrtDashUwp.Windows.System.UserProfile.AccountPictureKind.video
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccountPictureKind with Double] = js.native
  /* 1 */ @js.native
  object largeImage extends TopLevel[largeImage with Double]
  
  /* 0 */ @js.native
  object smallImage extends TopLevel[smallImage with Double]
  
  /* 2 */ @js.native
  object video extends TopLevel[video with Double]
  
}


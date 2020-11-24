package typings.winrtUwp.Windows.System.UserProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

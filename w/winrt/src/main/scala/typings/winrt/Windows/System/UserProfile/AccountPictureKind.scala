package typings.winrt.Windows.System.UserProfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AccountPictureKind extends js.Object

@JSGlobal("Windows.System.UserProfile.AccountPictureKind")
@js.native
object AccountPictureKind extends js.Object {
  @js.native
  sealed trait largeImage extends AccountPictureKind
  
  @js.native
  sealed trait smallImage extends AccountPictureKind
  
  @js.native
  sealed trait video extends AccountPictureKind
  
  /* 1 */ val largeImage: typings.winrt.Windows.System.UserProfile.AccountPictureKind.largeImage with Double = js.native
  /* 0 */ val smallImage: typings.winrt.Windows.System.UserProfile.AccountPictureKind.smallImage with Double = js.native
  /* 2 */ val video: typings.winrt.Windows.System.UserProfile.AccountPictureKind.video with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccountPictureKind with Double] = js.native
}


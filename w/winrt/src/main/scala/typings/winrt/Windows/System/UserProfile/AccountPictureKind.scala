package typings.winrt.Windows.System.UserProfile

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.System.UserProfile.AccountPictureKind.largeImage
import typings.winrt.Windows.System.UserProfile.AccountPictureKind.smallImage
import typings.winrt.Windows.System.UserProfile.AccountPictureKind.video
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AccountPictureKind with Double] = js.native
  /* 1 */ @js.native
  object largeImage extends TopLevel[largeImage with Double]
  
  /* 0 */ @js.native
  object smallImage extends TopLevel[smallImage with Double]
  
  /* 2 */ @js.native
  object video extends TopLevel[video with Double]
  
}


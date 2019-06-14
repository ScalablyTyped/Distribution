package typings
package winrtLib.WindowsNs.SystemNs.UserProfileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AccountPictureKind extends js.Object

@JSGlobal("Windows.System.UserProfile.AccountPictureKind")
@js.native
object AccountPictureKind extends js.Object {
  @js.native
  sealed trait largeImage
    extends winrtLib.WindowsNs.SystemNs.UserProfileNs.AccountPictureKind
  
  @js.native
  sealed trait smallImage
    extends winrtLib.WindowsNs.SystemNs.UserProfileNs.AccountPictureKind
  
  @js.native
  sealed trait video
    extends winrtLib.WindowsNs.SystemNs.UserProfileNs.AccountPictureKind
  
  /* 1 */ val largeImage: largeImage with scala.Double = js.native
  /* 0 */ val smallImage: smallImage with scala.Double = js.native
  /* 2 */ val video: video with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.SystemNs.UserProfileNs.AccountPictureKind with scala.Double] = js.native
}


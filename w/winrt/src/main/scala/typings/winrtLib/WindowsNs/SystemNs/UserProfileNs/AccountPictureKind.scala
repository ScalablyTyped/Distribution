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
  
  val largeImage: largeImage with java.lang.String = js.native
  val smallImage: smallImage with java.lang.String = js.native
  val video: video with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SystemNs.UserProfileNs.AccountPictureKind with java.lang.String
  ] = js.native
}


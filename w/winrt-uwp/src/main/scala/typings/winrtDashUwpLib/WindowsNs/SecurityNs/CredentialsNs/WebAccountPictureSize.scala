package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAccountPictureSize extends js.Object

/** Represents the sizes of a web account picture. */
@JSGlobal("Windows.Security.Credentials.WebAccountPictureSize")
@js.native
object WebAccountPictureSize extends js.Object {
  /** 1080x1080 */
  @js.native
  sealed trait size1080x1080
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountPictureSize
  
  /** 208x208 */
  @js.native
  sealed trait size208x208
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountPictureSize
  
  /** 424x424 */
  @js.native
  sealed trait size424x424
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountPictureSize
  
  /** 64x64 */
  @js.native
  sealed trait size64x64
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountPictureSize
  
  /* 3 */ val size1080x1080: size1080x1080 with scala.Double = js.native
  /* 1 */ val size208x208: size208x208 with scala.Double = js.native
  /* 2 */ val size424x424: size424x424 with scala.Double = js.native
  /* 0 */ val size64x64: size64x64 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountPictureSize with scala.Double
  ] = js.native
}


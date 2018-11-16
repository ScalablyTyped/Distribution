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
  
  val size1080x1080: size1080x1080 with java.lang.String = js.native
  val size208x208: size208x208 with java.lang.String = js.native
  val size424x424: size424x424 with java.lang.String = js.native
  val size64x64: size64x64 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.WebAccountPictureSize with java.lang.String
  ] = js.native
}


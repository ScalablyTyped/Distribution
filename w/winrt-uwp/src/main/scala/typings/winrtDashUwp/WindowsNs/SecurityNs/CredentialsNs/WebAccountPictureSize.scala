package typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs

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
  sealed trait size1080x1080 extends WebAccountPictureSize
  
  /** 208x208 */
  @js.native
  sealed trait size208x208 extends WebAccountPictureSize
  
  /** 424x424 */
  @js.native
  sealed trait size424x424 extends WebAccountPictureSize
  
  /** 64x64 */
  @js.native
  sealed trait size64x64 extends WebAccountPictureSize
  
  /* 3 */ val size1080x1080: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.WebAccountPictureSize.size1080x1080 with Double = js.native
  /* 1 */ val size208x208: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.WebAccountPictureSize.size208x208 with Double = js.native
  /* 2 */ val size424x424: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.WebAccountPictureSize.size424x424 with Double = js.native
  /* 0 */ val size64x64: typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.WebAccountPictureSize.size64x64 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAccountPictureSize with Double] = js.native
}


package typings.winrtUwp.Windows.Security.Credentials

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

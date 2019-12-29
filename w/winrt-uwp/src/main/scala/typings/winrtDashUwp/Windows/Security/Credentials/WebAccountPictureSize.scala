package typings.winrtDashUwp.Windows.Security.Credentials

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAccountPictureSize with Double] = js.native
  /* 3 */ @js.native
  object size1080x1080 extends TopLevel[size1080x1080 with Double]
  
  /* 1 */ @js.native
  object size208x208 extends TopLevel[size208x208 with Double]
  
  /* 2 */ @js.native
  object size424x424 extends TopLevel[size424x424 with Double]
  
  /* 0 */ @js.native
  object size64x64 extends TopLevel[size64x64 with Double]
  
}


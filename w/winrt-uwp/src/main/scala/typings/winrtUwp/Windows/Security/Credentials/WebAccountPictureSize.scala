package typings.winrtUwp.Windows.Security.Credentials

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WebAccountPictureSize extends StObject
/** Represents the sizes of a web account picture. */
@JSGlobal("Windows.Security.Credentials.WebAccountPictureSize")
@js.native
object WebAccountPictureSize extends StObject {
  
  /** 1080x1080 */
  @js.native
  sealed trait size1080x1080
    extends StObject
       with WebAccountPictureSize
  
  /** 208x208 */
  @js.native
  sealed trait size208x208
    extends StObject
       with WebAccountPictureSize
  
  /** 424x424 */
  @js.native
  sealed trait size424x424
    extends StObject
       with WebAccountPictureSize
  
  /** 64x64 */
  @js.native
  sealed trait size64x64
    extends StObject
       with WebAccountPictureSize
}

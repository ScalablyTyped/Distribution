package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NOGLASS3DNOTSUPPORTED extends StObject {
  
  /**
    * Glasses-free 3D is not supported
    * @since 2.3
    */
  var NO_GLASS_3D_NOT_SUPPORTED: `0` = js.native
  
  /**
    * @descEng Glasses-free 3D is supported
    * @since 2.3
    */
  var NO_GLASS_3D_SUPPORTED: `1` = js.native
}
object NOGLASS3DNOTSUPPORTED {
  
  @scala.inline
  def apply(NO_GLASS_3D_NOT_SUPPORTED: `0`, NO_GLASS_3D_SUPPORTED: `1`): NOGLASS3DNOTSUPPORTED = {
    val __obj = js.Dynamic.literal(NO_GLASS_3D_NOT_SUPPORTED = NO_GLASS_3D_NOT_SUPPORTED.asInstanceOf[js.Any], NO_GLASS_3D_SUPPORTED = NO_GLASS_3D_SUPPORTED.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOGLASS3DNOTSUPPORTED]
  }
  
  @scala.inline
  implicit class NOGLASS3DNOTSUPPORTEDMutableBuilder[Self <: NOGLASS3DNOTSUPPORTED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNO_GLASS_3D_NOT_SUPPORTED(value: `0`): Self = StObject.set(x, "NO_GLASS_3D_NOT_SUPPORTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_GLASS_3D_SUPPORTED(value: `1`): Self = StObject.set(x, "NO_GLASS_3D_SUPPORTED", value.asInstanceOf[js.Any])
  }
}

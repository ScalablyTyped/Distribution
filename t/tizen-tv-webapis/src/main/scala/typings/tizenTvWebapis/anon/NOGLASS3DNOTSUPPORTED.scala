package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisInts.`0`
import typings.tizenTvWebapis.tizenTvWebapisInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NOGLASS3DNOTSUPPORTED extends StObject {
  
  /**
    * Glasses-free 3D is not supported
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  var NO_GLASS_3D_NOT_SUPPORTED: `0`
  
  /**
    * Glasses-free 3D is supported
    *
    * @since 2.3
    *
    * @version 1.0
    *
    */
  var NO_GLASS_3D_SUPPORTED: `1`
}
object NOGLASS3DNOTSUPPORTED {
  
  inline def apply(): NOGLASS3DNOTSUPPORTED = {
    val __obj = js.Dynamic.literal(NO_GLASS_3D_NOT_SUPPORTED = 0, NO_GLASS_3D_SUPPORTED = 1)
    __obj.asInstanceOf[NOGLASS3DNOTSUPPORTED]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NOGLASS3DNOTSUPPORTED] (val x: Self) extends AnyVal {
    
    inline def setNO_GLASS_3D_NOT_SUPPORTED(value: `0`): Self = StObject.set(x, "NO_GLASS_3D_NOT_SUPPORTED", value.asInstanceOf[js.Any])
    
    inline def setNO_GLASS_3D_SUPPORTED(value: `1`): Self = StObject.set(x, "NO_GLASS_3D_SUPPORTED", value.asInstanceOf[js.Any])
  }
}

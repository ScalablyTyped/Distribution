package typings.three.anon

import typings.three.srcConstantsMod.TOUCH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  ONE :three.three/src/Three.TOUCH,   TWO :three.three/src/Three.TOUCH}> */
trait PartialONETOUCHTWOTOUCH extends StObject {
  
  var ONE: js.UndefOr[TOUCH] = js.undefined
  
  var TWO: js.UndefOr[TOUCH] = js.undefined
}
object PartialONETOUCHTWOTOUCH {
  
  inline def apply(): PartialONETOUCHTWOTOUCH = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialONETOUCHTWOTOUCH]
  }
  
  extension [Self <: PartialONETOUCHTWOTOUCH](x: Self) {
    
    inline def setONE(value: TOUCH): Self = StObject.set(x, "ONE", value.asInstanceOf[js.Any])
    
    inline def setONEUndefined: Self = StObject.set(x, "ONE", js.undefined)
    
    inline def setTWO(value: TOUCH): Self = StObject.set(x, "TWO", value.asInstanceOf[js.Any])
    
    inline def setTWOUndefined: Self = StObject.set(x, "TWO", js.undefined)
  }
}

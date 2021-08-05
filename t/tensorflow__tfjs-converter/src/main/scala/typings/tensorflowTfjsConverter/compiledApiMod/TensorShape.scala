package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TensorShape {
  
  /** Properties of a Dim. */
  trait IDim extends StObject {
    
    /** Dim name */
    var name: js.UndefOr[String | Null] = js.undefined
    
    /** Dim size */
    var size: js.UndefOr[Double | String | Null] = js.undefined
  }
  object IDim {
    
    inline def apply(): IDim = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDim]
    }
    
    extension [Self <: IDim](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameNull: Self = StObject.set(x, "name", null)
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeNull: Self = StObject.set(x, "size", null)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}

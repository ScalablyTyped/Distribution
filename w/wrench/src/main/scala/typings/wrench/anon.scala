package typings.wrench

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Preserve extends StObject {
    
    var preserve: js.UndefOr[Boolean] = js.undefined
  }
  object Preserve {
    
    inline def apply(): Preserve = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Preserve]
    }
    
    extension [Self <: Preserve](x: Self) {
      
      inline def setPreserve(value: Boolean): Self = StObject.set(x, "preserve", value.asInstanceOf[js.Any])
      
      inline def setPreserveUndefined: Self = StObject.set(x, "preserve", js.undefined)
    }
  }
}

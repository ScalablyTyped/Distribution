package typings.ungapStructuredClone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Lossy extends StObject {
    
    var lossy: js.UndefOr[Boolean] = js.undefined
  }
  object Lossy {
    
    inline def apply(): Lossy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Lossy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lossy] (val x: Self) extends AnyVal {
      
      inline def setLossy(value: Boolean): Self = StObject.set(x, "lossy", value.asInstanceOf[js.Any])
      
      inline def setLossyUndefined: Self = StObject.set(x, "lossy", js.undefined)
    }
  }
}

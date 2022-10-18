package typings.webicon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconSizeableMod {
  
  trait Sizeable extends StObject {
    
    /**
      * The default size of the icon.
      */
    var iconSize: js.UndefOr[Double] = js.undefined
  }
  object Sizeable {
    
    inline def apply(): Sizeable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sizeable]
    }
    
    extension [Self <: Sizeable](x: Self) {
      
      inline def setIconSize(value: Double): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      inline def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
    }
  }
}

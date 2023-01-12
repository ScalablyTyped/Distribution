package typings.styleValueTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictx
    extends StObject
       with /* x */ StringDictionary[Double] {
    
    var alpha: Double
  }
  object Dictx {
    
    inline def apply(alpha: Double): Dictx = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictx]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictx] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    }
  }
}

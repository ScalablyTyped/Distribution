package typings.useColorScheme

import typings.useColorScheme.mod.Preference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Scheme extends StObject {
    
    var scheme: Preference
  }
  object Scheme {
    
    inline def apply(scheme: Preference): Scheme = {
      val __obj = js.Dynamic.literal(scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scheme]
    }
    
    extension [Self <: Scheme](x: Self) {
      
      inline def setScheme(value: Preference): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
}

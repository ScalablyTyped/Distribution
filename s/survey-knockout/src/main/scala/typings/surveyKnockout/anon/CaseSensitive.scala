package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaseSensitive extends StObject {
  
  var caseSensitive: Boolean
  
  var trimStrings: Boolean
}
object CaseSensitive {
  
  inline def apply(caseSensitive: Boolean, trimStrings: Boolean): CaseSensitive = {
    val __obj = js.Dynamic.literal(caseSensitive = caseSensitive.asInstanceOf[js.Any], trimStrings = trimStrings.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaseSensitive]
  }
  
  extension [Self <: CaseSensitive](x: Self) {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setTrimStrings(value: Boolean): Self = StObject.set(x, "trimStrings", value.asInstanceOf[js.Any])
  }
}

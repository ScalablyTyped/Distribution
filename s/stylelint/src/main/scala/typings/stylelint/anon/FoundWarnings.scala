package typings.stylelint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoundWarnings extends StObject {
  
  var foundWarnings: Double
  
  var maxWarnings: Double
}
object FoundWarnings {
  
  inline def apply(foundWarnings: Double, maxWarnings: Double): FoundWarnings = {
    val __obj = js.Dynamic.literal(foundWarnings = foundWarnings.asInstanceOf[js.Any], maxWarnings = maxWarnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoundWarnings]
  }
  
  extension [Self <: FoundWarnings](x: Self) {
    
    inline def setFoundWarnings(value: Double): Self = StObject.set(x, "foundWarnings", value.asInstanceOf[js.Any])
    
    inline def setMaxWarnings(value: Double): Self = StObject.set(x, "maxWarnings", value.asInstanceOf[js.Any])
  }
}

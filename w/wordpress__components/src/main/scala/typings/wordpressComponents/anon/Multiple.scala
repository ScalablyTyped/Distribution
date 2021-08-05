package typings.wordpressComponents.anon

import typings.wordpressComponents.wordpressComponentsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Multiple extends StObject {
  
  var multiple: `true`
}
object Multiple {
  
  inline def apply(): Multiple = {
    val __obj = js.Dynamic.literal(multiple = true)
    __obj.asInstanceOf[Multiple]
  }
  
  extension [Self <: Multiple](x: Self) {
    
    inline def setMultiple(value: `true`): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
  }
}

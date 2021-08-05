package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsString extends StObject {
  
  var options: String
}
object OptionsString {
  
  inline def apply(options: String): OptionsString = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsString]
  }
  
  extension [Self <: OptionsString](x: Self) {
    
    inline def setOptions(value: String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}

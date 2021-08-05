package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsObject extends StObject {
  
  var options: js.Object
}
object OptionsObject {
  
  inline def apply(options: js.Object): OptionsObject = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsObject]
  }
  
  extension [Self <: OptionsObject](x: Self) {
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}

package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsNumber extends StObject {
  
  var options: Double
}
object OptionsNumber {
  
  inline def apply(options: Double): OptionsNumber = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsNumber] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: Double): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}

package typings.vueI18n.anon

import typings.std.NumberConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validator extends StObject {
  
  var `type`: js.Array[StringConstructor | NumberConstructor]
  
  def validator(`val`: Any): Boolean
}
object Validator {
  
  inline def apply(`type`: js.Array[StringConstructor | NumberConstructor], validator: Any => Boolean): Validator = {
    val __obj = js.Dynamic.literal(validator = js.Any.fromFunction1(validator))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Validator] (val x: Self) extends AnyVal {
    
    inline def setType(value: js.Array[StringConstructor | NumberConstructor]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: (StringConstructor | NumberConstructor)*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setValidator(value: Any => Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
  }
}

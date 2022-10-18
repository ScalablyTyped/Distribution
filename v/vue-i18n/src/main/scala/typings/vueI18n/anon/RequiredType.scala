package typings.vueI18n.anon

import typings.std.NumberConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequiredType extends StObject {
  
  var required: Boolean
  
  /* standard es5 */
  def `type`(): Double
  def `type`(value: Any): Double
  @JSName("type")
  var type_Original: NumberConstructor
}
object RequiredType {
  
  inline def apply(required: Boolean, `type`: NumberConstructor): RequiredType = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredType]
  }
  
  extension [Self <: RequiredType](x: Self) {
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: NumberConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

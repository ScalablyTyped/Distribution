package typings.vueI18n.anon

import typings.std.StringConstructor
import typings.vueI18n.vueI18nStrings.global
import typings.vueI18n.vueI18nStrings.parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: parent | global
  
  /* standard es5 */
  def `type`(): String
  def `type`(value: Any): String
  @JSName("type")
  var type_Original: StringConstructor
  
  def validator(`val`: parent | global): Boolean
}
object Default {
  
  inline def apply(default: parent | global, `type`: StringConstructor, validator: parent | global => Boolean): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], validator = js.Any.fromFunction1(validator))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    inline def setDefault(value: parent | global): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setType(value: StringConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidator(value: parent | global => Boolean): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
  }
}

package typings.vueI18n.anon

import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeStringConstructor extends StObject {
  
  /* standard es5 */
  def `type`(): String
  def `type`(value: Any): String
  @JSName("type")
  var type_Original: StringConstructor
}
object TypeStringConstructor {
  
  inline def apply(`type`: StringConstructor): TypeStringConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeStringConstructor]
  }
  
  extension [Self <: TypeStringConstructor](x: Self) {
    
    inline def setType(value: StringConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

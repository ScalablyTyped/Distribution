package typings.vueRuntimeCore.anon

import typings.std.DateConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeDateConstructor extends StObject {
  
  /* standard es5 */
  def `type`(): String
  @JSName("type")
  var type_Original: DateConstructor
}
object TypeDateConstructor {
  
  inline def apply(`type`: DateConstructor): TypeDateConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeDateConstructor]
  }
  
  extension [Self <: TypeDateConstructor](x: Self) {
    
    inline def setType(value: DateConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

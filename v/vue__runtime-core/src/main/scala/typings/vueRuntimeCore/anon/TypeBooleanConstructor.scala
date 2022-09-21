package typings.vueRuntimeCore.anon

import typings.std.BooleanConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeBooleanConstructor extends StObject {
  
  /* standard es5 */
  def `type`[T](): Boolean
  def `type`[T](value: T): Boolean
  @JSName("type")
  var type_Original: BooleanConstructor
}
object TypeBooleanConstructor {
  
  inline def apply(`type`: BooleanConstructor): TypeBooleanConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeBooleanConstructor]
  }
  
  extension [Self <: TypeBooleanConstructor](x: Self) {
    
    inline def setType(value: BooleanConstructor): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.vueTestUtils.anon

import typings.std.ObjectConstructor
import typings.std.StringConstructor
import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var required: `true`
  
  var `type`: js.Array[ObjectConstructor | StringConstructor]
}
object Required {
  
  inline def apply(`type`: js.Array[ObjectConstructor | StringConstructor]): Required = {
    val __obj = js.Dynamic.literal(required = true)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Required] (val x: Self) extends AnyVal {
    
    inline def setRequired(value: `true`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Array[ObjectConstructor | StringConstructor]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: (ObjectConstructor | StringConstructor)*): Self = StObject.set(x, "type", js.Array(value*))
  }
}

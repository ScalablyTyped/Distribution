package typings.vueTestUtils.anon

import typings.std.ObjectConstructor
import typings.std.StringConstructor
import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var required: `true`
  
  var `type`: js.Array[StringConstructor | ObjectConstructor]
}
object Required {
  
  inline def apply(`type`: js.Array[StringConstructor | ObjectConstructor]): Required = {
    val __obj = js.Dynamic.literal(required = true)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
  
  extension [Self <: Required](x: Self) {
    
    inline def setRequired(value: `true`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Array[StringConstructor | ObjectConstructor]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: (StringConstructor | ObjectConstructor)*): Self = StObject.set(x, "type", js.Array(value*))
  }
}

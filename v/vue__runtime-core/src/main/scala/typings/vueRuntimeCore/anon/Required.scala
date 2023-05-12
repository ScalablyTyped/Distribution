package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var required: `true`
}
object Required {
  
  inline def apply(): Required = {
    val __obj = js.Dynamic.literal(required = true)
    __obj.asInstanceOf[Required]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Required] (val x: Self) extends AnyVal {
    
    inline def setRequired(value: `true`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}

package typings.yargs.anon

import typings.yargs.yargsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Required extends StObject {
  
  var required: java.lang.String | `true`
}
object Required {
  
  inline def apply(required: java.lang.String | `true`): Required = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
  
  extension [Self <: Required](x: Self) {
    
    inline def setRequired(value: java.lang.String | `true`): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
  }
}

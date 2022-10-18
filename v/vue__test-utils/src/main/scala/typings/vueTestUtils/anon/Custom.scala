package typings.vueTestUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Custom extends StObject {
  
  var custom: Default
  
  var to: Required
}
object Custom {
  
  inline def apply(custom: Default, to: Required): Custom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
  
  extension [Self <: Custom](x: Self) {
    
    inline def setCustom(value: Default): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setTo(value: Required): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}

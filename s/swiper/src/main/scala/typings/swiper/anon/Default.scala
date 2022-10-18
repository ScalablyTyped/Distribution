package typings.swiper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: Data
}
object Default {
  
  inline def apply(default: Data): Default = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  extension [Self <: Default](x: Self) {
    
    inline def setDefault(value: Data): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}

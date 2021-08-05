package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsEsSpecCompliant extends StObject {
  
  var options: EsSpecCompliant
}
object OptionsEsSpecCompliant {
  
  inline def apply(options: EsSpecCompliant): OptionsEsSpecCompliant = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsEsSpecCompliant]
  }
  
  extension [Self <: OptionsEsSpecCompliant](x: Self) {
    
    inline def setOptions(value: EsSpecCompliant): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}

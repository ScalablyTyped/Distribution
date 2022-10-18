package typings.vegaLite.buildSrcDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeneratorBase extends StObject {
  
  /**
    * Provide a placeholder name and bind data at runtime.
    */
  var name: js.UndefOr[String] = js.undefined
}
object GeneratorBase {
  
  inline def apply(): GeneratorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeneratorBase]
  }
  
  extension [Self <: GeneratorBase](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}

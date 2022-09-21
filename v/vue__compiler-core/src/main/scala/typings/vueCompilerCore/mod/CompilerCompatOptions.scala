package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilerCompatOptions extends StObject {
  
  var compatConfig: js.UndefOr[CompilerCompatConfig] = js.undefined
}
object CompilerCompatOptions {
  
  inline def apply(): CompilerCompatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompilerCompatOptions]
  }
  
  extension [Self <: CompilerCompatOptions](x: Self) {
    
    inline def setCompatConfig(value: CompilerCompatConfig): Self = StObject.set(x, "compatConfig", value.asInstanceOf[js.Any])
    
    inline def setCompatConfigUndefined: Self = StObject.set(x, "compatConfig", js.undefined)
  }
}

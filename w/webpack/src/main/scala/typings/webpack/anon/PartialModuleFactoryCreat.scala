package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<webpack.webpack.ModuleFactoryCreateDataContextInfo> */
trait PartialModuleFactoryCreat extends StObject {
  
  var compiler: js.UndefOr[String] = js.undefined
  
  var issuer: js.UndefOr[String] = js.undefined
  
  var issuerLayer: js.UndefOr[Null | String] = js.undefined
}
object PartialModuleFactoryCreat {
  
  inline def apply(): PartialModuleFactoryCreat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModuleFactoryCreat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialModuleFactoryCreat] (val x: Self) extends AnyVal {
    
    inline def setCompiler(value: String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerLayer(value: String): Self = StObject.set(x, "issuerLayer", value.asInstanceOf[js.Any])
    
    inline def setIssuerLayerNull: Self = StObject.set(x, "issuerLayer", null)
    
    inline def setIssuerLayerUndefined: Self = StObject.set(x, "issuerLayer", js.undefined)
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
  }
}

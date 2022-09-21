package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleFactoryCreateDataContextInfo extends StObject {
  
  var compiler: String
  
  var issuer: String
  
  var issuerLayer: js.UndefOr[Null | String] = js.undefined
}
object ModuleFactoryCreateDataContextInfo {
  
  inline def apply(compiler: String, issuer: String): ModuleFactoryCreateDataContextInfo = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleFactoryCreateDataContextInfo]
  }
  
  extension [Self <: ModuleFactoryCreateDataContextInfo](x: Self) {
    
    inline def setCompiler(value: String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerLayer(value: String): Self = StObject.set(x, "issuerLayer", value.asInstanceOf[js.Any])
    
    inline def setIssuerLayerNull: Self = StObject.set(x, "issuerLayer", null)
    
    inline def setIssuerLayerUndefined: Self = StObject.set(x, "issuerLayer", js.undefined)
  }
}

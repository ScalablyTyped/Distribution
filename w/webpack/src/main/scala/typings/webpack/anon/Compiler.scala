package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compiler extends StObject {
  
  var compiler: String
  
  var issuer: String
  
  var realResource: String
  
  var resource: String
  
  var resourceQuery: String
}
object Compiler {
  
  inline def apply(compiler: String, issuer: String, realResource: String, resource: String, resourceQuery: String): Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], realResource = realResource.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceQuery = resourceQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compiler]
  }
  
  extension [Self <: Compiler](x: Self) {
    
    inline def setCompiler(value: String): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setRealResource(value: String): Self = StObject.set(x, "realResource", value.asInstanceOf[js.Any])
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceQuery(value: String): Self = StObject.set(x, "resourceQuery", value.asInstanceOf[js.Any])
  }
}

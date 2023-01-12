package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilationParams extends StObject {
  
  var contextModuleFactory: ContextModuleFactory
  
  var normalModuleFactory: NormalModuleFactory
}
object CompilationParams {
  
  inline def apply(contextModuleFactory: ContextModuleFactory, normalModuleFactory: NormalModuleFactory): CompilationParams = {
    val __obj = js.Dynamic.literal(contextModuleFactory = contextModuleFactory.asInstanceOf[js.Any], normalModuleFactory = normalModuleFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompilationParams] (val x: Self) extends AnyVal {
    
    inline def setContextModuleFactory(value: ContextModuleFactory): Self = StObject.set(x, "contextModuleFactory", value.asInstanceOf[js.Any])
    
    inline def setNormalModuleFactory(value: NormalModuleFactory): Self = StObject.set(x, "normalModuleFactory", value.asInstanceOf[js.Any])
  }
}

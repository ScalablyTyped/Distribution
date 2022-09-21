package typings.webpack.anon

import typings.webpack.mod.NormalModuleFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextModuleFactory extends StObject {
  
  var contextModuleFactory: typings.webpack.mod.ContextModuleFactory
  
  var normalModuleFactory: NormalModuleFactory
}
object ContextModuleFactory {
  
  inline def apply(
    contextModuleFactory: typings.webpack.mod.ContextModuleFactory,
    normalModuleFactory: NormalModuleFactory
  ): ContextModuleFactory = {
    val __obj = js.Dynamic.literal(contextModuleFactory = contextModuleFactory.asInstanceOf[js.Any], normalModuleFactory = normalModuleFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextModuleFactory]
  }
  
  extension [Self <: ContextModuleFactory](x: Self) {
    
    inline def setContextModuleFactory(value: typings.webpack.mod.ContextModuleFactory): Self = StObject.set(x, "contextModuleFactory", value.asInstanceOf[js.Any])
    
    inline def setNormalModuleFactory(value: NormalModuleFactory): Self = StObject.set(x, "normalModuleFactory", value.asInstanceOf[js.Any])
  }
}

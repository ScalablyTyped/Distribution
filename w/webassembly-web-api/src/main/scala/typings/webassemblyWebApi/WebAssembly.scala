package typings.webassemblyWebApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  // tslint:disable-next-line no-empty-interface
  trait Instance extends StObject
  
  /// Other WebAssembly declarations, for compatibility with older versions of Typescript
  // tslint:disable-next-line no-empty-interface
  trait Module extends StObject
  
  trait ResultObject extends StObject {
    
    var instance: Instance
    
    var module: Module
  }
  object ResultObject {
    
    inline def apply(instance: Instance, module: Module): ResultObject = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultObject]
    }
    
    extension [Self <: ResultObject](x: Self) {
      
      inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
}

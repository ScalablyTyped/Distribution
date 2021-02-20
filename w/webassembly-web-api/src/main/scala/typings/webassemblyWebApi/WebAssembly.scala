package typings.webassemblyWebApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  // tslint:disable-next-line no-empty-interface
  @js.native
  trait Instance extends StObject
  
  /// Other WebAssembly declarations, for compatibility with older versions of Typescript
  // tslint:disable-next-line no-empty-interface
  @js.native
  trait Module extends StObject
  
  @js.native
  trait ResultObject extends StObject {
    
    var instance: Instance = js.native
    
    var module: Module = js.native
  }
  object ResultObject {
    
    @scala.inline
    def apply(instance: Instance, module: Module): ResultObject = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultObject]
    }
    
    @scala.inline
    implicit class ResultObjectMutableBuilder[Self <: ResultObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
}

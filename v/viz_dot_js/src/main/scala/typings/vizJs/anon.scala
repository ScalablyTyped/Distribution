package typings.vizJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Module extends StObject {
    
    var Module: typings.vizJs.Module
    
    def render(instance: typings.vizJs.Module, src: String, options: Options): String
    @JSName("render")
    var render_Original: RenderFunction
  }
  object Module {
    
    inline def apply(
      Module: typings.vizJs.Module,
      render: (/* instance */ typings.vizJs.Module, /* src */ String, /* options */ Options) => String
    ): typings.vizJs.anon.Module = {
      val __obj = js.Dynamic.literal(Module = Module.asInstanceOf[js.Any], render = js.Any.fromFunction3(render))
      __obj.asInstanceOf[typings.vizJs.anon.Module]
    }
    
    extension [Self <: typings.vizJs.anon.Module](x: Self) {
      
      inline def setModule(value: typings.vizJs.Module): Self = StObject.set(x, "Module", value.asInstanceOf[js.Any])
      
      inline def setRender(value: (/* instance */ typings.vizJs.Module, /* src */ String, /* options */ Options) => String): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    }
  }
}

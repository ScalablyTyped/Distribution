package typings.vscodeLanguageclient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeModule
  extends StObject
     with _ServerOptions {
  
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  var module: String
  
  var options: js.UndefOr[ForkOptions] = js.undefined
  
  var runtime: js.UndefOr[String] = js.undefined
  
  var transport: js.UndefOr[Transport] = js.undefined
}
object NodeModule {
  
  @scala.inline
  def apply(module: String): NodeModule = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeModule]
  }
  
  @scala.inline
  implicit class NodeModuleMutableBuilder[Self <: NodeModule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: ForkOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setRuntime(value: String): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    @scala.inline
    def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}

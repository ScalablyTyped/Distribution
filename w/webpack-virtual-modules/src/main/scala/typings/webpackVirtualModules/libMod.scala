package typings.webpackVirtualModules

import typings.std.Record
import typings.webpack.mod.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("webpack-virtual-modules/lib", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with VirtualModulesPlugin {
    def this(modules: Record[String, String]) = this()
    
    /* private */ /* CompleteClass */
    var _compiler: Any = js.native
    
    /* private */ /* CompleteClass */
    var _staticModules: Any = js.native
    
    /* private */ /* CompleteClass */
    var _watcher: Any = js.native
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: Compiler): Unit = js.native
    
    /* CompleteClass */
    override def writeModule(filePath: String, contents: String): Unit = js.native
  }
  
  trait VirtualModulesPlugin extends StObject {
    
    /* private */ var _compiler: Any
    
    /* private */ var _staticModules: Any
    
    /* private */ var _watcher: Any
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
    
    def writeModule(filePath: String, contents: String): Unit
  }
  object VirtualModulesPlugin {
    
    inline def apply(
      _compiler: Any,
      _staticModules: Any,
      _watcher: Any,
      apply: Compiler => Unit,
      writeModule: (String, String) => Unit
    ): VirtualModulesPlugin = {
      val __obj = js.Dynamic.literal(_compiler = _compiler.asInstanceOf[js.Any], _staticModules = _staticModules.asInstanceOf[js.Any], _watcher = _watcher.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), writeModule = js.Any.fromFunction2(writeModule))
      __obj.asInstanceOf[VirtualModulesPlugin]
    }
    
    extension [Self <: VirtualModulesPlugin](x: Self) {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setWriteModule(value: (String, String) => Unit): Self = StObject.set(x, "writeModule", js.Any.fromFunction2(value))
      
      inline def set_compiler(value: Any): Self = StObject.set(x, "_compiler", value.asInstanceOf[js.Any])
      
      inline def set_staticModules(value: Any): Self = StObject.set(x, "_staticModules", value.asInstanceOf[js.Any])
      
      inline def set_watcher(value: Any): Self = StObject.set(x, "_watcher", value.asInstanceOf[js.Any])
    }
  }
}

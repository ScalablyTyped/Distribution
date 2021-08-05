package typings.webpackVirtualModules

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Plugin that allows dynamic generation of in-memory virtual modules for JavaScript builds
    * created with webpack.
    */
  @JSImport("webpack-virtual-modules", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with VirtualModulesPlugin {
    def this(modules: Record[String, String]) = this()
    
    /**
      * Attaches necessary hooks, in particular, `afterEnvironment`, `afterResolvers`, and `watchRun` hooks,
      * to ensure that the virtual files are added dynamically.
      */
    /* CompleteClass */
    @JSName("apply")
    override def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit = js.native
    
    /**
      * Writes a static or dynamic virtual module to a path.
      */
    /* CompleteClass */
    override def writeModule(filePath: String, fileContents: String): Unit = js.native
  }
  
  /**
    * Plugin that allows dynamic generation of in-memory virtual modules for JavaScript builds
    * created with webpack.
    */
  trait VirtualModulesPlugin extends StObject {
    
    /**
      * Attaches necessary hooks, in particular, `afterEnvironment`, `afterResolvers`, and `watchRun` hooks,
      * to ensure that the virtual files are added dynamically.
      */
    @JSName("apply")
    def apply(
      compiler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any
    ): Unit
    
    /**
      * Writes a static or dynamic virtual module to a path.
      */
    def writeModule(filePath: String, fileContents: String): Unit
  }
  object VirtualModulesPlugin {
    
    inline def apply(
      apply: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any => Unit,
      writeModule: (String, String) => Unit
    ): VirtualModulesPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), writeModule = js.Any.fromFunction2(writeModule))
      __obj.asInstanceOf[VirtualModulesPlugin]
    }
    
    extension [Self <: VirtualModulesPlugin](x: Self) {
      
      inline def setApply(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any => Unit
      ): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setWriteModule(value: (String, String) => Unit): Self = StObject.set(x, "writeModule", js.Any.fromFunction2(value))
    }
  }
}

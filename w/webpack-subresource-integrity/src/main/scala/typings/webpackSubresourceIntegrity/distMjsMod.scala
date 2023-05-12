package typings.webpackSubresourceIntegrity

import typings.webpack.mod.Compiler
import typings.webpackSubresourceIntegrity.distMjsTypesMod.SubresourceIntegrityPluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsMod {
  
  @JSImport("webpack-subresource-integrity/dist/mjs", "SubresourceIntegrityPlugin")
  @js.native
  /**
    * Create a new instance.
    *
    * @public
    */
  open class SubresourceIntegrityPlugin () extends StObject {
    def this(options: SubresourceIntegrityPluginOptions) = this()
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
    
    /**
      * @internal
      */
    /* private */ var isEnabled: Any = js.native
    
    /* private */ val options: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var setup: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var validateHashFuncName: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var validateHashFuncNames: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var validateHashLoading: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var validateOptions: Any = js.native
    
    /**
      * @internal
      */
    /* private */ var warnStandardHashFunc: Any = js.native
  }
}

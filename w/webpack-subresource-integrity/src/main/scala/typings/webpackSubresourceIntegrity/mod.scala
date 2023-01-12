package typings.webpackSubresourceIntegrity

import typings.webpack.mod.Compiler
import typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityBooleans.`false`
import typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityBooleans.`true`
import typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityStrings.`lazy`
import typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityStrings.auto
import typings.webpackSubresourceIntegrity.webpackSubresourceIntegrityStrings.eager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-subresource-integrity", "SubresourceIntegrityPlugin")
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
    
    /* private */ val options: Any = js.native
  }
  
  trait SubresourceIntegrityPluginOptions extends StObject {
    
    val enabled: js.UndefOr[auto | `true` | `false`] = js.undefined
    
    val hashFuncNames: js.UndefOr[Array[String]] = js.undefined
    
    val hashLoading: js.UndefOr[eager | `lazy`] = js.undefined
  }
  object SubresourceIntegrityPluginOptions {
    
    inline def apply(): SubresourceIntegrityPluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubresourceIntegrityPluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SubresourceIntegrityPluginOptions] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: auto | `true` | `false`): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHashFuncNames(value: Array[String]): Self = StObject.set(x, "hashFuncNames", value.asInstanceOf[js.Any])
      
      inline def setHashFuncNamesUndefined: Self = StObject.set(x, "hashFuncNames", js.undefined)
      
      inline def setHashLoading(value: eager | `lazy`): Self = StObject.set(x, "hashLoading", value.asInstanceOf[js.Any])
      
      inline def setHashLoadingUndefined: Self = StObject.set(x, "hashLoading", js.undefined)
    }
  }
}

package typings.webpackSubresourceIntegrity

import typings.std.ReturnType
import typings.webpack.mod.Compilation
import typings.webpack.mod.Compiler
import typings.webpackSubresourceIntegrity.distCjsTypesMod.getHtmlWebpackPluginHooksType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsHooksMod {
  
  @JSImport("webpack-subresource-integrity/dist/cjs/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def install(
    compiler: Compiler,
    callback: js.Function2[
      /* compilation */ Compilation, 
      /* hwpHooks */ ReturnType[getHtmlWebpackPluginHooksType] | Null, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(compiler.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

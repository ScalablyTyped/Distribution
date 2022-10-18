package typings.terserWebpackPlugin

import typings.terserWebpackPlugin.mod.InternalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMinifyMod {
  
  @JSImport("terser-webpack-plugin/types/minify", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def minify[T](options: InternalOptions[T]): js.Promise[MinimizedResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("minify")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MinimizedResult]]
  
  inline def transform(options: String): js.Promise[MinimizedResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("transform")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MinimizedResult]]
  
  type CustomOptions = typings.terserWebpackPlugin.mod.CustomOptions
  
  type MinimizedResult = typings.terserWebpackPlugin.mod.MinimizedResult
}

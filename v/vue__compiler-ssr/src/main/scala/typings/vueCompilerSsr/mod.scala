package typings.vueCompilerSsr

import typings.vueCompilerCore.mod.CodegenResult
import typings.vueCompilerCore.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/compiler-ssr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compile(template: String): CodegenResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[CodegenResult]
  @scala.inline
  def compile(template: String, options: CompilerOptions): CodegenResult = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CodegenResult]
}

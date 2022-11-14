package typings.vueComponentCompilerUtils

import typings.vueComponentCompilerUtils.distCompileStyleMod.StyleCompileOptions
import typings.vueComponentCompilerUtils.distCompileStyleMod.StyleCompileResults
import typings.vueComponentCompilerUtils.distCompileTemplateMod.TemplateCompileOptions
import typings.vueComponentCompilerUtils.distCompileTemplateMod.TemplateCompileResult
import typings.vueComponentCompilerUtils.distParseMod.ParseOptions
import typings.vueComponentCompilerUtils.distParseMod.SFCDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/component-compiler-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileStyle(options: StyleCompileOptions): StyleCompileResults = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStyle")(options.asInstanceOf[js.Any]).asInstanceOf[StyleCompileResults]
  
  inline def compileStyleAsync(options: StyleCompileOptions): js.Promise[StyleCompileResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStyleAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StyleCompileResults]]
  
  inline def compileTemplate(options: TemplateCompileOptions): TemplateCompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compileTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[TemplateCompileResult]
  
  inline def parse(options: ParseOptions): SFCDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[SFCDescriptor]
}

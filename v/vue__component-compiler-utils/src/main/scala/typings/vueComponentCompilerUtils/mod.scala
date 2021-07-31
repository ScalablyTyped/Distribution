package typings.vueComponentCompilerUtils

import typings.vueComponentCompilerUtils.compileStyleMod.StyleCompileOptions
import typings.vueComponentCompilerUtils.compileStyleMod.StyleCompileResults
import typings.vueComponentCompilerUtils.compileTemplateMod.TemplateCompileOptions
import typings.vueComponentCompilerUtils.compileTemplateMod.TemplateCompileResult
import typings.vueComponentCompilerUtils.parseMod.ParseOptions
import typings.vueComponentCompilerUtils.parseMod.SFCDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/component-compiler-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def compileStyle(options: StyleCompileOptions): StyleCompileResults = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStyle")(options.asInstanceOf[js.Any]).asInstanceOf[StyleCompileResults]
  
  @scala.inline
  def compileStyleAsync(options: StyleCompileOptions): js.Promise[StyleCompileResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStyleAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StyleCompileResults]]
  
  @scala.inline
  def compileTemplate(options: TemplateCompileOptions): TemplateCompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compileTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[TemplateCompileResult]
  
  @scala.inline
  def parse(options: ParseOptions): SFCDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[SFCDescriptor]
}

package typings.vueTemplateCompiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ASTElementHandlers = org.scalablytyped.runtime.StringDictionary[
    typings.vueTemplateCompiler.mod.ASTElementHandler | js.Array[typings.vueTemplateCompiler.mod.ASTElementHandler]
  ]
  
  type ASTModifiers = org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  
  type DirectiveFunction = js.Function2[
    /* node */ typings.vueTemplateCompiler.mod.ASTElement, 
    /* directiveMeta */ typings.vueTemplateCompiler.mod.ASTDirective, 
    scala.Unit
  ]
  
  @scala.inline
  def compile(template: java.lang.String): typings.vueTemplateCompiler.mod.CompiledResult[java.lang.String] = typings.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[typings.vueTemplateCompiler.mod.CompiledResult[java.lang.String]]
  @scala.inline
  def compile(template: java.lang.String, options: typings.vueTemplateCompiler.mod.CompilerOptions): typings.vueTemplateCompiler.mod.CompiledResult[java.lang.String] = (typings.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTemplateCompiler.mod.CompiledResult[java.lang.String]]
  @scala.inline
  def compile(
    template: java.lang.String,
    options: typings.vueTemplateCompiler.mod.CompilerOptionsWithSourceRange
  ): typings.vueTemplateCompiler.mod.CompiledResult[typings.vueTemplateCompiler.mod.ErrorWithRange] = (typings.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTemplateCompiler.mod.CompiledResult[typings.vueTemplateCompiler.mod.ErrorWithRange]]
  
  @scala.inline
  def compileToFunctions(template: java.lang.String): typings.vueTemplateCompiler.mod.CompiledResultFunctions = typings.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("compileToFunctions")(template.asInstanceOf[js.Any]).asInstanceOf[typings.vueTemplateCompiler.mod.CompiledResultFunctions]
  
  @scala.inline
  def generateCodeFrame(template: java.lang.String, start: scala.Double, end: scala.Double): java.lang.String = (typings.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(template.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def parseComponent(file: java.lang.String): typings.vueTemplateCompiler.mod.SFCDescriptor = typings.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseComponent")(file.asInstanceOf[js.Any]).asInstanceOf[typings.vueTemplateCompiler.mod.SFCDescriptor]
  @scala.inline
  def parseComponent(file: java.lang.String, options: typings.vueTemplateCompiler.mod.SFCParserOptions): typings.vueTemplateCompiler.mod.SFCDescriptor = (typings.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("parseComponent")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTemplateCompiler.mod.SFCDescriptor]
  
  @scala.inline
  def ssrCompile(template: java.lang.String): typings.vueTemplateCompiler.mod.CompiledResult[java.lang.String] = typings.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ssrCompile")(template.asInstanceOf[js.Any]).asInstanceOf[typings.vueTemplateCompiler.mod.CompiledResult[java.lang.String]]
  @scala.inline
  def ssrCompile(template: java.lang.String, options: typings.vueTemplateCompiler.mod.CompilerOptions): typings.vueTemplateCompiler.mod.CompiledResult[java.lang.String] = (typings.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ssrCompile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTemplateCompiler.mod.CompiledResult[java.lang.String]]
  @scala.inline
  def ssrCompile(
    template: java.lang.String,
    options: typings.vueTemplateCompiler.mod.CompilerOptionsWithSourceRange
  ): typings.vueTemplateCompiler.mod.CompiledResult[typings.vueTemplateCompiler.mod.ErrorWithRange] = (typings.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ssrCompile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.vueTemplateCompiler.mod.CompiledResult[typings.vueTemplateCompiler.mod.ErrorWithRange]]
  
  @scala.inline
  def ssrCompileToFunctions(template: java.lang.String): typings.vueTemplateCompiler.mod.CompiledResultFunctions = typings.vueTemplateCompiler.mod.^.asInstanceOf[js.Dynamic].applyDynamic("ssrCompileToFunctions")(template.asInstanceOf[js.Any]).asInstanceOf[typings.vueTemplateCompiler.mod.CompiledResultFunctions]
}

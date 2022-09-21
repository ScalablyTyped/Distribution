package typings.vueTemplateCompiler.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vueTemplateCompiler.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def compile(template: String): CompiledResult[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any]).asInstanceOf[CompiledResult[String]]
inline def compile(template: String, options: CompilerOptions): CompiledResult[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledResult[String]]
inline def compile(template: String, options: CompilerOptionsWithSourceRange): CompiledResult[ErrorWithRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledResult[ErrorWithRange]]

inline def compileToFunctions(template: String): CompiledResultFunctions = ^.asInstanceOf[js.Dynamic].applyDynamic("compileToFunctions")(template.asInstanceOf[js.Any]).asInstanceOf[CompiledResultFunctions]

inline def generateCodeFrame(template: String, start: Double, end: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCodeFrame")(template.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[String]

inline def parseComponent(file: String): SFCDescriptor = ^.asInstanceOf[js.Dynamic].applyDynamic("parseComponent")(file.asInstanceOf[js.Any]).asInstanceOf[SFCDescriptor]
inline def parseComponent(file: String, options: SFCParserOptions): SFCDescriptor = (^.asInstanceOf[js.Dynamic].applyDynamic("parseComponent")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[SFCDescriptor]

inline def ssrCompile(template: String): CompiledResult[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("ssrCompile")(template.asInstanceOf[js.Any]).asInstanceOf[CompiledResult[String]]
inline def ssrCompile(template: String, options: CompilerOptions): CompiledResult[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrCompile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledResult[String]]
inline def ssrCompile(template: String, options: CompilerOptionsWithSourceRange): CompiledResult[ErrorWithRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("ssrCompile")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CompiledResult[ErrorWithRange]]

inline def ssrCompileToFunctions(template: String): CompiledResultFunctions = ^.asInstanceOf[js.Dynamic].applyDynamic("ssrCompileToFunctions")(template.asInstanceOf[js.Any]).asInstanceOf[CompiledResultFunctions]

type ASTElementHandlers = StringDictionary[ASTElementHandler | js.Array[ASTElementHandler]]

type ASTModifiers = StringDictionary[Boolean]

type DirectiveFunction = js.Function2[/* node */ ASTElement, /* directiveMeta */ ASTDirective, Unit]

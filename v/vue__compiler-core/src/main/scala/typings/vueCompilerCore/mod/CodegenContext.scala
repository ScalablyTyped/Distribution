package typings.vueCompilerCore.mod

import typings.sourceMap.mod.SourceMapGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<std.Required<@vue/compiler-core.@vue/compiler-core.CodegenOptions>, 'bindingMetadata' | 'inline'> */
@js.native
trait CodegenContext extends StObject {
  
  var code: String = js.native
  
  var column: Double = js.native
  
  def deindent(): Unit = js.native
  def deindent(withoutNewLine: Boolean): Unit = js.native
  
  var filename: String = js.native
  
  def helper(key: js.Symbol): String = js.native
  
  var inSSR: Boolean = js.native
  
  def indent(): Unit = js.native
  
  var indentLevel: Double = js.native
  
  var isTS: Boolean = js.native
  
  var line: Double = js.native
  
  var map: js.UndefOr[SourceMapGenerator] = js.native
  
  var mode: "module" | "function" = js.native
  
  def newline(): Unit = js.native
  
  var offset: Double = js.native
  
  var optimizeImports: Boolean = js.native
  
  var prefixIdentifiers: Boolean = js.native
  
  var pure: Boolean = js.native
  
  def push(code: String): Unit = js.native
  def push(code: String, node: CodegenNode): Unit = js.native
  
  var runtimeGlobalName: String = js.native
  
  var runtimeModuleName: String = js.native
  
  var scopeId: String = js.native
  
  var source: String = js.native
  
  var sourceMap: Boolean = js.native
  
  var ssr: Boolean = js.native
  
  var ssrRuntimeModuleName: String = js.native
}

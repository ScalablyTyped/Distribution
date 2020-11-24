package typings.stylableCore.stylableMetaMod

import typings.postcss.mod.AtRule_
import typings.postcss.mod.Root_
import typings.std.Record
import typings.stylableCore.diagnosticsMod.Diagnostics
import typings.stylableCore.selectorUtilsMod.SelectorChunk2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/stylable-meta", "StylableMeta")
@js.native
class StylableMeta protected () extends js.Object {
  def this(ast: Root_, diagnostics: Diagnostics) = this()
  
  var ast: Root_ = js.native
  
  var classes: Record[String, ClassSymbol] = js.native
  
  var cssVars: Record[String, CSSVarSymbol] = js.native
  
  var customSelectors: Record[String, String] = js.native
  
  var diagnostics: Diagnostics = js.native
  
  var elements: Record[String, ElementSymbol] = js.native
  
  var globals: Record[String, Boolean] = js.native
  
  var imports: js.Array[Imported] = js.native
  
  var keyframes: js.Array[AtRule_] = js.native
  
  var mappedKeyframes: Record[String, KeyframesSymbol] = js.native
  
  var mappedSymbols: Record[String, StylableSymbol] = js.native
  
  var mixins: js.Array[RefedMixin] = js.native
  
  var namespace: String = js.native
  
  var outputAst: js.UndefOr[Root_] = js.native
  
  var parent: js.UndefOr[StylableMeta] = js.native
  
  var rawAst: Root_ = js.native
  
  var root: typings.stylableCore.stylableCoreStrings.root = js.native
  
  var scopes: js.Array[AtRule_] = js.native
  
  var simpleSelectors: Record[String, SimpleSelector] = js.native
  
  var source: String = js.native
  
  var transformDiagnostics: Diagnostics | Null = js.native
  
  var transformedScopes: (Record[String, js.Array[js.Array[SelectorChunk2]]]) | Null = js.native
  
  var urls: js.Array[String] = js.native
  
  var vars: js.Array[VarSymbol] = js.native
}

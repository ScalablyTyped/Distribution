package typings.stylableCore.mod

import typings.postcss.mod.Declaration
import typings.stylableCore.anon.Ast
import typings.stylableCore.anon.KeyframesMap
import typings.stylableCore.stylableCoreStrings.args
import typings.stylableCore.stylableCoreStrings.named
import typings.stylableCore.stylableValueParsersMod.MappedStates
import typings.stylableCore.stylableValueParsersMod.MixinValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "SBTypesParsers")
@js.native
object SBTypesParsers extends js.Object {
  
  def `-st-extends`(value: String): Ast = js.native
  
  def `-st-global`(decl: Declaration, _diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): js.Any = js.native
  
  def `-st-mixin`(mixinNode: Declaration, strategy: js.Function1[/* type */ String, named | args]): js.Array[MixinValue] = js.native
  def `-st-mixin`(
    mixinNode: Declaration,
    strategy: js.Function1[/* type */ String, named | args],
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
  ): js.Array[MixinValue] = js.native
  
  def `-st-named`(value: String, node: Declaration, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): KeyframesMap = js.native
  
  def `-st-partial-mixin`(mixinNode: Declaration, strategy: js.Function1[/* type */ String, named | args]): js.Array[MixinValue] = js.native
  def `-st-partial-mixin`(
    mixinNode: Declaration,
    strategy: js.Function1[/* type */ String, named | args],
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
  ): js.Array[MixinValue] = js.native
  
  def `-st-root`(value: String): Boolean = js.native
  
  def `-st-states`(value: String, decl: Declaration, diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics): MappedStates = js.native
}

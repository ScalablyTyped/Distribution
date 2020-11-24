package typings.stylableCore.mod

import typings.postcss.mod.Node
import typings.std.Record
import typings.stylableCore.stylableTransformerMod.replaceValueHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "evalDeclarationValue")
@js.native
object evalDeclarationValue extends js.Object {
  
  def apply(
    resolver: typings.stylableCore.stylableResolverMod.StylableResolver,
    value: String,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    node: js.UndefOr[Node],
    variableOverride: js.UndefOr[(Record[String, String]) | Null],
    valueHook: js.UndefOr[replaceValueHook],
    diagnostics: js.UndefOr[typings.stylableCore.diagnosticsMod.Diagnostics],
    passedThrough: js.UndefOr[js.Array[String]],
    cssVarsMapping: js.UndefOr[Record[String, String]],
    args: js.UndefOr[js.Array[String]]
  ): String = js.native
}

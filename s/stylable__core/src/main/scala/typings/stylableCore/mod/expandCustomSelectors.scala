package typings.stylableCore.mod

import typings.postcss.mod.Rule_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "expandCustomSelectors")
@js.native
object expandCustomSelectors extends js.Object {
  
  def apply(rule: Rule_, customSelectors: Record[String, String]): String = js.native
  def apply(
    rule: Rule_,
    customSelectors: Record[String, String],
    diagnostics: typings.stylableCore.diagnosticsMod.Diagnostics
  ): String = js.native
}

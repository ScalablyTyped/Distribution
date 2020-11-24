package typings.stylableCore.mod

import typings.std.Record
import typings.stylableCore.stylableProcessorMod.SRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core", "appendMixins")
@js.native
object appendMixins extends js.Object {
  
  def apply(
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    rule: SRule,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String]
  ): Unit = js.native
  def apply(
    transformer: typings.stylableCore.stylableTransformerMod.StylableTransformer,
    rule: SRule,
    meta: typings.stylableCore.stylableProcessorMod.StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String],
    path: js.Array[String]
  ): Unit = js.native
}

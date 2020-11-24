package typings.stylableCore

import typings.std.Record
import typings.stylableCore.stylableMetaMod.RefedMixin
import typings.stylableCore.stylableProcessorMod.SRule
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableTransformerMod.StylableTransformer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/core/cjs/stylable-mixins", JSImport.Namespace)
@js.native
object stylableMixinsMod extends js.Object {
  
  def appendMixin(
    mix: RefedMixin,
    transformer: StylableTransformer,
    rule: SRule,
    meta: StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String]
  ): Unit = js.native
  def appendMixin(
    mix: RefedMixin,
    transformer: StylableTransformer,
    rule: SRule,
    meta: StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String],
    path: js.Array[String]
  ): Unit = js.native
  
  def appendMixins(
    transformer: StylableTransformer,
    rule: SRule,
    meta: StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String]
  ): Unit = js.native
  def appendMixins(
    transformer: StylableTransformer,
    rule: SRule,
    meta: StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String],
    path: js.Array[String]
  ): Unit = js.native
  
  @js.native
  object mixinWarnings extends js.Object {
    
    def CIRCULAR_MIXIN(circularPaths: js.Array[String]): String = js.native
    
    def FAILED_TO_APPLY_MIXIN(error: String): String = js.native
    
    def JS_MIXIN_NOT_A_FUNC(): String = js.native
    
    def UNKNOWN_MIXIN_SYMBOL(name: String): String = js.native
  }
}

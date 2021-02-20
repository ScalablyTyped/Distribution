package typings.stylableCore

import typings.std.Record
import typings.stylableCore.stylableMetaMod.RefedMixin
import typings.stylableCore.stylableProcessorMod.SRule
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableTransformerMod.StylableTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableMixinsMod {
  
  @JSImport("@stylable/core/cjs/stylable-mixins", "appendMixin")
  @js.native
  def appendMixin(
    mix: RefedMixin,
    transformer: StylableTransformer,
    rule: SRule,
    meta: StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String]
  ): Unit = js.native
  @JSImport("@stylable/core/cjs/stylable-mixins", "appendMixin")
  @js.native
  def appendMixin(
    mix: RefedMixin,
    transformer: StylableTransformer,
    rule: SRule,
    meta: StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String],
    path: js.Array[String]
  ): Unit = js.native
  
  @JSImport("@stylable/core/cjs/stylable-mixins", "appendMixins")
  @js.native
  def appendMixins(
    transformer: StylableTransformer,
    rule: SRule,
    meta: StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String]
  ): Unit = js.native
  @JSImport("@stylable/core/cjs/stylable-mixins", "appendMixins")
  @js.native
  def appendMixins(
    transformer: StylableTransformer,
    rule: SRule,
    meta: StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String],
    path: js.Array[String]
  ): Unit = js.native
  
  object mixinWarnings {
    
    @JSImport("@stylable/core/cjs/stylable-mixins", "mixinWarnings.CIRCULAR_MIXIN")
    @js.native
    def CIRCULAR_MIXIN(circularPaths: js.Array[String]): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-mixins", "mixinWarnings.FAILED_TO_APPLY_MIXIN")
    @js.native
    def FAILED_TO_APPLY_MIXIN(error: String): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-mixins", "mixinWarnings.JS_MIXIN_NOT_A_FUNC")
    @js.native
    def JS_MIXIN_NOT_A_FUNC(): String = js.native
    
    @JSImport("@stylable/core/cjs/stylable-mixins", "mixinWarnings.UNKNOWN_MIXIN_SYMBOL")
    @js.native
    def UNKNOWN_MIXIN_SYMBOL(name: String): String = js.native
  }
}

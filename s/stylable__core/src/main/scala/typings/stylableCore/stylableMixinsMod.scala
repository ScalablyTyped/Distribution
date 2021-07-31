package typings.stylableCore

import typings.std.Record
import typings.stylableCore.stylableMetaMod.RefedMixin
import typings.stylableCore.stylableProcessorMod.SRule
import typings.stylableCore.stylableProcessorMod.StylableMeta
import typings.stylableCore.stylableTransformerMod.StylableTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylableMixinsMod {
  
  @JSImport("@stylable/core/cjs/stylable-mixins", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def appendMixin(
    mix: RefedMixin,
    transformer: StylableTransformer,
    rule: SRule,
    meta: StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendMixin")(mix.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def appendMixin(
    mix: RefedMixin,
    transformer: StylableTransformer,
    rule: SRule,
    meta: StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String],
    path: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendMixin")(mix.asInstanceOf[js.Any], transformer.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def appendMixins(
    transformer: StylableTransformer,
    rule: SRule,
    meta: StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendMixins")(transformer.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def appendMixins(
    transformer: StylableTransformer,
    rule: SRule,
    meta: StylableMeta,
    variableOverride: Record[String, String],
    cssVarsMapping: Record[String, String],
    path: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendMixins")(transformer.asInstanceOf[js.Any], rule.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], variableOverride.asInstanceOf[js.Any], cssVarsMapping.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object mixinWarnings {
    
    @JSImport("@stylable/core/cjs/stylable-mixins", "mixinWarnings")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def CIRCULAR_MIXIN(circularPaths: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("CIRCULAR_MIXIN")(circularPaths.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def FAILED_TO_APPLY_MIXIN(error: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("FAILED_TO_APPLY_MIXIN")(error.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def JS_MIXIN_NOT_A_FUNC(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("JS_MIXIN_NOT_A_FUNC")().asInstanceOf[String]
    
    @scala.inline
    def UNKNOWN_MIXIN_SYMBOL(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("UNKNOWN_MIXIN_SYMBOL")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  }
}

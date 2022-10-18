package typings.vegaLite

import typings.vegaLite.buildSrcCompileMarkBaseMod.MarkCompiler
import typings.vegaLite.buildSrcCompileUnitMod.UnitModel
import typings.vegaLite.buildSrcConfigMod.Config
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaLite.buildSrcVegaDotschemaMod.VgEncodeEntry
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileMarkPointMod {
  
  @JSImport("vega-lite/build/src/compile/mark/point", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/point", "circle")
  @js.native
  val circle: MarkCompiler = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/point", "point")
  @js.native
  val point: MarkCompiler = js.native
  
  inline def shapeMixins(model: UnitModel, config: Config[ExprRef | SignalRef]): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("shapeMixins")(model.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  inline def shapeMixins(
    model: UnitModel,
    config: Config[ExprRef | SignalRef],
    fixedShape: typings.vegaLite.vegaLiteStrings.circle | typings.vegaLite.vegaLiteStrings.square
  ): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("shapeMixins")(model.asInstanceOf[js.Any], config.asInstanceOf[js.Any], fixedShape.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @JSImport("vega-lite/build/src/compile/mark/point", "square")
  @js.native
  val square: MarkCompiler = js.native
}

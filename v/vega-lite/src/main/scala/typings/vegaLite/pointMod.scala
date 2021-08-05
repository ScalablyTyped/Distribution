package typings.vegaLite

import typings.vegaLite.baseMod.MarkCompiler
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcConfigMod.Config
import typings.vegaLite.unitMod.UnitModel
import typings.vegaLite.vegaSchemaMod.VgEncodeEntry
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pointMod {
  
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
  
  inline def shapeMixins_circle(
    model: UnitModel,
    config: Config[ExprRef | SignalRef],
    fixedShape: typings.vegaLite.vegaLiteStrings.circle
  ): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("shapeMixins")(model.asInstanceOf[js.Any], config.asInstanceOf[js.Any], fixedShape.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  inline def shapeMixins_square(
    model: UnitModel,
    config: Config[ExprRef | SignalRef],
    fixedShape: typings.vegaLite.vegaLiteStrings.square
  ): VgEncodeEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("shapeMixins")(model.asInstanceOf[js.Any], config.asInstanceOf[js.Any], fixedShape.asInstanceOf[js.Any])).asInstanceOf[VgEncodeEntry]
  
  @JSImport("vega-lite/build/src/compile/mark/point", "square")
  @js.native
  val square: MarkCompiler = js.native
}

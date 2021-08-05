package typings.vegaLite

import typings.vegaLite.anon.ClipHeight
import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.legendComponentMod.LegendComponent
import typings.vegaLite.modelMod.Model
import typings.vegaLite.srcConfigMod.Config
import typings.vegaTypings.legendMod.Legend
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/legend/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleLegend(legendCmpt: LegendComponent, config: Config[ExprRef | SignalRef]): ClipHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleLegend")(legendCmpt.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ClipHeight]
  
  inline def assembleLegends(model: Model): js.Array[Legend] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleLegends")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[Legend]]
}

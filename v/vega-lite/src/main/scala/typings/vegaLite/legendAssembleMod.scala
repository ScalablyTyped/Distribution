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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/legend/assemble", "assembleLegend")
  @js.native
  def assembleLegend(legendCmpt: LegendComponent, config: Config[ExprRef | SignalRef]): ClipHeight = js.native
  
  @JSImport("vega-lite/build/src/compile/legend/assemble", "assembleLegends")
  @js.native
  def assembleLegends(model: Model): js.Array[Legend] = js.native
}

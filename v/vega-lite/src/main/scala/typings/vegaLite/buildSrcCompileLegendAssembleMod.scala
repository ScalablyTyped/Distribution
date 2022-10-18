package typings.vegaLite

import typings.vegaLite.anon.ClipHeight
import typings.vegaLite.buildSrcCompileLegendComponentMod.LegendComponent
import typings.vegaLite.buildSrcCompileModelMod.Model
import typings.vegaLite.buildSrcConfigMod.Config
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecLegendMod.Legend
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileLegendAssembleMod {
  
  @JSImport("vega-lite/build/src/compile/legend/assemble", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleLegend(legendCmpt: LegendComponent, config: Config[ExprRef | SignalRef]): ClipHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleLegend")(legendCmpt.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ClipHeight]
  
  inline def assembleLegends(model: Model): js.Array[Legend] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleLegends")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[Legend]]
}

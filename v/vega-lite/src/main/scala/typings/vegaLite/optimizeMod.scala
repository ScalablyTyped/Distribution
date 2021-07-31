package typings.vegaLite

import typings.vegaLite.dataMod.DataComponent
import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.modelMod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optimizeMod {
  
  @JSImport("vega-lite/build/src/compile/data/optimize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/data/optimize", "FACET_SCALE_PREFIX")
  @js.native
  val FACET_SCALE_PREFIX: /* "scale_" */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/data/optimize", "MAX_OPTIMIZATION_RUNS")
  @js.native
  val MAX_OPTIMIZATION_RUNS: /* 5 */ Double = js.native
  
  @scala.inline
  def checkLinks(nodes: js.Array[DataFlowNode]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkLinks")(nodes.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def optimizeDataflow(data: DataComponent, model: Model): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("optimizeDataflow")(data.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

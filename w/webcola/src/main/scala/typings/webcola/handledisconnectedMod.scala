package typings.webcola

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handledisconnectedMod {
  
  @JSImport("webcola/dist/src/handledisconnected", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyPacking(graphs: js.Array[js.Any], w: js.Any, h: js.Any, node_size: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyPacking(graphs: js.Array[js.Any], w: js.Any, h: js.Any, node_size: js.Any, desired_ratio: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any], desired_ratio.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyPacking(
    graphs: js.Array[js.Any],
    w: js.Any,
    h: js.Any,
    node_size: js.Any,
    desired_ratio: Double,
    centerGraph: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any], desired_ratio.asInstanceOf[js.Any], centerGraph.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyPacking(
    graphs: js.Array[js.Any],
    w: js.Any,
    h: js.Any,
    node_size: js.Any,
    desired_ratio: Unit,
    centerGraph: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPacking")(graphs.asInstanceOf[js.Any], w.asInstanceOf[js.Any], h.asInstanceOf[js.Any], node_size.asInstanceOf[js.Any], desired_ratio.asInstanceOf[js.Any], centerGraph.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def separateGraphs(nodes: js.Any, links: js.Any): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("separateGraphs")(nodes.asInstanceOf[js.Any], links.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
}

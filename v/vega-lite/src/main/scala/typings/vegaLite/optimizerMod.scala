package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optimizerMod {
  
  @JSImport("vega-lite/build/src/compile/data/optimizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/data/optimizer", "BottomUpOptimizer")
  @js.native
  abstract class BottomUpOptimizer () extends Optimizer {
    
    /**
      * Compute a map of node depths that we can use to determine a topological sort order.
      */
    /* private */ var getNodeDepths: js.Any = js.native
    
    /**
      * Run the optimizer at the node. This method should not change the parent of the passed in node (it should only affect children).
      */
    def run(node: DataFlowNode): Unit = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/data/optimizer", "Optimizer")
  @js.native
  abstract class Optimizer () extends StObject {
    
    def modifiedFlag: Boolean = js.native
    
    /**
      * Run the optimization for the tree with the provided root.
      */
    def optimize(root: DataFlowNode): Boolean = js.native
    
    /* private */ var `private`: js.Any = js.native
    
    def setModified(): Unit = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/data/optimizer", "TopDownOptimizer")
  @js.native
  abstract class TopDownOptimizer () extends Optimizer {
    
    /**
      * Run the optimizer at the node.
      */
    def run(node: DataFlowNode): Unit = js.native
  }
  
  inline def isDataSourceNode(node: DataFlowNode): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataSourceNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

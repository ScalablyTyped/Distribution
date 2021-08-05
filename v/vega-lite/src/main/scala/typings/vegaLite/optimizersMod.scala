package typings.vegaLite

import typings.std.Set
import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.modelMod.Model
import typings.vegaLite.optimizerMod.BottomUpOptimizer
import typings.vegaLite.optimizerMod.Optimizer
import typings.vegaLite.optimizerMod.TopDownOptimizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optimizersMod {
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MergeAggregates")
  @js.native
  class MergeAggregates () extends BottomUpOptimizer
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MergeBins")
  @js.native
  class MergeBins protected () extends BottomUpOptimizer {
    def this(model: Model) = this()
    
    /* private */ var model: js.Any = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MergeIdenticalNodes")
  @js.native
  class MergeIdenticalNodes () extends TopDownOptimizer {
    
    def mergeNodes(parent: DataFlowNode, nodes: js.Array[DataFlowNode]): Unit = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MergeOutputs")
  @js.native
  class MergeOutputs () extends BottomUpOptimizer
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MergeParse")
  @js.native
  class MergeParse () extends BottomUpOptimizer
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MergeTimeUnits")
  @js.native
  class MergeTimeUnits () extends BottomUpOptimizer
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MoveParseUp")
  @js.native
  class MoveParseUp () extends BottomUpOptimizer
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "RemoveDuplicateTimeUnits")
  @js.native
  class RemoveDuplicateTimeUnits () extends Optimizer {
    
    def run(node: DataFlowNode, timeUnitFields: Set[String]): Unit = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "RemoveUnnecessaryIdentifierNodes")
  @js.native
  class RemoveUnnecessaryIdentifierNodes protected () extends TopDownOptimizer {
    def this(model: Model) = this()
    
    /* private */ var requiresSelectionId: js.Any = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "RemoveUnnecessaryOutputNodes")
  @js.native
  class RemoveUnnecessaryOutputNodes () extends TopDownOptimizer
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "RemoveUnusedSubtrees")
  @js.native
  class RemoveUnusedSubtrees () extends BottomUpOptimizer
}

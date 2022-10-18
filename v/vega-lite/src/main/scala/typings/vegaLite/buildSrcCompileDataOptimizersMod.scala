package typings.vegaLite

import typings.std.Set
import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcCompileDataOptimizerMod.BottomUpOptimizer
import typings.vegaLite.buildSrcCompileDataOptimizerMod.Optimizer
import typings.vegaLite.buildSrcCompileDataOptimizerMod.TopDownOptimizer
import typings.vegaLite.buildSrcCompileModelMod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataOptimizersMod {
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MergeAggregates")
  @js.native
  open class MergeAggregates () extends BottomUpOptimizer
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MergeBins")
  @js.native
  open class MergeBins protected () extends BottomUpOptimizer {
    def this(model: Model) = this()
    
    /* private */ var model: Any = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MergeIdenticalNodes")
  @js.native
  open class MergeIdenticalNodes () extends TopDownOptimizer {
    
    def mergeNodes(parent: DataFlowNode, nodes: js.Array[DataFlowNode]): Unit = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MergeOutputs")
  @js.native
  open class MergeOutputs () extends BottomUpOptimizer
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MergeParse")
  @js.native
  open class MergeParse () extends BottomUpOptimizer
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MergeTimeUnits")
  @js.native
  open class MergeTimeUnits () extends BottomUpOptimizer
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "MoveParseUp")
  @js.native
  open class MoveParseUp () extends BottomUpOptimizer
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "RemoveDuplicateTimeUnits")
  @js.native
  open class RemoveDuplicateTimeUnits () extends Optimizer {
    
    def run(node: DataFlowNode, timeUnitFields: Set[String]): Unit = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "RemoveUnnecessaryIdentifierNodes")
  @js.native
  open class RemoveUnnecessaryIdentifierNodes protected () extends TopDownOptimizer {
    def this(model: Model) = this()
    
    /* private */ var requiresSelectionId: Any = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "RemoveUnnecessaryOutputNodes")
  @js.native
  open class RemoveUnnecessaryOutputNodes () extends TopDownOptimizer
  
  @JSImport("vega-lite/build/src/compile/data/optimizers", "RemoveUnusedSubtrees")
  @js.native
  open class RemoveUnusedSubtrees () extends BottomUpOptimizer
}

package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.logicalMod.LogicalComposition
import typings.vegaLite.modelMod.Model
import typings.vegaLite.srcPredicateMod.Predicate
import typings.vegaTypings.transformMod.FilterTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("vega-lite/build/src/compile/data/filter", "FilterNode")
  @js.native
  open class FilterNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, model: Model, filter: LogicalComposition[Predicate]) = this()
    
    /* private */ var _dependentFields: Any = js.native
    
    def assemble(): FilterTransform = js.native
    
    /* private */ var expr: Any = js.native
    
    /* private */ val filter: Any = js.native
    
    /* private */ val model: Any = js.native
  }
}

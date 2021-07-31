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
  class FilterNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, model: Model, filter: LogicalComposition[Predicate]) = this()
    
    var _dependentFields: js.Any = js.native
    
    def assemble(): FilterTransform = js.native
    
    var expr: js.Any = js.native
    
    val filter: js.Any = js.native
    
    val model: js.Any = js.native
  }
}

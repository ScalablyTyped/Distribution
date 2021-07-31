package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.transformMod.PivotTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pivotMod {
  
  @JSImport("vega-lite/build/src/compile/data/pivot", "PivotTransformNode")
  @js.native
  class PivotTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: PivotTransform) = this()
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): typings.vegaTypings.transformMod.PivotTransform = js.native
    
    var transform: js.Any = js.native
  }
}

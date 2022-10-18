package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcTransformMod.PivotTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataPivotMod {
  
  @JSImport("vega-lite/build/src/compile/data/pivot", "PivotTransformNode")
  @js.native
  open class PivotTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: PivotTransform) = this()
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): typings.vegaTypings.typesSpecTransformMod.PivotTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}

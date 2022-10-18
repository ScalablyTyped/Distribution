package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcTransformMod.WindowTransform
import typings.vegaLite.buildSrcVegaDotschemaMod.VgJoinAggregateTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataWindowMod {
  
  @JSImport("vega-lite/build/src/compile/data/window", "WindowTransformNode")
  @js.native
  open class WindowTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: WindowTransform) = this()
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): typings.vegaTypings.typesSpecTransformMod.WindowTransform | VgJoinAggregateTransform = js.native
    
    /* private */ var getDefaultName: Any = js.native
    
    /* private */ val transform: Any = js.native
  }
}

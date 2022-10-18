package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcTransformMod.SampleTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataSampleMod {
  
  @JSImport("vega-lite/build/src/compile/data/sample", "SampleTransformNode")
  @js.native
  open class SampleTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: SampleTransform) = this()
    
    def assemble(): typings.vegaTypings.typesSpecTransformMod.SampleTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}

package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.transformMod.SampleTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sampleMod {
  
  @JSImport("vega-lite/build/src/compile/data/sample", "SampleTransformNode")
  @js.native
  class SampleTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: SampleTransform) = this()
    
    def assemble(): typings.vegaTypings.transformMod.SampleTransform = js.native
    
    /* private */ var transform: js.Any = js.native
  }
}

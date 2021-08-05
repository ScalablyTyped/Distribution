package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.transformMod.DensityTransform
import typings.vegaTypings.transformMod.KDETransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object densityMod {
  
  @JSImport("vega-lite/build/src/compile/data/density", "DensityTransformNode")
  @js.native
  class DensityTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: DensityTransform) = this()
    
    def assemble(): KDETransform = js.native
    
    /* private */ var transform: js.Any = js.native
  }
}

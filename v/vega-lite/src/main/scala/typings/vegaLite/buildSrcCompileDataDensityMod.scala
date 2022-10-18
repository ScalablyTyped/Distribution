package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcTransformMod.DensityTransform
import typings.vegaTypings.typesSpecTransformMod.KDETransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataDensityMod {
  
  @JSImport("vega-lite/build/src/compile/data/density", "DensityTransformNode")
  @js.native
  open class DensityTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: DensityTransform) = this()
    
    def assemble(): KDETransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}

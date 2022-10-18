package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcDataMod.GraticuleParams
import typings.vegaLite.vegaLiteBooleans.`true`
import typings.vegaTypings.typesSpecTransformMod.GraticuleTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataGraticuleMod {
  
  @JSImport("vega-lite/build/src/compile/data/graticule", "GraticuleNode")
  @js.native
  open class GraticuleNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, params: GraticuleParams) = this()
    def this(parent: DataFlowNode, params: `true`) = this()
    
    def assemble(): GraticuleTransform = js.native
    
    /* private */ var params: Any = js.native
  }
}

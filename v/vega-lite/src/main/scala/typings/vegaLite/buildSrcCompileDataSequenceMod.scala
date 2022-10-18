package typings.vegaLite

import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcDataMod.SequenceParams
import typings.vegaTypings.typesSpecTransformMod.SequenceTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataSequenceMod {
  
  @JSImport("vega-lite/build/src/compile/data/sequence", "SequenceNode")
  @js.native
  open class SequenceNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, params: SequenceParams) = this()
    
    def assemble(): SequenceTransform = js.native
    
    /* private */ var params: Any = js.native
  }
}

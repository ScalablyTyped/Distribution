package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.modelMod.Model
import typings.vegaLite.transformMod.LookupTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lookupMod {
  
  @JSImport("vega-lite/build/src/compile/data/lookup", "LookupNode")
  @js.native
  class LookupNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: LookupTransform, secondary: String) = this()
    
    def assemble(): typings.vegaTypings.transformMod.LookupTransform = js.native
    
    val secondary: String = js.native
    
    val transform: LookupTransform = js.native
  }
  /* static members */
  object LookupNode {
    
    @JSImport("vega-lite/build/src/compile/data/lookup", "LookupNode")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def make(parent: DataFlowNode, model: Model, transform: LookupTransform, counter: Double): LookupNode = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any], transform.asInstanceOf[js.Any], counter.asInstanceOf[js.Any])).asInstanceOf[LookupNode]
  }
}

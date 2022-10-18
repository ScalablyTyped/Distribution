package typings.vegaLite

import typings.std.Set
import typings.vegaLite.buildSrcCompileDataDataflowMod.DataFlowNode
import typings.vegaLite.buildSrcCompileModelMod.ModelWithField
import typings.vegaLite.buildSrcUtilMod.Dict
import typings.vegaTypings.typesSpecTransformMod.TimeUnitTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcCompileDataTimeunitMod {
  
  @JSImport("vega-lite/build/src/compile/data/timeunit", "TimeUnitNode")
  @js.native
  open class TimeUnitNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, formula: Dict[TimeUnitComponent]) = this()
    
    def assemble(): js.Array[TimeUnitTransform] = js.native
    
    /* private */ var formula: Any = js.native
    
    /**
      * Merge together TimeUnitNodes assigning the children of `other` to `this`
      * and removing `other`.
      */
    def merge(other: TimeUnitNode): Unit = js.native
    
    /**
      * Remove time units coming from the other node.
      */
    def removeFormulas(fields: Set[String]): Unit = js.native
  }
  /* static members */
  object TimeUnitNode {
    
    @JSImport("vega-lite/build/src/compile/data/timeunit", "TimeUnitNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def makeFromEncoding(parent: DataFlowNode, model: ModelWithField): TimeUnitNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromEncoding")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[TimeUnitNode]
    
    inline def makeFromTransform(parent: DataFlowNode, t: typings.vegaLite.buildSrcTransformMod.TimeUnitTransform): TimeUnitNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromTransform")(parent.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[TimeUnitNode]
  }
  
  type TimeUnitComponent = typings.vegaLite.buildSrcTransformMod.TimeUnitTransform
}

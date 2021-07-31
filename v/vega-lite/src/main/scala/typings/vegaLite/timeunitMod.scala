package typings.vegaLite

import typings.std.Set
import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.dataflowMod.DataFlowNode
import typings.vegaLite.modelMod.ModelWithField
import typings.vegaLite.srcTimeunitMod.TimeUnit
import typings.vegaLite.srcTimeunitMod.TimeUnitParams
import typings.vegaLite.utilMod.Dict
import typings.vegaTypings.transformMod.TimeUnitTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeunitMod {
  
  @JSImport("vega-lite/build/src/compile/data/timeunit", "TimeUnitNode")
  @js.native
  class TimeUnitNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, formula: Dict[TimeUnitComponent]) = this()
    
    def assemble(): js.Array[TimeUnitTransform] = js.native
    
    var formula: js.Any = js.native
    
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
    
    @scala.inline
    def makeFromEncoding(parent: DataFlowNode, model: ModelWithField): TimeUnitNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromEncoding")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[TimeUnitNode]
    
    @scala.inline
    def makeFromTransform(parent: DataFlowNode, t: typings.vegaLite.transformMod.TimeUnitTransform): TimeUnitNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromTransform")(parent.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[TimeUnitNode]
  }
  
  trait TimeUnitComponent
    extends StObject
       with typings.vegaLite.transformMod.TimeUnitTransform {
    
    /** whether to output time unit as a band (generate two formula including start and end) */
    var band: js.UndefOr[Boolean] = js.undefined
  }
  object TimeUnitComponent {
    
    @scala.inline
    def apply(as: FieldName, field: FieldName, timeUnit: TimeUnit | TimeUnitParams): TimeUnitComponent = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], timeUnit = timeUnit.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeUnitComponent]
    }
    
    @scala.inline
    implicit class TimeUnitComponentMutableBuilder[Self <: TimeUnitComponent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBand(value: Boolean): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
    }
  }
}

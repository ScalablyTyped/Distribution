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
import scala.scalajs.js.`|`
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
    
    @JSImport("vega-lite/build/src/compile/data/timeunit", "TimeUnitNode.makeFromEncoding")
    @js.native
    def makeFromEncoding(parent: DataFlowNode, model: ModelWithField): TimeUnitNode = js.native
    
    @JSImport("vega-lite/build/src/compile/data/timeunit", "TimeUnitNode.makeFromTransform")
    @js.native
    def makeFromTransform(parent: DataFlowNode, t: typings.vegaLite.transformMod.TimeUnitTransform): TimeUnitNode = js.native
  }
  
  /* Inlined vega-lite.vega-lite/build/src/transform.TimeUnitTransform & {  band :boolean | undefined} */
  @js.native
  trait TimeUnitComponent extends StObject {
    
    /**
      * The output field to write the timeUnit value.
      */
    var as: FieldName = js.native
    
    /** whether to output time unit as a band (generate two formula including start and end) */
    var band: js.UndefOr[Boolean] = js.native
    
    /**
      * The data field to apply time unit.
      */
    var field: FieldName = js.native
    
    /**
      * The timeUnit.
      */
    var timeUnit: TimeUnit | TimeUnitParams = js.native
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
      def setAs(value: FieldName): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBand(value: Boolean): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBandUndefined: Self = StObject.set(x, "band", js.undefined)
      
      @scala.inline
      def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUnit(value: TimeUnit | TimeUnitParams): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    }
  }
}

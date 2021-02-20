package typings.vegaLite

import org.scalablytyped.runtime.Shortcut
import typings.std.Partial
import typings.std.Record
import typings.vegaLite.anon.Visual
import typings.vegaLite.channelMod.SingleDefUnitChannel
import typings.vegaLite.timeunitMod.TimeUnitNode
import typings.vegaLite.transformsMod.TransformCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projectMod extends Shortcut {
  
  @JSImport("vega-lite/build/src/compile/selection/transforms/project", JSImport.Default)
  @js.native
  val default: TransformCompiler = js.native
  
  @JSImport("vega-lite/build/src/compile/selection/transforms/project", "SelectionProjectionComponent")
  @js.native
  class SelectionProjectionComponent protected () extends StObject {
    def this(items: SelectionProjection*) = this()
    
    var hasChannel: Partial[Record[SingleDefUnitChannel, SelectionProjection]] = js.native
    
    var hasField: Record[String, SelectionProjection] = js.native
    
    var items: js.Array[SelectionProjection] = js.native
    
    var timeUnit: js.UndefOr[TimeUnitNode] = js.native
  }
  
  @JSImport("vega-lite/build/src/compile/selection/transforms/project", "TUPLE_FIELDS")
  @js.native
  val TUPLE_FIELDS: /* "_tuple_fields" */ String = js.native
  
  @js.native
  trait SelectionProjection extends StObject {
    
    var channel: js.UndefOr[SingleDefUnitChannel] = js.native
    
    var field: String = js.native
    
    var hasLegend: js.UndefOr[Boolean] = js.native
    
    var signals: js.UndefOr[Visual] = js.native
    
    var `type`: TupleStoreType = js.native
  }
  object SelectionProjection {
    
    @scala.inline
    def apply(field: String, `type`: TupleStoreType): SelectionProjection = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionProjection]
    }
    
    @scala.inline
    implicit class SelectionProjectionMutableBuilder[Self <: SelectionProjection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: SingleDefUnitChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasLegend(value: Boolean): Self = StObject.set(x, "hasLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasLegendUndefined: Self = StObject.set(x, "hasLegend", js.undefined)
      
      @scala.inline
      def setSignals(value: Visual): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      @scala.inline
      def setType(value: TupleStoreType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite.vegaLiteStrings.E
    - typings.vegaLite.vegaLiteStrings.R
    - typings.vegaLite.vegaLiteStrings.`R-RE`
  */
  trait TupleStoreType extends StObject
  object TupleStoreType {
    
    @scala.inline
    def E: typings.vegaLite.vegaLiteStrings.E = "E".asInstanceOf[typings.vegaLite.vegaLiteStrings.E]
    
    @scala.inline
    def R: typings.vegaLite.vegaLiteStrings.R = "R".asInstanceOf[typings.vegaLite.vegaLiteStrings.R]
    
    @scala.inline
    def `R-RE`: typings.vegaLite.vegaLiteStrings.`R-RE` = "R-RE".asInstanceOf[typings.vegaLite.vegaLiteStrings.`R-RE`]
  }
  
  type _To = TransformCompiler
  
  /* This means you don't have to write `default`, but can instead just say `projectMod.foo` */
  override def _to: TransformCompiler = default
}

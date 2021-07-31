package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector6
import typings.vegaTypings.vegaTypingsStrings.partition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionTransform
  extends StObject
     with _Transforms {
  
  var as: js.UndefOr[(Vector6[String | SignalRef]) | SignalRef] = js.undefined
  
  var field: js.UndefOr[FieldRef] = js.undefined
  
  var padding: js.UndefOr[Double | SignalRef] = js.undefined
  
  var round: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  
  var sort: js.UndefOr[Compare] = js.undefined
  
  var `type`: partition
}
object PartitionTransform {
  
  @scala.inline
  def apply(): PartitionTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("partition")
    __obj.asInstanceOf[PartitionTransform]
  }
  
  @scala.inline
  implicit class PartitionTransformMutableBuilder[Self <: PartitionTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (Vector6[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean | SignalRef): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    @scala.inline
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setType(value: partition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

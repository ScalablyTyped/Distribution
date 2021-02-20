package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector5
import typings.vegaTypings.vegaTypingsStrings.pack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PackTransform extends _Transforms {
  
  var as: js.UndefOr[(Vector5[String | SignalRef]) | SignalRef] = js.native
  
  var field: js.UndefOr[FieldRef] = js.native
  
  var padding: js.UndefOr[Double | SignalRef] = js.native
  
  var radius: js.UndefOr[FieldRef] = js.native
  
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var sort: js.UndefOr[Compare] = js.native
  
  var `type`: pack = js.native
}
object PackTransform {
  
  @scala.inline
  def apply(`type`: pack): PackTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackTransform]
  }
  
  @scala.inline
  implicit class PackTransformMutableBuilder[Self <: PackTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (Vector5[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
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
    def setRadius(value: FieldRef): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setType(value: pack): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

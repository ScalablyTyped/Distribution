package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector4
import typings.vegaTypings.vegaTypingsStrings.tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeTransform extends _Transforms {
  
  var as: js.UndefOr[(Vector4[String | SignalRef]) | SignalRef] = js.native
  
  var field: js.UndefOr[FieldRef] = js.native
  
  var method: js.UndefOr[TreeMethod | SignalRef] = js.native
  
  var nodeSize: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var separation: js.UndefOr[Boolean | SignalRef] = js.native
  
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var sort: js.UndefOr[Compare] = js.native
  
  var `type`: tree = js.native
}
object TreeTransform {
  
  @scala.inline
  def apply(`type`: tree): TreeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeTransform]
  }
  
  @scala.inline
  implicit class TreeTransformMutableBuilder[Self <: TreeTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (Vector4[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setMethod(value: TreeMethod | SignalRef): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setNodeSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeSizeUndefined: Self = StObject.set(x, "nodeSize", js.undefined)
    
    @scala.inline
    def setSeparation(value: Boolean | SignalRef): Self = StObject.set(x, "separation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeparationUndefined: Self = StObject.set(x, "separation", js.undefined)
    
    @scala.inline
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setType(value: tree): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector4
import typings.vegaTypings.vegaTypingsStrings.tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(Vector4[String | SignalRef]) | SignalRef] = js.undefined
  
  var field: js.UndefOr[FieldRef] = js.undefined
  
  var method: js.UndefOr[TreeMethod | SignalRef] = js.undefined
  
  var nodeSize: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  
  var separation: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  
  var sort: js.UndefOr[Compare] = js.undefined
  
  var `type`: tree
}
object TreeTransform {
  
  inline def apply(): TreeTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("tree")
    __obj.asInstanceOf[TreeTransform]
  }
  
  extension [Self <: TreeTransform](x: Self) {
    
    inline def setAs(value: (Vector4[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMethod(value: TreeMethod | SignalRef): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNodeSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
    
    inline def setNodeSizeUndefined: Self = StObject.set(x, "nodeSize", js.undefined)
    
    inline def setSeparation(value: Boolean | SignalRef): Self = StObject.set(x, "separation", value.asInstanceOf[js.Any])
    
    inline def setSeparationUndefined: Self = StObject.set(x, "separation", js.undefined)
    
    inline def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setType(value: tree): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

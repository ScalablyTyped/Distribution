package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.linkpath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkPathTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[String | SignalRef] = js.undefined
  
  var orient: js.UndefOr[LinkPathOrient | SignalRef] = js.undefined
  
  var require: js.UndefOr[SignalRef] = js.undefined
  
  var shape: js.UndefOr[LinkPathShape | SignalRef] = js.undefined
  
  var sourceX: js.UndefOr[FieldRef] = js.undefined
  
  var sourceY: js.UndefOr[FieldRef] = js.undefined
  
  var targetX: js.UndefOr[FieldRef] = js.undefined
  
  var targetY: js.UndefOr[FieldRef] = js.undefined
  
  var `type`: linkpath
}
object LinkPathTransform {
  
  inline def apply(): LinkPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("linkpath")
    __obj.asInstanceOf[LinkPathTransform]
  }
  
  extension [Self <: LinkPathTransform](x: Self) {
    
    inline def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setOrient(value: LinkPathOrient | SignalRef): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    inline def setRequire(value: SignalRef): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    inline def setShape(value: LinkPathShape | SignalRef): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSourceX(value: FieldRef): Self = StObject.set(x, "sourceX", value.asInstanceOf[js.Any])
    
    inline def setSourceXUndefined: Self = StObject.set(x, "sourceX", js.undefined)
    
    inline def setSourceY(value: FieldRef): Self = StObject.set(x, "sourceY", value.asInstanceOf[js.Any])
    
    inline def setSourceYUndefined: Self = StObject.set(x, "sourceY", js.undefined)
    
    inline def setTargetX(value: FieldRef): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
    
    inline def setTargetXUndefined: Self = StObject.set(x, "targetX", js.undefined)
    
    inline def setTargetY(value: FieldRef): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
    
    inline def setTargetYUndefined: Self = StObject.set(x, "targetY", js.undefined)
    
    inline def setType(value: linkpath): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

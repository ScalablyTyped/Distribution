package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.linkpath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkPathTransform extends _Transforms {
  
  var as: js.UndefOr[String | SignalRef] = js.native
  
  var orient: js.UndefOr[LinkPathOrient | SignalRef] = js.native
  
  var require: js.UndefOr[SignalRef] = js.native
  
  var shape: js.UndefOr[LinkPathShape | SignalRef] = js.native
  
  var sourceX: js.UndefOr[FieldRef] = js.native
  
  var sourceY: js.UndefOr[FieldRef] = js.native
  
  var targetX: js.UndefOr[FieldRef] = js.native
  
  var targetY: js.UndefOr[FieldRef] = js.native
  
  var `type`: linkpath = js.native
}
object LinkPathTransform {
  
  @scala.inline
  def apply(`type`: linkpath): LinkPathTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkPathTransform]
  }
  
  @scala.inline
  implicit class LinkPathTransformMutableBuilder[Self <: LinkPathTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: String | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setOrient(value: LinkPathOrient | SignalRef): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    @scala.inline
    def setRequire(value: SignalRef): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
    
    @scala.inline
    def setShape(value: LinkPathShape | SignalRef): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    @scala.inline
    def setSourceX(value: FieldRef): Self = StObject.set(x, "sourceX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceXUndefined: Self = StObject.set(x, "sourceX", js.undefined)
    
    @scala.inline
    def setSourceY(value: FieldRef): Self = StObject.set(x, "sourceY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceYUndefined: Self = StObject.set(x, "sourceY", js.undefined)
    
    @scala.inline
    def setTargetX(value: FieldRef): Self = StObject.set(x, "targetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetXUndefined: Self = StObject.set(x, "targetX", js.undefined)
    
    @scala.inline
    def setTargetY(value: FieldRef): Self = StObject.set(x, "targetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetYUndefined: Self = StObject.set(x, "targetY", js.undefined)
    
    @scala.inline
    def setType(value: linkpath): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.project
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectTransform
  extends StObject
     with _Transforms {
  
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.undefined
  
  var fields: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  
  var `type`: project
}
object ProjectTransform {
  
  @scala.inline
  def apply(): ProjectTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("project")
    __obj.asInstanceOf[ProjectTransform]
  }
  
  @scala.inline
  implicit class ProjectTransformMutableBuilder[Self <: ProjectTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (js.Array[String | SignalRef | Null]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setAsVarargs(value: (String | SignalRef | Null)*): Self = StObject.set(x, "as", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: FieldRef*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setType(value: project): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

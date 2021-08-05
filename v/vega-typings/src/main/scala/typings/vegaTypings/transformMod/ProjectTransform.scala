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
  
  inline def apply(): ProjectTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("project")
    __obj.asInstanceOf[ProjectTransform]
  }
  
  extension [Self <: ProjectTransform](x: Self) {
    
    inline def setAs(value: (js.Array[String | SignalRef | Null]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAsVarargs(value: (String | SignalRef | Null)*): Self = StObject.set(x, "as", js.Array(value :_*))
    
    inline def setFields(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldRef*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setType(value: project): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

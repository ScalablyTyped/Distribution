package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleMultiDataRef extends StObject {
  
  var fields: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]
}
object ScaleMultiDataRef {
  
  @scala.inline
  def apply(fields: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]): ScaleMultiDataRef = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleMultiDataRef]
  }
  
  @scala.inline
  implicit class ScaleMultiDataRefMutableBuilder[Self <: ScaleMultiDataRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: ((js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef)*): Self = StObject.set(x, "fields", js.Array(value :_*))
  }
}

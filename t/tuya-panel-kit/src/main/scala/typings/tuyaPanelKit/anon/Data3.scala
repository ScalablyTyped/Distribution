package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data3 extends StObject {
  
  var data: `3`
}
object Data3 {
  
  inline def apply(data: `3`): Data3 = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data3]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data3] (val x: Self) extends AnyVal {
    
    inline def setData(value: `3`): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}

package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataClosing extends StObject {
  
  var data: Closing
}
object DataClosing {
  
  inline def apply(data: Closing): DataClosing = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataClosing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataClosing] (val x: Self) extends AnyVal {
    
    inline def setData(value: Closing): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}

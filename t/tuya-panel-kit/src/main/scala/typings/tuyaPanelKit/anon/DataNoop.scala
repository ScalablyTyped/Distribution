package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataNoop extends StObject {
  
  var data: Noop
}
object DataNoop {
  
  inline def apply(data: Noop): DataNoop = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataNoop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataNoop] (val x: Self) extends AnyVal {
    
    inline def setData(value: Noop): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}

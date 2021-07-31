package typings.winrt.anon

import typings.winrt.Windows.Devices.Enumeration.Pnp.PnpObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var items: js.Array[PnpObject]
  
  var returnValue: Double
}
object `4` {
  
  @scala.inline
  def apply(items: js.Array[PnpObject], returnValue: Double): `4` = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[PnpObject]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: PnpObject*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}

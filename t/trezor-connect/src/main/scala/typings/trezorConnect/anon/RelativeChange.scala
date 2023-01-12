package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelativeChange extends StObject {
  
  var relativeChange: Double
}
object RelativeChange {
  
  inline def apply(relativeChange: Double): RelativeChange = {
    val __obj = js.Dynamic.literal(relativeChange = relativeChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelativeChange] (val x: Self) extends AnyVal {
    
    inline def setRelativeChange(value: Double): Self = StObject.set(x, "relativeChange", value.asInstanceOf[js.Any])
  }
}

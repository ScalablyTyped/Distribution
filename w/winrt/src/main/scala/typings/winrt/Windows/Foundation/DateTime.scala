package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTime extends StObject {
  
  var universalTime: Double
}
object DateTime {
  
  inline def apply(universalTime: Double): DateTime = {
    val __obj = js.Dynamic.literal(universalTime = universalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTime] (val x: Self) extends AnyVal {
    
    inline def setUniversalTime(value: Double): Self = StObject.set(x, "universalTime", value.asInstanceOf[js.Any])
  }
}

package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HResult extends StObject {
  
  var value: Double
}
object HResult {
  
  inline def apply(value: Double): HResult = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HResult] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

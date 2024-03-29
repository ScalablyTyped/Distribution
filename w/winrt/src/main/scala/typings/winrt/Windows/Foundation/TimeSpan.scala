package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSpan extends StObject {
  
  var duration: Double
}
object TimeSpan {
  
  inline def apply(duration: Double): TimeSpan = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeSpan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeSpan] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}

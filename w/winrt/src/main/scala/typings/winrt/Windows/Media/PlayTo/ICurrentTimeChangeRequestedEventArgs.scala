package typings.winrt.Windows.Media.PlayTo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICurrentTimeChangeRequestedEventArgs extends StObject {
  
  var time: Double
}
object ICurrentTimeChangeRequestedEventArgs {
  
  inline def apply(time: Double): ICurrentTimeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICurrentTimeChangeRequestedEventArgs]
  }
  
  extension [Self <: ICurrentTimeChangeRequestedEventArgs](x: Self) {
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}

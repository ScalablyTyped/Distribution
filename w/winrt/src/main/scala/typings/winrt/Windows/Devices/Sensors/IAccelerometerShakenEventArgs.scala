package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccelerometerShakenEventArgs extends StObject {
  
  var timestamp: Date = js.native
}
object IAccelerometerShakenEventArgs {
  
  @scala.inline
  def apply(timestamp: Date): IAccelerometerShakenEventArgs = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccelerometerShakenEventArgs]
  }
  
  @scala.inline
  implicit class IAccelerometerShakenEventArgsMutableBuilder[Self <: IAccelerometerShakenEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}

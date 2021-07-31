package typings.winrt.Windows.Devices.Sensors

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccelerometerShakenEventArgs
  extends StObject
     with IAccelerometerShakenEventArgs
object AccelerometerShakenEventArgs {
  
  @scala.inline
  def apply(timestamp: Date): AccelerometerShakenEventArgs = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerShakenEventArgs]
  }
}

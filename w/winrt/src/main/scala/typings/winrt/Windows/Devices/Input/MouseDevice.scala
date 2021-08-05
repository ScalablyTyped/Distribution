package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseDevice
  extends StObject
     with IMouseDevice
object MouseDevice {
  
  inline def apply(onmousemoved: js.Any): MouseDevice = {
    val __obj = js.Dynamic.literal(onmousemoved = onmousemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseDevice]
  }
}

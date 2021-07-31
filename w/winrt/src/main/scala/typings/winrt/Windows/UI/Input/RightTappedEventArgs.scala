package typings.winrt.Windows.UI.Input

import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RightTappedEventArgs
  extends StObject
     with IRightTappedEventArgs
object RightTappedEventArgs {
  
  @scala.inline
  def apply(pointerDeviceType: PointerDeviceType, position: Point): RightTappedEventArgs = {
    val __obj = js.Dynamic.literal(pointerDeviceType = pointerDeviceType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightTappedEventArgs]
  }
}

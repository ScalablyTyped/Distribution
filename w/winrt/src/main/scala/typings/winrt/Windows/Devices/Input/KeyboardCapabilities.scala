package typings.winrt.Windows.Devices.Input

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardCapabilities
  extends StObject
     with IKeyboardCapabilities
object KeyboardCapabilities {
  
  inline def apply(keyboardPresent: Double): KeyboardCapabilities = {
    val __obj = js.Dynamic.literal(keyboardPresent = keyboardPresent.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardCapabilities]
  }
}

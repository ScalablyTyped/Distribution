package typings.winrtUwp.Windows.UI.ViewManagement

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.highcontrastchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides access to the high contrast accessibility settings. */
@js.native
trait AccessibilitySettings extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highcontrastchanged(`type`: highcontrastchanged, listener: TypedEventHandler[AccessibilitySettings, Any]): Unit = js.native
  
  /** Gets a value that indicates whether the system high contrast feature is on or off. */
  var highContrast: Boolean = js.native
  
  /** Gets the name of the default high contrast color scheme. */
  var highContrastScheme: String = js.native
  
  /** Occurs when the system high contrast feature turns on or off. */
  def onhighcontrastchanged(ev: Any & WinRTEvent[AccessibilitySettings]): Unit = js.native
  /** Occurs when the system high contrast feature turns on or off. */
  @JSName("onhighcontrastchanged")
  var onhighcontrastchanged_Original: TypedEventHandler[AccessibilitySettings, Any] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_highcontrastchanged(`type`: highcontrastchanged, listener: TypedEventHandler[AccessibilitySettings, Any]): Unit = js.native
}

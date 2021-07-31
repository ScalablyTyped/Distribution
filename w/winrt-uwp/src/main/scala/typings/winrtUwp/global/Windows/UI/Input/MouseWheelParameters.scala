package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties associated with the button wheel of a mouse device. */
@JSGlobal("Windows.UI.Input.MouseWheelParameters")
@js.native
abstract class MouseWheelParameters ()
  extends StObject
     with typings.winrtUwp.Windows.UI.Input.MouseWheelParameters {
  
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both character width and line height units (as set in the Wheel settings of the Mouse control panel). */
  /* CompleteClass */
  var charTranslation: Point = js.native
  
  /** Gets or sets a value that indicates the change in the angle of rotation associated with input from the wheel button of a mouse. */
  /* CompleteClass */
  var deltaRotationAngle: Double = js.native
  
  /** Gets or sets a value that indicates the change in scale associated with input from the wheel button of a mouse. */
  /* CompleteClass */
  var deltaScale: Double = js.native
  
  /** Gets or sets the device-independent pixel (DIP) conversion factors for both page width and height units (as set in the Wheel settings of the Mouse control panel). */
  /* CompleteClass */
  var pageTranslation: Point = js.native
}

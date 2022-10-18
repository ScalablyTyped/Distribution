package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Windows.Devices.Perception video profile. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Perception.PerceptionVideoProfile")
@js.native
open class PerceptionVideoProfile ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.PerceptionVideoProfile {
  
  /** Gets the bitmap alpha mode. */
  /* CompleteClass */
  var bitmapAlphaMode: BitmapAlphaMode = js.native
  
  /** Gets the bitmap pixel format. */
  /* CompleteClass */
  var bitmapPixelFormat: BitmapPixelFormat = js.native
  
  /** Gets the time duration of each frame. */
  /* CompleteClass */
  var frameDuration: Double = js.native
  
  /** Gets the frame height, in pixels. */
  /* CompleteClass */
  var height: Double = js.native
  
  /**
    * A comparison function used to determine if two IPerceptionVideoProfile objects are equivalent.
    * @param other The IPerceptionVideoProfile object to compare to this one.
    * @return True if the two video profiles are equivalent, otherwise false.
    */
  /* CompleteClass */
  override def isEqual(other: typings.winrtUwp.Windows.Devices.Perception.PerceptionVideoProfile): Boolean = js.native
  
  /** Gets the frame width, in pixels. */
  /* CompleteClass */
  var width: Double = js.native
}

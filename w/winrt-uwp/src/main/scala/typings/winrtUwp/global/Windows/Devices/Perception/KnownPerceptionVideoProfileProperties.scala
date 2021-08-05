package typings.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides static properties of a video profile. */
@JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoProfileProperties")
@js.native
abstract class KnownPerceptionVideoProfileProperties ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Perception.KnownPerceptionVideoProfileProperties
object KnownPerceptionVideoProfileProperties {
  
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoProfileProperties")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets a string key used to retrieve an enumeration property indicating the bitmap alpha mode. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoProfileProperties.bitmapAlphaMode")
  @js.native
  def bitmapAlphaMode: String = js.native
  inline def bitmapAlphaMode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitmapAlphaMode")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve an enumeration property indicating the bitmap pixel format. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoProfileProperties.bitmapPixelFormat")
  @js.native
  def bitmapPixelFormat: String = js.native
  inline def bitmapPixelFormat_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitmapPixelFormat")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve a TimeSpan property indicating the time duration of each frame. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoProfileProperties.frameDuration")
  @js.native
  def frameDuration: String = js.native
  inline def frameDuration_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frameDuration")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve a 32-bit unsigned integer property indicating the frame height, in pixels. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoProfileProperties.height")
  @js.native
  def height: String = js.native
  inline def height_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
  
  /** Gets a string key used to retrieve a 32-bit unsigned integer property indicating the frame width, in pixels. */
  /* static member */
  @JSGlobal("Windows.Devices.Perception.KnownPerceptionVideoProfileProperties.width")
  @js.native
  def width: String = js.native
  inline def width_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
}

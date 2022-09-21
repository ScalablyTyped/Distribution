package typings.winrtUwp.Windows.Devices.Sensors

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Graphics.Display.DisplayOrientations
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.readingchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a gyrometer sensor. */
@js.native
trait Gyrometer extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Gyrometer, GyrometerReadingChangedEventArgs]): Unit = js.native
  
  /** Gets the device identifier. */
  var deviceId: String = js.native
  
  /**
    * Gets the current gyrometer reading.
    * @return This method has no parameters.
    */
  def getCurrentReading(): GyrometerReading = js.native
  
  /** Gets the minimum report interval supported by the gyrometer. */
  var minimumReportInterval: Double = js.native
  
  /** Occurs each time the gyrometer reports the current sensor reading. */
  def onreadingchanged(ev: GyrometerReadingChangedEventArgs & WinRTEvent[Gyrometer]): Unit = js.native
  /** Occurs each time the gyrometer reports the current sensor reading. */
  @JSName("onreadingchanged")
  var onreadingchanged_Original: TypedEventHandler[Gyrometer, GyrometerReadingChangedEventArgs] = js.native
  
  /** Gets or sets the transformation that needs to be applied to sensor data. Transformations to be applied are tied to the display orientation with which to align the sensor data. */
  var readingTransform: DisplayOrientations = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_readingchanged(`type`: readingchanged, listener: TypedEventHandler[Gyrometer, GyrometerReadingChangedEventArgs]): Unit = js.native
  
  /** Gets or sets the current report interval for the gyrometer. */
  var reportInterval: Double = js.native
}

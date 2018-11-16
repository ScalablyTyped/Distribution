package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorTemperaturePreset extends js.Object

/** Defines the values for the possible color temperature presets. */
@JSGlobal("Windows.Media.Devices.ColorTemperaturePreset")
@js.native
object ColorTemperaturePreset extends js.Object {
  /** Indicates that the color temperature is set automatically. */
  @js.native
  sealed trait auto
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by candlelight. */
  @js.native
  sealed trait candlelight
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a cloudy scene. */
  @js.native
  sealed trait cloudy
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a daylight scene. */
  @js.native
  sealed trait daylight
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by a flash. */
  @js.native
  sealed trait flash
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by florescent light. */
  @js.native
  sealed trait fluorescent
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ColorTemperaturePreset
  
  /** Indicates that the color temperature is set manually. */
  @js.native
  sealed trait manual
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by tungsten light. */
  @js.native
  sealed trait tungsten
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ColorTemperaturePreset
  
  val auto: auto with java.lang.String = js.native
  val candlelight: candlelight with java.lang.String = js.native
  val cloudy: cloudy with java.lang.String = js.native
  val daylight: daylight with java.lang.String = js.native
  val flash: flash with java.lang.String = js.native
  val fluorescent: fluorescent with java.lang.String = js.native
  val manual: manual with java.lang.String = js.native
  val tungsten: tungsten with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ColorTemperaturePreset with java.lang.String
  ] = js.native
}


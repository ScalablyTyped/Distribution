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
  
  /* 0 */ val auto: auto with scala.Double = js.native
  /* 7 */ val candlelight: candlelight with scala.Double = js.native
  /* 2 */ val cloudy: cloudy with scala.Double = js.native
  /* 3 */ val daylight: daylight with scala.Double = js.native
  /* 4 */ val flash: flash with scala.Double = js.native
  /* 5 */ val fluorescent: fluorescent with scala.Double = js.native
  /* 1 */ val manual: manual with scala.Double = js.native
  /* 6 */ val tungsten: tungsten with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.ColorTemperaturePreset with scala.Double
  ] = js.native
}


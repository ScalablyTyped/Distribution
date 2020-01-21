package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
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
  sealed trait auto extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by candlelight. */
  @js.native
  sealed trait candlelight extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a cloudy scene. */
  @js.native
  sealed trait cloudy extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a daylight scene. */
  @js.native
  sealed trait daylight extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by a flash. */
  @js.native
  sealed trait flash extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by florescent light. */
  @js.native
  sealed trait fluorescent extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is set manually. */
  @js.native
  sealed trait manual extends ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by tungsten light. */
  @js.native
  sealed trait tungsten extends ColorTemperaturePreset
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorTemperaturePreset with Double] = js.native
  /* 0 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 7 */ @js.native
  object candlelight extends TopLevel[candlelight with Double]
  
  /* 2 */ @js.native
  object cloudy extends TopLevel[cloudy with Double]
  
  /* 3 */ @js.native
  object daylight extends TopLevel[daylight with Double]
  
  /* 4 */ @js.native
  object flash extends TopLevel[flash with Double]
  
  /* 5 */ @js.native
  object fluorescent extends TopLevel[fluorescent with Double]
  
  /* 1 */ @js.native
  object manual extends TopLevel[manual with Double]
  
  /* 6 */ @js.native
  object tungsten extends TopLevel[tungsten with Double]
  
}


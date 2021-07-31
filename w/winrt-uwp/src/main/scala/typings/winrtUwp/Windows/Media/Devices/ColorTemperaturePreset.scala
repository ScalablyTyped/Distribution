package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ColorTemperaturePreset extends StObject
/** Defines the values for the possible color temperature presets. */
@JSGlobal("Windows.Media.Devices.ColorTemperaturePreset")
@js.native
object ColorTemperaturePreset extends StObject {
  
  /** Indicates that the color temperature is set automatically. */
  @js.native
  sealed trait auto
    extends StObject
       with ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by candlelight. */
  @js.native
  sealed trait candlelight
    extends StObject
       with ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a cloudy scene. */
  @js.native
  sealed trait cloudy
    extends StObject
       with ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a daylight scene. */
  @js.native
  sealed trait daylight
    extends StObject
       with ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by a flash. */
  @js.native
  sealed trait flash
    extends StObject
       with ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by florescent light. */
  @js.native
  sealed trait fluorescent
    extends StObject
       with ColorTemperaturePreset
  
  /** Indicates that the color temperature is set manually. */
  @js.native
  sealed trait manual
    extends StObject
       with ColorTemperaturePreset
  
  /** Indicates that the color temperature is adjusted for a scene lit by tungsten light. */
  @js.native
  sealed trait tungsten
    extends StObject
       with ColorTemperaturePreset
}

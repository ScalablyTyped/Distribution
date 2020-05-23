package typings.winrtUwp.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IsoSpeedPreset extends js.Object

/** Defines the possible values for ISO speed presets. */
@JSGlobal("Windows.Media.Devices.IsoSpeedPreset")
@js.native
object IsoSpeedPreset extends js.Object {
  /** The film speed is automatically set. */
  @js.native
  sealed trait auto extends IsoSpeedPreset
  
  /** The film speed is set to 100 ISO. */
  @js.native
  sealed trait iso100 extends IsoSpeedPreset
  
  /** The film speed is set to 12800 ISO. */
  @js.native
  sealed trait iso12800 extends IsoSpeedPreset
  
  /** The film speed is set to 1600 ISO. */
  @js.native
  sealed trait iso1600 extends IsoSpeedPreset
  
  /** The film speed is set to 200 ISO. */
  @js.native
  sealed trait iso200 extends IsoSpeedPreset
  
  /** The film speed is set to 25600 ISO. */
  @js.native
  sealed trait iso25600 extends IsoSpeedPreset
  
  /** The film speed is set to 3200 ISO. */
  @js.native
  sealed trait iso3200 extends IsoSpeedPreset
  
  /** The film speed is set to 400 ISO. */
  @js.native
  sealed trait iso400 extends IsoSpeedPreset
  
  /** The film speed is set to 50 ISO. */
  @js.native
  sealed trait iso50 extends IsoSpeedPreset
  
  /** The film speed is set to 6400 ISO. */
  @js.native
  sealed trait iso6400 extends IsoSpeedPreset
  
  /** The film speed is set to 80 ISO. */
  @js.native
  sealed trait iso80 extends IsoSpeedPreset
  
  /** The film speed is set to 800 ISO. */
  @js.native
  sealed trait iso800 extends IsoSpeedPreset
  
}


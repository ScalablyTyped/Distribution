package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

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
  
  /* 0 */ val auto: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset.auto with Double = js.native
  /* 3 */ val iso100: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset.iso100 with Double = js.native
  /* 10 */ val iso12800: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset.iso12800 with Double = js.native
  /* 7 */ val iso1600: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset.iso1600 with Double = js.native
  /* 4 */ val iso200: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset.iso200 with Double = js.native
  /* 11 */ val iso25600: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset.iso25600 with Double = js.native
  /* 8 */ val iso3200: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset.iso3200 with Double = js.native
  /* 5 */ val iso400: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset.iso400 with Double = js.native
  /* 1 */ val iso50: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset.iso50 with Double = js.native
  /* 9 */ val iso6400: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset.iso6400 with Double = js.native
  /* 2 */ val iso80: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset.iso80 with Double = js.native
  /* 6 */ val iso800: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset.iso800 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IsoSpeedPreset with Double] = js.native
}


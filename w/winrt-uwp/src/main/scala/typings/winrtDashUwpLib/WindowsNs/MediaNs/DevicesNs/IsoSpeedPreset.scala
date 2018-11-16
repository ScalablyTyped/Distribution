package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

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
  sealed trait auto
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset
  
  /** The film speed is set to 100 ISO. */
  @js.native
  sealed trait iso100
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset
  
  /** The film speed is set to 12800 ISO. */
  @js.native
  sealed trait iso12800
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset
  
  /** The film speed is set to 1600 ISO. */
  @js.native
  sealed trait iso1600
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset
  
  /** The film speed is set to 200 ISO. */
  @js.native
  sealed trait iso200
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset
  
  /** The film speed is set to 25600 ISO. */
  @js.native
  sealed trait iso25600
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset
  
  /** The film speed is set to 3200 ISO. */
  @js.native
  sealed trait iso3200
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset
  
  /** The film speed is set to 400 ISO. */
  @js.native
  sealed trait iso400
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset
  
  /** The film speed is set to 50 ISO. */
  @js.native
  sealed trait iso50
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset
  
  /** The film speed is set to 6400 ISO. */
  @js.native
  sealed trait iso6400
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset
  
  /** The film speed is set to 80 ISO. */
  @js.native
  sealed trait iso80
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset
  
  /** The film speed is set to 800 ISO. */
  @js.native
  sealed trait iso800
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset
  
  val auto: auto with java.lang.String = js.native
  val iso100: iso100 with java.lang.String = js.native
  val iso12800: iso12800 with java.lang.String = js.native
  val iso1600: iso1600 with java.lang.String = js.native
  val iso200: iso200 with java.lang.String = js.native
  val iso25600: iso25600 with java.lang.String = js.native
  val iso3200: iso3200 with java.lang.String = js.native
  val iso400: iso400 with java.lang.String = js.native
  val iso50: iso50 with java.lang.String = js.native
  val iso6400: iso6400 with java.lang.String = js.native
  val iso80: iso80 with java.lang.String = js.native
  val iso800: iso800 with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.IsoSpeedPreset with java.lang.String] = js.native
}


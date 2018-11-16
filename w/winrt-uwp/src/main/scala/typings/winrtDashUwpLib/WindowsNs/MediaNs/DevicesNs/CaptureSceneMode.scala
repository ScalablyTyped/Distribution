package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CaptureSceneMode extends js.Object

/** Defines the possible capture scene modes. */
@JSGlobal("Windows.Media.Devices.CaptureSceneMode")
@js.native
object CaptureSceneMode extends js.Object {
  /** Indicates that the best settings and exposure optimization are automatically performed. */
  @js.native
  sealed trait auto
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for photos that are backlit. */
  @js.native
  sealed trait backlit
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for beach photos. */
  @js.native
  sealed trait beach
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for candlelight photos. */
  @js.native
  sealed trait candlelight
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for photos of landscape. */
  @js.native
  sealed trait landscape
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for macro photos. */
  @js.native
  sealed trait `macro`
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
  
  /** Indicates that no optimization is performed on the captured frame. */
  @js.native
  sealed trait manual
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for night photos */
  @js.native
  sealed trait night
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for low-light portrait photos. */
  @js.native
  sealed trait nightPortrait
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for portrait photos. */
  @js.native
  sealed trait portrait
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for photos that include snow. */
  @js.native
  sealed trait snow
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for sports photos. */
  @js.native
  sealed trait sport
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for sunset photos. */
  @js.native
  sealed trait sunset
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
  
  val auto: auto with java.lang.String = js.native
  val backlit: backlit with java.lang.String = js.native
  val beach: beach with java.lang.String = js.native
  val candlelight: candlelight with java.lang.String = js.native
  val landscape: landscape with java.lang.String = js.native
  val `macro`: `macro` with java.lang.String = js.native
  val manual: manual with java.lang.String = js.native
  val night: night with java.lang.String = js.native
  val nightPortrait: nightPortrait with java.lang.String = js.native
  val portrait: portrait with java.lang.String = js.native
  val snow: snow with java.lang.String = js.native
  val sport: sport with java.lang.String = js.native
  val sunset: sunset with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode with java.lang.String
  ] = js.native
}


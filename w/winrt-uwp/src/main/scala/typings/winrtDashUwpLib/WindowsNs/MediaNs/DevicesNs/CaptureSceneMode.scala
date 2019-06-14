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
  
  /* 0 */ val auto: auto with scala.Double = js.native
  /* 12 */ val backlit: backlit with scala.Double = js.native
  /* 7 */ val beach: beach with scala.Double = js.native
  /* 9 */ val candlelight: candlelight with scala.Double = js.native
  /* 10 */ val landscape: landscape with scala.Double = js.native
  /* 2 */ val `macro`: `macro` with scala.Double = js.native
  /* 1 */ val manual: manual with scala.Double = js.native
  /* 6 */ val night: night with scala.Double = js.native
  /* 11 */ val nightPortrait: nightPortrait with scala.Double = js.native
  /* 3 */ val portrait: portrait with scala.Double = js.native
  /* 5 */ val snow: snow with scala.Double = js.native
  /* 4 */ val sport: sport with scala.Double = js.native
  /* 8 */ val sunset: sunset with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode with scala.Double] = js.native
}


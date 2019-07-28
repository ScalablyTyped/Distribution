package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

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
  sealed trait auto extends CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for photos that are backlit. */
  @js.native
  sealed trait backlit extends CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for beach photos. */
  @js.native
  sealed trait beach extends CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for candlelight photos. */
  @js.native
  sealed trait candlelight extends CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for photos of landscape. */
  @js.native
  sealed trait landscape extends CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for macro photos. */
  @js.native
  sealed trait `macro` extends CaptureSceneMode
  
  /** Indicates that no optimization is performed on the captured frame. */
  @js.native
  sealed trait manual extends CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for night photos */
  @js.native
  sealed trait night extends CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for low-light portrait photos. */
  @js.native
  sealed trait nightPortrait extends CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for portrait photos. */
  @js.native
  sealed trait portrait extends CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for photos that include snow. */
  @js.native
  sealed trait snow extends CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for sports photos. */
  @js.native
  sealed trait sport extends CaptureSceneMode
  
  /** Indicates that the captured framed is optimized for sunset photos. */
  @js.native
  sealed trait sunset extends CaptureSceneMode
  
  /* 0 */ val auto: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode.auto with Double = js.native
  /* 12 */ val backlit: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode.backlit with Double = js.native
  /* 7 */ val beach: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode.beach with Double = js.native
  /* 9 */ val candlelight: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode.candlelight with Double = js.native
  /* 10 */ val landscape: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode.landscape with Double = js.native
  /* 2 */ val `macro`: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode.`macro` with Double = js.native
  /* 1 */ val manual: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode.manual with Double = js.native
  /* 6 */ val night: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode.night with Double = js.native
  /* 11 */ val nightPortrait: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode.nightPortrait with Double = js.native
  /* 3 */ val portrait: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode.portrait with Double = js.native
  /* 5 */ val snow: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode.snow with Double = js.native
  /* 4 */ val sport: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode.sport with Double = js.native
  /* 8 */ val sunset: typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode.sunset with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CaptureSceneMode with Double] = js.native
}


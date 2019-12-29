package typings.winrtDashUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CaptureSceneMode with Double] = js.native
  /* 0 */ @js.native
  object auto extends TopLevel[auto with Double]
  
  /* 12 */ @js.native
  object backlit extends TopLevel[backlit with Double]
  
  /* 7 */ @js.native
  object beach extends TopLevel[beach with Double]
  
  /* 9 */ @js.native
  object candlelight extends TopLevel[candlelight with Double]
  
  /* 10 */ @js.native
  object landscape extends TopLevel[landscape with Double]
  
  /* 2 */ @js.native
  object `macro` extends TopLevel[`macro` with Double]
  
  /* 1 */ @js.native
  object manual extends TopLevel[manual with Double]
  
  /* 6 */ @js.native
  object night extends TopLevel[night with Double]
  
  /* 11 */ @js.native
  object nightPortrait extends TopLevel[nightPortrait with Double]
  
  /* 3 */ @js.native
  object portrait extends TopLevel[portrait with Double]
  
  /* 5 */ @js.native
  object snow extends TopLevel[snow with Double]
  
  /* 4 */ @js.native
  object sport extends TopLevel[sport with Double]
  
  /* 8 */ @js.native
  object sunset extends TopLevel[sunset with Double]
  
}


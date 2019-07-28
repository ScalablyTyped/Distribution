package typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClosedCaptionEdgeEffect extends js.Object

/** Specifies the edge effect of closed caption text. */
@JSGlobal("Windows.Media.ClosedCaptioning.ClosedCaptionEdgeEffect")
@js.native
object ClosedCaptionEdgeEffect extends js.Object {
  /** The default edge effect. */
  @js.native
  sealed trait default extends ClosedCaptionEdgeEffect
  
  /** Depressed edge. */
  @js.native
  sealed trait depressed extends ClosedCaptionEdgeEffect
  
  /** Drop shadow. */
  @js.native
  sealed trait dropShadow extends ClosedCaptionEdgeEffect
  
  /** No edge effect. */
  @js.native
  sealed trait none extends ClosedCaptionEdgeEffect
  
  /** Raised edge. */
  @js.native
  sealed trait raised extends ClosedCaptionEdgeEffect
  
  /** Uniform edge */
  @js.native
  sealed trait uniform extends ClosedCaptionEdgeEffect
  
  /* 0 */ val default: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionEdgeEffect.default with Double = js.native
  /* 3 */ val depressed: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionEdgeEffect.depressed with Double = js.native
  /* 5 */ val dropShadow: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionEdgeEffect.dropShadow with Double = js.native
  /* 1 */ val none: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionEdgeEffect.none with Double = js.native
  /* 2 */ val raised: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionEdgeEffect.raised with Double = js.native
  /* 4 */ val uniform: typings.winrtDashUwp.WindowsNs.MediaNs.ClosedCaptioningNs.ClosedCaptionEdgeEffect.uniform with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClosedCaptionEdgeEffect with Double] = js.native
}


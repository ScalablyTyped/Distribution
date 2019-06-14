package typings
package winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnimationEffectTarget extends js.Object

/** Specifies a participant in an animation. */
@JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffectTarget")
@js.native
object AnimationEffectTarget extends js.Object {
  /** Objects that are being added. */
  @js.native
  sealed trait added
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** Objects affected by the animation, such as objects that move out of the way when another object is dropped between them. */
  @js.native
  sealed trait affected
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** The background object of the item. */
  @js.native
  sealed trait background
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** The content of the item. */
  @js.native
  sealed trait content
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** Objects that are being deleted. */
  @js.native
  sealed trait deleted
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** Objects that have been deselected through a cross-slide deselect interaction. */
  @js.native
  sealed trait deselected
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** Objects that are being dragged. */
  @js.native
  sealed trait dragSource
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** Objects that are currently hidden. */
  @js.native
  sealed trait hidden
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** New content to replace old content. */
  @js.native
  sealed trait incoming
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** Old content that is being replaced by new content. */
  @js.native
  sealed trait outgoing
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** An outline border around an area. */
  @js.native
  sealed trait outline
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** The only participant in an single-target animation. */
  @js.native
  sealed trait primary
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** Objects that are left behind after other items have been removed. */
  @js.native
  sealed trait remaining
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** Objects that become visible in an expansion. */
  @js.native
  sealed trait revealed
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** A row that is being added to a grid. */
  @js.native
  sealed trait rowIn
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** A row that is about to be removed from a grid. */
  @js.native
  sealed trait rowOut
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** Objects that are selected through a cross-slide select interaction. */
  @js.native
  sealed trait selected
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** Objects, such as checkmarks, that indicate that an item is selected. */
  @js.native
  sealed trait selection
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** Objects previously invisible that are becoming visible. */
  @js.native
  sealed trait shown
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /** Objects that have been tapped or clicked on. */
  @js.native
  sealed trait tapped
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget
  
  /* 1 */ val added: added with scala.Double = js.native
  /* 2 */ val affected: affected with scala.Double = js.native
  /* 3 */ val background: background with scala.Double = js.native
  /* 4 */ val content: content with scala.Double = js.native
  /* 5 */ val deleted: deleted with scala.Double = js.native
  /* 6 */ val deselected: deselected with scala.Double = js.native
  /* 7 */ val dragSource: dragSource with scala.Double = js.native
  /* 8 */ val hidden: hidden with scala.Double = js.native
  /* 9 */ val incoming: incoming with scala.Double = js.native
  /* 10 */ val outgoing: outgoing with scala.Double = js.native
  /* 11 */ val outline: outline with scala.Double = js.native
  /* 0 */ val primary: primary with scala.Double = js.native
  /* 12 */ val remaining: remaining with scala.Double = js.native
  /* 13 */ val revealed: revealed with scala.Double = js.native
  /* 14 */ val rowIn: rowIn with scala.Double = js.native
  /* 15 */ val rowOut: rowOut with scala.Double = js.native
  /* 16 */ val selected: selected with scala.Double = js.native
  /* 17 */ val selection: selection with scala.Double = js.native
  /* 18 */ val shown: shown with scala.Double = js.native
  /* 19 */ val tapped: tapped with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget with scala.Double
  ] = js.native
}


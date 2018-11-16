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
  
  val added: added with java.lang.String = js.native
  val affected: affected with java.lang.String = js.native
  val background: background with java.lang.String = js.native
  val content: content with java.lang.String = js.native
  val deleted: deleted with java.lang.String = js.native
  val deselected: deselected with java.lang.String = js.native
  val dragSource: dragSource with java.lang.String = js.native
  val hidden: hidden with java.lang.String = js.native
  val incoming: incoming with java.lang.String = js.native
  val outgoing: outgoing with java.lang.String = js.native
  val outline: outline with java.lang.String = js.native
  val primary: primary with java.lang.String = js.native
  val remaining: remaining with java.lang.String = js.native
  val revealed: revealed with java.lang.String = js.native
  val rowIn: rowIn with java.lang.String = js.native
  val rowOut: rowOut with java.lang.String = js.native
  val selected: selected with java.lang.String = js.native
  val selection: selection with java.lang.String = js.native
  val shown: shown with java.lang.String = js.native
  val tapped: tapped with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget with java.lang.String
  ] = js.native
}


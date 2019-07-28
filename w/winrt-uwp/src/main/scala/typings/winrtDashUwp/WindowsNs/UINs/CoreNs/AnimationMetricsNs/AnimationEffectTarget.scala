package typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs

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
  sealed trait added extends AnimationEffectTarget
  
  /** Objects affected by the animation, such as objects that move out of the way when another object is dropped between them. */
  @js.native
  sealed trait affected extends AnimationEffectTarget
  
  /** The background object of the item. */
  @js.native
  sealed trait background extends AnimationEffectTarget
  
  /** The content of the item. */
  @js.native
  sealed trait content extends AnimationEffectTarget
  
  /** Objects that are being deleted. */
  @js.native
  sealed trait deleted extends AnimationEffectTarget
  
  /** Objects that have been deselected through a cross-slide deselect interaction. */
  @js.native
  sealed trait deselected extends AnimationEffectTarget
  
  /** Objects that are being dragged. */
  @js.native
  sealed trait dragSource extends AnimationEffectTarget
  
  /** Objects that are currently hidden. */
  @js.native
  sealed trait hidden extends AnimationEffectTarget
  
  /** New content to replace old content. */
  @js.native
  sealed trait incoming extends AnimationEffectTarget
  
  /** Old content that is being replaced by new content. */
  @js.native
  sealed trait outgoing extends AnimationEffectTarget
  
  /** An outline border around an area. */
  @js.native
  sealed trait outline extends AnimationEffectTarget
  
  /** The only participant in an single-target animation. */
  @js.native
  sealed trait primary extends AnimationEffectTarget
  
  /** Objects that are left behind after other items have been removed. */
  @js.native
  sealed trait remaining extends AnimationEffectTarget
  
  /** Objects that become visible in an expansion. */
  @js.native
  sealed trait revealed extends AnimationEffectTarget
  
  /** A row that is being added to a grid. */
  @js.native
  sealed trait rowIn extends AnimationEffectTarget
  
  /** A row that is about to be removed from a grid. */
  @js.native
  sealed trait rowOut extends AnimationEffectTarget
  
  /** Objects that are selected through a cross-slide select interaction. */
  @js.native
  sealed trait selected extends AnimationEffectTarget
  
  /** Objects, such as checkmarks, that indicate that an item is selected. */
  @js.native
  sealed trait selection extends AnimationEffectTarget
  
  /** Objects previously invisible that are becoming visible. */
  @js.native
  sealed trait shown extends AnimationEffectTarget
  
  /** Objects that have been tapped or clicked on. */
  @js.native
  sealed trait tapped extends AnimationEffectTarget
  
  /* 1 */ val added: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.added with Double = js.native
  /* 2 */ val affected: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.affected with Double = js.native
  /* 3 */ val background: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.background with Double = js.native
  /* 4 */ val content: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.content with Double = js.native
  /* 5 */ val deleted: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.deleted with Double = js.native
  /* 6 */ val deselected: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.deselected with Double = js.native
  /* 7 */ val dragSource: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.dragSource with Double = js.native
  /* 8 */ val hidden: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.hidden with Double = js.native
  /* 9 */ val incoming: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.incoming with Double = js.native
  /* 10 */ val outgoing: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.outgoing with Double = js.native
  /* 11 */ val outline: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.outline with Double = js.native
  /* 0 */ val primary: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.primary with Double = js.native
  /* 12 */ val remaining: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.remaining with Double = js.native
  /* 13 */ val revealed: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.revealed with Double = js.native
  /* 14 */ val rowIn: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.rowIn with Double = js.native
  /* 15 */ val rowOut: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.rowOut with Double = js.native
  /* 16 */ val selected: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.selected with Double = js.native
  /* 17 */ val selection: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.selection with Double = js.native
  /* 18 */ val shown: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.shown with Double = js.native
  /* 19 */ val tapped: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffectTarget.tapped with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimationEffectTarget with Double] = js.native
}


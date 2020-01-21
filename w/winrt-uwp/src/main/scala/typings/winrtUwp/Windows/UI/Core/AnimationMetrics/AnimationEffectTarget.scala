package typings.winrtUwp.Windows.UI.Core.AnimationMetrics

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimationEffectTarget with Double] = js.native
  /* 1 */ @js.native
  object added extends TopLevel[added with Double]
  
  /* 2 */ @js.native
  object affected extends TopLevel[affected with Double]
  
  /* 3 */ @js.native
  object background extends TopLevel[background with Double]
  
  /* 4 */ @js.native
  object content extends TopLevel[content with Double]
  
  /* 5 */ @js.native
  object deleted extends TopLevel[deleted with Double]
  
  /* 6 */ @js.native
  object deselected extends TopLevel[deselected with Double]
  
  /* 7 */ @js.native
  object dragSource extends TopLevel[dragSource with Double]
  
  /* 8 */ @js.native
  object hidden extends TopLevel[hidden with Double]
  
  /* 9 */ @js.native
  object incoming extends TopLevel[incoming with Double]
  
  /* 10 */ @js.native
  object outgoing extends TopLevel[outgoing with Double]
  
  /* 11 */ @js.native
  object outline extends TopLevel[outline with Double]
  
  /* 0 */ @js.native
  object primary extends TopLevel[primary with Double]
  
  /* 12 */ @js.native
  object remaining extends TopLevel[remaining with Double]
  
  /* 13 */ @js.native
  object revealed extends TopLevel[revealed with Double]
  
  /* 14 */ @js.native
  object rowIn extends TopLevel[rowIn with Double]
  
  /* 15 */ @js.native
  object rowOut extends TopLevel[rowOut with Double]
  
  /* 16 */ @js.native
  object selected extends TopLevel[selected with Double]
  
  /* 17 */ @js.native
  object selection extends TopLevel[selection with Double]
  
  /* 18 */ @js.native
  object shown extends TopLevel[shown with Double]
  
  /* 19 */ @js.native
  object tapped extends TopLevel[tapped with Double]
  
}


package typings.winrtUwp.Windows.UI.Core.AnimationMetrics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnimationEffectTarget extends StObject
/** Specifies a participant in an animation. */
@JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffectTarget")
@js.native
object AnimationEffectTarget extends StObject {
  
  /** Objects that are being added. */
  @js.native
  sealed trait added
    extends StObject
       with AnimationEffectTarget
  
  /** Objects affected by the animation, such as objects that move out of the way when another object is dropped between them. */
  @js.native
  sealed trait affected
    extends StObject
       with AnimationEffectTarget
  
  /** The background object of the item. */
  @js.native
  sealed trait background
    extends StObject
       with AnimationEffectTarget
  
  /** The content of the item. */
  @js.native
  sealed trait content
    extends StObject
       with AnimationEffectTarget
  
  /** Objects that are being deleted. */
  @js.native
  sealed trait deleted
    extends StObject
       with AnimationEffectTarget
  
  /** Objects that have been deselected through a cross-slide deselect interaction. */
  @js.native
  sealed trait deselected
    extends StObject
       with AnimationEffectTarget
  
  /** Objects that are being dragged. */
  @js.native
  sealed trait dragSource
    extends StObject
       with AnimationEffectTarget
  
  /** Objects that are currently hidden. */
  @js.native
  sealed trait hidden
    extends StObject
       with AnimationEffectTarget
  
  /** New content to replace old content. */
  @js.native
  sealed trait incoming
    extends StObject
       with AnimationEffectTarget
  
  /** Old content that is being replaced by new content. */
  @js.native
  sealed trait outgoing
    extends StObject
       with AnimationEffectTarget
  
  /** An outline border around an area. */
  @js.native
  sealed trait outline
    extends StObject
       with AnimationEffectTarget
  
  /** The only participant in an single-target animation. */
  @js.native
  sealed trait primary
    extends StObject
       with AnimationEffectTarget
  
  /** Objects that are left behind after other items have been removed. */
  @js.native
  sealed trait remaining
    extends StObject
       with AnimationEffectTarget
  
  /** Objects that become visible in an expansion. */
  @js.native
  sealed trait revealed
    extends StObject
       with AnimationEffectTarget
  
  /** A row that is being added to a grid. */
  @js.native
  sealed trait rowIn
    extends StObject
       with AnimationEffectTarget
  
  /** A row that is about to be removed from a grid. */
  @js.native
  sealed trait rowOut
    extends StObject
       with AnimationEffectTarget
  
  /** Objects that are selected through a cross-slide select interaction. */
  @js.native
  sealed trait selected
    extends StObject
       with AnimationEffectTarget
  
  /** Objects, such as checkmarks, that indicate that an item is selected. */
  @js.native
  sealed trait selection
    extends StObject
       with AnimationEffectTarget
  
  /** Objects previously invisible that are becoming visible. */
  @js.native
  sealed trait shown
    extends StObject
       with AnimationEffectTarget
  
  /** Objects that have been tapped or clicked on. */
  @js.native
  sealed trait tapped
    extends StObject
       with AnimationEffectTarget
}

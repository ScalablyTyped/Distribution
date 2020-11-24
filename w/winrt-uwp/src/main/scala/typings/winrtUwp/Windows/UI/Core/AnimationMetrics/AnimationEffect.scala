package typings.winrtUwp.Windows.UI.Core.AnimationMetrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnimationEffect extends js.Object
/** Specifies an animation. */
@JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffect")
@js.native
object AnimationEffect extends js.Object {
  
  /** An object is added to a collection that is arranged in a grid. */
  @js.native
  sealed trait addToGrid extends AnimationEffect
  
  /** An object is added to a list. */
  @js.native
  sealed trait addToList extends AnimationEffect
  
  /** An object is added to search results that are arranged in a grid. */
  @js.native
  sealed trait addToSearchGrid extends AnimationEffect
  
  /** An object is added to a vertically arranged list of search results. */
  @js.native
  sealed trait addToSearchList extends AnimationEffect
  
  /** An object decreases in size to hide content. */
  @js.native
  sealed trait collapse extends AnimationEffect
  
  /** One item is faded out as another fades in in its place. */
  @js.native
  sealed trait crossFade extends AnimationEffect
  
  /** An object is removed from a collection that is arranged in a grid. */
  @js.native
  sealed trait deleteFromGrid extends AnimationEffect
  
  /** An object is removed from a list. */
  @js.native
  sealed trait deleteFromList extends AnimationEffect
  
  /** An object is removed from search results that are arranged in a grid. */
  @js.native
  sealed trait deleteFromSearchGrid extends AnimationEffect
  
  /** An object is removed from a vertically arranged list of search results. */
  @js.native
  sealed trait deleteFromSearchList extends AnimationEffect
  
  /** A drag source has moved between two items. */
  @js.native
  sealed trait dragBetweenEnter extends AnimationEffect
  
  /** A drag source is no longer between two items. */
  @js.native
  sealed trait dragBetweenLeave extends AnimationEffect
  
  /** The user has stopped dragging an item. */
  @js.native
  sealed trait dragSourceEnd extends AnimationEffect
  
  /** The user has begun dragging an item. */
  @js.native
  sealed trait dragSourceStart extends AnimationEffect
  
  /** A page of content is brought in to the display. */
  @js.native
  sealed trait enterPage extends AnimationEffect
  
  /** An object increases in size to reveal additional content. */
  @js.native
  sealed trait expand extends AnimationEffect
  
  /** A contextual control fades in. */
  @js.native
  sealed trait fadeIn extends AnimationEffect
  
  /** A contextual control fades out. */
  @js.native
  sealed trait fadeOut extends AnimationEffect
  
  /** UI collapses around a tapped or clicked target. */
  @js.native
  sealed trait hide extends AnimationEffect
  
  /** UI displayed at the edge of the screen is removed. */
  @js.native
  sealed trait hideEdgeUI extends AnimationEffect
  
  /** A section of content is removed from the screen. */
  @js.native
  sealed trait hidePanel extends AnimationEffect
  
  /** A pop-up control is removed from the screen. */
  @js.native
  sealed trait hidePopup extends AnimationEffect
  
  /** Contents of a tile move up or down to show a part of the tile that is normally hidden. */
  @js.native
  sealed trait peek extends AnimationEffect
  
  /** The pointing device (such as a mouse or touch) has engaged on an item. */
  @js.native
  sealed trait pointerDown extends AnimationEffect
  
  /** The pointing device (such as a mouse or touch) has disengaged from an item. */
  @js.native
  sealed trait pointerUp extends AnimationEffect
  
  /** An object changes position. No more specific animation applies. */
  @js.native
  sealed trait reposition extends AnimationEffect
  
  /** UI expands around a tapped or clicked target. */
  @js.native
  sealed trait reveal extends AnimationEffect
  
  /** UI is brought in from the edge of the screen. */
  @js.native
  sealed trait showEdgeUI extends AnimationEffect
  
  /** A section of content appears on the screen. */
  @js.native
  sealed trait showPanel extends AnimationEffect
  
  /** A pop-up control appears on the screen. */
  @js.native
  sealed trait showPopup extends AnimationEffect
  
  /** An object has been deselected through the swipe interaction. */
  @js.native
  sealed trait swipeDeselect extends AnimationEffect
  
  /** Triggered by a press and hold on an item that can be cross-slide selected. */
  @js.native
  sealed trait swipeReveal extends AnimationEffect
  
  /** An object has been selected through the swipe interaction. */
  @js.native
  sealed trait swipeSelect extends AnimationEffect
  
  /** Large-scale content replacement is occuring. */
  @js.native
  sealed trait transitionContent extends AnimationEffect
  
  /** One page is replaced by another page. */
  @js.native
  sealed trait transitionPage extends AnimationEffect
  
  /** Update a tile's badge overlay. */
  @js.native
  sealed trait updateBadge extends AnimationEffect
}

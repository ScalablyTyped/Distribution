package typings.winrtUwp.Windows.UI.Core.AnimationMetrics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AnimationEffect extends StObject
/** Specifies an animation. */
@JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffect")
@js.native
object AnimationEffect extends StObject {
  
  /** An object is added to a collection that is arranged in a grid. */
  @js.native
  sealed trait addToGrid
    extends StObject
       with AnimationEffect
  
  /** An object is added to a list. */
  @js.native
  sealed trait addToList
    extends StObject
       with AnimationEffect
  
  /** An object is added to search results that are arranged in a grid. */
  @js.native
  sealed trait addToSearchGrid
    extends StObject
       with AnimationEffect
  
  /** An object is added to a vertically arranged list of search results. */
  @js.native
  sealed trait addToSearchList
    extends StObject
       with AnimationEffect
  
  /** An object decreases in size to hide content. */
  @js.native
  sealed trait collapse
    extends StObject
       with AnimationEffect
  
  /** One item is faded out as another fades in in its place. */
  @js.native
  sealed trait crossFade
    extends StObject
       with AnimationEffect
  
  /** An object is removed from a collection that is arranged in a grid. */
  @js.native
  sealed trait deleteFromGrid
    extends StObject
       with AnimationEffect
  
  /** An object is removed from a list. */
  @js.native
  sealed trait deleteFromList
    extends StObject
       with AnimationEffect
  
  /** An object is removed from search results that are arranged in a grid. */
  @js.native
  sealed trait deleteFromSearchGrid
    extends StObject
       with AnimationEffect
  
  /** An object is removed from a vertically arranged list of search results. */
  @js.native
  sealed trait deleteFromSearchList
    extends StObject
       with AnimationEffect
  
  /** A drag source has moved between two items. */
  @js.native
  sealed trait dragBetweenEnter
    extends StObject
       with AnimationEffect
  
  /** A drag source is no longer between two items. */
  @js.native
  sealed trait dragBetweenLeave
    extends StObject
       with AnimationEffect
  
  /** The user has stopped dragging an item. */
  @js.native
  sealed trait dragSourceEnd
    extends StObject
       with AnimationEffect
  
  /** The user has begun dragging an item. */
  @js.native
  sealed trait dragSourceStart
    extends StObject
       with AnimationEffect
  
  /** A page of content is brought in to the display. */
  @js.native
  sealed trait enterPage
    extends StObject
       with AnimationEffect
  
  /** An object increases in size to reveal additional content. */
  @js.native
  sealed trait expand
    extends StObject
       with AnimationEffect
  
  /** A contextual control fades in. */
  @js.native
  sealed trait fadeIn
    extends StObject
       with AnimationEffect
  
  /** A contextual control fades out. */
  @js.native
  sealed trait fadeOut
    extends StObject
       with AnimationEffect
  
  /** UI collapses around a tapped or clicked target. */
  @js.native
  sealed trait hide
    extends StObject
       with AnimationEffect
  
  /** UI displayed at the edge of the screen is removed. */
  @js.native
  sealed trait hideEdgeUI
    extends StObject
       with AnimationEffect
  
  /** A section of content is removed from the screen. */
  @js.native
  sealed trait hidePanel
    extends StObject
       with AnimationEffect
  
  /** A pop-up control is removed from the screen. */
  @js.native
  sealed trait hidePopup
    extends StObject
       with AnimationEffect
  
  /** Contents of a tile move up or down to show a part of the tile that is normally hidden. */
  @js.native
  sealed trait peek
    extends StObject
       with AnimationEffect
  
  /** The pointing device (such as a mouse or touch) has engaged on an item. */
  @js.native
  sealed trait pointerDown
    extends StObject
       with AnimationEffect
  
  /** The pointing device (such as a mouse or touch) has disengaged from an item. */
  @js.native
  sealed trait pointerUp
    extends StObject
       with AnimationEffect
  
  /** An object changes position. No more specific animation applies. */
  @js.native
  sealed trait reposition
    extends StObject
       with AnimationEffect
  
  /** UI expands around a tapped or clicked target. */
  @js.native
  sealed trait reveal
    extends StObject
       with AnimationEffect
  
  /** UI is brought in from the edge of the screen. */
  @js.native
  sealed trait showEdgeUI
    extends StObject
       with AnimationEffect
  
  /** A section of content appears on the screen. */
  @js.native
  sealed trait showPanel
    extends StObject
       with AnimationEffect
  
  /** A pop-up control appears on the screen. */
  @js.native
  sealed trait showPopup
    extends StObject
       with AnimationEffect
  
  /** An object has been deselected through the swipe interaction. */
  @js.native
  sealed trait swipeDeselect
    extends StObject
       with AnimationEffect
  
  /** Triggered by a press and hold on an item that can be cross-slide selected. */
  @js.native
  sealed trait swipeReveal
    extends StObject
       with AnimationEffect
  
  /** An object has been selected through the swipe interaction. */
  @js.native
  sealed trait swipeSelect
    extends StObject
       with AnimationEffect
  
  /** Large-scale content replacement is occuring. */
  @js.native
  sealed trait transitionContent
    extends StObject
       with AnimationEffect
  
  /** One page is replaced by another page. */
  @js.native
  sealed trait transitionPage
    extends StObject
       with AnimationEffect
  
  /** Update a tile's badge overlay. */
  @js.native
  sealed trait updateBadge
    extends StObject
       with AnimationEffect
}

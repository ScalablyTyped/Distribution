package typings
package winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnimationEffect extends js.Object

/** Specifies an animation. */
@JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffect")
@js.native
object AnimationEffect extends js.Object {
  /** An object is added to a collection that is arranged in a grid. */
  @js.native
  sealed trait addToGrid
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** An object is added to a list. */
  @js.native
  sealed trait addToList
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** An object is added to search results that are arranged in a grid. */
  @js.native
  sealed trait addToSearchGrid
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** An object is added to a vertically arranged list of search results. */
  @js.native
  sealed trait addToSearchList
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** An object decreases in size to hide content. */
  @js.native
  sealed trait collapse
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** One item is faded out as another fades in in its place. */
  @js.native
  sealed trait crossFade
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** An object is removed from a collection that is arranged in a grid. */
  @js.native
  sealed trait deleteFromGrid
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** An object is removed from a list. */
  @js.native
  sealed trait deleteFromList
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** An object is removed from search results that are arranged in a grid. */
  @js.native
  sealed trait deleteFromSearchGrid
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** An object is removed from a vertically arranged list of search results. */
  @js.native
  sealed trait deleteFromSearchList
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** A drag source has moved between two items. */
  @js.native
  sealed trait dragBetweenEnter
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** A drag source is no longer between two items. */
  @js.native
  sealed trait dragBetweenLeave
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** The user has stopped dragging an item. */
  @js.native
  sealed trait dragSourceEnd
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** The user has begun dragging an item. */
  @js.native
  sealed trait dragSourceStart
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** A page of content is brought in to the display. */
  @js.native
  sealed trait enterPage
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** An object increases in size to reveal additional content. */
  @js.native
  sealed trait expand
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** A contextual control fades in. */
  @js.native
  sealed trait fadeIn
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** A contextual control fades out. */
  @js.native
  sealed trait fadeOut
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** UI collapses around a tapped or clicked target. */
  @js.native
  sealed trait hide
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** UI displayed at the edge of the screen is removed. */
  @js.native
  sealed trait hideEdgeUI
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** A section of content is removed from the screen. */
  @js.native
  sealed trait hidePanel
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** A pop-up control is removed from the screen. */
  @js.native
  sealed trait hidePopup
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** Contents of a tile move up or down to show a part of the tile that is normally hidden. */
  @js.native
  sealed trait peek
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** The pointing device (such as a mouse or touch) has engaged on an item. */
  @js.native
  sealed trait pointerDown
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** The pointing device (such as a mouse or touch) has disengaged from an item. */
  @js.native
  sealed trait pointerUp
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** An object changes position. No more specific animation applies. */
  @js.native
  sealed trait reposition
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** UI expands around a tapped or clicked target. */
  @js.native
  sealed trait reveal
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** UI is brought in from the edge of the screen. */
  @js.native
  sealed trait showEdgeUI
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** A section of content appears on the screen. */
  @js.native
  sealed trait showPanel
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** A pop-up control appears on the screen. */
  @js.native
  sealed trait showPopup
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** An object has been deselected through the swipe interaction. */
  @js.native
  sealed trait swipeDeselect
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** Triggered by a press and hold on an item that can be cross-slide selected. */
  @js.native
  sealed trait swipeReveal
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** An object has been selected through the swipe interaction. */
  @js.native
  sealed trait swipeSelect
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** Large-scale content replacement is occuring. */
  @js.native
  sealed trait transitionContent
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** One page is replaced by another page. */
  @js.native
  sealed trait transitionPage
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /** Update a tile's badge overlay. */
  @js.native
  sealed trait updateBadge
    extends winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect
  
  /* 7 */ val addToGrid: addToGrid with scala.Double = js.native
  /* 5 */ val addToList: addToList with scala.Double = js.native
  /* 9 */ val addToSearchGrid: addToSearchGrid with scala.Double = js.native
  /* 11 */ val addToSearchList: addToSearchList with scala.Double = js.native
  /* 1 */ val collapse: collapse with scala.Double = js.native
  /* 33 */ val crossFade: crossFade with scala.Double = js.native
  /* 8 */ val deleteFromGrid: deleteFromGrid with scala.Double = js.native
  /* 6 */ val deleteFromList: deleteFromList with scala.Double = js.native
  /* 10 */ val deleteFromSearchGrid: deleteFromSearchGrid with scala.Double = js.native
  /* 12 */ val deleteFromSearchList: deleteFromSearchList with scala.Double = js.native
  /* 26 */ val dragBetweenEnter: dragBetweenEnter with scala.Double = js.native
  /* 27 */ val dragBetweenLeave: dragBetweenLeave with scala.Double = js.native
  /* 22 */ val dragSourceEnd: dragSourceEnd with scala.Double = js.native
  /* 21 */ val dragSourceStart: dragSourceStart with scala.Double = js.native
  /* 31 */ val enterPage: enterPage with scala.Double = js.native
  /* 0 */ val expand: expand with scala.Double = js.native
  /* 3 */ val fadeIn: fadeIn with scala.Double = js.native
  /* 4 */ val fadeOut: fadeOut with scala.Double = js.native
  /* 25 */ val hide: hide with scala.Double = js.native
  /* 15 */ val hideEdgeUI: hideEdgeUI with scala.Double = js.native
  /* 16 */ val hidePanel: hidePanel with scala.Double = js.native
  /* 18 */ val hidePopup: hidePopup with scala.Double = js.native
  /* 34 */ val peek: peek with scala.Double = js.native
  /* 19 */ val pointerDown: pointerDown with scala.Double = js.native
  /* 20 */ val pointerUp: pointerUp with scala.Double = js.native
  /* 2 */ val reposition: reposition with scala.Double = js.native
  /* 24 */ val reveal: reveal with scala.Double = js.native
  /* 13 */ val showEdgeUI: showEdgeUI with scala.Double = js.native
  /* 14 */ val showPanel: showPanel with scala.Double = js.native
  /* 17 */ val showPopup: showPopup with scala.Double = js.native
  /* 29 */ val swipeDeselect: swipeDeselect with scala.Double = js.native
  /* 30 */ val swipeReveal: swipeReveal with scala.Double = js.native
  /* 28 */ val swipeSelect: swipeSelect with scala.Double = js.native
  /* 23 */ val transitionContent: transitionContent with scala.Double = js.native
  /* 32 */ val transitionPage: transitionPage with scala.Double = js.native
  /* 35 */ val updateBadge: updateBadge with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect with scala.Double
  ] = js.native
}


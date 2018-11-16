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
  
  val addToGrid: addToGrid with java.lang.String = js.native
  val addToList: addToList with java.lang.String = js.native
  val addToSearchGrid: addToSearchGrid with java.lang.String = js.native
  val addToSearchList: addToSearchList with java.lang.String = js.native
  val collapse: collapse with java.lang.String = js.native
  val crossFade: crossFade with java.lang.String = js.native
  val deleteFromGrid: deleteFromGrid with java.lang.String = js.native
  val deleteFromList: deleteFromList with java.lang.String = js.native
  val deleteFromSearchGrid: deleteFromSearchGrid with java.lang.String = js.native
  val deleteFromSearchList: deleteFromSearchList with java.lang.String = js.native
  val dragBetweenEnter: dragBetweenEnter with java.lang.String = js.native
  val dragBetweenLeave: dragBetweenLeave with java.lang.String = js.native
  val dragSourceEnd: dragSourceEnd with java.lang.String = js.native
  val dragSourceStart: dragSourceStart with java.lang.String = js.native
  val enterPage: enterPage with java.lang.String = js.native
  val expand: expand with java.lang.String = js.native
  val fadeIn: fadeIn with java.lang.String = js.native
  val fadeOut: fadeOut with java.lang.String = js.native
  val hide: hide with java.lang.String = js.native
  val hideEdgeUI: hideEdgeUI with java.lang.String = js.native
  val hidePanel: hidePanel with java.lang.String = js.native
  val hidePopup: hidePopup with java.lang.String = js.native
  val peek: peek with java.lang.String = js.native
  val pointerDown: pointerDown with java.lang.String = js.native
  val pointerUp: pointerUp with java.lang.String = js.native
  val reposition: reposition with java.lang.String = js.native
  val reveal: reveal with java.lang.String = js.native
  val showEdgeUI: showEdgeUI with java.lang.String = js.native
  val showPanel: showPanel with java.lang.String = js.native
  val showPopup: showPopup with java.lang.String = js.native
  val swipeDeselect: swipeDeselect with java.lang.String = js.native
  val swipeReveal: swipeReveal with java.lang.String = js.native
  val swipeSelect: swipeSelect with java.lang.String = js.native
  val transitionContent: transitionContent with java.lang.String = js.native
  val transitionPage: transitionPage with java.lang.String = js.native
  val updateBadge: updateBadge with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect with java.lang.String
  ] = js.native
}


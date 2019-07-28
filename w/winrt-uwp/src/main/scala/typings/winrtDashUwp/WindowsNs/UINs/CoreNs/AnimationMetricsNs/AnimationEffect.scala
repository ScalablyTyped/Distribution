package typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs

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
  
  /* 7 */ val addToGrid: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.addToGrid with Double = js.native
  /* 5 */ val addToList: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.addToList with Double = js.native
  /* 9 */ val addToSearchGrid: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.addToSearchGrid with Double = js.native
  /* 11 */ val addToSearchList: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.addToSearchList with Double = js.native
  /* 1 */ val collapse: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.collapse with Double = js.native
  /* 33 */ val crossFade: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.crossFade with Double = js.native
  /* 8 */ val deleteFromGrid: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.deleteFromGrid with Double = js.native
  /* 6 */ val deleteFromList: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.deleteFromList with Double = js.native
  /* 10 */ val deleteFromSearchGrid: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.deleteFromSearchGrid with Double = js.native
  /* 12 */ val deleteFromSearchList: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.deleteFromSearchList with Double = js.native
  /* 26 */ val dragBetweenEnter: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.dragBetweenEnter with Double = js.native
  /* 27 */ val dragBetweenLeave: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.dragBetweenLeave with Double = js.native
  /* 22 */ val dragSourceEnd: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.dragSourceEnd with Double = js.native
  /* 21 */ val dragSourceStart: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.dragSourceStart with Double = js.native
  /* 31 */ val enterPage: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.enterPage with Double = js.native
  /* 0 */ val expand: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.expand with Double = js.native
  /* 3 */ val fadeIn: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.fadeIn with Double = js.native
  /* 4 */ val fadeOut: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.fadeOut with Double = js.native
  /* 25 */ val hide: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.hide with Double = js.native
  /* 15 */ val hideEdgeUI: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.hideEdgeUI with Double = js.native
  /* 16 */ val hidePanel: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.hidePanel with Double = js.native
  /* 18 */ val hidePopup: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.hidePopup with Double = js.native
  /* 34 */ val peek: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.peek with Double = js.native
  /* 19 */ val pointerDown: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.pointerDown with Double = js.native
  /* 20 */ val pointerUp: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.pointerUp with Double = js.native
  /* 2 */ val reposition: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.reposition with Double = js.native
  /* 24 */ val reveal: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.reveal with Double = js.native
  /* 13 */ val showEdgeUI: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.showEdgeUI with Double = js.native
  /* 14 */ val showPanel: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.showPanel with Double = js.native
  /* 17 */ val showPopup: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.showPopup with Double = js.native
  /* 29 */ val swipeDeselect: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.swipeDeselect with Double = js.native
  /* 30 */ val swipeReveal: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.swipeReveal with Double = js.native
  /* 28 */ val swipeSelect: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.swipeSelect with Double = js.native
  /* 23 */ val transitionContent: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.transitionContent with Double = js.native
  /* 32 */ val transitionPage: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.transitionPage with Double = js.native
  /* 35 */ val updateBadge: typings.winrtDashUwp.WindowsNs.UINs.CoreNs.AnimationMetricsNs.AnimationEffect.updateBadge with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimationEffect with Double] = js.native
}


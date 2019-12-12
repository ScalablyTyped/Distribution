package typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToGrid
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToList
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchGrid
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchList
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.collapse
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.crossFade
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromGrid
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromList
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchGrid
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchList
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenEnter
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenLeave
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceEnd
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceStart
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.enterPage
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.expand
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeIn
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeOut
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hide
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hideEdgeUI
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePanel
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePopup
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.peek
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerDown
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerUp
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.reposition
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.reveal
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showEdgeUI
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPanel
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPopup
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeDeselect
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeReveal
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeSelect
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionContent
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionPage
import typings.winrtDashUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.updateBadge
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimationEffect with Double] = js.native
  /* 7 */ @js.native
  object addToGrid extends TopLevel[addToGrid with Double]
  
  /* 5 */ @js.native
  object addToList extends TopLevel[addToList with Double]
  
  /* 9 */ @js.native
  object addToSearchGrid extends TopLevel[addToSearchGrid with Double]
  
  /* 11 */ @js.native
  object addToSearchList extends TopLevel[addToSearchList with Double]
  
  /* 1 */ @js.native
  object collapse extends TopLevel[collapse with Double]
  
  /* 33 */ @js.native
  object crossFade extends TopLevel[crossFade with Double]
  
  /* 8 */ @js.native
  object deleteFromGrid extends TopLevel[deleteFromGrid with Double]
  
  /* 6 */ @js.native
  object deleteFromList extends TopLevel[deleteFromList with Double]
  
  /* 10 */ @js.native
  object deleteFromSearchGrid extends TopLevel[deleteFromSearchGrid with Double]
  
  /* 12 */ @js.native
  object deleteFromSearchList extends TopLevel[deleteFromSearchList with Double]
  
  /* 26 */ @js.native
  object dragBetweenEnter extends TopLevel[dragBetweenEnter with Double]
  
  /* 27 */ @js.native
  object dragBetweenLeave extends TopLevel[dragBetweenLeave with Double]
  
  /* 22 */ @js.native
  object dragSourceEnd extends TopLevel[dragSourceEnd with Double]
  
  /* 21 */ @js.native
  object dragSourceStart extends TopLevel[dragSourceStart with Double]
  
  /* 31 */ @js.native
  object enterPage extends TopLevel[enterPage with Double]
  
  /* 0 */ @js.native
  object expand extends TopLevel[expand with Double]
  
  /* 3 */ @js.native
  object fadeIn extends TopLevel[fadeIn with Double]
  
  /* 4 */ @js.native
  object fadeOut extends TopLevel[fadeOut with Double]
  
  /* 25 */ @js.native
  object hide extends TopLevel[hide with Double]
  
  /* 15 */ @js.native
  object hideEdgeUI extends TopLevel[hideEdgeUI with Double]
  
  /* 16 */ @js.native
  object hidePanel extends TopLevel[hidePanel with Double]
  
  /* 18 */ @js.native
  object hidePopup extends TopLevel[hidePopup with Double]
  
  /* 34 */ @js.native
  object peek extends TopLevel[peek with Double]
  
  /* 19 */ @js.native
  object pointerDown extends TopLevel[pointerDown with Double]
  
  /* 20 */ @js.native
  object pointerUp extends TopLevel[pointerUp with Double]
  
  /* 2 */ @js.native
  object reposition extends TopLevel[reposition with Double]
  
  /* 24 */ @js.native
  object reveal extends TopLevel[reveal with Double]
  
  /* 13 */ @js.native
  object showEdgeUI extends TopLevel[showEdgeUI with Double]
  
  /* 14 */ @js.native
  object showPanel extends TopLevel[showPanel with Double]
  
  /* 17 */ @js.native
  object showPopup extends TopLevel[showPopup with Double]
  
  /* 29 */ @js.native
  object swipeDeselect extends TopLevel[swipeDeselect with Double]
  
  /* 30 */ @js.native
  object swipeReveal extends TopLevel[swipeReveal with Double]
  
  /* 28 */ @js.native
  object swipeSelect extends TopLevel[swipeSelect with Double]
  
  /* 23 */ @js.native
  object transitionContent extends TopLevel[transitionContent with Double]
  
  /* 32 */ @js.native
  object transitionPage extends TopLevel[transitionPage with Double]
  
  /* 35 */ @js.native
  object updateBadge extends TopLevel[updateBadge with Double]
  
}


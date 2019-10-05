package typings.winrt.Windows.UI.Core.AnimationMetrics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnimationEffect extends js.Object

@JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffect")
@js.native
object AnimationEffect extends js.Object {
  @js.native
  sealed trait addToGrid extends AnimationEffect
  
  @js.native
  sealed trait addToList extends AnimationEffect
  
  @js.native
  sealed trait addToSearchGrid extends AnimationEffect
  
  @js.native
  sealed trait addToSearchList extends AnimationEffect
  
  @js.native
  sealed trait collapse extends AnimationEffect
  
  @js.native
  sealed trait crossFade extends AnimationEffect
  
  @js.native
  sealed trait deleteFromGrid extends AnimationEffect
  
  @js.native
  sealed trait deleteFromList extends AnimationEffect
  
  @js.native
  sealed trait deleteFromSearchGrid extends AnimationEffect
  
  @js.native
  sealed trait deleteFromSearchList extends AnimationEffect
  
  @js.native
  sealed trait dragBetweenEnter extends AnimationEffect
  
  @js.native
  sealed trait dragBetweenLeave extends AnimationEffect
  
  @js.native
  sealed trait dragSourceEnd extends AnimationEffect
  
  @js.native
  sealed trait dragSourceStart extends AnimationEffect
  
  @js.native
  sealed trait enterPage extends AnimationEffect
  
  @js.native
  sealed trait expand extends AnimationEffect
  
  @js.native
  sealed trait fadeIn extends AnimationEffect
  
  @js.native
  sealed trait fadeOut extends AnimationEffect
  
  @js.native
  sealed trait hide extends AnimationEffect
  
  @js.native
  sealed trait hideEdgeUI extends AnimationEffect
  
  @js.native
  sealed trait hidePanel extends AnimationEffect
  
  @js.native
  sealed trait hidePopup extends AnimationEffect
  
  @js.native
  sealed trait peek extends AnimationEffect
  
  @js.native
  sealed trait pointerDown extends AnimationEffect
  
  @js.native
  sealed trait pointerUp extends AnimationEffect
  
  @js.native
  sealed trait reposition extends AnimationEffect
  
  @js.native
  sealed trait reveal extends AnimationEffect
  
  @js.native
  sealed trait showEdgeUI extends AnimationEffect
  
  @js.native
  sealed trait showPanel extends AnimationEffect
  
  @js.native
  sealed trait showPopup extends AnimationEffect
  
  @js.native
  sealed trait swipeDeselect extends AnimationEffect
  
  @js.native
  sealed trait swipeReveal extends AnimationEffect
  
  @js.native
  sealed trait swipeSelect extends AnimationEffect
  
  @js.native
  sealed trait transitionContent extends AnimationEffect
  
  @js.native
  sealed trait transitionPage extends AnimationEffect
  
  @js.native
  sealed trait updateBadge extends AnimationEffect
  
  /* 7 */ val addToGrid: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToGrid with Double = js.native
  /* 5 */ val addToList: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToList with Double = js.native
  /* 9 */ val addToSearchGrid: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchGrid with Double = js.native
  /* 11 */ val addToSearchList: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchList with Double = js.native
  /* 1 */ val collapse: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.collapse with Double = js.native
  /* 33 */ val crossFade: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.crossFade with Double = js.native
  /* 8 */ val deleteFromGrid: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromGrid with Double = js.native
  /* 6 */ val deleteFromList: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromList with Double = js.native
  /* 10 */ val deleteFromSearchGrid: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchGrid with Double = js.native
  /* 12 */ val deleteFromSearchList: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchList with Double = js.native
  /* 26 */ val dragBetweenEnter: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenEnter with Double = js.native
  /* 27 */ val dragBetweenLeave: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenLeave with Double = js.native
  /* 22 */ val dragSourceEnd: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceEnd with Double = js.native
  /* 21 */ val dragSourceStart: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceStart with Double = js.native
  /* 31 */ val enterPage: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.enterPage with Double = js.native
  /* 0 */ val expand: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.expand with Double = js.native
  /* 3 */ val fadeIn: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeIn with Double = js.native
  /* 4 */ val fadeOut: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeOut with Double = js.native
  /* 25 */ val hide: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.hide with Double = js.native
  /* 15 */ val hideEdgeUI: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.hideEdgeUI with Double = js.native
  /* 16 */ val hidePanel: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePanel with Double = js.native
  /* 18 */ val hidePopup: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePopup with Double = js.native
  /* 34 */ val peek: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.peek with Double = js.native
  /* 19 */ val pointerDown: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerDown with Double = js.native
  /* 20 */ val pointerUp: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerUp with Double = js.native
  /* 2 */ val reposition: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.reposition with Double = js.native
  /* 24 */ val reveal: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.reveal with Double = js.native
  /* 13 */ val showEdgeUI: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.showEdgeUI with Double = js.native
  /* 14 */ val showPanel: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPanel with Double = js.native
  /* 17 */ val showPopup: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPopup with Double = js.native
  /* 29 */ val swipeDeselect: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeDeselect with Double = js.native
  /* 30 */ val swipeReveal: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeReveal with Double = js.native
  /* 28 */ val swipeSelect: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeSelect with Double = js.native
  /* 23 */ val transitionContent: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionContent with Double = js.native
  /* 32 */ val transitionPage: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionPage with Double = js.native
  /* 35 */ val updateBadge: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.updateBadge with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnimationEffect with Double] = js.native
}


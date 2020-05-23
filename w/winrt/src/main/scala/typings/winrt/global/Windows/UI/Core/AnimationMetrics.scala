package typings.winrt.global.Windows.UI.Core

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect
import typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget
import typings.winrt.Windows.UI.Core.AnimationMetrics.IPropertyAnimation
import typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core.AnimationMetrics")
@js.native
object AnimationMetrics extends js.Object {
  @js.native
  class AnimationDescription protected ()
    extends typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationDescription {
    def this(effect: AnimationEffect, target: AnimationEffectTarget) = this()
    /* CompleteClass */
    override var animations: IVectorView[IPropertyAnimation] = js.native
    /* CompleteClass */
    override var delayLimit: Double = js.native
    /* CompleteClass */
    override var staggerDelay: Double = js.native
    /* CompleteClass */
    override var staggerDelayFactor: Double = js.native
    /* CompleteClass */
    override var zOrder: Double = js.native
  }
  
  @js.native
  class OpacityAnimation ()
    extends typings.winrt.Windows.UI.Core.AnimationMetrics.OpacityAnimation {
    /* CompleteClass */
    override var control1: Point = js.native
    /* CompleteClass */
    override var control2: Point = js.native
    /* CompleteClass */
    override var delay: Double = js.native
    /* CompleteClass */
    override var duration: Double = js.native
    /* CompleteClass */
    override var finalOpacity: Double = js.native
    /* CompleteClass */
    override var initialOpacity: Double = js.native
    /* CompleteClass */
    override var `type`: PropertyAnimationType = js.native
  }
  
  @js.native
  class PropertyAnimation ()
    extends typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimation {
    /* CompleteClass */
    override var control1: Point = js.native
    /* CompleteClass */
    override var control2: Point = js.native
    /* CompleteClass */
    override var delay: Double = js.native
    /* CompleteClass */
    override var duration: Double = js.native
    /* CompleteClass */
    override var `type`: PropertyAnimationType = js.native
  }
  
  @js.native
  class ScaleAnimation ()
    extends typings.winrt.Windows.UI.Core.AnimationMetrics.ScaleAnimation {
    /* CompleteClass */
    override var control1: Point = js.native
    /* CompleteClass */
    override var control2: Point = js.native
    /* CompleteClass */
    override var delay: Double = js.native
    /* CompleteClass */
    override var duration: Double = js.native
    /* CompleteClass */
    override var finalScaleX: Double = js.native
    /* CompleteClass */
    override var finalScaleY: Double = js.native
    /* CompleteClass */
    override var initialScaleX: Double = js.native
    /* CompleteClass */
    override var initialScaleY: Double = js.native
    /* CompleteClass */
    override var normalizedOrigin: Point = js.native
    /* CompleteClass */
    override var `type`: PropertyAnimationType = js.native
  }
  
  @js.native
  class TranslationAnimation ()
    extends typings.winrt.Windows.UI.Core.AnimationMetrics.TranslationAnimation {
    /* CompleteClass */
    override var control1: Point = js.native
    /* CompleteClass */
    override var control2: Point = js.native
    /* CompleteClass */
    override var delay: Double = js.native
    /* CompleteClass */
    override var duration: Double = js.native
    /* CompleteClass */
    override var `type`: PropertyAnimationType = js.native
  }
  
  @js.native
  object AnimationEffect extends js.Object {
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
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect with Double] = js.native
  }
  
  @js.native
  object AnimationEffectTarget extends js.Object {
    /* 1 */ val added: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.added with Double = js.native
    /* 2 */ val affected: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.affected with Double = js.native
    /* 3 */ val background: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.background with Double = js.native
    /* 4 */ val content: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.content with Double = js.native
    /* 5 */ val deleted: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deleted with Double = js.native
    /* 6 */ val deselected: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deselected with Double = js.native
    /* 7 */ val dragSource: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.dragSource with Double = js.native
    /* 8 */ val hidden: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.hidden with Double = js.native
    /* 9 */ val incoming: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.incoming with Double = js.native
    /* 10 */ val outgoing: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outgoing with Double = js.native
    /* 11 */ val outline: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outline with Double = js.native
    /* 0 */ val primary: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.primary with Double = js.native
    /* 12 */ val remaining: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.remaining with Double = js.native
    /* 13 */ val revealed: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.revealed with Double = js.native
    /* 14 */ val rowIn: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowIn with Double = js.native
    /* 15 */ val rowOut: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowOut with Double = js.native
    /* 16 */ val selected: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selected with Double = js.native
    /* 17 */ val selection: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selection with Double = js.native
    /* 18 */ val shown: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.shown with Double = js.native
    /* 19 */ val tapped: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.tapped with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget with Double] = js.native
  }
  
  @js.native
  object PropertyAnimationType extends js.Object {
    /* 2 */ val opacity: typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.opacity with Double = js.native
    /* 0 */ val scale: typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.scale with Double = js.native
    /* 1 */ val translation: typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.translation with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType with Double] = js.native
  }
  
}


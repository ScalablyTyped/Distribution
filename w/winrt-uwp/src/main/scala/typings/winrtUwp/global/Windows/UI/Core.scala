package typings.winrtUwp.global.Windows.UI

import typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect
import typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Core")
@js.native
object Core extends js.Object {
  /** Provides event data for the SystemNavigationManager.BackRequested event. */
  @js.native
  abstract class BackRequestedEventArgs ()
    extends typings.winrtUwp.Windows.UI.Core.BackRequestedEventArgs
  
  /** Provides a way for an app to respond to system provided back-navigation events. */
  @js.native
  abstract class SystemNavigationManager ()
    extends typings.winrtUwp.Windows.UI.Core.SystemNavigationManager
  
  /** The classes and their properties that are exposed through this namespace retrieve the raw scaling, translation, and opacity parameters used in Windows animations. These parameters include such metrics as the animation type, stagger delay, z-order, duration, initial and final opacity, initial and final scale factors, and cubic Bezier control points, among others. This information enables developers of apps and application frameworks to create custom animations that are consistent with both Windows itself and with other apps that use Windows animations. */
  @js.native
  object AnimationMetrics extends js.Object {
    /** Exposes a collection of individual animation effects that are performed on a specific target to make up a complete Windows opacity, scaling, or translation animation. */
    @js.native
    class AnimationDescription protected ()
      extends typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationDescription {
      /**
        * Creates an AnimationDescription object with a specific animation and target.
        * @param effect The animation effect to apply to the target.
        * @param target The target of the animation effect.
        */
      def this(effect: AnimationEffect, target: AnimationEffectTarget) = this()
    }
    
    /** Provides methods that enable you to retrieve the parameters of an opacity (fade in or fade out) animation. */
    @js.native
    abstract class OpacityAnimation ()
      extends typings.winrtUwp.Windows.UI.Core.AnimationMetrics.OpacityAnimation
    
    /** Provides methods that enable you to retrieve animation property values that are common to all property animation types . */
    @js.native
    abstract class PropertyAnimation ()
      extends typings.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimation
    
    /** Provides methods that enable you to retrieve the parameters for a scaling (growing or shrinking) animation. */
    @js.native
    abstract class ScaleAnimation ()
      extends typings.winrtUwp.Windows.UI.Core.AnimationMetrics.ScaleAnimation
    
    /** Provides methods that enable you to retrieve the parameters for a translation (move to a new location) animation. */
    @js.native
    abstract class TranslationAnimation ()
      extends typings.winrtUwp.Windows.UI.Core.AnimationMetrics.TranslationAnimation
    
    /** Specifies an animation. */
    @js.native
    object AnimationEffect extends js.Object {
      /* 7 */ val addToGrid: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToGrid with Double = js.native
      /* 5 */ val addToList: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToList with Double = js.native
      /* 9 */ val addToSearchGrid: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchGrid with Double = js.native
      /* 11 */ val addToSearchList: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchList with Double = js.native
      /* 1 */ val collapse: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.collapse with Double = js.native
      /* 33 */ val crossFade: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.crossFade with Double = js.native
      /* 8 */ val deleteFromGrid: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromGrid with Double = js.native
      /* 6 */ val deleteFromList: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromList with Double = js.native
      /* 10 */ val deleteFromSearchGrid: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchGrid with Double = js.native
      /* 12 */ val deleteFromSearchList: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchList with Double = js.native
      /* 26 */ val dragBetweenEnter: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenEnter with Double = js.native
      /* 27 */ val dragBetweenLeave: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenLeave with Double = js.native
      /* 22 */ val dragSourceEnd: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceEnd with Double = js.native
      /* 21 */ val dragSourceStart: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceStart with Double = js.native
      /* 31 */ val enterPage: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.enterPage with Double = js.native
      /* 0 */ val expand: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.expand with Double = js.native
      /* 3 */ val fadeIn: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeIn with Double = js.native
      /* 4 */ val fadeOut: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeOut with Double = js.native
      /* 25 */ val hide: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hide with Double = js.native
      /* 15 */ val hideEdgeUI: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hideEdgeUI with Double = js.native
      /* 16 */ val hidePanel: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePanel with Double = js.native
      /* 18 */ val hidePopup: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePopup with Double = js.native
      /* 34 */ val peek: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.peek with Double = js.native
      /* 19 */ val pointerDown: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerDown with Double = js.native
      /* 20 */ val pointerUp: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerUp with Double = js.native
      /* 2 */ val reposition: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.reposition with Double = js.native
      /* 24 */ val reveal: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.reveal with Double = js.native
      /* 13 */ val showEdgeUI: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showEdgeUI with Double = js.native
      /* 14 */ val showPanel: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPanel with Double = js.native
      /* 17 */ val showPopup: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPopup with Double = js.native
      /* 29 */ val swipeDeselect: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeDeselect with Double = js.native
      /* 30 */ val swipeReveal: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeReveal with Double = js.native
      /* 28 */ val swipeSelect: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeSelect with Double = js.native
      /* 23 */ val transitionContent: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionContent with Double = js.native
      /* 32 */ val transitionPage: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionPage with Double = js.native
      /* 35 */ val updateBadge: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.updateBadge with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect with Double] = js.native
    }
    
    /** Specifies a participant in an animation. */
    @js.native
    object AnimationEffectTarget extends js.Object {
      /* 1 */ val added: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.added with Double = js.native
      /* 2 */ val affected: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.affected with Double = js.native
      /* 3 */ val background: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.background with Double = js.native
      /* 4 */ val content: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.content with Double = js.native
      /* 5 */ val deleted: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deleted with Double = js.native
      /* 6 */ val deselected: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deselected with Double = js.native
      /* 7 */ val dragSource: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.dragSource with Double = js.native
      /* 8 */ val hidden: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.hidden with Double = js.native
      /* 9 */ val incoming: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.incoming with Double = js.native
      /* 10 */ val outgoing: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outgoing with Double = js.native
      /* 11 */ val outline: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outline with Double = js.native
      /* 0 */ val primary: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.primary with Double = js.native
      /* 12 */ val remaining: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.remaining with Double = js.native
      /* 13 */ val revealed: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.revealed with Double = js.native
      /* 14 */ val rowIn: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowIn with Double = js.native
      /* 15 */ val rowOut: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowOut with Double = js.native
      /* 16 */ val selected: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selected with Double = js.native
      /* 17 */ val selection: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selection with Double = js.native
      /* 18 */ val shown: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.shown with Double = js.native
      /* 19 */ val tapped: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.tapped with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget with Double
          ] = js.native
    }
    
    /** Specifies the animation type represented by a PropertyAnimation object. */
    @js.native
    object PropertyAnimationType extends js.Object {
      /* 2 */ val opacity: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.opacity with Double = js.native
      /* 0 */ val scale: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.scale with Double = js.native
      /* 1 */ val translation: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.translation with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType with Double
          ] = js.native
    }
    
  }
  
  /** Defines constants that specify whether the back button is shown in the system UI. */
  @js.native
  object AppViewBackButtonVisibility extends js.Object {
    /* 1 */ val collapsed: typings.winrtUwp.Windows.UI.Core.AppViewBackButtonVisibility.collapsed with Double = js.native
    /* 0 */ val visible: typings.winrtUwp.Windows.UI.Core.AppViewBackButtonVisibility.visible with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Core.AppViewBackButtonVisibility with Double] = js.native
  }
  
  /* static members */
  @js.native
  object SystemNavigationManager extends js.Object {
    /**
      * Returns the SystemNavigationManager object associated with the current window.
      * @return The SystemNavigationManager object associated with the current window.
      */
    def getForCurrentView(): typings.winrtUwp.Windows.UI.Core.SystemNavigationManager = js.native
  }
  
}


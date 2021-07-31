package typings.winrtUwp.global.Windows.UI

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect
import typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget
import typings.winrtUwp.Windows.UI.Core.AnimationMetrics.IPropertyAnimation
import typings.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  /** The classes and their properties that are exposed through this namespace retrieve the raw scaling, translation, and opacity parameters used in Windows animations. These parameters include such metrics as the animation type, stagger delay, z-order, duration, initial and final opacity, initial and final scale factors, and cubic Bezier control points, among others. This information enables developers of apps and application frameworks to create custom animations that are consistent with both Windows itself and with other apps that use Windows animations. */
  object AnimationMetrics {
    
    /** Exposes a collection of individual animation effects that are performed on a specific target to make up a complete Windows opacity, scaling, or translation animation. */
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationDescription")
    @js.native
    class AnimationDescription protected ()
      extends StObject
         with typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationDescription {
      /**
        * Creates an AnimationDescription object with a specific animation and target.
        * @param effect The animation effect to apply to the target.
        * @param target The target of the animation effect.
        */
      def this(effect: AnimationEffect, target: AnimationEffectTarget) = this()
      
      /** Gets the collection of animations that are associated with the AnimationDescription object. */
      /* CompleteClass */
      var animations: IVectorView[IPropertyAnimation] = js.native
      
      /** Gets the maximum cumulative delay time for the animation to be applied to the collection of objects in a target. */
      /* CompleteClass */
      var delayLimit: Double = js.native
      
      /** Gets the amount of time between the application of the animation effect to each object in a target that contains multiple objects. The StaggerDelay, together with the StaggerDelayFactor and DelayLimit, is one of the three elements used to control the relative timing of the animation effects. */
      /* CompleteClass */
      var staggerDelay: Double = js.native
      
      /** Gets a multiplier that is applied to each occurrence of the stagger delay, increasing or decreasing the previous delay instance by that amount. */
      /* CompleteClass */
      var staggerDelayFactor: Double = js.native
      
      /** Gets the z-order position of an AnimationDescription object relative to other AnimationDescription objects in the same animation effect. AnimationDescription objects with a higher z-order cover transitions with a lower z-order. */
      /* CompleteClass */
      var zorder: Double = js.native
    }
    
    /** Specifies an animation. */
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffect")
    @js.native
    object AnimationEffect extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect & Double] = js.native
      
      /* 7 */ val addToGrid: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToGrid & Double = js.native
      
      /* 5 */ val addToList: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToList & Double = js.native
      
      /* 9 */ val addToSearchGrid: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchGrid & Double = js.native
      
      /* 11 */ val addToSearchList: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchList & Double = js.native
      
      /* 1 */ val collapse: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.collapse & Double = js.native
      
      /* 33 */ val crossFade: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.crossFade & Double = js.native
      
      /* 8 */ val deleteFromGrid: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromGrid & Double = js.native
      
      /* 6 */ val deleteFromList: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromList & Double = js.native
      
      /* 10 */ val deleteFromSearchGrid: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchGrid & Double = js.native
      
      /* 12 */ val deleteFromSearchList: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchList & Double = js.native
      
      /* 26 */ val dragBetweenEnter: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenEnter & Double = js.native
      
      /* 27 */ val dragBetweenLeave: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenLeave & Double = js.native
      
      /* 22 */ val dragSourceEnd: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceEnd & Double = js.native
      
      /* 21 */ val dragSourceStart: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceStart & Double = js.native
      
      /* 31 */ val enterPage: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.enterPage & Double = js.native
      
      /* 0 */ val expand: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.expand & Double = js.native
      
      /* 3 */ val fadeIn: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeIn & Double = js.native
      
      /* 4 */ val fadeOut: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeOut & Double = js.native
      
      /* 25 */ val hide: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hide & Double = js.native
      
      /* 15 */ val hideEdgeUI: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hideEdgeUI & Double = js.native
      
      /* 16 */ val hidePanel: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePanel & Double = js.native
      
      /* 18 */ val hidePopup: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePopup & Double = js.native
      
      /* 34 */ val peek: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.peek & Double = js.native
      
      /* 19 */ val pointerDown: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerDown & Double = js.native
      
      /* 20 */ val pointerUp: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerUp & Double = js.native
      
      /* 2 */ val reposition: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.reposition & Double = js.native
      
      /* 24 */ val reveal: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.reveal & Double = js.native
      
      /* 13 */ val showEdgeUI: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showEdgeUI & Double = js.native
      
      /* 14 */ val showPanel: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPanel & Double = js.native
      
      /* 17 */ val showPopup: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPopup & Double = js.native
      
      /* 29 */ val swipeDeselect: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeDeselect & Double = js.native
      
      /* 30 */ val swipeReveal: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeReveal & Double = js.native
      
      /* 28 */ val swipeSelect: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeSelect & Double = js.native
      
      /* 23 */ val transitionContent: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionContent & Double = js.native
      
      /* 32 */ val transitionPage: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionPage & Double = js.native
      
      /* 35 */ val updateBadge: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffect.updateBadge & Double = js.native
    }
    
    /** Specifies a participant in an animation. */
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffectTarget")
    @js.native
    object AnimationEffectTarget extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget & Double] = js.native
      
      /* 1 */ val added: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.added & Double = js.native
      
      /* 2 */ val affected: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.affected & Double = js.native
      
      /* 3 */ val background: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.background & Double = js.native
      
      /* 4 */ val content: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.content & Double = js.native
      
      /* 5 */ val deleted: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deleted & Double = js.native
      
      /* 6 */ val deselected: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deselected & Double = js.native
      
      /* 7 */ val dragSource: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.dragSource & Double = js.native
      
      /* 8 */ val hidden: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.hidden & Double = js.native
      
      /* 9 */ val incoming: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.incoming & Double = js.native
      
      /* 10 */ val outgoing: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outgoing & Double = js.native
      
      /* 11 */ val outline: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outline & Double = js.native
      
      /* 0 */ val primary: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.primary & Double = js.native
      
      /* 12 */ val remaining: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.remaining & Double = js.native
      
      /* 13 */ val revealed: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.revealed & Double = js.native
      
      /* 14 */ val rowIn: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowIn & Double = js.native
      
      /* 15 */ val rowOut: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowOut & Double = js.native
      
      /* 16 */ val selected: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selected & Double = js.native
      
      /* 17 */ val selection: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selection & Double = js.native
      
      /* 18 */ val shown: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.shown & Double = js.native
      
      /* 19 */ val tapped: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.tapped & Double = js.native
    }
    
    /** Provides methods that enable you to retrieve the parameters of an opacity (fade in or fade out) animation. */
    @JSGlobal("Windows.UI.Core.AnimationMetrics.OpacityAnimation")
    @js.native
    abstract class OpacityAnimation ()
      extends StObject
         with typings.winrtUwp.Windows.UI.Core.AnimationMetrics.OpacityAnimation {
      
      /** Gets the location of the first control point for the cubic Bézier curve that describes how the opacity should animate over time. */
      /* CompleteClass */
      var control1: Point = js.native
      
      /** Gets the location of the second control point for the cubic Bézier curve that describes how the opacity should animate over time. */
      /* CompleteClass */
      var control2: Point = js.native
      
      /** Gets the amount of time between when the opacity animation is instructed to begin and when that animation actually begins to draw. */
      /* CompleteClass */
      var delay: Double = js.native
      
      /** Gets the amount of time over which the opacity animation should be performed. This does not include the delay. */
      /* CompleteClass */
      var duration: Double = js.native
      
      /** Gets the object's final opacity. */
      /* CompleteClass */
      var finalOpacity: Double = js.native
      
      /** Gets the object's initial opacity. */
      /* CompleteClass */
      var initialOpacity: Double = js.native
      
      /** Gets the type of animation represented by this object. */
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
    
    /** Provides methods that enable you to retrieve animation property values that are common to all property animation types . */
    @JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimation")
    @js.native
    abstract class PropertyAnimation ()
      extends StObject
         with typings.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimation {
      
      /** Gets the location of the first control point for the cubic Bézier curve that describes how this property of this object should animate over time. */
      /* CompleteClass */
      var control1: Point = js.native
      
      /** Gets the location of the second control point for the cubic Bézier curve that describes how this property of this object should animate over time. */
      /* CompleteClass */
      var control2: Point = js.native
      
      /** Gets the amount of time between when the animation is instructed to begin and when that animation actually begins to draw. */
      /* CompleteClass */
      var delay: Double = js.native
      
      /** Gets the amount of time over which the animation should be performed. This does not include the delay. */
      /* CompleteClass */
      var duration: Double = js.native
      
      /** Gets the type of animation represented by this object. */
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
    
    /** Specifies the animation type represented by a PropertyAnimation object. */
    @JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimationType")
    @js.native
    object PropertyAnimationType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType & Double] = js.native
      
      /* 2 */ val opacity: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.opacity & Double = js.native
      
      /* 0 */ val scale: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.scale & Double = js.native
      
      /* 1 */ val translation: typings.winrtUwp.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.translation & Double = js.native
    }
    
    /** Provides methods that enable you to retrieve the parameters for a scaling (growing or shrinking) animation. */
    @JSGlobal("Windows.UI.Core.AnimationMetrics.ScaleAnimation")
    @js.native
    abstract class ScaleAnimation ()
      extends StObject
         with typings.winrtUwp.Windows.UI.Core.AnimationMetrics.ScaleAnimation {
      
      /** Gets the location of the first control point for the cubic Bézier curve that describes how the scale should animate over time. */
      /* CompleteClass */
      var control1: Point = js.native
      
      /** Gets the location of the second control point for the cubic Bézier curve that describes how the scale should animate over time. */
      /* CompleteClass */
      var control2: Point = js.native
      
      /** Gets the amount of time between when the scale animation is instructed to begin and when that animation actually begins to draw. */
      /* CompleteClass */
      var delay: Double = js.native
      
      /** Gets the amount of time over which the scale animation should be performed. This does not include the delay. */
      /* CompleteClass */
      var duration: Double = js.native
      
      /** Gets the final horizontal scale factor for the object. */
      /* CompleteClass */
      var finalScaleX: Double = js.native
      
      /** Gets the final vertical scale factor for the object. */
      /* CompleteClass */
      var finalScaleY: Double = js.native
      
      /** Gets the initial horizontal scale factor for the object. */
      /* CompleteClass */
      var initialScaleX: Double = js.native
      
      /** Gets the initial vertical scale factor for the object. */
      /* CompleteClass */
      var initialScaleY: Double = js.native
      
      /** Gets the center point for the scaling animation, expressed as a point relative to the object's normal size. */
      /* CompleteClass */
      var normalizedOrigin: Point = js.native
      
      /** Gets the type of animation represented by this object. */
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
    
    /** Provides methods that enable you to retrieve the parameters for a translation (move to a new location) animation. */
    @JSGlobal("Windows.UI.Core.AnimationMetrics.TranslationAnimation")
    @js.native
    abstract class TranslationAnimation ()
      extends StObject
         with typings.winrtUwp.Windows.UI.Core.AnimationMetrics.TranslationAnimation {
      
      /** Gets the location of the first control point for the cubic Bézier curve that describes how the translation should animate over time. */
      /* CompleteClass */
      var control1: Point = js.native
      
      /** Gets the location of the second control point for the cubic Bézier curve that describes how the translation should animate over time. */
      /* CompleteClass */
      var control2: Point = js.native
      
      /** Gets the amount of time between when the translation animation is instructed to begin and when that animation actually begins to draw. */
      /* CompleteClass */
      var delay: Double = js.native
      
      /** Gets the amount of time over which the translation animation should be performed. This does not include the delay. */
      /* CompleteClass */
      var duration: Double = js.native
      
      /** Gets the type of animation represented by this object. */
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
  }
  
  /** Defines constants that specify whether the back button is shown in the system UI. */
  @JSGlobal("Windows.UI.Core.AppViewBackButtonVisibility")
  @js.native
  object AppViewBackButtonVisibility extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Core.AppViewBackButtonVisibility & Double] = js.native
    
    /* 1 */ val collapsed: typings.winrtUwp.Windows.UI.Core.AppViewBackButtonVisibility.collapsed & Double = js.native
    
    /* 0 */ val visible: typings.winrtUwp.Windows.UI.Core.AppViewBackButtonVisibility.visible & Double = js.native
  }
  
  /** Provides event data for the SystemNavigationManager.BackRequested event. */
  @JSGlobal("Windows.UI.Core.BackRequestedEventArgs")
  @js.native
  abstract class BackRequestedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Core.BackRequestedEventArgs {
    
    /** Gets or sets a value that indicates whether the app performed the requested back-navigation. */
    /* CompleteClass */
    var handled: Boolean = js.native
  }
  
  /** Provides a way for an app to respond to system provided back-navigation events. */
  @JSGlobal("Windows.UI.Core.SystemNavigationManager")
  @js.native
  abstract class SystemNavigationManager ()
    extends StObject
       with typings.winrtUwp.Windows.UI.Core.SystemNavigationManager
  object SystemNavigationManager {
    
    @JSGlobal("Windows.UI.Core.SystemNavigationManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the SystemNavigationManager object associated with the current window.
      * @return The SystemNavigationManager object associated with the current window.
      */
    /* static member */
    @scala.inline
    def getForCurrentView(): typings.winrtUwp.Windows.UI.Core.SystemNavigationManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrtUwp.Windows.UI.Core.SystemNavigationManager]
  }
}

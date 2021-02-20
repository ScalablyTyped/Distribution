package typings.winrt.global.Windows.UI

import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect
import typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget
import typings.winrt.Windows.UI.Core.CoreCursorType
import typings.winrt.Windows.UI.Core.CoreCursorType.wait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  @JSGlobal("Windows.UI.Core.AcceleratorKeyEventArgs")
  @js.native
  class AcceleratorKeyEventArgs ()
    extends typings.winrt.Windows.UI.Core.AcceleratorKeyEventArgs
  
  object AnimationMetrics {
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationDescription")
    @js.native
    class AnimationDescription protected ()
      extends typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationDescription {
      def this(effect: AnimationEffect, target: AnimationEffectTarget) = this()
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffect")
    @js.native
    object AnimationEffect extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect with Double] = js.native
      
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
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffectTarget")
    @js.native
    object AnimationEffectTarget extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget with Double] = js.native
      
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
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.OpacityAnimation")
    @js.native
    class OpacityAnimation ()
      extends typings.winrt.Windows.UI.Core.AnimationMetrics.OpacityAnimation
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimation")
    @js.native
    class PropertyAnimation ()
      extends typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimation
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimationType")
    @js.native
    object PropertyAnimationType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType with Double] = js.native
      
      /* 2 */ val opacity: typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.opacity with Double = js.native
      
      /* 0 */ val scale: typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.scale with Double = js.native
      
      /* 1 */ val translation: typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.translation with Double = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.ScaleAnimation")
    @js.native
    class ScaleAnimation ()
      extends typings.winrt.Windows.UI.Core.AnimationMetrics.ScaleAnimation
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.TranslationAnimation")
    @js.native
    class TranslationAnimation ()
      extends typings.winrt.Windows.UI.Core.AnimationMetrics.TranslationAnimation
  }
  
  @JSGlobal("Windows.UI.Core.AutomationProviderRequestedEventArgs")
  @js.native
  class AutomationProviderRequestedEventArgs ()
    extends typings.winrt.Windows.UI.Core.AutomationProviderRequestedEventArgs
  
  @JSGlobal("Windows.UI.Core.CharacterReceivedEventArgs")
  @js.native
  class CharacterReceivedEventArgs ()
    extends typings.winrt.Windows.UI.Core.CharacterReceivedEventArgs
  
  @JSGlobal("Windows.UI.Core.CoreAcceleratorKeyEventType")
  @js.native
  object CoreAcceleratorKeyEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType with Double] = js.native
    
    /* 0 */ val character: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.character with Double = js.native
    
    /* 1 */ val deadCharacter: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.deadCharacter with Double = js.native
    
    /* 2 */ val keyDown: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.keyDown with Double = js.native
    
    /* 3 */ val keyUp: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.keyUp with Double = js.native
    
    /* 4 */ val systemCharacter: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.systemCharacter with Double = js.native
    
    /* 5 */ val systemDeadCharacter: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.systemDeadCharacter with Double = js.native
    
    /* 6 */ val systemKeyDown: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.systemKeyDown with Double = js.native
    
    /* 7 */ val systemKeyUp: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.systemKeyUp with Double = js.native
    
    /* 8 */ val unicodeCharacter: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.unicodeCharacter with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreAcceleratorKeys")
  @js.native
  class CoreAcceleratorKeys ()
    extends typings.winrt.Windows.UI.Core.CoreAcceleratorKeys
  
  @JSGlobal("Windows.UI.Core.CoreCursor")
  @js.native
  class CoreCursor protected ()
    extends typings.winrt.Windows.UI.Core.CoreCursor {
    def this(`type`: CoreCursorType, id: Double) = this()
  }
  
  @JSGlobal("Windows.UI.Core.CoreCursorType")
  @js.native
  object CoreCursorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreCursorType with Double] = js.native
    
    /* 0 */ val arrow: typings.winrt.Windows.UI.Core.CoreCursorType.arrow with Double = js.native
    
    /* 1 */ val cross: typings.winrt.Windows.UI.Core.CoreCursorType.cross with Double = js.native
    
    /* 2 */ val custom: typings.winrt.Windows.UI.Core.CoreCursorType.custom with Double = js.native
    
    /* 3 */ val hand: typings.winrt.Windows.UI.Core.CoreCursorType.hand with Double = js.native
    
    /* 4 */ val help: typings.winrt.Windows.UI.Core.CoreCursorType.help with Double = js.native
    
    /* 5 */ val iBeam: typings.winrt.Windows.UI.Core.CoreCursorType.iBeam with Double = js.native
    
    /* 6 */ val sizeAll: typings.winrt.Windows.UI.Core.CoreCursorType.sizeAll with Double = js.native
    
    /* 8 */ val sizeNorthSouth: typings.winrt.Windows.UI.Core.CoreCursorType.sizeNorthSouth with Double = js.native
    
    /* 7 */ val sizeNortheastSouthwest: typings.winrt.Windows.UI.Core.CoreCursorType.sizeNortheastSouthwest with Double = js.native
    
    /* 9 */ val sizeNorthwestSoutheast: typings.winrt.Windows.UI.Core.CoreCursorType.sizeNorthwestSoutheast with Double = js.native
    
    /* 10 */ val sizeWestEast: typings.winrt.Windows.UI.Core.CoreCursorType.sizeWestEast with Double = js.native
    
    /* 11 */ val universalNo: typings.winrt.Windows.UI.Core.CoreCursorType.universalNo with Double = js.native
    
    /* 12 */ val upArrow: typings.winrt.Windows.UI.Core.CoreCursorType.upArrow with Double = js.native
    
    /* 13 */ @JSName("wait")
    val wait_ : wait with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreDispatcher")
  @js.native
  class CoreDispatcher ()
    extends typings.winrt.Windows.UI.Core.CoreDispatcher
  
  @JSGlobal("Windows.UI.Core.CoreDispatcherPriority")
  @js.native
  object CoreDispatcherPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreDispatcherPriority with Double] = js.native
    
    /* 2 */ val high: typings.winrt.Windows.UI.Core.CoreDispatcherPriority.high with Double = js.native
    
    /* 0 */ val low: typings.winrt.Windows.UI.Core.CoreDispatcherPriority.low with Double = js.native
    
    /* 1 */ val normal: typings.winrt.Windows.UI.Core.CoreDispatcherPriority.normal with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreProcessEventsOption")
  @js.native
  object CoreProcessEventsOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreProcessEventsOption with Double] = js.native
    
    /* 3 */ val processAllIfPresent: typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processAllIfPresent with Double = js.native
    
    /* 0 */ val processOneAndAllPending: typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processOneAndAllPending with Double = js.native
    
    /* 1 */ val processOneIfPresent: typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processOneIfPresent with Double = js.native
    
    /* 2 */ val processUntilQuit: typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processUntilQuit with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreProximityEvaluationScore")
  @js.native
  object CoreProximityEvaluationScore extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreProximityEvaluationScore with Double] = js.native
    
    /* 0 */ val closest: typings.winrt.Windows.UI.Core.CoreProximityEvaluationScore.closest with Double = js.native
    
    /* 1 */ val farthest: typings.winrt.Windows.UI.Core.CoreProximityEvaluationScore.farthest with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreVirtualKeyStates")
  @js.native
  object CoreVirtualKeyStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreVirtualKeyStates with Double] = js.native
    
    /* 1 */ val down: typings.winrt.Windows.UI.Core.CoreVirtualKeyStates.down with Double = js.native
    
    /* 2 */ val locked: typings.winrt.Windows.UI.Core.CoreVirtualKeyStates.locked with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.UI.Core.CoreVirtualKeyStates.none with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindow")
  @js.native
  class CoreWindow ()
    extends typings.winrt.Windows.UI.Core.CoreWindow
  /* static members */
  object CoreWindow {
    
    @JSGlobal("Windows.UI.Core.CoreWindow.getForCurrentThread")
    @js.native
    def getForCurrentThread(): typings.winrt.Windows.UI.Core.CoreWindow = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowActivationState")
  @js.native
  object CoreWindowActivationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreWindowActivationState with Double] = js.native
    
    /* 0 */ val codeActivated: typings.winrt.Windows.UI.Core.CoreWindowActivationState.codeActivated with Double = js.native
    
    /* 1 */ val deactivated: typings.winrt.Windows.UI.Core.CoreWindowActivationState.deactivated with Double = js.native
    
    /* 2 */ val pointerActivated: typings.winrt.Windows.UI.Core.CoreWindowActivationState.pointerActivated with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowDialog")
  @js.native
  class CoreWindowDialog ()
    extends typings.winrt.Windows.UI.Core.CoreWindowDialog {
    def this(title: String) = this()
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowEventArgs")
  @js.native
  class CoreWindowEventArgs ()
    extends typings.winrt.Windows.UI.Core.CoreWindowEventArgs
  
  @JSGlobal("Windows.UI.Core.CoreWindowFlowDirection")
  @js.native
  object CoreWindowFlowDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreWindowFlowDirection with Double] = js.native
    
    /* 0 */ val leftToRight: typings.winrt.Windows.UI.Core.CoreWindowFlowDirection.leftToRight with Double = js.native
    
    /* 1 */ val rightToLeft: typings.winrt.Windows.UI.Core.CoreWindowFlowDirection.rightToLeft with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowFlyout")
  @js.native
  class CoreWindowFlyout protected ()
    extends typings.winrt.Windows.UI.Core.CoreWindowFlyout {
    def this(position: Point) = this()
    def this(position: Point, title: String) = this()
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowPopupShowingEventArgs")
  @js.native
  class CoreWindowPopupShowingEventArgs ()
    extends typings.winrt.Windows.UI.Core.CoreWindowPopupShowingEventArgs
  
  @JSGlobal("Windows.UI.Core.CoreWindowResizeManager")
  @js.native
  class CoreWindowResizeManager ()
    extends typings.winrt.Windows.UI.Core.CoreWindowResizeManager
  /* static members */
  object CoreWindowResizeManager {
    
    @JSGlobal("Windows.UI.Core.CoreWindowResizeManager.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrt.Windows.UI.Core.CoreWindowResizeManager = js.native
  }
  
  @JSGlobal("Windows.UI.Core.IdleDispatchedHandlerArgs")
  @js.native
  class IdleDispatchedHandlerArgs ()
    extends typings.winrt.Windows.UI.Core.IdleDispatchedHandlerArgs
  
  @JSGlobal("Windows.UI.Core.InputEnabledEventArgs")
  @js.native
  class InputEnabledEventArgs ()
    extends typings.winrt.Windows.UI.Core.InputEnabledEventArgs
  
  @JSGlobal("Windows.UI.Core.KeyEventArgs")
  @js.native
  class KeyEventArgs ()
    extends typings.winrt.Windows.UI.Core.KeyEventArgs
  
  @JSGlobal("Windows.UI.Core.PointerEventArgs")
  @js.native
  class PointerEventArgs ()
    extends typings.winrt.Windows.UI.Core.PointerEventArgs
  
  @JSGlobal("Windows.UI.Core.TouchHitTestingEventArgs")
  @js.native
  class TouchHitTestingEventArgs ()
    extends typings.winrt.Windows.UI.Core.TouchHitTestingEventArgs
  
  @JSGlobal("Windows.UI.Core.VisibilityChangedEventArgs")
  @js.native
  class VisibilityChangedEventArgs ()
    extends typings.winrt.Windows.UI.Core.VisibilityChangedEventArgs
  
  @JSGlobal("Windows.UI.Core.WindowActivatedEventArgs")
  @js.native
  class WindowActivatedEventArgs ()
    extends typings.winrt.Windows.UI.Core.WindowActivatedEventArgs
  
  @JSGlobal("Windows.UI.Core.WindowSizeChangedEventArgs")
  @js.native
  class WindowSizeChangedEventArgs ()
    extends typings.winrt.Windows.UI.Core.WindowSizeChangedEventArgs
}

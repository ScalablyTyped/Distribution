package typings.winrt.global.Windows.UI

import typings.winrt.Windows.Foundation.Collections.IPropertySet
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.Foundation.Size
import typings.winrt.Windows.System.VirtualKey
import typings.winrt.Windows.System.VirtualKeyModifiers
import typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect
import typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget
import typings.winrt.Windows.UI.Core.AnimationMetrics.IPropertyAnimation
import typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType
import typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType
import typings.winrt.Windows.UI.Core.CoreCursorType
import typings.winrt.Windows.UI.Core.CoreCursorType.wait
import typings.winrt.Windows.UI.Core.CoreDispatcherPriority
import typings.winrt.Windows.UI.Core.CorePhysicalKeyStatus
import typings.winrt.Windows.UI.Core.CoreProcessEventsOption
import typings.winrt.Windows.UI.Core.CoreVirtualKeyStates
import typings.winrt.Windows.UI.Core.CoreWindowActivationState
import typings.winrt.Windows.UI.Core.CoreWindowFlowDirection
import typings.winrt.Windows.UI.Core.DispatchedHandler
import typings.winrt.Windows.UI.Core.IdleDispatchedHandler
import typings.winrt.Windows.UI.Input.PointerPoint
import typings.winrt.Windows.UI.Popups.IUICommand
import typings.winrt.Windows.UI.Popups.UICommandInvokedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Core {
  
  @JSGlobal("Windows.UI.Core.AcceleratorKeyEventArgs")
  @js.native
  open class AcceleratorKeyEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Core.AcceleratorKeyEventArgs {
    
    /* CompleteClass */
    var eventType: CoreAcceleratorKeyEventType = js.native
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var keyStatus: CorePhysicalKeyStatus = js.native
    
    /* CompleteClass */
    var virtualKey: VirtualKey = js.native
  }
  
  object AnimationMetrics {
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationDescription")
    @js.native
    open class AnimationDescription protected ()
      extends StObject
         with typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationDescription {
      def this(effect: AnimationEffect, target: AnimationEffectTarget) = this()
      
      /* CompleteClass */
      var animations: IVectorView[IPropertyAnimation] = js.native
      
      /* CompleteClass */
      var delayLimit: Double = js.native
      
      /* CompleteClass */
      var staggerDelay: Double = js.native
      
      /* CompleteClass */
      var staggerDelayFactor: Double = js.native
      
      /* CompleteClass */
      var zOrder: Double = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffect")
    @js.native
    object AnimationEffect extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect & Double] = js.native
      
      /* 7 */ val addToGrid: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToGrid & Double = js.native
      
      /* 5 */ val addToList: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToList & Double = js.native
      
      /* 9 */ val addToSearchGrid: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchGrid & Double = js.native
      
      /* 11 */ val addToSearchList: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.addToSearchList & Double = js.native
      
      /* 1 */ val collapse: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.collapse & Double = js.native
      
      /* 33 */ val crossFade: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.crossFade & Double = js.native
      
      /* 8 */ val deleteFromGrid: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromGrid & Double = js.native
      
      /* 6 */ val deleteFromList: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromList & Double = js.native
      
      /* 10 */ val deleteFromSearchGrid: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchGrid & Double = js.native
      
      /* 12 */ val deleteFromSearchList: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.deleteFromSearchList & Double = js.native
      
      /* 26 */ val dragBetweenEnter: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenEnter & Double = js.native
      
      /* 27 */ val dragBetweenLeave: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragBetweenLeave & Double = js.native
      
      /* 22 */ val dragSourceEnd: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceEnd & Double = js.native
      
      /* 21 */ val dragSourceStart: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.dragSourceStart & Double = js.native
      
      /* 31 */ val enterPage: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.enterPage & Double = js.native
      
      /* 0 */ val expand: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.expand & Double = js.native
      
      /* 3 */ val fadeIn: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeIn & Double = js.native
      
      /* 4 */ val fadeOut: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.fadeOut & Double = js.native
      
      /* 25 */ val hide: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.hide & Double = js.native
      
      /* 15 */ val hideEdgeUI: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.hideEdgeUI & Double = js.native
      
      /* 16 */ val hidePanel: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePanel & Double = js.native
      
      /* 18 */ val hidePopup: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.hidePopup & Double = js.native
      
      /* 34 */ val peek: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.peek & Double = js.native
      
      /* 19 */ val pointerDown: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerDown & Double = js.native
      
      /* 20 */ val pointerUp: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.pointerUp & Double = js.native
      
      /* 2 */ val reposition: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.reposition & Double = js.native
      
      /* 24 */ val reveal: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.reveal & Double = js.native
      
      /* 13 */ val showEdgeUI: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.showEdgeUI & Double = js.native
      
      /* 14 */ val showPanel: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPanel & Double = js.native
      
      /* 17 */ val showPopup: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.showPopup & Double = js.native
      
      /* 29 */ val swipeDeselect: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeDeselect & Double = js.native
      
      /* 30 */ val swipeReveal: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeReveal & Double = js.native
      
      /* 28 */ val swipeSelect: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.swipeSelect & Double = js.native
      
      /* 23 */ val transitionContent: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionContent & Double = js.native
      
      /* 32 */ val transitionPage: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.transitionPage & Double = js.native
      
      /* 35 */ val updateBadge: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffect.updateBadge & Double = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.AnimationEffectTarget")
    @js.native
    object AnimationEffectTarget extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget & Double] = js.native
      
      /* 1 */ val added: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.added & Double = js.native
      
      /* 2 */ val affected: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.affected & Double = js.native
      
      /* 3 */ val background: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.background & Double = js.native
      
      /* 4 */ val content: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.content & Double = js.native
      
      /* 5 */ val deleted: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deleted & Double = js.native
      
      /* 6 */ val deselected: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.deselected & Double = js.native
      
      /* 7 */ val dragSource: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.dragSource & Double = js.native
      
      /* 8 */ val hidden: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.hidden & Double = js.native
      
      /* 9 */ val incoming: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.incoming & Double = js.native
      
      /* 10 */ val outgoing: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outgoing & Double = js.native
      
      /* 11 */ val outline: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.outline & Double = js.native
      
      /* 0 */ val primary: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.primary & Double = js.native
      
      /* 12 */ val remaining: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.remaining & Double = js.native
      
      /* 13 */ val revealed: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.revealed & Double = js.native
      
      /* 14 */ val rowIn: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowIn & Double = js.native
      
      /* 15 */ val rowOut: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.rowOut & Double = js.native
      
      /* 16 */ val selected: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selected & Double = js.native
      
      /* 17 */ val selection: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.selection & Double = js.native
      
      /* 18 */ val shown: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.shown & Double = js.native
      
      /* 19 */ val tapped: typings.winrt.Windows.UI.Core.AnimationMetrics.AnimationEffectTarget.tapped & Double = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.OpacityAnimation")
    @js.native
    open class OpacityAnimation ()
      extends StObject
         with typings.winrt.Windows.UI.Core.AnimationMetrics.OpacityAnimation {
      
      /* CompleteClass */
      var control1: Point = js.native
      
      /* CompleteClass */
      var control2: Point = js.native
      
      /* CompleteClass */
      var delay: Double = js.native
      
      /* CompleteClass */
      var duration: Double = js.native
      
      /* CompleteClass */
      var finalOpacity: Double = js.native
      
      /* CompleteClass */
      var initialOpacity: Double = js.native
      
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimation")
    @js.native
    open class PropertyAnimation ()
      extends StObject
         with typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimation {
      
      /* CompleteClass */
      var control1: Point = js.native
      
      /* CompleteClass */
      var control2: Point = js.native
      
      /* CompleteClass */
      var delay: Double = js.native
      
      /* CompleteClass */
      var duration: Double = js.native
      
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.PropertyAnimationType")
    @js.native
    object PropertyAnimationType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType & Double] = js.native
      
      /* 2 */ val opacity: typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.opacity & Double = js.native
      
      /* 0 */ val scale: typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.scale & Double = js.native
      
      /* 1 */ val translation: typings.winrt.Windows.UI.Core.AnimationMetrics.PropertyAnimationType.translation & Double = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.ScaleAnimation")
    @js.native
    open class ScaleAnimation ()
      extends StObject
         with typings.winrt.Windows.UI.Core.AnimationMetrics.ScaleAnimation {
      
      /* CompleteClass */
      var control1: Point = js.native
      
      /* CompleteClass */
      var control2: Point = js.native
      
      /* CompleteClass */
      var delay: Double = js.native
      
      /* CompleteClass */
      var duration: Double = js.native
      
      /* CompleteClass */
      var finalScaleX: Double = js.native
      
      /* CompleteClass */
      var finalScaleY: Double = js.native
      
      /* CompleteClass */
      var initialScaleX: Double = js.native
      
      /* CompleteClass */
      var initialScaleY: Double = js.native
      
      /* CompleteClass */
      var normalizedOrigin: Point = js.native
      
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
    
    @JSGlobal("Windows.UI.Core.AnimationMetrics.TranslationAnimation")
    @js.native
    open class TranslationAnimation ()
      extends StObject
         with typings.winrt.Windows.UI.Core.AnimationMetrics.TranslationAnimation {
      
      /* CompleteClass */
      var control1: Point = js.native
      
      /* CompleteClass */
      var control2: Point = js.native
      
      /* CompleteClass */
      var delay: Double = js.native
      
      /* CompleteClass */
      var duration: Double = js.native
      
      /* CompleteClass */
      var `type`: PropertyAnimationType = js.native
    }
  }
  
  @JSGlobal("Windows.UI.Core.AutomationProviderRequestedEventArgs")
  @js.native
  open class AutomationProviderRequestedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Core.AutomationProviderRequestedEventArgs {
    
    /* CompleteClass */
    var automationProvider: Any = js.native
    
    /* CompleteClass */
    var handled: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CharacterReceivedEventArgs")
  @js.native
  open class CharacterReceivedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Core.CharacterReceivedEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var keyCode: Double = js.native
    
    /* CompleteClass */
    var keyStatus: CorePhysicalKeyStatus = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreAcceleratorKeyEventType")
  @js.native
  object CoreAcceleratorKeyEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType & Double] = js.native
    
    /* 0 */ val character: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.character & Double = js.native
    
    /* 1 */ val deadCharacter: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.deadCharacter & Double = js.native
    
    /* 2 */ val keyDown: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.keyDown & Double = js.native
    
    /* 3 */ val keyUp: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.keyUp & Double = js.native
    
    /* 4 */ val systemCharacter: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.systemCharacter & Double = js.native
    
    /* 5 */ val systemDeadCharacter: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.systemDeadCharacter & Double = js.native
    
    /* 6 */ val systemKeyDown: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.systemKeyDown & Double = js.native
    
    /* 7 */ val systemKeyUp: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.systemKeyUp & Double = js.native
    
    /* 8 */ val unicodeCharacter: typings.winrt.Windows.UI.Core.CoreAcceleratorKeyEventType.unicodeCharacter & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreAcceleratorKeys")
  @js.native
  open class CoreAcceleratorKeys ()
    extends StObject
       with typings.winrt.Windows.UI.Core.CoreAcceleratorKeys {
    
    /* CompleteClass */
    var onacceleratorkeyactivated: Any = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreCursor")
  @js.native
  open class CoreCursor protected ()
    extends StObject
       with typings.winrt.Windows.UI.Core.CoreCursor {
    def this(`type`: CoreCursorType, id: Double) = this()
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var `type`: CoreCursorType = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreCursorType")
  @js.native
  object CoreCursorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreCursorType & Double] = js.native
    
    /* 0 */ val arrow: typings.winrt.Windows.UI.Core.CoreCursorType.arrow & Double = js.native
    
    /* 1 */ val cross: typings.winrt.Windows.UI.Core.CoreCursorType.cross & Double = js.native
    
    /* 2 */ val custom: typings.winrt.Windows.UI.Core.CoreCursorType.custom & Double = js.native
    
    /* 3 */ val hand: typings.winrt.Windows.UI.Core.CoreCursorType.hand & Double = js.native
    
    /* 4 */ val help: typings.winrt.Windows.UI.Core.CoreCursorType.help & Double = js.native
    
    /* 5 */ val iBeam: typings.winrt.Windows.UI.Core.CoreCursorType.iBeam & Double = js.native
    
    /* 6 */ val sizeAll: typings.winrt.Windows.UI.Core.CoreCursorType.sizeAll & Double = js.native
    
    /* 8 */ val sizeNorthSouth: typings.winrt.Windows.UI.Core.CoreCursorType.sizeNorthSouth & Double = js.native
    
    /* 7 */ val sizeNortheastSouthwest: typings.winrt.Windows.UI.Core.CoreCursorType.sizeNortheastSouthwest & Double = js.native
    
    /* 9 */ val sizeNorthwestSoutheast: typings.winrt.Windows.UI.Core.CoreCursorType.sizeNorthwestSoutheast & Double = js.native
    
    /* 10 */ val sizeWestEast: typings.winrt.Windows.UI.Core.CoreCursorType.sizeWestEast & Double = js.native
    
    /* 11 */ val universalNo: typings.winrt.Windows.UI.Core.CoreCursorType.universalNo & Double = js.native
    
    /* 12 */ val upArrow: typings.winrt.Windows.UI.Core.CoreCursorType.upArrow & Double = js.native
    
    /* 13 */ @JSName("wait")
    val wait_ : wait & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreDispatcher")
  @js.native
  open class CoreDispatcher ()
    extends StObject
       with typings.winrt.Windows.UI.Core.CoreDispatcher {
    
    /* CompleteClass */
    var hasThreadAccess: Boolean = js.native
    
    /* CompleteClass */
    var onacceleratorkeyactivated: Any = js.native
    
    /* CompleteClass */
    override def processEvents(options: CoreProcessEventsOption): Unit = js.native
    
    /* CompleteClass */
    override def runAsync(priority: CoreDispatcherPriority, agileCallback: DispatchedHandler): IAsyncAction = js.native
    
    /* CompleteClass */
    override def runIdleAsync(agileCallback: IdleDispatchedHandler): IAsyncAction = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreDispatcherPriority")
  @js.native
  object CoreDispatcherPriority extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreDispatcherPriority & Double] = js.native
    
    /* 2 */ val high: typings.winrt.Windows.UI.Core.CoreDispatcherPriority.high & Double = js.native
    
    /* 0 */ val low: typings.winrt.Windows.UI.Core.CoreDispatcherPriority.low & Double = js.native
    
    /* 1 */ val normal: typings.winrt.Windows.UI.Core.CoreDispatcherPriority.normal & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreProcessEventsOption")
  @js.native
  object CoreProcessEventsOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreProcessEventsOption & Double] = js.native
    
    /* 3 */ val processAllIfPresent: typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processAllIfPresent & Double = js.native
    
    /* 0 */ val processOneAndAllPending: typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processOneAndAllPending & Double = js.native
    
    /* 1 */ val processOneIfPresent: typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processOneIfPresent & Double = js.native
    
    /* 2 */ val processUntilQuit: typings.winrt.Windows.UI.Core.CoreProcessEventsOption.processUntilQuit & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreProximityEvaluationScore")
  @js.native
  object CoreProximityEvaluationScore extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreProximityEvaluationScore & Double] = js.native
    
    /* 0 */ val closest: typings.winrt.Windows.UI.Core.CoreProximityEvaluationScore.closest & Double = js.native
    
    /* 1 */ val farthest: typings.winrt.Windows.UI.Core.CoreProximityEvaluationScore.farthest & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreVirtualKeyStates")
  @js.native
  object CoreVirtualKeyStates extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreVirtualKeyStates & Double] = js.native
    
    /* 1 */ val down: typings.winrt.Windows.UI.Core.CoreVirtualKeyStates.down & Double = js.native
    
    /* 2 */ val locked: typings.winrt.Windows.UI.Core.CoreVirtualKeyStates.locked & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.UI.Core.CoreVirtualKeyStates.none & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindow")
  @js.native
  open class CoreWindow ()
    extends StObject
       with typings.winrt.Windows.UI.Core.CoreWindow {
    
    /* CompleteClass */
    override def activate(): Unit = js.native
    
    /* CompleteClass */
    var automationHostProvider: Any = js.native
    
    /* CompleteClass */
    var bounds: Rect = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    var customProperties: IPropertySet = js.native
    
    /* CompleteClass */
    var dispatcher: typings.winrt.Windows.UI.Core.CoreDispatcher = js.native
    
    /* CompleteClass */
    var flowDirection: CoreWindowFlowDirection = js.native
    
    /* CompleteClass */
    override def getAsyncKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates = js.native
    
    /* CompleteClass */
    override def getKeyState(virtualKey: VirtualKey): CoreVirtualKeyStates = js.native
    
    /* CompleteClass */
    var isInputEnabled: Boolean = js.native
    
    /* CompleteClass */
    var onactivated: Any = js.native
    
    /* CompleteClass */
    var onautomationproviderrequested: Any = js.native
    
    /* CompleteClass */
    var oncharacterreceived: Any = js.native
    
    /* CompleteClass */
    var onclosed: Any = js.native
    
    /* CompleteClass */
    var oninputenabled: Any = js.native
    
    /* CompleteClass */
    var onkeydown: Any = js.native
    
    /* CompleteClass */
    var onkeyup: Any = js.native
    
    /* CompleteClass */
    var onpointercapturelost: Any = js.native
    
    /* CompleteClass */
    var onpointerentered: Any = js.native
    
    /* CompleteClass */
    var onpointerexited: Any = js.native
    
    /* CompleteClass */
    var onpointermoved: Any = js.native
    
    /* CompleteClass */
    var onpointerpressed: Any = js.native
    
    /* CompleteClass */
    var onpointerreleased: Any = js.native
    
    /* CompleteClass */
    var onpointerwheelchanged: Any = js.native
    
    /* CompleteClass */
    var onsizechanged: Any = js.native
    
    /* CompleteClass */
    var ontouchhittesting: Any = js.native
    
    /* CompleteClass */
    var onvisibilitychanged: Any = js.native
    
    /* CompleteClass */
    var pointerCursor: typings.winrt.Windows.UI.Core.CoreCursor = js.native
    
    /* CompleteClass */
    var pointerPosition: Point = js.native
    
    /* CompleteClass */
    override def releasePointerCapture(): Unit = js.native
    
    /* CompleteClass */
    override def setPointerCapture(): Unit = js.native
    
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  /* static members */
  object CoreWindow {
    
    @JSGlobal("Windows.UI.Core.CoreWindow")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getForCurrentThread(): typings.winrt.Windows.UI.Core.CoreWindow = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentThread")().asInstanceOf[typings.winrt.Windows.UI.Core.CoreWindow]
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowActivationState")
  @js.native
  object CoreWindowActivationState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreWindowActivationState & Double] = js.native
    
    /* 0 */ val codeActivated: typings.winrt.Windows.UI.Core.CoreWindowActivationState.codeActivated & Double = js.native
    
    /* 1 */ val deactivated: typings.winrt.Windows.UI.Core.CoreWindowActivationState.deactivated & Double = js.native
    
    /* 2 */ val pointerActivated: typings.winrt.Windows.UI.Core.CoreWindowActivationState.pointerActivated & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowDialog")
  @js.native
  open class CoreWindowDialog ()
    extends StObject
       with typings.winrt.Windows.UI.Core.CoreWindowDialog {
    def this(title: String) = this()
    
    /* CompleteClass */
    override def backButtonCommand(command: IUICommand): Unit = js.native
    /* CompleteClass */
    @JSName("backButtonCommand")
    var backButtonCommand_Original: UICommandInvokedHandler = js.native
    
    /* CompleteClass */
    var cancelCommandIndex: Double = js.native
    
    /* CompleteClass */
    var commands: IVector[IUICommand] = js.native
    
    /* CompleteClass */
    var defaultCommandIndex: Double = js.native
    
    /* CompleteClass */
    var isInteractionDelayed: Double = js.native
    
    /* CompleteClass */
    var maxSize: Size = js.native
    
    /* CompleteClass */
    var minSize: Size = js.native
    
    /* CompleteClass */
    var onshowing: Any = js.native
    
    /* CompleteClass */
    override def showAsync(): IAsyncOperation[IUICommand] = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowEventArgs")
  @js.native
  open class CoreWindowEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Core.CoreWindowEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowFlowDirection")
  @js.native
  object CoreWindowFlowDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Core.CoreWindowFlowDirection & Double] = js.native
    
    /* 0 */ val leftToRight: typings.winrt.Windows.UI.Core.CoreWindowFlowDirection.leftToRight & Double = js.native
    
    /* 1 */ val rightToLeft: typings.winrt.Windows.UI.Core.CoreWindowFlowDirection.rightToLeft & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowFlyout")
  @js.native
  open class CoreWindowFlyout protected ()
    extends StObject
       with typings.winrt.Windows.UI.Core.CoreWindowFlyout {
    def this(position: Point) = this()
    def this(position: Point, title: String) = this()
    
    /* CompleteClass */
    override def backButtonCommand(command: IUICommand): Unit = js.native
    /* CompleteClass */
    @JSName("backButtonCommand")
    var backButtonCommand_Original: UICommandInvokedHandler = js.native
    
    /* CompleteClass */
    var commands: IVector[IUICommand] = js.native
    
    /* CompleteClass */
    var defaultCommandIndex: Double = js.native
    
    /* CompleteClass */
    var isInteractionDelayed: Double = js.native
    
    /* CompleteClass */
    var maxSize: Size = js.native
    
    /* CompleteClass */
    var minSize: Size = js.native
    
    /* CompleteClass */
    var onshowing: Any = js.native
    
    /* CompleteClass */
    override def showAsync(): IAsyncOperation[IUICommand] = js.native
    
    /* CompleteClass */
    var title: String = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowPopupShowingEventArgs")
  @js.native
  open class CoreWindowPopupShowingEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Core.CoreWindowPopupShowingEventArgs {
    
    /* CompleteClass */
    override def setDesiredSize(value: Size): Unit = js.native
  }
  
  @JSGlobal("Windows.UI.Core.CoreWindowResizeManager")
  @js.native
  open class CoreWindowResizeManager ()
    extends StObject
       with typings.winrt.Windows.UI.Core.CoreWindowResizeManager {
    
    /* CompleteClass */
    override def notifyLayoutCompleted(): Unit = js.native
  }
  /* static members */
  object CoreWindowResizeManager {
    
    @JSGlobal("Windows.UI.Core.CoreWindowResizeManager")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getForCurrentView(): typings.winrt.Windows.UI.Core.CoreWindowResizeManager = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrt.Windows.UI.Core.CoreWindowResizeManager]
  }
  
  @JSGlobal("Windows.UI.Core.IdleDispatchedHandlerArgs")
  @js.native
  open class IdleDispatchedHandlerArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Core.IdleDispatchedHandlerArgs {
    
    /* CompleteClass */
    var isDispatcherIdle: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Core.InputEnabledEventArgs")
  @js.native
  open class InputEnabledEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Core.InputEnabledEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var inputEnabled: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Core.KeyEventArgs")
  @js.native
  open class KeyEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Core.KeyEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var keyStatus: CorePhysicalKeyStatus = js.native
    
    /* CompleteClass */
    var virtualKey: VirtualKey = js.native
  }
  
  @JSGlobal("Windows.UI.Core.PointerEventArgs")
  @js.native
  open class PointerEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Core.PointerEventArgs {
    
    /* CompleteClass */
    var currentPoint: PointerPoint = js.native
    
    /* CompleteClass */
    override def getIntermediatePoints(): IVector[PointerPoint] = js.native
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var keyModifiers: VirtualKeyModifiers = js.native
  }
  
  @JSGlobal("Windows.UI.Core.TouchHitTestingEventArgs")
  @js.native
  open class TouchHitTestingEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Core.TouchHitTestingEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Core.VisibilityChangedEventArgs")
  @js.native
  open class VisibilityChangedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Core.VisibilityChangedEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var visible: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Core.WindowActivatedEventArgs")
  @js.native
  open class WindowActivatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Core.WindowActivatedEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var windowActivationState: CoreWindowActivationState = js.native
  }
  
  @JSGlobal("Windows.UI.Core.WindowSizeChangedEventArgs")
  @js.native
  open class WindowSizeChangedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Core.WindowSizeChangedEventArgs {
    
    /* CompleteClass */
    var handled: Boolean = js.native
    
    /* CompleteClass */
    var size: Size = js.native
  }
}

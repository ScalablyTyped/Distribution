package typings.winrt.global.Windows.UI

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.UI.Input.IPointerPointTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  @JSGlobal("Windows.UI.Input.CrossSlidingEventArgs")
  @js.native
  class CrossSlidingEventArgs ()
    extends typings.winrt.Windows.UI.Input.CrossSlidingEventArgs
  
  @JSGlobal("Windows.UI.Input.CrossSlidingState")
  @js.native
  object CrossSlidingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.CrossSlidingState with Double] = js.native
    
    /* 6 */ val completed: typings.winrt.Windows.UI.Input.CrossSlidingState.completed with Double = js.native
    
    /* 1 */ val dragging: typings.winrt.Windows.UI.Input.CrossSlidingState.dragging with Double = js.native
    
    /* 5 */ val rearranging: typings.winrt.Windows.UI.Input.CrossSlidingState.rearranging with Double = js.native
    
    /* 3 */ val selectSpeedBumping: typings.winrt.Windows.UI.Input.CrossSlidingState.selectSpeedBumping with Double = js.native
    
    /* 2 */ val selecting: typings.winrt.Windows.UI.Input.CrossSlidingState.selecting with Double = js.native
    
    /* 4 */ val speedBumping: typings.winrt.Windows.UI.Input.CrossSlidingState.speedBumping with Double = js.native
    
    /* 0 */ val started: typings.winrt.Windows.UI.Input.CrossSlidingState.started with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.DraggingEventArgs")
  @js.native
  class DraggingEventArgs ()
    extends typings.winrt.Windows.UI.Input.DraggingEventArgs
  
  @JSGlobal("Windows.UI.Input.DraggingState")
  @js.native
  object DraggingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.DraggingState with Double] = js.native
    
    /* 2 */ val completed: typings.winrt.Windows.UI.Input.DraggingState.completed with Double = js.native
    
    /* 1 */ val continuing: typings.winrt.Windows.UI.Input.DraggingState.continuing with Double = js.native
    
    /* 0 */ val started: typings.winrt.Windows.UI.Input.DraggingState.started with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.EdgeGesture")
  @js.native
  class EdgeGesture ()
    extends typings.winrt.Windows.UI.Input.EdgeGesture
  /* static members */
  object EdgeGesture {
    
    @JSGlobal("Windows.UI.Input.EdgeGesture.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrt.Windows.UI.Input.EdgeGesture = js.native
  }
  
  @JSGlobal("Windows.UI.Input.EdgeGestureEventArgs")
  @js.native
  class EdgeGestureEventArgs ()
    extends typings.winrt.Windows.UI.Input.EdgeGestureEventArgs
  
  @JSGlobal("Windows.UI.Input.EdgeGestureKind")
  @js.native
  object EdgeGestureKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.EdgeGestureKind with Double] = js.native
    
    /* 1 */ val keyboard: typings.winrt.Windows.UI.Input.EdgeGestureKind.keyboard with Double = js.native
    
    /* 2 */ val mouse: typings.winrt.Windows.UI.Input.EdgeGestureKind.mouse with Double = js.native
    
    /* 0 */ val touch: typings.winrt.Windows.UI.Input.EdgeGestureKind.touch with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.GestureRecognizer")
  @js.native
  class GestureRecognizer ()
    extends typings.winrt.Windows.UI.Input.GestureRecognizer
  
  @JSGlobal("Windows.UI.Input.GestureSettings")
  @js.native
  object GestureSettings extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.GestureSettings with Double] = js.native
    
    /* 16 */ val crossSlide: typings.winrt.Windows.UI.Input.GestureSettings.crossSlide with Double = js.native
    
    /* 2 */ val doubleTap: typings.winrt.Windows.UI.Input.GestureSettings.doubleTap with Double = js.native
    
    /* 6 */ val drag: typings.winrt.Windows.UI.Input.GestureSettings.drag with Double = js.native
    
    /* 3 */ val hold: typings.winrt.Windows.UI.Input.GestureSettings.hold with Double = js.native
    
    /* 4 */ val holdWithMouse: typings.winrt.Windows.UI.Input.GestureSettings.holdWithMouse with Double = js.native
    
    /* 11 */ val manipulationRotate: typings.winrt.Windows.UI.Input.GestureSettings.manipulationRotate with Double = js.native
    
    /* 14 */ val manipulationRotateInertia: typings.winrt.Windows.UI.Input.GestureSettings.manipulationRotateInertia with Double = js.native
    
    /* 12 */ val manipulationScale: typings.winrt.Windows.UI.Input.GestureSettings.manipulationScale with Double = js.native
    
    /* 15 */ val manipulationScaleInertia: typings.winrt.Windows.UI.Input.GestureSettings.manipulationScaleInertia with Double = js.native
    
    /* 13 */ val manipulationTranslateInertia: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateInertia with Double = js.native
    
    /* 9 */ val manipulationTranslateRailsX: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateRailsX with Double = js.native
    
    /* 10 */ val manipulationTranslateRailsY: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateRailsY with Double = js.native
    
    /* 7 */ val manipulationTranslateX: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateX with Double = js.native
    
    /* 8 */ val manipulationTranslateY: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateY with Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.UI.Input.GestureSettings.none with Double = js.native
    
    /* 5 */ val rightTap: typings.winrt.Windows.UI.Input.GestureSettings.rightTap with Double = js.native
    
    /* 1 */ val tap: typings.winrt.Windows.UI.Input.GestureSettings.tap with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.HoldingEventArgs")
  @js.native
  class HoldingEventArgs ()
    extends typings.winrt.Windows.UI.Input.HoldingEventArgs
  
  @JSGlobal("Windows.UI.Input.HoldingState")
  @js.native
  object HoldingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.HoldingState with Double] = js.native
    
    /* 2 */ val canceled: typings.winrt.Windows.UI.Input.HoldingState.canceled with Double = js.native
    
    /* 1 */ val completed: typings.winrt.Windows.UI.Input.HoldingState.completed with Double = js.native
    
    /* 0 */ val started: typings.winrt.Windows.UI.Input.HoldingState.started with Double = js.native
  }
  
  object Inking {
    
    @JSGlobal("Windows.UI.Input.Inking.InkDrawingAttributes")
    @js.native
    class InkDrawingAttributes ()
      extends typings.winrt.Windows.UI.Input.Inking.InkDrawingAttributes
    
    @JSGlobal("Windows.UI.Input.Inking.InkManager")
    @js.native
    class InkManager ()
      extends typings.winrt.Windows.UI.Input.Inking.InkManager
    
    @JSGlobal("Windows.UI.Input.Inking.InkManipulationMode")
    @js.native
    object InkManipulationMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.Inking.InkManipulationMode with Double] = js.native
      
      /* 1 */ val erasing: typings.winrt.Windows.UI.Input.Inking.InkManipulationMode.erasing with Double = js.native
      
      /* 0 */ val inking: typings.winrt.Windows.UI.Input.Inking.InkManipulationMode.inking with Double = js.native
      
      /* 2 */ val selecting: typings.winrt.Windows.UI.Input.Inking.InkManipulationMode.selecting with Double = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognitionResult")
    @js.native
    class InkRecognitionResult ()
      extends typings.winrt.Windows.UI.Input.Inking.InkRecognitionResult
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognitionTarget")
    @js.native
    object InkRecognitionTarget extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.Inking.InkRecognitionTarget with Double] = js.native
      
      /* 0 */ val all: typings.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.all with Double = js.native
      
      /* 2 */ val recent: typings.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.recent with Double = js.native
      
      /* 1 */ val selected: typings.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.selected with Double = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognizer")
    @js.native
    class InkRecognizer ()
      extends typings.winrt.Windows.UI.Input.Inking.InkRecognizer
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognizerContainer")
    @js.native
    class InkRecognizerContainer ()
      extends typings.winrt.Windows.UI.Input.Inking.InkRecognizerContainer
    
    @JSGlobal("Windows.UI.Input.Inking.InkStroke")
    @js.native
    class InkStroke ()
      extends typings.winrt.Windows.UI.Input.Inking.InkStroke
    
    @JSGlobal("Windows.UI.Input.Inking.InkStrokeBuilder")
    @js.native
    class InkStrokeBuilder ()
      extends typings.winrt.Windows.UI.Input.Inking.InkStrokeBuilder
    
    @JSGlobal("Windows.UI.Input.Inking.InkStrokeContainer")
    @js.native
    class InkStrokeContainer ()
      extends typings.winrt.Windows.UI.Input.Inking.InkStrokeContainer
    
    @JSGlobal("Windows.UI.Input.Inking.InkStrokeRenderingSegment")
    @js.native
    class InkStrokeRenderingSegment ()
      extends typings.winrt.Windows.UI.Input.Inking.InkStrokeRenderingSegment
    
    @JSGlobal("Windows.UI.Input.Inking.PenTipShape")
    @js.native
    object PenTipShape extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.Inking.PenTipShape with Double] = js.native
      
      /* 0 */ val circle: typings.winrt.Windows.UI.Input.Inking.PenTipShape.circle with Double = js.native
      
      /* 1 */ val rectangle: typings.winrt.Windows.UI.Input.Inking.PenTipShape.rectangle with Double = js.native
    }
  }
  
  @JSGlobal("Windows.UI.Input.ManipulationCompletedEventArgs")
  @js.native
  class ManipulationCompletedEventArgs ()
    extends typings.winrt.Windows.UI.Input.ManipulationCompletedEventArgs
  
  @JSGlobal("Windows.UI.Input.ManipulationInertiaStartingEventArgs")
  @js.native
  class ManipulationInertiaStartingEventArgs ()
    extends typings.winrt.Windows.UI.Input.ManipulationInertiaStartingEventArgs
  
  @JSGlobal("Windows.UI.Input.ManipulationStartedEventArgs")
  @js.native
  class ManipulationStartedEventArgs ()
    extends typings.winrt.Windows.UI.Input.ManipulationStartedEventArgs
  
  @JSGlobal("Windows.UI.Input.ManipulationUpdatedEventArgs")
  @js.native
  class ManipulationUpdatedEventArgs ()
    extends typings.winrt.Windows.UI.Input.ManipulationUpdatedEventArgs
  
  @JSGlobal("Windows.UI.Input.MouseWheelParameters")
  @js.native
  class MouseWheelParameters ()
    extends typings.winrt.Windows.UI.Input.MouseWheelParameters
  
  @JSGlobal("Windows.UI.Input.PointerPoint")
  @js.native
  class PointerPoint ()
    extends typings.winrt.Windows.UI.Input.PointerPoint
  /* static members */
  object PointerPoint {
    
    @JSGlobal("Windows.UI.Input.PointerPoint.getCurrentPoint")
    @js.native
    def getCurrentPoint(pointerId: Double): typings.winrt.Windows.UI.Input.PointerPoint = js.native
    @JSGlobal("Windows.UI.Input.PointerPoint.getCurrentPoint")
    @js.native
    def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): typings.winrt.Windows.UI.Input.PointerPoint = js.native
    
    @JSGlobal("Windows.UI.Input.PointerPoint.getIntermediatePoints")
    @js.native
    def getIntermediatePoints(pointerId: Double): IVector[typings.winrt.Windows.UI.Input.PointerPoint] = js.native
    @JSGlobal("Windows.UI.Input.PointerPoint.getIntermediatePoints")
    @js.native
    def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[typings.winrt.Windows.UI.Input.PointerPoint] = js.native
  }
  
  @JSGlobal("Windows.UI.Input.PointerPointProperties")
  @js.native
  class PointerPointProperties ()
    extends typings.winrt.Windows.UI.Input.PointerPointProperties
  
  @JSGlobal("Windows.UI.Input.PointerUpdateKind")
  @js.native
  object PointerUpdateKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.PointerUpdateKind with Double] = js.native
    
    /* 1 */ val leftButtonPressed: typings.winrt.Windows.UI.Input.PointerUpdateKind.leftButtonPressed with Double = js.native
    
    /* 2 */ val leftButtonReleased: typings.winrt.Windows.UI.Input.PointerUpdateKind.leftButtonReleased with Double = js.native
    
    /* 5 */ val middleButtonPressed: typings.winrt.Windows.UI.Input.PointerUpdateKind.middleButtonPressed with Double = js.native
    
    /* 6 */ val middleButtonReleased: typings.winrt.Windows.UI.Input.PointerUpdateKind.middleButtonReleased with Double = js.native
    
    /* 0 */ val other: typings.winrt.Windows.UI.Input.PointerUpdateKind.other with Double = js.native
    
    /* 3 */ val rightButtonPressed: typings.winrt.Windows.UI.Input.PointerUpdateKind.rightButtonPressed with Double = js.native
    
    /* 4 */ val rightButtonReleased: typings.winrt.Windows.UI.Input.PointerUpdateKind.rightButtonReleased with Double = js.native
    
    /* 7 */ val xButton1Pressed: typings.winrt.Windows.UI.Input.PointerUpdateKind.xButton1Pressed with Double = js.native
    
    /* 8 */ val xButton1Released: typings.winrt.Windows.UI.Input.PointerUpdateKind.xButton1Released with Double = js.native
    
    /* 9 */ val xButton2Pressed: typings.winrt.Windows.UI.Input.PointerUpdateKind.xButton2Pressed with Double = js.native
    
    /* 10 */ val xButton2Released: typings.winrt.Windows.UI.Input.PointerUpdateKind.xButton2Released with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
  @js.native
  class PointerVisualizationSettings ()
    extends typings.winrt.Windows.UI.Input.PointerVisualizationSettings
  /* static members */
  object PointerVisualizationSettings {
    
    @JSGlobal("Windows.UI.Input.PointerVisualizationSettings.getForCurrentView")
    @js.native
    def getForCurrentView(): typings.winrt.Windows.UI.Input.PointerVisualizationSettings = js.native
  }
  
  @JSGlobal("Windows.UI.Input.RightTappedEventArgs")
  @js.native
  class RightTappedEventArgs ()
    extends typings.winrt.Windows.UI.Input.RightTappedEventArgs
  
  @JSGlobal("Windows.UI.Input.TappedEventArgs")
  @js.native
  class TappedEventArgs ()
    extends typings.winrt.Windows.UI.Input.TappedEventArgs
}

package typings.winrt.global.Windows.UI

import typings.winrt.Windows.Devices.Input.PointerDevice
import typings.winrt.Windows.Devices.Input.PointerDeviceType
import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncActionWithProgress
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Foundation.Point
import typings.winrt.Windows.Foundation.Rect
import typings.winrt.Windows.Foundation.Size
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import typings.winrt.Windows.UI.Color
import typings.winrt.Windows.UI.Input.CrossSlideThresholds
import typings.winrt.Windows.UI.Input.CrossSlidingState
import typings.winrt.Windows.UI.Input.DraggingState
import typings.winrt.Windows.UI.Input.EdgeGestureKind
import typings.winrt.Windows.UI.Input.GestureSettings
import typings.winrt.Windows.UI.Input.HoldingState
import typings.winrt.Windows.UI.Input.IPointerPointTransform
import typings.winrt.Windows.UI.Input.Inking.InkRecognitionTarget
import typings.winrt.Windows.UI.Input.Inking.PenTipShape
import typings.winrt.Windows.UI.Input.ManipulationDelta
import typings.winrt.Windows.UI.Input.ManipulationVelocities
import typings.winrt.Windows.UI.Input.PointerUpdateKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  @JSGlobal("Windows.UI.Input.CrossSlidingEventArgs")
  @js.native
  class CrossSlidingEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Input.CrossSlidingEventArgs {
    
    /* CompleteClass */
    var crossSlidingState: CrossSlidingState = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
  }
  
  @JSGlobal("Windows.UI.Input.CrossSlidingState")
  @js.native
  object CrossSlidingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.CrossSlidingState & Double] = js.native
    
    /* 6 */ val completed: typings.winrt.Windows.UI.Input.CrossSlidingState.completed & Double = js.native
    
    /* 1 */ val dragging: typings.winrt.Windows.UI.Input.CrossSlidingState.dragging & Double = js.native
    
    /* 5 */ val rearranging: typings.winrt.Windows.UI.Input.CrossSlidingState.rearranging & Double = js.native
    
    /* 3 */ val selectSpeedBumping: typings.winrt.Windows.UI.Input.CrossSlidingState.selectSpeedBumping & Double = js.native
    
    /* 2 */ val selecting: typings.winrt.Windows.UI.Input.CrossSlidingState.selecting & Double = js.native
    
    /* 4 */ val speedBumping: typings.winrt.Windows.UI.Input.CrossSlidingState.speedBumping & Double = js.native
    
    /* 0 */ val started: typings.winrt.Windows.UI.Input.CrossSlidingState.started & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.DraggingEventArgs")
  @js.native
  class DraggingEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Input.DraggingEventArgs {
    
    /* CompleteClass */
    var draggingState: DraggingState = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
  }
  
  @JSGlobal("Windows.UI.Input.DraggingState")
  @js.native
  object DraggingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.DraggingState & Double] = js.native
    
    /* 2 */ val completed: typings.winrt.Windows.UI.Input.DraggingState.completed & Double = js.native
    
    /* 1 */ val continuing: typings.winrt.Windows.UI.Input.DraggingState.continuing & Double = js.native
    
    /* 0 */ val started: typings.winrt.Windows.UI.Input.DraggingState.started & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.EdgeGesture")
  @js.native
  class EdgeGesture ()
    extends StObject
       with typings.winrt.Windows.UI.Input.EdgeGesture {
    
    /* CompleteClass */
    var oncanceled: js.Any = js.native
    
    /* CompleteClass */
    var oncompleted: js.Any = js.native
    
    /* CompleteClass */
    var onstarting: js.Any = js.native
  }
  /* static members */
  object EdgeGesture {
    
    @JSGlobal("Windows.UI.Input.EdgeGesture")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getForCurrentView(): typings.winrt.Windows.UI.Input.EdgeGesture = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrt.Windows.UI.Input.EdgeGesture]
  }
  
  @JSGlobal("Windows.UI.Input.EdgeGestureEventArgs")
  @js.native
  class EdgeGestureEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Input.EdgeGestureEventArgs {
    
    /* CompleteClass */
    var kind: EdgeGestureKind = js.native
  }
  
  @JSGlobal("Windows.UI.Input.EdgeGestureKind")
  @js.native
  object EdgeGestureKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.EdgeGestureKind & Double] = js.native
    
    /* 1 */ val keyboard: typings.winrt.Windows.UI.Input.EdgeGestureKind.keyboard & Double = js.native
    
    /* 2 */ val mouse: typings.winrt.Windows.UI.Input.EdgeGestureKind.mouse & Double = js.native
    
    /* 0 */ val touch: typings.winrt.Windows.UI.Input.EdgeGestureKind.touch & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.GestureRecognizer")
  @js.native
  class GestureRecognizer ()
    extends StObject
       with typings.winrt.Windows.UI.Input.GestureRecognizer {
    
    /* CompleteClass */
    var autoProcessInertia: Boolean = js.native
    
    /* CompleteClass */
    override def canBeDoubleTap(value: typings.winrt.Windows.UI.Input.PointerPoint): Boolean = js.native
    
    /* CompleteClass */
    override def completeGesture(): Unit = js.native
    
    /* CompleteClass */
    var crossSlideExact: Boolean = js.native
    
    /* CompleteClass */
    var crossSlideHorizontally: Boolean = js.native
    
    /* CompleteClass */
    var crossSlideThresholds: CrossSlideThresholds = js.native
    
    /* CompleteClass */
    var gestureSettings: GestureSettings = js.native
    
    /* CompleteClass */
    var inertiaExpansion: Double = js.native
    
    /* CompleteClass */
    var inertiaExpansionDeceleration: Double = js.native
    
    /* CompleteClass */
    var inertiaRotationAngle: Double = js.native
    
    /* CompleteClass */
    var inertiaRotationDeceleration: Double = js.native
    
    /* CompleteClass */
    var inertiaTranslationDeceleration: Double = js.native
    
    /* CompleteClass */
    var inertiaTranslationDisplacement: Double = js.native
    
    /* CompleteClass */
    var isActive: Boolean = js.native
    
    /* CompleteClass */
    var isInertial: Boolean = js.native
    
    /* CompleteClass */
    var manipulationExact: Boolean = js.native
    
    /* CompleteClass */
    var mouseWheelParameters: typings.winrt.Windows.UI.Input.MouseWheelParameters = js.native
    
    /* CompleteClass */
    var oncrosssliding: js.Any = js.native
    
    /* CompleteClass */
    var ondragging: js.Any = js.native
    
    /* CompleteClass */
    var onholding: js.Any = js.native
    
    /* CompleteClass */
    var onmanipulationcompleted: js.Any = js.native
    
    /* CompleteClass */
    var onmanipulationinertiastarting: js.Any = js.native
    
    /* CompleteClass */
    var onmanipulationstarted: js.Any = js.native
    
    /* CompleteClass */
    var onmanipulationupdated: js.Any = js.native
    
    /* CompleteClass */
    var onrighttapped: js.Any = js.native
    
    /* CompleteClass */
    var ontapped: js.Any = js.native
    
    /* CompleteClass */
    var pivotCenter: Point = js.native
    
    /* CompleteClass */
    var pivotRadius: Double = js.native
    
    /* CompleteClass */
    override def processDownEvent(value: typings.winrt.Windows.UI.Input.PointerPoint): Unit = js.native
    
    /* CompleteClass */
    override def processInertia(): Unit = js.native
    
    /* CompleteClass */
    override def processMouseWheelEvent(
      value: typings.winrt.Windows.UI.Input.PointerPoint,
      isShiftKeyDown: Boolean,
      isControlKeyDown: Boolean
    ): Unit = js.native
    
    /* CompleteClass */
    override def processMoveEvents(value: IVector[typings.winrt.Windows.UI.Input.PointerPoint]): Unit = js.native
    
    /* CompleteClass */
    override def processUpEvent(value: typings.winrt.Windows.UI.Input.PointerPoint): Unit = js.native
    
    /* CompleteClass */
    var showGestureFeedback: Boolean = js.native
  }
  
  @JSGlobal("Windows.UI.Input.GestureSettings")
  @js.native
  object GestureSettings extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.GestureSettings & Double] = js.native
    
    /* 16 */ val crossSlide: typings.winrt.Windows.UI.Input.GestureSettings.crossSlide & Double = js.native
    
    /* 2 */ val doubleTap: typings.winrt.Windows.UI.Input.GestureSettings.doubleTap & Double = js.native
    
    /* 6 */ val drag: typings.winrt.Windows.UI.Input.GestureSettings.drag & Double = js.native
    
    /* 3 */ val hold: typings.winrt.Windows.UI.Input.GestureSettings.hold & Double = js.native
    
    /* 4 */ val holdWithMouse: typings.winrt.Windows.UI.Input.GestureSettings.holdWithMouse & Double = js.native
    
    /* 11 */ val manipulationRotate: typings.winrt.Windows.UI.Input.GestureSettings.manipulationRotate & Double = js.native
    
    /* 14 */ val manipulationRotateInertia: typings.winrt.Windows.UI.Input.GestureSettings.manipulationRotateInertia & Double = js.native
    
    /* 12 */ val manipulationScale: typings.winrt.Windows.UI.Input.GestureSettings.manipulationScale & Double = js.native
    
    /* 15 */ val manipulationScaleInertia: typings.winrt.Windows.UI.Input.GestureSettings.manipulationScaleInertia & Double = js.native
    
    /* 13 */ val manipulationTranslateInertia: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateInertia & Double = js.native
    
    /* 9 */ val manipulationTranslateRailsX: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateRailsX & Double = js.native
    
    /* 10 */ val manipulationTranslateRailsY: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateRailsY & Double = js.native
    
    /* 7 */ val manipulationTranslateX: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateX & Double = js.native
    
    /* 8 */ val manipulationTranslateY: typings.winrt.Windows.UI.Input.GestureSettings.manipulationTranslateY & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.UI.Input.GestureSettings.none & Double = js.native
    
    /* 5 */ val rightTap: typings.winrt.Windows.UI.Input.GestureSettings.rightTap & Double = js.native
    
    /* 1 */ val tap: typings.winrt.Windows.UI.Input.GestureSettings.tap & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.HoldingEventArgs")
  @js.native
  class HoldingEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Input.HoldingEventArgs {
    
    /* CompleteClass */
    var holdingState: HoldingState = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
  }
  
  @JSGlobal("Windows.UI.Input.HoldingState")
  @js.native
  object HoldingState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.HoldingState & Double] = js.native
    
    /* 2 */ val canceled: typings.winrt.Windows.UI.Input.HoldingState.canceled & Double = js.native
    
    /* 1 */ val completed: typings.winrt.Windows.UI.Input.HoldingState.completed & Double = js.native
    
    /* 0 */ val started: typings.winrt.Windows.UI.Input.HoldingState.started & Double = js.native
  }
  
  object Inking {
    
    @JSGlobal("Windows.UI.Input.Inking.InkDrawingAttributes")
    @js.native
    class InkDrawingAttributes ()
      extends StObject
         with typings.winrt.Windows.UI.Input.Inking.InkDrawingAttributes {
      
      /* CompleteClass */
      var color: Color = js.native
      
      /* CompleteClass */
      var fitToCurve: Boolean = js.native
      
      /* CompleteClass */
      var ignorePressure: Boolean = js.native
      
      /* CompleteClass */
      var penTip: PenTipShape = js.native
      
      /* CompleteClass */
      var size: Size = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkManager")
    @js.native
    class InkManager ()
      extends StObject
         with typings.winrt.Windows.UI.Input.Inking.InkManager {
      
      /* CompleteClass */
      override def addStroke(stroke: typings.winrt.Windows.UI.Input.Inking.InkStroke): Unit = js.native
      
      /* CompleteClass */
      var boundingRect: Rect = js.native
      
      /* CompleteClass */
      override def canPasteFromClipboard(): Boolean = js.native
      
      /* CompleteClass */
      override def copySelectedToClipboard(): Unit = js.native
      
      /* CompleteClass */
      override def deleteSelected(): Rect = js.native
      
      /* CompleteClass */
      override def getRecognitionResults(): IVectorView[typings.winrt.Windows.UI.Input.Inking.InkRecognitionResult] = js.native
      
      /* CompleteClass */
      override def getRecognizers(): IVectorView[typings.winrt.Windows.UI.Input.Inking.InkRecognizer] = js.native
      
      /* CompleteClass */
      override def getStrokes(): IVectorView[typings.winrt.Windows.UI.Input.Inking.InkStroke] = js.native
      
      /* CompleteClass */
      override def loadAsync(inputStream: IInputStream): IAsyncActionWithProgress[Double] = js.native
      
      /* CompleteClass */
      override def moveSelected(translation: Point): Rect = js.native
      
      /* CompleteClass */
      override def pasteFromClipboard(position: Point): Rect = js.native
      
      /* CompleteClass */
      override def recognizeAsync(
        strokeCollection: typings.winrt.Windows.UI.Input.Inking.InkStrokeContainer,
        recognitionTarget: InkRecognitionTarget
      ): IAsyncOperation[IVectorView[typings.winrt.Windows.UI.Input.Inking.InkRecognitionResult]] = js.native
      
      /* CompleteClass */
      override def saveAsync(outputStream: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
      
      /* CompleteClass */
      override def selectWithLine(from: Point, to: Point): Rect = js.native
      
      /* CompleteClass */
      override def selectWithPolyLine(polyline: IIterable[Point]): Rect = js.native
      
      /* CompleteClass */
      override def setDefaultRecognizer(recognizer: typings.winrt.Windows.UI.Input.Inking.InkRecognizer): Unit = js.native
      
      /* CompleteClass */
      override def updateRecognitionResults(recognitionResults: IVectorView[typings.winrt.Windows.UI.Input.Inking.InkRecognitionResult]): Unit = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkManipulationMode")
    @js.native
    object InkManipulationMode extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.Inking.InkManipulationMode & Double] = js.native
      
      /* 1 */ val erasing: typings.winrt.Windows.UI.Input.Inking.InkManipulationMode.erasing & Double = js.native
      
      /* 0 */ val inking: typings.winrt.Windows.UI.Input.Inking.InkManipulationMode.inking & Double = js.native
      
      /* 2 */ val selecting: typings.winrt.Windows.UI.Input.Inking.InkManipulationMode.selecting & Double = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognitionResult")
    @js.native
    class InkRecognitionResult ()
      extends StObject
         with typings.winrt.Windows.UI.Input.Inking.InkRecognitionResult {
      
      /* CompleteClass */
      var boundingRect: Rect = js.native
      
      /* CompleteClass */
      override def getStrokes(): IVectorView[typings.winrt.Windows.UI.Input.Inking.InkStroke] = js.native
      
      /* CompleteClass */
      override def getTextCandidates(): IVectorView[String] = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognitionTarget")
    @js.native
    object InkRecognitionTarget extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.Inking.InkRecognitionTarget & Double] = js.native
      
      /* 0 */ val all: typings.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.all & Double = js.native
      
      /* 2 */ val recent: typings.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.recent & Double = js.native
      
      /* 1 */ val selected: typings.winrt.Windows.UI.Input.Inking.InkRecognitionTarget.selected & Double = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognizer")
    @js.native
    class InkRecognizer ()
      extends StObject
         with typings.winrt.Windows.UI.Input.Inking.InkRecognizer {
      
      /* CompleteClass */
      var name: String = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkRecognizerContainer")
    @js.native
    class InkRecognizerContainer ()
      extends StObject
         with typings.winrt.Windows.UI.Input.Inking.InkRecognizerContainer {
      
      /* CompleteClass */
      override def getRecognizers(): IVectorView[typings.winrt.Windows.UI.Input.Inking.InkRecognizer] = js.native
      
      /* CompleteClass */
      override def recognizeAsync(
        strokeCollection: typings.winrt.Windows.UI.Input.Inking.InkStrokeContainer,
        recognitionTarget: InkRecognitionTarget
      ): IAsyncOperation[IVectorView[typings.winrt.Windows.UI.Input.Inking.InkRecognitionResult]] = js.native
      
      /* CompleteClass */
      override def setDefaultRecognizer(recognizer: typings.winrt.Windows.UI.Input.Inking.InkRecognizer): Unit = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkStroke")
    @js.native
    class InkStroke ()
      extends StObject
         with typings.winrt.Windows.UI.Input.Inking.InkStroke {
      
      /* CompleteClass */
      var boundingRect: Rect = js.native
      
      /* CompleteClass */
      var drawingAttributes: typings.winrt.Windows.UI.Input.Inking.InkDrawingAttributes = js.native
      
      /* CompleteClass */
      override def getRenderingSegments(): IVectorView[typings.winrt.Windows.UI.Input.Inking.InkStrokeRenderingSegment] = js.native
      
      /* CompleteClass */
      var recognized: Boolean = js.native
      
      /* CompleteClass */
      var selected: Boolean = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkStrokeBuilder")
    @js.native
    class InkStrokeBuilder ()
      extends StObject
         with typings.winrt.Windows.UI.Input.Inking.InkStrokeBuilder {
      
      /* CompleteClass */
      override def appendToStroke(pointerPoint: typings.winrt.Windows.UI.Input.PointerPoint): typings.winrt.Windows.UI.Input.PointerPoint = js.native
      
      /* CompleteClass */
      override def beginStroke(pointerPoint: typings.winrt.Windows.UI.Input.PointerPoint): Unit = js.native
      
      /* CompleteClass */
      override def createStroke(points: IIterable[Point]): typings.winrt.Windows.UI.Input.Inking.InkStroke = js.native
      
      /* CompleteClass */
      override def endStroke(pointerPoint: typings.winrt.Windows.UI.Input.PointerPoint): typings.winrt.Windows.UI.Input.Inking.InkStroke = js.native
      
      /* CompleteClass */
      override def setDefaultDrawingAttributes(drawingAttributes: typings.winrt.Windows.UI.Input.Inking.InkDrawingAttributes): Unit = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkStrokeContainer")
    @js.native
    class InkStrokeContainer ()
      extends StObject
         with typings.winrt.Windows.UI.Input.Inking.InkStrokeContainer {
      
      /* CompleteClass */
      override def addStroke(stroke: typings.winrt.Windows.UI.Input.Inking.InkStroke): Unit = js.native
      
      /* CompleteClass */
      var boundingRect: Rect = js.native
      
      /* CompleteClass */
      override def canPasteFromClipboard(): Boolean = js.native
      
      /* CompleteClass */
      override def copySelectedToClipboard(): Unit = js.native
      
      /* CompleteClass */
      override def deleteSelected(): Rect = js.native
      
      /* CompleteClass */
      override def getRecognitionResults(): IVectorView[typings.winrt.Windows.UI.Input.Inking.InkRecognitionResult] = js.native
      
      /* CompleteClass */
      override def getStrokes(): IVectorView[typings.winrt.Windows.UI.Input.Inking.InkStroke] = js.native
      
      /* CompleteClass */
      override def loadAsync(inputStream: IInputStream): IAsyncActionWithProgress[Double] = js.native
      
      /* CompleteClass */
      override def moveSelected(translation: Point): Rect = js.native
      
      /* CompleteClass */
      override def pasteFromClipboard(position: Point): Rect = js.native
      
      /* CompleteClass */
      override def saveAsync(outputStream: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
      
      /* CompleteClass */
      override def selectWithLine(from: Point, to: Point): Rect = js.native
      
      /* CompleteClass */
      override def selectWithPolyLine(polyline: IIterable[Point]): Rect = js.native
      
      /* CompleteClass */
      override def updateRecognitionResults(recognitionResults: IVectorView[typings.winrt.Windows.UI.Input.Inking.InkRecognitionResult]): Unit = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.InkStrokeRenderingSegment")
    @js.native
    class InkStrokeRenderingSegment ()
      extends StObject
         with typings.winrt.Windows.UI.Input.Inking.InkStrokeRenderingSegment {
      
      /* CompleteClass */
      var bezierControlPoint1: Point = js.native
      
      /* CompleteClass */
      var bezierControlPoint2: Point = js.native
      
      /* CompleteClass */
      var position: Point = js.native
      
      /* CompleteClass */
      var pressure: Double = js.native
      
      /* CompleteClass */
      var tiltX: Double = js.native
      
      /* CompleteClass */
      var tiltY: Double = js.native
      
      /* CompleteClass */
      var twist: Double = js.native
    }
    
    @JSGlobal("Windows.UI.Input.Inking.PenTipShape")
    @js.native
    object PenTipShape extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.Inking.PenTipShape & Double] = js.native
      
      /* 0 */ val circle: typings.winrt.Windows.UI.Input.Inking.PenTipShape.circle & Double = js.native
      
      /* 1 */ val rectangle: typings.winrt.Windows.UI.Input.Inking.PenTipShape.rectangle & Double = js.native
    }
  }
  
  @JSGlobal("Windows.UI.Input.ManipulationCompletedEventArgs")
  @js.native
  class ManipulationCompletedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Input.ManipulationCompletedEventArgs {
    
    /* CompleteClass */
    var cumulative: ManipulationDelta = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
    
    /* CompleteClass */
    var velocities: ManipulationVelocities = js.native
  }
  
  @JSGlobal("Windows.UI.Input.ManipulationInertiaStartingEventArgs")
  @js.native
  class ManipulationInertiaStartingEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Input.ManipulationInertiaStartingEventArgs {
    
    /* CompleteClass */
    var cumulative: ManipulationDelta = js.native
    
    /* CompleteClass */
    var delta: ManipulationDelta = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
    
    /* CompleteClass */
    var velocities: ManipulationVelocities = js.native
  }
  
  @JSGlobal("Windows.UI.Input.ManipulationStartedEventArgs")
  @js.native
  class ManipulationStartedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Input.ManipulationStartedEventArgs {
    
    /* CompleteClass */
    var cumulative: ManipulationDelta = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
  }
  
  @JSGlobal("Windows.UI.Input.ManipulationUpdatedEventArgs")
  @js.native
  class ManipulationUpdatedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Input.ManipulationUpdatedEventArgs {
    
    /* CompleteClass */
    var cumulative: ManipulationDelta = js.native
    
    /* CompleteClass */
    var delta: ManipulationDelta = js.native
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
    
    /* CompleteClass */
    var velocities: ManipulationVelocities = js.native
  }
  
  @JSGlobal("Windows.UI.Input.MouseWheelParameters")
  @js.native
  class MouseWheelParameters ()
    extends StObject
       with typings.winrt.Windows.UI.Input.MouseWheelParameters {
    
    /* CompleteClass */
    var charTranslation: Point = js.native
    
    /* CompleteClass */
    var deltaRotationAngle: Double = js.native
    
    /* CompleteClass */
    var deltaScale: Double = js.native
    
    /* CompleteClass */
    var pageTranslation: Point = js.native
  }
  
  @JSGlobal("Windows.UI.Input.PointerPoint")
  @js.native
  class PointerPoint ()
    extends StObject
       with typings.winrt.Windows.UI.Input.PointerPoint {
    
    /* CompleteClass */
    var frameId: Double = js.native
    
    /* CompleteClass */
    var isInContact: Boolean = js.native
    
    /* CompleteClass */
    var pointerDevice: PointerDevice = js.native
    
    /* CompleteClass */
    var pointerId: Double = js.native
    
    /* CompleteClass */
    var position: Point = js.native
    
    /* CompleteClass */
    var properties: typings.winrt.Windows.UI.Input.PointerPointProperties = js.native
    
    /* CompleteClass */
    var rawPosition: Point = js.native
    
    /* CompleteClass */
    var timestamp: Double = js.native
  }
  /* static members */
  object PointerPoint {
    
    @JSGlobal("Windows.UI.Input.PointerPoint")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getCurrentPoint(pointerId: Double): typings.winrt.Windows.UI.Input.PointerPoint = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPoint")(pointerId.asInstanceOf[js.Any]).asInstanceOf[typings.winrt.Windows.UI.Input.PointerPoint]
    inline def getCurrentPoint(pointerId: Double, transform: IPointerPointTransform): typings.winrt.Windows.UI.Input.PointerPoint = (^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentPoint")(pointerId.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[typings.winrt.Windows.UI.Input.PointerPoint]
    
    inline def getIntermediatePoints(pointerId: Double): IVector[typings.winrt.Windows.UI.Input.PointerPoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIntermediatePoints")(pointerId.asInstanceOf[js.Any]).asInstanceOf[IVector[typings.winrt.Windows.UI.Input.PointerPoint]]
    inline def getIntermediatePoints(pointerId: Double, transform: IPointerPointTransform): IVector[typings.winrt.Windows.UI.Input.PointerPoint] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIntermediatePoints")(pointerId.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[IVector[typings.winrt.Windows.UI.Input.PointerPoint]]
  }
  
  @JSGlobal("Windows.UI.Input.PointerPointProperties")
  @js.native
  class PointerPointProperties ()
    extends StObject
       with typings.winrt.Windows.UI.Input.PointerPointProperties {
    
    /* CompleteClass */
    var contactRect: Rect = js.native
    
    /* CompleteClass */
    var contactRectRaw: Rect = js.native
    
    /* CompleteClass */
    override def getUsageValue(usagePage: Double, usageId: Double): Double = js.native
    
    /* CompleteClass */
    override def hasUsage(usagePage: Double, usageId: Double): Boolean = js.native
    
    /* CompleteClass */
    var isBarrelButtonPressed: Boolean = js.native
    
    /* CompleteClass */
    var isCanceled: Boolean = js.native
    
    /* CompleteClass */
    var isEraser: Boolean = js.native
    
    /* CompleteClass */
    var isHorizontalMouseWheel: Boolean = js.native
    
    /* CompleteClass */
    var isInRange: Boolean = js.native
    
    /* CompleteClass */
    var isInverted: Boolean = js.native
    
    /* CompleteClass */
    var isLeftButtonPressed: Boolean = js.native
    
    /* CompleteClass */
    var isMiddleButtonPressed: Boolean = js.native
    
    /* CompleteClass */
    var isPrimary: Boolean = js.native
    
    /* CompleteClass */
    var isRightButtonPressed: Boolean = js.native
    
    /* CompleteClass */
    var isXButton1Pressed: Boolean = js.native
    
    /* CompleteClass */
    var isXButton2Pressed: Boolean = js.native
    
    /* CompleteClass */
    var mouseWheelDelta: Double = js.native
    
    /* CompleteClass */
    var orientation: Double = js.native
    
    /* CompleteClass */
    var pointerUpdateKind: PointerUpdateKind = js.native
    
    /* CompleteClass */
    var pressure: Double = js.native
    
    /* CompleteClass */
    var touchConfidence: Boolean = js.native
    
    /* CompleteClass */
    var twist: Double = js.native
    
    /* CompleteClass */
    var xTilt: Double = js.native
    
    /* CompleteClass */
    var yTilt: Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.PointerUpdateKind")
  @js.native
  object PointerUpdateKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.UI.Input.PointerUpdateKind & Double] = js.native
    
    /* 1 */ val leftButtonPressed: typings.winrt.Windows.UI.Input.PointerUpdateKind.leftButtonPressed & Double = js.native
    
    /* 2 */ val leftButtonReleased: typings.winrt.Windows.UI.Input.PointerUpdateKind.leftButtonReleased & Double = js.native
    
    /* 5 */ val middleButtonPressed: typings.winrt.Windows.UI.Input.PointerUpdateKind.middleButtonPressed & Double = js.native
    
    /* 6 */ val middleButtonReleased: typings.winrt.Windows.UI.Input.PointerUpdateKind.middleButtonReleased & Double = js.native
    
    /* 0 */ val other: typings.winrt.Windows.UI.Input.PointerUpdateKind.other & Double = js.native
    
    /* 3 */ val rightButtonPressed: typings.winrt.Windows.UI.Input.PointerUpdateKind.rightButtonPressed & Double = js.native
    
    /* 4 */ val rightButtonReleased: typings.winrt.Windows.UI.Input.PointerUpdateKind.rightButtonReleased & Double = js.native
    
    /* 7 */ val xButton1Pressed: typings.winrt.Windows.UI.Input.PointerUpdateKind.xButton1Pressed & Double = js.native
    
    /* 8 */ val xButton1Released: typings.winrt.Windows.UI.Input.PointerUpdateKind.xButton1Released & Double = js.native
    
    /* 9 */ val xButton2Pressed: typings.winrt.Windows.UI.Input.PointerUpdateKind.xButton2Pressed & Double = js.native
    
    /* 10 */ val xButton2Released: typings.winrt.Windows.UI.Input.PointerUpdateKind.xButton2Released & Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
  @js.native
  class PointerVisualizationSettings ()
    extends StObject
       with typings.winrt.Windows.UI.Input.PointerVisualizationSettings {
    
    /* CompleteClass */
    var isBarrelButtonFeedbackEnabled: Boolean = js.native
    
    /* CompleteClass */
    var isContactFeedbackEnabled: Boolean = js.native
  }
  /* static members */
  object PointerVisualizationSettings {
    
    @JSGlobal("Windows.UI.Input.PointerVisualizationSettings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getForCurrentView(): typings.winrt.Windows.UI.Input.PointerVisualizationSettings = ^.asInstanceOf[js.Dynamic].applyDynamic("getForCurrentView")().asInstanceOf[typings.winrt.Windows.UI.Input.PointerVisualizationSettings]
  }
  
  @JSGlobal("Windows.UI.Input.RightTappedEventArgs")
  @js.native
  class RightTappedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Input.RightTappedEventArgs {
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
  }
  
  @JSGlobal("Windows.UI.Input.TappedEventArgs")
  @js.native
  class TappedEventArgs ()
    extends StObject
       with typings.winrt.Windows.UI.Input.TappedEventArgs {
    
    /* CompleteClass */
    var pointerDeviceType: PointerDeviceType = js.native
    
    /* CompleteClass */
    var position: Point = js.native
    
    /* CompleteClass */
    var tapCount: Double = js.native
  }
}

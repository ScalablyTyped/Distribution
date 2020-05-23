package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncActionWithProgress
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.Numerics.Matrix3x2
import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.UI.Color
import typings.winrtUwp.Windows.UI.Input.Inking.InkRecognitionTarget
import typings.winrtUwp.Windows.UI.Input.Inking.PenTipShape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides support for ink input, processing, and management. */
@JSGlobal("Windows.UI.Input.Inking")
@js.native
object Inking extends js.Object {
  /** Provides properties associated with the drawing of an InkStroke . */
  @js.native
  /** Creates a new InkDrawingAttributes object that is used to specify InkStroke attributes. */
  class InkDrawingAttributes ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkDrawingAttributes {
    /** Gets or sets a value that indicates the color of an InkStroke . */
    /* CompleteClass */
    override var color: Color = js.native
    /** Gets or sets a value that indicates whether the InkStroke is rendered as a highlighter overlay. The stroke is typically set to a bright color, such as yellow. */
    /* CompleteClass */
    override var drawAsHighlighter: Boolean = js.native
    /** Gets or sets a value that indicates whether a Bezier curve or a collection of straight line segments is used to draw an InkStroke . */
    /* CompleteClass */
    override var fitToCurve: Boolean = js.native
    /** Gets or sets a value that indicates whether the pressure of the contact on the digitizer surface is ignored when you draw an InkStroke . */
    /* CompleteClass */
    override var ignorePressure: Boolean = js.native
    /** Gets or sets a value that indicates the shape of the pen tip when you draw an InkStroke . */
    /* CompleteClass */
    override var penTip: PenTipShape = js.native
    /** Gets or sets an affine transformation matrix applied to the PenTipShape used for an InkStroke . */
    /* CompleteClass */
    override var penTipTransform: Matrix3x2 = js.native
    /** Gets or sets a value that indicates the dimensions of the pen tip ( PenTip ) when you draw an InkStroke . */
    /* CompleteClass */
    override var size: Size = js.native
  }
  
  /** Provides properties and methods to manage the input, manipulation, and processing (including handwriting recognition) of one or more InkStroke objects. */
  @js.native
  /** Creates a new InkManager object that is used to manage InkStroke objects. */
  class InkManager ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkManager
  
  @js.native
  class InkPoint protected ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkPoint {
    /**
      * Creates a new InkPoint object used in the construction of an InkStroke .
      * @param position The screen coordinates for the InkPoint object.
      * @param pressure The pressure of the contact on the digitizer surface. The default is 0.5.
      */
    def this(position: Point, pressure: Double) = this()
    /** The X, Y coordinates of the InkPoint , in device-independent pixels (DIPs) relative to the upper left-hand corner of the inking area. */
    /* CompleteClass */
    override var position: Point = js.native
    /* CompleteClass */
    override var pressure: js.Any = js.native
  }
  
  /** Provides properties and methods to manage InkStroke handwriting recognition data. */
  @js.native
  abstract class InkRecognitionResult ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkRecognitionResult {
    /** Gets the bounding rectangle of the InkStroke data used for handwriting recognition. */
    /* CompleteClass */
    override var boundingRect: Rect = js.native
    /**
      * Retrieves all ink strokes used for handwriting recognition.
      * @return The ink strokes used for handwriting recognition as a collection of InkStroke objects.
      */
    /* CompleteClass */
    override def getStrokes(): IVectorView[typings.winrtUwp.Windows.UI.Input.Inking.InkStroke] = js.native
    /**
      * Retrieves the collection of strings identified as potential matches for each word returned by handwriting recognition.
      * @return The recognition matches as a collection of String objects. The most likely candidate is topmost in the collection.
      */
    /* CompleteClass */
    override def getTextCandidates(): IVectorView[String] = js.native
  }
  
  /** Manages all aspects of handwriting recognition. */
  @js.native
  abstract class InkRecognizer ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkRecognizer {
    /** Gets the name of the InkRecognizer . */
    /* CompleteClass */
    override var name: String = js.native
  }
  
  /** Provides properties and methods to manage one or more InkRecognizer objects used for handwriting recognition. */
  @js.native
  /** Creates a new InkRecognizerContainer object to manage InkRecognizer objects used for handwriting recognition. */
  class InkRecognizerContainer ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkRecognizerContainer {
    /**
      * Gets the collection of installed handwriting recognizers.
      * @return The installed handwriting recognizers as a collection of InkRecognizer objects.
      */
    /* CompleteClass */
    override def getRecognizers(): IVectorView[typings.winrtUwp.Windows.UI.Input.Inking.InkRecognizer] = js.native
    /**
      * Performs handwriting recognition on one or more InkStroke objects.
      * @param strokeCollection The set of strokes on which recognition is performed.
      * @param recognitionTarget One of the values from the InkRecognitionTarget enumeration.
      * @return The results of the recognition as a collection of InkRecognitionResult objects.
      */
    /* CompleteClass */
    override def recognizeAsync(
      strokeCollection: typings.winrtUwp.Windows.UI.Input.Inking.InkStrokeContainer,
      recognitionTarget: InkRecognitionTarget
    ): IPromiseWithIAsyncOperation[IVectorView[_]] = js.native
    /**
      * Sets the default InkRecognizer used for handwriting recognition.
      * @param recognizer The InkRecognizer .
      */
    /* CompleteClass */
    override def setDefaultRecognizer(recognizer: typings.winrtUwp.Windows.UI.Input.Inking.InkRecognizer): Unit = js.native
  }
  
  /** A single ink stroke, including the Bézier curve parameters used for final rendering of the stroke. */
  @js.native
  abstract class InkStroke ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkStroke {
    /** Gets the bounding box for the InkStroke . */
    /* CompleteClass */
    override var boundingRect: Rect = js.native
    /** Gets or sets the properties associated with an InkStroke . */
    /* CompleteClass */
    override var drawingAttributes: typings.winrtUwp.Windows.UI.Input.Inking.InkDrawingAttributes = js.native
    /** Gets or sets an affine transformation matrix to apply to the InkStroke object. */
    /* CompleteClass */
    override var pointTransform: Matrix3x2 = js.native
    /** Gets whether the stroke is recognized. */
    /* CompleteClass */
    override var recognized: Boolean = js.native
    /** Gets whether the stroke is selected. */
    /* CompleteClass */
    override var selected: Boolean = js.native
    /**
      * Gets the collection of InkPoint objects used to construct the InkStroke .
      * @return The collection of InkPoint objects used to construct the InkStroke .
      */
    /* CompleteClass */
    override def getInkPoints(): IVectorView[typings.winrtUwp.Windows.UI.Input.Inking.InkPoint] = js.native
    /**
      * Gets the rendering segments of the stroke.
      * @return The collection of InkStrokeRenderingSegment objects.
      */
    /* CompleteClass */
    override def getRenderingSegments(): IVectorView[typings.winrtUwp.Windows.UI.Input.Inking.InkStrokeRenderingSegment] = js.native
  }
  
  /** Builds strokes from raw pointer input. */
  @js.native
  /** Creates a new InkStrokeBuilder object that is used to construct InkStroke objects. */
  class InkStrokeBuilder ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkStrokeBuilder {
    /**
      * Adds a new segment to the ink stroke.
      * @param pointerPoint The end point of the new segment.
      * @return The previous end point. This end point can be used when rendering the stroke.
      */
    /* CompleteClass */
    override def appendToStroke(pointerPoint: typings.winrtUwp.Windows.UI.Input.PointerPoint): typings.winrtUwp.Windows.UI.Input.PointerPoint = js.native
    /**
      * Starts building the ink stroke.
      * @param pointerPoint The first point for the stroke.
      */
    /* CompleteClass */
    override def beginStroke(pointerPoint: typings.winrtUwp.Windows.UI.Input.PointerPoint): Unit = js.native
    /**
      * Creates a stroke from an array of Point coordinates.
      * @param points An array of Point coordinates.
      * @return The new stroke.
      */
    /* CompleteClass */
    override def createStroke(points: IIterable[Point]): typings.winrtUwp.Windows.UI.Input.Inking.InkStroke = js.native
    /**
      * Creates a stroke from collection of InkPoint objects.
      * @param inkPoints The collection of InkPoint objects.
      * @param transform A 2-D transformation matrix.
      * @return The ink stroke, including the Bézier curve parameters used for final rendering of the stroke.
      */
    /* CompleteClass */
    override def createStrokeFromInkPoints(inkPoints: IIterable[typings.winrtUwp.Windows.UI.Input.Inking.InkPoint], transform: Matrix3x2): typings.winrtUwp.Windows.UI.Input.Inking.InkStroke = js.native
    /**
      * Stops building the ink stroke.
      * @param pointerPoint The last point for the stroke.
      * @return The stroke built from the points.
      */
    /* CompleteClass */
    override def endStroke(pointerPoint: typings.winrtUwp.Windows.UI.Input.PointerPoint): typings.winrtUwp.Windows.UI.Input.Inking.InkStroke = js.native
    /**
      * Sets the default InkDrawingAttributes for all new ink strokes created after the current stroke.
      * @param drawingAttributes The default attributes.
      */
    /* CompleteClass */
    override def setDefaultDrawingAttributes(drawingAttributes: typings.winrtUwp.Windows.UI.Input.Inking.InkDrawingAttributes): Unit = js.native
  }
  
  /** Provides properties and methods to store and manage the collection of InkStroke objects rendered by the InkPresenter . */
  @js.native
  /** Creates a new InkStrokeContainer object that is used to manage InkStroke objects. */
  class InkStrokeContainer ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkStrokeContainer {
    /** Gets the bounding rectangle of the InkStroke collection managed by the InkStrokeContainer . */
    /* CompleteClass */
    override var boundingRect: Rect = js.native
    /**
      * Adds an InkStroke object to the collection managed by the InkStrokeContainer .
      * @param stroke The ink stroke to be added.
      */
    /* CompleteClass */
    override def addStroke(stroke: typings.winrtUwp.Windows.UI.Input.Inking.InkStroke): Unit = js.native
    /**
      * Adds one or more ink strokes to the collection managed by the InkStrokeContainer .
      * @param strokes The ink strokes to be added as a collection of InkStroke objects.
      */
    /* CompleteClass */
    override def addStrokes(strokes: IIterable[typings.winrtUwp.Windows.UI.Input.Inking.InkStroke]): Unit = js.native
    /**
      * Identifies whether content on the clipboard can be added to the InkStroke collection managed by the InkStrokeContainer .
      * @return True if content can be pasted from the clipboard; otherwise, false.
      */
    /* CompleteClass */
    override def canPasteFromClipboard(): Boolean = js.native
    /** Deletes all InkStroke objects from the collection managed by the InkStrokeContainer . */
    /* CompleteClass */
    override def clear(): Unit = js.native
    /** Copies the selected InkStroke objects (from the InkStroke collection managed by the InkStrokeContainer ) to the clipboard in Ink Serialized Format (ISF) format. */
    /* CompleteClass */
    override def copySelectedToClipboard(): Unit = js.native
    /**
      * Deletes the selected InkStroke objects from the InkStroke collection managed by the InkStrokeContainer .
      * @return The bounding rectangle of the selected ink strokes, or the invalidated rectangle (0, 0, 0, 0) if no strokes were removed (no selected strokes).
      */
    /* CompleteClass */
    override def deleteSelected(): Rect = js.native
    /**
      * Gets the collection of recognition matches previously processed by an InkRecognizer and stored in an InkRecognizerContainer .
      * @return The results of the recognition as a collection of InkRecognitionResult objects.
      */
    /* CompleteClass */
    override def getRecognitionResults(): IVectorView[typings.winrtUwp.Windows.UI.Input.Inking.InkRecognitionResult] = js.native
    /**
      * Retrieves all ink strokes in the collection managed by the InkStrokeContainer .
      * @return The ink strokes managed by the InkStrokeContainer as a collection of InkStroke objects.
      */
    /* CompleteClass */
    override def getStrokes(): IVectorView[typings.winrtUwp.Windows.UI.Input.Inking.InkStroke] = js.native
    /**
      * Asynchronously loads all InkStroke objects from the specified stream to the InkStroke collection that is managed by the InkStrokeContainer .
      * @param inputStream The target stream.
      * @return The status of the asynchronous operation as the number of bytes fetched. For more information, see ReadAsync method.
      */
    /* CompleteClass */
    override def loadAsync(inputStream: IInputStream): IPromiseWithIAsyncActionWithProgress[Double] = js.native
    /**
      * Moves the selected strokes. All affected strokes are re-rendered.
      * @param translation The destination screen coordinates for the upper-left corner of the bounding rectangle of the selected strokes.
      * @return The bounding rectangle of the selected ink strokes.
      */
    /* CompleteClass */
    override def moveSelected(translation: Point): Rect = js.native
    /**
      * Adds the InkStroke content from the clipboard to the InkStroke collection that is managed by the InkStrokeContainer and renders the new strokes..
      * @param position The screen coordinates for the upper-left corner of the bounding rectangle of the clipboard content.
      * @return The invalidated bounding rectangle of the InkStroke collection.
      */
    /* CompleteClass */
    override def pasteFromClipboard(position: Point): Rect = js.native
    /**
      * Asynchronously saves all InkStroke objects in the InkStroke collection that is managed by the InkStrokeContainer to the specified stream.
      * @param outputStream The target stream. An IRandomAccessStream (requires IOutputStream ) object can be specified instead.
      * @return The status of the asynchronous operation as the number of bytes sent. For more information, see WriteAsync method.
      */
    /* CompleteClass */
    override def saveAsync(outputStream: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
    /**
      * Selects all strokes intersected by the new stroke.
      * @param from The start of the line.
      * @param to The of the line.
      * @return The bounding rectangle of the selected ink strokes.
      */
    /* CompleteClass */
    override def selectWithLine(from: Point, to: Point): Rect = js.native
    /**
      * Selects all strokes contained entirely within the polyline.
      * @param polyline The points of the polyline.
      * @return The bounding rectangle of the selected ink strokes.
      */
    /* CompleteClass */
    override def selectWithPolyLine(polyline: IIterable[Point]): Rect = js.native
    /**
      * Updates the collection of recognition matches previously processed by an InkRecognizer and stored in an InkRecognizerContainer .
      * @param recognitionResults The updated collection of InkRecognitionResult objects.
      */
    /* CompleteClass */
    override def updateRecognitionResults(recognitionResults: IVectorView[typings.winrtUwp.Windows.UI.Input.Inking.InkRecognitionResult]): Unit = js.native
  }
  
  /** A single segment of a complete ink stroke. */
  @js.native
  abstract class InkStrokeRenderingSegment ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkStrokeRenderingSegment {
    /** Gets the first control point for the Bézier curve. */
    /* CompleteClass */
    override var bezierControlPoint1: Point = js.native
    /** Gets the second control point for the Bézier curve. */
    /* CompleteClass */
    override var bezierControlPoint2: Point = js.native
    /** Gets the end point of the segment. */
    /* CompleteClass */
    override var position: Point = js.native
    /** Gets the pressure of the contact on the digitizer surface. */
    /* CompleteClass */
    override var pressure: Double = js.native
    /** Gets the tilt of the contact along the x axis. */
    /* CompleteClass */
    override var tiltX: Double = js.native
    /** Gets the tilt of the contact along the y axis. */
    /* CompleteClass */
    override var tiltY: Double = js.native
    /** Gets the twist of the contact along the rotational axis. */
    /* CompleteClass */
    override var twist: Double = js.native
  }
  
  /** Identifies the ink input mode. */
  @js.native
  object InkManipulationMode extends js.Object {
    /* 1 */ val erasing: typings.winrtUwp.Windows.UI.Input.Inking.InkManipulationMode.erasing with Double = js.native
    /* 0 */ val inking: typings.winrtUwp.Windows.UI.Input.Inking.InkManipulationMode.inking with Double = js.native
    /* 2 */ val selecting: typings.winrtUwp.Windows.UI.Input.Inking.InkManipulationMode.selecting with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Input.Inking.InkManipulationMode with Double] = js.native
  }
  
  /** Indicates which strokes you want to include in handwriting recognition. */
  @js.native
  object InkRecognitionTarget extends js.Object {
    /* 0 */ val all: typings.winrtUwp.Windows.UI.Input.Inking.InkRecognitionTarget.all with Double = js.native
    /* 2 */ val recent: typings.winrtUwp.Windows.UI.Input.Inking.InkRecognitionTarget.recent with Double = js.native
    /* 1 */ val selected: typings.winrtUwp.Windows.UI.Input.Inking.InkRecognitionTarget.selected with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Input.Inking.InkRecognitionTarget with Double] = js.native
  }
  
  /** Identifies the shape of the PenTip . */
  @js.native
  object PenTipShape extends js.Object {
    /* 0 */ val circle: typings.winrtUwp.Windows.UI.Input.Inking.PenTipShape.circle with Double = js.native
    /* 1 */ val rectangle: typings.winrtUwp.Windows.UI.Input.Inking.PenTipShape.rectangle with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Input.Inking.PenTipShape with Double] = js.native
  }
  
}


package typings.winrtUwp.global.Windows.UI.Input

import typings.winrtUwp.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for ink input, processing, and management. */
object Inking {
  
  /** Provides properties associated with the drawing of an InkStroke . */
  @JSGlobal("Windows.UI.Input.Inking.InkDrawingAttributes")
  @js.native
  /** Creates a new InkDrawingAttributes object that is used to specify InkStroke attributes. */
  class InkDrawingAttributes ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkDrawingAttributes
  
  /** Provides properties and methods to manage the input, manipulation, and processing (including handwriting recognition) of one or more InkStroke objects. */
  @JSGlobal("Windows.UI.Input.Inking.InkManager")
  @js.native
  /** Creates a new InkManager object that is used to manage InkStroke objects. */
  class InkManager ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkManager
  
  /** Identifies the ink input mode. */
  @JSGlobal("Windows.UI.Input.Inking.InkManipulationMode")
  @js.native
  object InkManipulationMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Input.Inking.InkManipulationMode with Double] = js.native
    
    /* 1 */ val erasing: typings.winrtUwp.Windows.UI.Input.Inking.InkManipulationMode.erasing with Double = js.native
    
    /* 0 */ val inking: typings.winrtUwp.Windows.UI.Input.Inking.InkManipulationMode.inking with Double = js.native
    
    /* 2 */ val selecting: typings.winrtUwp.Windows.UI.Input.Inking.InkManipulationMode.selecting with Double = js.native
  }
  
  @JSGlobal("Windows.UI.Input.Inking.InkPoint")
  @js.native
  class InkPoint protected ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkPoint {
    /**
      * Creates a new InkPoint object used in the construction of an InkStroke .
      * @param position The screen coordinates for the InkPoint object.
      * @param pressure The pressure of the contact on the digitizer surface. The default is 0.5.
      */
    def this(position: Point, pressure: Double) = this()
  }
  
  /** Provides properties and methods to manage InkStroke handwriting recognition data. */
  @JSGlobal("Windows.UI.Input.Inking.InkRecognitionResult")
  @js.native
  abstract class InkRecognitionResult ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkRecognitionResult
  
  /** Indicates which strokes you want to include in handwriting recognition. */
  @JSGlobal("Windows.UI.Input.Inking.InkRecognitionTarget")
  @js.native
  object InkRecognitionTarget extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Input.Inking.InkRecognitionTarget with Double] = js.native
    
    /* 0 */ val all: typings.winrtUwp.Windows.UI.Input.Inking.InkRecognitionTarget.all with Double = js.native
    
    /* 2 */ val recent: typings.winrtUwp.Windows.UI.Input.Inking.InkRecognitionTarget.recent with Double = js.native
    
    /* 1 */ val selected: typings.winrtUwp.Windows.UI.Input.Inking.InkRecognitionTarget.selected with Double = js.native
  }
  
  /** Manages all aspects of handwriting recognition. */
  @JSGlobal("Windows.UI.Input.Inking.InkRecognizer")
  @js.native
  abstract class InkRecognizer ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkRecognizer
  
  /** Provides properties and methods to manage one or more InkRecognizer objects used for handwriting recognition. */
  @JSGlobal("Windows.UI.Input.Inking.InkRecognizerContainer")
  @js.native
  /** Creates a new InkRecognizerContainer object to manage InkRecognizer objects used for handwriting recognition. */
  class InkRecognizerContainer ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkRecognizerContainer
  
  /** A single ink stroke, including the Bézier curve parameters used for final rendering of the stroke. */
  @JSGlobal("Windows.UI.Input.Inking.InkStroke")
  @js.native
  abstract class InkStroke ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkStroke
  
  /** Builds strokes from raw pointer input. */
  @JSGlobal("Windows.UI.Input.Inking.InkStrokeBuilder")
  @js.native
  /** Creates a new InkStrokeBuilder object that is used to construct InkStroke objects. */
  class InkStrokeBuilder ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkStrokeBuilder
  
  /** Provides properties and methods to store and manage the collection of InkStroke objects rendered by the InkPresenter . */
  @JSGlobal("Windows.UI.Input.Inking.InkStrokeContainer")
  @js.native
  /** Creates a new InkStrokeContainer object that is used to manage InkStroke objects. */
  class InkStrokeContainer ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkStrokeContainer
  
  /** A single segment of a complete ink stroke. */
  @JSGlobal("Windows.UI.Input.Inking.InkStrokeRenderingSegment")
  @js.native
  abstract class InkStrokeRenderingSegment ()
    extends typings.winrtUwp.Windows.UI.Input.Inking.InkStrokeRenderingSegment
  
  /** Identifies the shape of the PenTip . */
  @JSGlobal("Windows.UI.Input.Inking.PenTipShape")
  @js.native
  object PenTipShape extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.UI.Input.Inking.PenTipShape with Double] = js.native
    
    /* 0 */ val circle: typings.winrtUwp.Windows.UI.Input.Inking.PenTipShape.circle with Double = js.native
    
    /* 1 */ val rectangle: typings.winrtUwp.Windows.UI.Input.Inking.PenTipShape.rectangle with Double = js.native
  }
}

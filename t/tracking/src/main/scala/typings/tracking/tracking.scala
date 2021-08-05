package typings.tracking

import typings.std.Uint8ClampedArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tracking {
  
  /**
    * Color match predicate function.
    */
  type ColorFunction = js.Function3[/* r */ Double, /* g */ Double, /* b */ Double, Boolean]
  
  /**
    * ColorTracker utility to track colored blobs in a frame using color
    * difference evaluation.
    */
  @js.native
  trait ColorTracker
    extends StObject
       with Tracker {
    
    /** Gets the colors being tracked by the `ColorTracker` instance. */
    def getColors(): js.Array[String] = js.native
    
    /** Gets the maximum dimension to classify a rectangle. */
    def getMaxDimension(): Double = js.native
    
    /** Gets the minimum dimension to classify a rectangle. */
    def getMinDimension(): Double = js.native
    
    /** Gets the minimum group size to be classified as a rectangle. */
    def getMinGroupSize(): Double = js.native
    
    /**
      * Sets the colors to be tracked by the `ColorTracker` instance.
      * @param colors Array of color names to add.
      */
    def setColors(colors: js.Array[String]): Unit = js.native
    
    /**
      * Sets the maximum dimension to classify a rectangle.
      * @param maxDimension The max dimension.
      */
    def setMaxDimension(maxDimension: Double): Unit = js.native
    
    /**
      * Sets the minimum dimension to classify a rectangle.
      * @param minDimension The min dimension.
      */
    def setMinDimension(minDimension: Double): Unit = js.native
    
    /**
      * Sets the minimum group size to be classified as a rectangle.
      * @param minGroupSize The min group size.
      */
    def setMinGroupSize(minGroupSize: Double): Unit = js.native
  }
  
  /**
    * EventEmitter utility class.
    */
  @js.native
  trait EventEmitter extends StObject {
    
    /**
      * Adds a listener to the end of the listeners array for the specified event.
      * @param event Name of the event.
      * @param listener Listener function.
      */
    def addListener(event: String, listener: TrackEventListener): this.type = js.native
    
    /**
      * Execute each of the listeners in order with the supplied arguments.
      * @param event Name of the event.
      * @param args Callback arguments.
      */
    def emit(event: String, args: js.Any*): Boolean = js.native
    
    /**
      * Adds a listener to the end of the listeners array for the specified event.
      * @param event Name of the event.
      * @param listener Listener function.
      */
    def on(event: String, listener: TrackEventListener): this.type = js.native
    
    /**
      * Adds a one time listener for the event. This listener is invoked only the
      * next time the event is fired, after which it is removed.
      * @param event Name of the event.
      * @param listener Listener function.
      * FIXME: tracking.js docs says method should return this, but code does not
      *        this should be updated when fixed in the repo.
      */
    def once(event: String, listener: TrackEventListener): Unit = js.native
    
    /**
      * Removes all listeners, or those of the specified event. It's not a good
      * idea to remove listeners that were added elsewhere in the code,
      * especially when it's on an emitter that you didn't create.
      * @param event Optional name of the evnet to remove listeners for.
      */
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: String): this.type = js.native
    
    /**
      * Remove a listener from the listener array for the specified event.
      * Caution: changes array indices in the listener array behind the listener.
      * @param event Name of the event.
      * @param listener Listener function.
      */
    def removeListener(event: String, listener: TrackEventListener): this.type = js.native
  }
  
  /**
    * Object tracker utility.
    */
  @js.native
  trait ObjectTracker
    extends StObject
       with Tracker {
    
    /** Gets the tracker HAAR classifiers. */
    def getClassifiers(): js.Array[Double] = js.native
    
    /** Gets the edges density value. */
    def getEdgesDensity(): Double = js.native
    
    /** Gets the initial scale to start the feature block scaling. */
    def getInitialScale(): Double = js.native
    
    /** Gets the scale factor to scale the feature block. */
    def getScaleFactor(): Double = js.native
    
    /** Gets the block step size. */
    def getStepSize(): Double = js.native
    
    /**
      * Sets the tracker HAAR classifiers.
      * @param classifiers Classifiers to track.
      */
    def setClassifiers(classifiers: js.Array[Double]): Unit = js.native
    
    /**
      * Sets the edges density.
      * @param edgesDensity
      */
    def setEdgesDensity(edgesDensity: Double): Unit = js.native
    
    /**
      * Sets the initial scale to start the block scaling.
      * @param initialScale
      */
    def setInitialScale(initialScale: Double): Unit = js.native
    
    /**
      * Sets the scale factor to scale the feature block.
      * @param scaleFactor
      */
    def setScaleFactor(scaleFactor: Double): Unit = js.native
    
    /**
      * Sets the block step size.
      * @param stepSize
      */
    def setStepSize(stepSize: Double): Unit = js.native
  }
  
  /**
    * Event data emmitted by a `track` event.
    */
  trait TrackEvent extends StObject {
    
    var data: js.Array[TrackRect]
  }
  object TrackEvent {
    
    inline def apply(data: js.Array[TrackRect]): TrackEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackEvent]
    }
    
    extension [Self <: TrackEvent](x: Self) {
      
      inline def setData(value: js.Array[TrackRect]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: TrackRect*): Self = StObject.set(x, "data", js.Array(value :_*))
    }
  }
  
  /**
    * Listener callback type for track events.
    */
  type TrackEventListener = js.Function1[/* event */ TrackEvent, Unit]
  
  /**
    * Bounding box data for individal tracking rectangles.
    */
  trait TrackRect extends StObject {
    
    /** Color being tracked (for ColorTracker only) */
    var color: js.UndefOr[String] = js.undefined
    
    /** Rectange height. */
    var height: Double
    
    /** Rectange width. */
    var width: Double
    
    /** Horizontal position of top-left corner. */
    var x: Double
    
    /** Vertical position of top-left corner */
    var y: Double
  }
  object TrackRect {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): TrackRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrackRect]
    }
    
    extension [Self <: TrackRect](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Base class for specific tracker types.
    */
  @js.native
  trait Tracker
    extends StObject
       with EventEmitter {
    
    /**
      * Tracks the pixels on the array. This method is called for each video
      * frame in order to emit `track` event.
      * @param pixels The pixel data to track.
      * @param width The pixel canvas width.
      * @param height The pixel data height.
      */
    def track(pixels: Uint8ClampedArray, width: Double, height: Double): Unit = js.native
  }
  
  /**
    * TrackerTask utility.
    * Note: Types do not provide `setTracker()` even though not marked as private.
    * A new tracker should be created instead.
    */
  @js.native
  trait TrackerTask
    extends StObject
       with EventEmitter {
    
    /**
      * Gets the tracker instance managed by this task.
      */
    def getTracker(): Tracker = js.native
    
    /**
      * Emits a `run` event on the tracker task for the implementers to run any
      * child action, e.g. `requestAnimationFrame`.
      */
    def run(): this.type = js.native
    
    /**
      * Emits a `stop` event on the tracker task for the implementers to stop any
      * child action being done, e.g. `requestAnimationFrame`.
      */
    def stop(): this.type = js.native
  }
}

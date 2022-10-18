package typings.tracking

import typings.std.HTMLElement
import typings.tracking.anon.Audio
import typings.tracking.tracking.ColorFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object tracking {
    
    @JSGlobal("tracking")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * ColorTracker utility to track colored blobs in a frame using color
      * difference evaluation.
      */
    @JSGlobal("tracking.ColorTracker")
    @js.native
    /**
      * Create a new ColorTracker.
      * @param colors Optional color(s) to track.
      */
    open class ColorTracker ()
      extends StObject
         with typings.tracking.tracking.ColorTracker {
      def this(colors: String) = this()
      def this(colors: js.Array[String]) = this()
    }
    object ColorTracker {
      
      @JSGlobal("tracking.ColorTracker")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Gets the known color function that is able to test whether an (r,g,b) is
        * the desired color.
        * @param name The color name.
        */
      /* static member */
      inline def getColor(name: String): ColorFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("getColor")(name.asInstanceOf[js.Any]).asInstanceOf[ColorFunction]
      
      /**
        * Registers a color as known color.
        * @param name The color name.
        * @param predicate The color function to test if the passed (r,g,b) is
        *        the desired color.
        */
      /* static member */
      inline def registerColor(name: String, predicate: ColorFunction): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerColor")(name.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /**
      * EventEmitter utility class.
      */
    @JSGlobal("tracking.EventEmitter")
    @js.native
    open class EventEmitter ()
      extends StObject
         with typings.tracking.tracking.EventEmitter
    
    /**
      * Object tracker utility.
      */
    @JSGlobal("tracking.ObjectTracker")
    @js.native
    /**
      * Create a new Object Tracker.
      * @param classifiers Optional object classifiers to track.
      */
    open class ObjectTracker ()
      extends StObject
         with typings.tracking.tracking.ObjectTracker {
      def this(classifiers: String) = this()
      def this(classifiers: js.Array[String]) = this()
    }
    
    /**
      * Base class for specific tracker types.
      */
    /* note: abstract class */ @JSGlobal("tracking.Tracker")
    @js.native
    open class Tracker ()
      extends StObject
         with typings.tracking.tracking.Tracker
    
    /**
      * TrackerTask utility.
      * Note: Types do not provide `setTracker()` even though not marked as private.
      * A new tracker should be created instead.
      */
    @JSGlobal("tracking.TrackerTask")
    @js.native
    open class TrackerTask protected ()
      extends StObject
         with typings.tracking.tracking.TrackerTask {
      /**
        * Create a new tracker task.
        * @param tracker The tracker instance to manage.
        */
      def this(tracker: typings.tracking.tracking.Tracker) = this()
    }
    
    inline def track(element: String, tracker: typings.tracking.tracking.Tracker): typings.tracking.tracking.TrackerTask = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(element.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any])).asInstanceOf[typings.tracking.tracking.TrackerTask]
    inline def track(element: String, tracker: typings.tracking.tracking.Tracker, options: Audio): typings.tracking.tracking.TrackerTask = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(element.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.tracking.tracking.TrackerTask]
    /**
      * Tracks a canvas, image or video element based on the specified `tracker`
      * instance. This method extract the pixel information of the input element
      * to pass to the `tracker` instance. When tracking a video, the
      * `tracker.track(pixels, width, height)` will be in a
      * `requestAnimationFrame` loop in order to track all video frames.
      * @param element HTMLElement or CSS3 selector string for the element to track.
      *                Element must be convas, image, or video.
      * @param tracker Tracker instance used to track the element.
      * @param options Optional tracker configuration.
      */
    inline def track(element: HTMLElement, tracker: typings.tracking.tracking.Tracker): typings.tracking.tracking.TrackerTask = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(element.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any])).asInstanceOf[typings.tracking.tracking.TrackerTask]
    inline def track(element: HTMLElement, tracker: typings.tracking.tracking.Tracker, options: Audio): typings.tracking.tracking.TrackerTask = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(element.asInstanceOf[js.Any], tracker.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.tracking.tracking.TrackerTask]
  }
}

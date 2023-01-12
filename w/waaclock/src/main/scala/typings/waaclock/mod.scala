package typings.waaclock

import typings.std.AudioContext
import typings.waaclock.anon.Early
import typings.waaclock.anon.ToleranceEarly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * WAAClock handles all the scheduling work. It is the only object you need to create directly.
    *
    * You can set the default tolerance of events with the options toleranceLate and toleranceEarly.
    */
  @JSImport("waaclock", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with WAAClock {
    def this(audioContext: AudioContext) = this()
    def this(audioContext: AudioContext, opts: ToleranceEarly) = this()
    
    /** Schedules func to run before deadline in seconds, and returns an Event object. */
    /* CompleteClass */
    override def callbackAtTime(func: js.Function1[/* e */ Event, Unit], deadline: Double): Event = js.native
    
    /** Schedules func to run after delay seconds, and returns an Event object. */
    /* CompleteClass */
    override def setTimeout(func: js.Function1[/* e */ Event, Unit], delay: Double): Event = js.native
    
    /** Starts the clock. This will also erase all the events that were previously scheduled. */
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /** Stops the clock. */
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /**
      * Stretch time and repeat time of events by ratio, keeping their relative distance,
      * and taking tRef as a reference . In fact this is equivalent to changing the tempo.
      */
    /* CompleteClass */
    override def timeStretch(tRef: Double, events: js.Array[Event], ratio: Double): js.Array[Event] = js.native
  }
  
  /**
    * Every scheduling method returns an event object.
    */
  @js.native
  trait Event extends StObject {
    
    /**
      * Cancels the event execution. This will work only if the event hasn't been scheduled yet
      * (see [the docs](https://github.com/sebpiq/WAAClock#more-infos-about-scheduling) for more info).
      */
    def clear(): Event = js.native
    
    /** The deadline of the event. */
    var deadline: Double = js.native
    
    /** Returns true if the event is repeated, false otherwise */
    def isRepeated(): Boolean = js.native
    
    /**
      * Sets the event to repeat every time seconds. If you want to remove the repeat you can pass null.
      *
      * Note that even if an event is dropped because it expired, subsequent "repeats" of the event will still be executed.
      */
    def repeat(): Event = js.native
    def repeat(time: Double): Event = js.native
    
    /** Reschedule the deadline of an event, deadline is the absolute time as given by context.currentTime. */
    def schedule(deadline: Double): Unit = js.native
    
    /** Time stretches only this event. */
    def timeStretch(tRef: Double, ratio: Double): Unit = js.native
    
    /** Sets the event's tolerance. See [the docs](https://github.com/sebpiq/WAAClock#more-infos-about-scheduling) for a detailed explanation. */
    def tolerance(values: Early): Event = js.native
  }
  
  /**
    * WAAClock handles all the scheduling work. It is the only object you need to create directly.
    *
    * You can set the default tolerance of events with the options toleranceLate and toleranceEarly.
    */
  trait WAAClock extends StObject {
    
    /** Schedules func to run before deadline in seconds, and returns an Event object. */
    def callbackAtTime(func: js.Function1[/* e */ Event, Unit], deadline: Double): Event
    
    /** Schedules func to run after delay seconds, and returns an Event object. */
    def setTimeout(func: js.Function1[/* e */ Event, Unit], delay: Double): Event
    
    /** Starts the clock. This will also erase all the events that were previously scheduled. */
    def start(): Unit
    
    /** Stops the clock. */
    def stop(): Unit
    
    /**
      * Stretch time and repeat time of events by ratio, keeping their relative distance,
      * and taking tRef as a reference . In fact this is equivalent to changing the tempo.
      */
    def timeStretch(tRef: Double, events: js.Array[Event], ratio: Double): js.Array[Event]
  }
  object WAAClock {
    
    inline def apply(
      callbackAtTime: (js.Function1[/* e */ Event, Unit], Double) => Event,
      setTimeout: (js.Function1[/* e */ Event, Unit], Double) => Event,
      start: () => Unit,
      stop: () => Unit,
      timeStretch: (Double, js.Array[Event], Double) => js.Array[Event]
    ): WAAClock = {
      val __obj = js.Dynamic.literal(callbackAtTime = js.Any.fromFunction2(callbackAtTime), setTimeout = js.Any.fromFunction2(setTimeout), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), timeStretch = js.Any.fromFunction3(timeStretch))
      __obj.asInstanceOf[WAAClock]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WAAClock] (val x: Self) extends AnyVal {
      
      inline def setCallbackAtTime(value: (js.Function1[/* e */ Event, Unit], Double) => Event): Self = StObject.set(x, "callbackAtTime", js.Any.fromFunction2(value))
      
      inline def setSetTimeout(value: (js.Function1[/* e */ Event, Unit], Double) => Event): Self = StObject.set(x, "setTimeout", js.Any.fromFunction2(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setTimeStretch(value: (Double, js.Array[Event], Double) => js.Array[Event]): Self = StObject.set(x, "timeStretch", js.Any.fromFunction3(value))
    }
  }
}

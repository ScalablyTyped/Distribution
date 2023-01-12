package typings.victoryCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryUtilTimerMod {
  
  @JSImport("victory-core/lib/victory-util/timer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Timer {
    
    /* private */ /* CompleteClass */
    var activeSubscriptions: Any = js.native
    
    /* CompleteClass */
    override def bypassAnimation(): Unit = js.native
    
    /* CompleteClass */
    override def loop(): Unit = js.native
    
    /* CompleteClass */
    override def resumeAnimation(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var shouldAnimate: Any = js.native
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
    
    /* CompleteClass */
    override def subscribe(callback: TimerCallback, duration: Double): Double = js.native
    
    /* private */ /* CompleteClass */
    override val subscribers: Any = js.native
    
    /* private */ /* CompleteClass */
    var timer: Any = js.native
    
    /* CompleteClass */
    override def unsubscribe(id: Any): Unit = js.native
  }
  
  trait Timer extends StObject {
    
    /* private */ var activeSubscriptions: Any
    
    def bypassAnimation(): Unit
    
    def loop(): Unit
    
    def resumeAnimation(): Unit
    
    /* private */ var shouldAnimate: Any
    
    def start(): Unit
    
    def stop(): Unit
    
    def subscribe(callback: TimerCallback, duration: Double): Double
    
    /* private */ val subscribers: Any
    
    /* private */ var timer: Any
    
    def unsubscribe(id: Any): Unit
  }
  object Timer {
    
    inline def apply(
      activeSubscriptions: Any,
      bypassAnimation: () => Unit,
      loop: () => Unit,
      resumeAnimation: () => Unit,
      shouldAnimate: Any,
      start: () => Unit,
      stop: () => Unit,
      subscribe: (TimerCallback, Double) => Double,
      subscribers: Any,
      timer: Any,
      unsubscribe: Any => Unit
    ): Timer = {
      val __obj = js.Dynamic.literal(activeSubscriptions = activeSubscriptions.asInstanceOf[js.Any], bypassAnimation = js.Any.fromFunction0(bypassAnimation), loop = js.Any.fromFunction0(loop), resumeAnimation = js.Any.fromFunction0(resumeAnimation), shouldAnimate = shouldAnimate.asInstanceOf[js.Any], start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), subscribe = js.Any.fromFunction2(subscribe), subscribers = subscribers.asInstanceOf[js.Any], timer = timer.asInstanceOf[js.Any], unsubscribe = js.Any.fromFunction1(unsubscribe))
      __obj.asInstanceOf[Timer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
      
      inline def setActiveSubscriptions(value: Any): Self = StObject.set(x, "activeSubscriptions", value.asInstanceOf[js.Any])
      
      inline def setBypassAnimation(value: () => Unit): Self = StObject.set(x, "bypassAnimation", js.Any.fromFunction0(value))
      
      inline def setLoop(value: () => Unit): Self = StObject.set(x, "loop", js.Any.fromFunction0(value))
      
      inline def setResumeAnimation(value: () => Unit): Self = StObject.set(x, "resumeAnimation", js.Any.fromFunction0(value))
      
      inline def setShouldAnimate(value: Any): Self = StObject.set(x, "shouldAnimate", value.asInstanceOf[js.Any])
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
      
      inline def setSubscribe(value: (TimerCallback, Double) => Double): Self = StObject.set(x, "subscribe", js.Any.fromFunction2(value))
      
      inline def setSubscribers(value: Any): Self = StObject.set(x, "subscribers", value.asInstanceOf[js.Any])
      
      inline def setTimer(value: Any): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribe(value: Any => Unit): Self = StObject.set(x, "unsubscribe", js.Any.fromFunction1(value))
    }
  }
  
  type TimerCallback = js.Function2[/* elapsed */ Double, /* duration */ Double, Unit]
}

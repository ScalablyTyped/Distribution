package typings.swipe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Swipe extends StObject {
  
  def attachEvents(): Unit
  
  def getNumSlides(): Double
  
  def getPos(): Double
  
  def kill(): Unit
  
  def next(): Unit
  
  def prev(): Unit
  
  def setup(): Unit
  
  def slide(index: Double, duration: Double): Unit
}
object Swipe {
  
  inline def apply(
    attachEvents: () => Unit,
    getNumSlides: () => Double,
    getPos: () => Double,
    kill: () => Unit,
    next: () => Unit,
    prev: () => Unit,
    setup: () => Unit,
    slide: (Double, Double) => Unit
  ): Swipe = {
    val __obj = js.Dynamic.literal(attachEvents = js.Any.fromFunction0(attachEvents), getNumSlides = js.Any.fromFunction0(getNumSlides), getPos = js.Any.fromFunction0(getPos), kill = js.Any.fromFunction0(kill), next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), setup = js.Any.fromFunction0(setup), slide = js.Any.fromFunction2(slide))
    __obj.asInstanceOf[Swipe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Swipe] (val x: Self) extends AnyVal {
    
    inline def setAttachEvents(value: () => Unit): Self = StObject.set(x, "attachEvents", js.Any.fromFunction0(value))
    
    inline def setGetNumSlides(value: () => Double): Self = StObject.set(x, "getNumSlides", js.Any.fromFunction0(value))
    
    inline def setGetPos(value: () => Double): Self = StObject.set(x, "getPos", js.Any.fromFunction0(value))
    
    inline def setKill(value: () => Unit): Self = StObject.set(x, "kill", js.Any.fromFunction0(value))
    
    inline def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    inline def setPrev(value: () => Unit): Self = StObject.set(x, "prev", js.Any.fromFunction0(value))
    
    inline def setSetup(value: () => Unit): Self = StObject.set(x, "setup", js.Any.fromFunction0(value))
    
    inline def setSlide(value: (Double, Double) => Unit): Self = StObject.set(x, "slide", js.Any.fromFunction2(value))
  }
}

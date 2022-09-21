package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An event listener, created by woosmap.map.event.addListener() and friends.
  */
trait MapEventListener extends StObject {
  
  /**
    * Calling `listener.remove()` is equivalent to `woosmap.map.event.removeListener(listener)`.
    */
  def remove(): Unit
}
object MapEventListener {
  
  inline def apply(remove: () => Unit): MapEventListener = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[MapEventListener]
  }
  
  extension [Self <: MapEventListener](x: Self) {
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
  }
}

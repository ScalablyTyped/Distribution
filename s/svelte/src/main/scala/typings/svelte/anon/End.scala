package typings.svelte.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  def end(): Unit
  
  def invalidate(): Unit
  
  def start(): Unit
}
object End {
  
  inline def apply(end: () => Unit, invalidate: () => Unit, start: () => Unit): End = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), invalidate = js.Any.fromFunction0(invalidate), start = js.Any.fromFunction0(start))
    __obj.asInstanceOf[End]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    
    inline def setInvalidate(value: () => Unit): Self = StObject.set(x, "invalidate", js.Any.fromFunction0(value))
    
    inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
  }
}

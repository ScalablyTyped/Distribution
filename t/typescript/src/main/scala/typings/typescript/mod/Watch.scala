package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Watch[T] extends StObject {
  
  /** Closes the watch */
  def close(): Unit
  
  /** Synchronize with host and get updated program */
  def getProgram(): T
}
object Watch {
  
  inline def apply[T](close: () => Unit, getProgram: () => T): Watch[T] = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getProgram = js.Any.fromFunction0(getProgram))
    __obj.asInstanceOf[Watch[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Watch[?], T] (val x: Self & Watch[T]) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setGetProgram(value: () => T): Self = StObject.set(x, "getProgram", js.Any.fromFunction0(value))
  }
}

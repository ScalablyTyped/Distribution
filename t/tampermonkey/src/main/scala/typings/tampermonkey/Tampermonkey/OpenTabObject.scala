package typings.tampermonkey.Tampermonkey

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenTabObject extends StObject {
  
  /** Closes tab */
  def close(): Unit
  
  var closed: Boolean
  
  /** Set closed listener */
  var onclosed: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object OpenTabObject {
  
  @scala.inline
  def apply(close: () => Unit, closed: Boolean): OpenTabObject = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), closed = closed.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenTabObject]
  }
  
  @scala.inline
  implicit class OpenTabObjectMutableBuilder[Self <: OpenTabObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnclosed(value: () => Unit): Self = StObject.set(x, "onclosed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnclosedUndefined: Self = StObject.set(x, "onclosed", js.undefined)
  }
}

package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Open extends StObject {
  
  /**
    * A function opening the media modal when called.
    */
  def open(): Unit
}
object Open {
  
  inline def apply(open: () => Unit): Open = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Open]
  }
  
  extension [Self <: Open](x: Self) {
    
    inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}

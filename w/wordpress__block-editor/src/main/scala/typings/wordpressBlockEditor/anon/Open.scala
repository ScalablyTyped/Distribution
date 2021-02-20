package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Open extends StObject {
  
  /**
    * A function opening the media modal when called.
    */
  def open(): Unit = js.native
}
object Open {
  
  @scala.inline
  def apply(open: () => Unit): Open = {
    val __obj = js.Dynamic.literal(open = js.Any.fromFunction0(open))
    __obj.asInstanceOf[Open]
  }
  
  @scala.inline
  implicit class OpenMutableBuilder[Self <: Open] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
  }
}

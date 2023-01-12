package typings.webStreamsPolyfill.mod

import typings.webStreamsPolyfill.webStreamsPolyfillStrings.abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortSignal extends StObject {
  
  /**
    * Whether the request is aborted.
    */
  val aborted: Boolean
  
  /**
    * Add an event listener to be triggered when this signal becomes aborted.
    */
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function0[Unit]): Unit
  
  /**
    * Remove an event listener that was previously added with {@link AbortSignal.addEventListener}.
    */
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: js.Function0[Unit]): Unit
}
object AbortSignal {
  
  inline def apply(
    aborted: Boolean,
    addEventListener: (abort, js.Function0[Unit]) => Unit,
    removeEventListener: (abort, js.Function0[Unit]) => Unit
  ): AbortSignal = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
    __obj.asInstanceOf[AbortSignal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AbortSignal] (val x: Self) extends AnyVal {
    
    inline def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
    
    inline def setAddEventListener(value: (abort, js.Function0[Unit]) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setRemoveEventListener(value: (abort, js.Function0[Unit]) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
  }
}

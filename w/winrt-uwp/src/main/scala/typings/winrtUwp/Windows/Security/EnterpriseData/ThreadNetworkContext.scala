package typings.winrtUwp.Windows.Security.EnterpriseData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A protected network context for an enterprise identity. The creation of the context tags all network connections made thereafter on the current thread with the identity, and allows access to enterprise resources that are access controlled by the enterprise's policy. */
trait ThreadNetworkContext extends StObject {
  
  /** Closes the protected network context. The app must call Close after access to the protected resource is completed. */
  def close(): Unit
}
object ThreadNetworkContext {
  
  @scala.inline
  def apply(close: () => Unit): ThreadNetworkContext = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[ThreadNetworkContext]
  }
  
  @scala.inline
  implicit class ThreadNetworkContextMutableBuilder[Self <: ThreadNetworkContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}

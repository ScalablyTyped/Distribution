package typings.trufflePrivatekeyProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("truffle-privatekey-provider", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with PrivateKeyProvider {
    def this(privateKey: Any, providerUrl: Any) = this()
    
    /* CompleteClass */
    override def send(args: Any*): Any = js.native
    
    /* CompleteClass */
    override def sendAsync(args: Any*): Unit = js.native
  }
  
  trait PrivateKeyProvider extends StObject {
    
    def send(args: Any*): Any
    
    def sendAsync(args: Any*): Unit
  }
  object PrivateKeyProvider {
    
    inline def apply(send: /* repeated */ Any => Any, sendAsync: /* repeated */ Any => Unit): PrivateKeyProvider = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendAsync = js.Any.fromFunction1(sendAsync))
      __obj.asInstanceOf[PrivateKeyProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrivateKeyProvider] (val x: Self) extends AnyVal {
      
      inline def setSend(value: /* repeated */ Any => Any): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setSendAsync(value: /* repeated */ Any => Unit): Self = StObject.set(x, "sendAsync", js.Any.fromFunction1(value))
    }
  }
}

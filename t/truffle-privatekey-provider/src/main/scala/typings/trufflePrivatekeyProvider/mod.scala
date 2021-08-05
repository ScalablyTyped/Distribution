package typings.trufflePrivatekeyProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("truffle-privatekey-provider", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with PrivateKeyProvider {
    def this(privateKey: js.Any, providerUrl: js.Any) = this()
    
    /* CompleteClass */
    override def send(args: js.Any*): js.Any = js.native
    
    /* CompleteClass */
    override def sendAsync(args: js.Any*): Unit = js.native
  }
  
  trait PrivateKeyProvider extends StObject {
    
    def send(args: js.Any*): js.Any
    
    def sendAsync(args: js.Any*): Unit
  }
  object PrivateKeyProvider {
    
    inline def apply(send: /* repeated */ js.Any => js.Any, sendAsync: /* repeated */ js.Any => Unit): PrivateKeyProvider = {
      val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send), sendAsync = js.Any.fromFunction1(sendAsync))
      __obj.asInstanceOf[PrivateKeyProvider]
    }
    
    extension [Self <: PrivateKeyProvider](x: Self) {
      
      inline def setSend(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setSendAsync(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "sendAsync", js.Any.fromFunction1(value))
    }
  }
}

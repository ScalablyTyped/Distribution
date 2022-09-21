package typings.tedious

import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDuplexpairMod {
  
  @JSImport("native-duplexpair", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DuplexPair {
    
    /* CompleteClass */
    var socket1: DuplexSocket = js.native
    
    /* CompleteClass */
    var socket2: DuplexSocket = js.native
  }
  
  trait DuplexPair extends StObject {
    
    var socket1: DuplexSocket
    
    var socket2: DuplexSocket
  }
  object DuplexPair {
    
    inline def apply(socket1: DuplexSocket, socket2: DuplexSocket): DuplexPair = {
      val __obj = js.Dynamic.literal(socket1 = socket1.asInstanceOf[js.Any], socket2 = socket2.asInstanceOf[js.Any])
      __obj.asInstanceOf[DuplexPair]
    }
    
    extension [Self <: DuplexPair](x: Self) {
      
      inline def setSocket1(value: DuplexSocket): Self = StObject.set(x, "socket1", value.asInstanceOf[js.Any])
      
      inline def setSocket2(value: DuplexSocket): Self = StObject.set(x, "socket2", value.asInstanceOf[js.Any])
    }
  }
  
  type DuplexSocket = Duplex
}

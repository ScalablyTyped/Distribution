package typings.typestubIpfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Multiaddr extends StObject {
  
  var buffer: js.typedarray.Uint8Array
}
object Multiaddr {
  
  inline def apply(buffer: js.typedarray.Uint8Array): Multiaddr = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Multiaddr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Multiaddr] (val x: Self) extends AnyVal {
    
    inline def setBuffer(value: js.typedarray.Uint8Array): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
  }
}

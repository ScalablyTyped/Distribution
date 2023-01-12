package typings.xummSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Always extends StObject {
  
  var always: String
  
  var no_push_msg_received: js.UndefOr[String] = js.undefined
}
object Always {
  
  inline def apply(always: String): Always = {
    val __obj = js.Dynamic.literal(always = always.asInstanceOf[js.Any])
    __obj.asInstanceOf[Always]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Always] (val x: Self) extends AnyVal {
    
    inline def setAlways(value: String): Self = StObject.set(x, "always", value.asInstanceOf[js.Any])
    
    inline def setNo_push_msg_received(value: String): Self = StObject.set(x, "no_push_msg_received", value.asInstanceOf[js.Any])
    
    inline def setNo_push_msg_receivedUndefined: Self = StObject.set(x, "no_push_msg_received", js.undefined)
  }
}

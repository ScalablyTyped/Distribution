package typings.telnetlib.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options_[T /* <: TelnetOption */] extends StObject {
  
  var localOptions: js.UndefOr[js.Array[T]] = js.undefined
  
  var receiveBuffermax: js.UndefOr[Double] = js.undefined
  
  var remoteOptions: js.UndefOr[js.Array[T]] = js.undefined
  
  var subnegotiationBufferMax: js.UndefOr[Double] = js.undefined
}
object Options_ {
  
  inline def apply[T /* <: TelnetOption */](): Options_[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options_[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options_[?], T /* <: TelnetOption */] (val x: Self & Options_[T]) extends AnyVal {
    
    inline def setLocalOptions(value: js.Array[T]): Self = StObject.set(x, "localOptions", value.asInstanceOf[js.Any])
    
    inline def setLocalOptionsUndefined: Self = StObject.set(x, "localOptions", js.undefined)
    
    inline def setLocalOptionsVarargs(value: T*): Self = StObject.set(x, "localOptions", js.Array(value*))
    
    inline def setReceiveBuffermax(value: Double): Self = StObject.set(x, "receiveBuffermax", value.asInstanceOf[js.Any])
    
    inline def setReceiveBuffermaxUndefined: Self = StObject.set(x, "receiveBuffermax", js.undefined)
    
    inline def setRemoteOptions(value: js.Array[T]): Self = StObject.set(x, "remoteOptions", value.asInstanceOf[js.Any])
    
    inline def setRemoteOptionsUndefined: Self = StObject.set(x, "remoteOptions", js.undefined)
    
    inline def setRemoteOptionsVarargs(value: T*): Self = StObject.set(x, "remoteOptions", js.Array(value*))
    
    inline def setSubnegotiationBufferMax(value: Double): Self = StObject.set(x, "subnegotiationBufferMax", value.asInstanceOf[js.Any])
    
    inline def setSubnegotiationBufferMaxUndefined: Self = StObject.set(x, "subnegotiationBufferMax", js.undefined)
  }
}

package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Granted extends StObject {
  
  var granted: Boolean
  
  var remember: Boolean
}
object Granted {
  
  inline def apply(granted: Boolean, remember: Boolean): Granted = {
    val __obj = js.Dynamic.literal(granted = granted.asInstanceOf[js.Any], remember = remember.asInstanceOf[js.Any])
    __obj.asInstanceOf[Granted]
  }
  
  extension [Self <: Granted](x: Self) {
    
    inline def setGranted(value: Boolean): Self = StObject.set(x, "granted", value.asInstanceOf[js.Any])
    
    inline def setRemember(value: Boolean): Self = StObject.set(x, "remember", value.asInstanceOf[js.Any])
  }
}

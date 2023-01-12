package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log extends StObject {
  
  /**
    * Logger settings when running bin scripts.
    *   config.bin.log = see config
    */
  var log: Any
}
object Log {
  
  inline def apply(log: Any): Log = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
    
    inline def setLog(value: Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
  }
}

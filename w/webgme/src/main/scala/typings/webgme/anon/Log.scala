package typings.webgme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Log extends StObject {
  
  /**
    * Logger settings when running bin scripts.
    *   config.bin.log = see config
    */
  var log: js.Any
}
object Log {
  
  @scala.inline
  def apply(log: js.Any): Log = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
  
  @scala.inline
  implicit class LogMutableBuilder[Self <: Log] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
  }
}

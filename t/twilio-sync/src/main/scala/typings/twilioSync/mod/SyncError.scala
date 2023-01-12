package typings.twilioSync.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Generic SyncLibrary error class
  */
trait SyncError
  extends StObject
     with Error {
  
  var code: Double
  
  var status: Double
}
object SyncError {
  
  inline def apply(code: Double, message: String, name: String, status: Double): SyncError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}

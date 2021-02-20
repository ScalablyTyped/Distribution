package typings.typeorm.mongodbTypingsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteError extends StObject {
  
  /**
    * Write concern error code.
    */
  var code: scala.Double = js.native
  
  /**
    * Write concern error message.
    */
  var errmsg: String = js.native
  
  /**
    * Write concern error original bulk operation index.
    */
  var index: scala.Double = js.native
}
object WriteError {
  
  @scala.inline
  def apply(code: scala.Double, errmsg: String, index: scala.Double): WriteError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errmsg = errmsg.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteError]
  }
  
  @scala.inline
  implicit class WriteErrorMutableBuilder[Self <: WriteError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: scala.Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrmsg(value: String): Self = StObject.set(x, "errmsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: scala.Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}

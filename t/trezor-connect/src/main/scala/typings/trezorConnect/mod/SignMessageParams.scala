package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignMessageParams extends CommonParams {
  
  var coin: js.UndefOr[String] = js.native
  
  var message: String = js.native
  
  var path: String | js.Array[Double] = js.native
}
object SignMessageParams {
  
  @scala.inline
  def apply(message: String, path: String | js.Array[Double]): SignMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignMessageParams]
  }
  
  @scala.inline
  implicit class SignMessageParamsMutableBuilder[Self <: SignMessageParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoinUndefined: Self = StObject.set(x, "coin", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String | js.Array[Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathVarargs(value: Double*): Self = StObject.set(x, "path", js.Array(value :_*))
  }
}

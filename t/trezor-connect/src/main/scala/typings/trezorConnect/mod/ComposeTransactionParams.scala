package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComposeTransactionParams extends CommonParams {
  
  var coin: String = js.native
  
  var outputs: js.Array[Output] = js.native
  
  var push: js.UndefOr[Boolean] = js.native
}
object ComposeTransactionParams {
  
  @scala.inline
  def apply(coin: String, outputs: js.Array[Output]): ComposeTransactionParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeTransactionParams]
  }
  
  @scala.inline
  implicit class ComposeTransactionParamsMutableBuilder[Self <: ComposeTransactionParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoin(value: String): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: js.Array[Output]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    @scala.inline
    def setPush(value: Boolean): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
  }
}

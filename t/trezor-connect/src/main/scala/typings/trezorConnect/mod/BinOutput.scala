package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinOutput extends StObject {
  
  var amount: Double = js.native
  
  var script_pubkey: String = js.native
}
object BinOutput {
  
  @scala.inline
  def apply(amount: Double, script_pubkey: String): BinOutput = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], script_pubkey = script_pubkey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinOutput]
  }
  
  @scala.inline
  implicit class BinOutputMutableBuilder[Self <: BinOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript_pubkey(value: String): Self = StObject.set(x, "script_pubkey", value.asInstanceOf[js.Any])
  }
}

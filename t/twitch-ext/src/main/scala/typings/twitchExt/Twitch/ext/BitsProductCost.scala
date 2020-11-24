package typings.twitchExt.Twitch.ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BitsProductCost extends js.Object {
  
  /**
    * Number of Bits required for the product.
    */
  var amount: String = js.native
  
  /**
    * Always the string "bits". Reserved for future use.
    */
  var `type`: typings.twitchExt.twitchExtStrings.bits = js.native
}
object BitsProductCost {
  
  @scala.inline
  def apply(amount: String, `type`: typings.twitchExt.twitchExtStrings.bits): BitsProductCost = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitsProductCost]
  }
  
  @scala.inline
  implicit class BitsProductCostOps[Self <: BitsProductCost] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.twitchExt.twitchExtStrings.bits): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}

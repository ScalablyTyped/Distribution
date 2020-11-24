package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAddressParams extends CommonParams {
  
  var address: js.UndefOr[String] = js.native
  
  var coin: js.UndefOr[String] = js.native
  
  var crossChain: js.UndefOr[Boolean] = js.native
  
  var path: String | js.Array[Double] = js.native
  
  var showOnTrezor: js.UndefOr[Boolean] = js.native
}
object GetAddressParams {
  
  @scala.inline
  def apply(path: String | js.Array[Double]): GetAddressParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAddressParams]
  }
  
  @scala.inline
  implicit class GetAddressParamsOps[Self <: GetAddressParams] (val x: Self) extends AnyVal {
    
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
    def setPathVarargs(value: Double*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: String | js.Array[Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setCoin(value: String): Self = this.set("coin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoin: Self = this.set("coin", js.undefined)
    
    @scala.inline
    def setCrossChain(value: Boolean): Self = this.set("crossChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossChain: Self = this.set("crossChain", js.undefined)
    
    @scala.inline
    def setShowOnTrezor(value: Boolean): Self = this.set("showOnTrezor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOnTrezor: Self = this.set("showOnTrezor", js.undefined)
  }
}

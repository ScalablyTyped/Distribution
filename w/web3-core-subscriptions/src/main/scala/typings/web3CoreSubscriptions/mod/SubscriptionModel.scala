package typings.web3CoreSubscriptions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscriptionModel extends js.Object {
  
  var inputFormatter: js.Array[js.Function0[Unit]] = js.native
  
  def outputFormatter(): Unit = js.native
  
  var params: Double = js.native
  
  def subscriptionHandler(): Unit = js.native
  
  var subscriptionName: String = js.native
}
object SubscriptionModel {
  
  @scala.inline
  def apply(
    inputFormatter: js.Array[js.Function0[Unit]],
    outputFormatter: () => Unit,
    params: Double,
    subscriptionHandler: () => Unit,
    subscriptionName: String
  ): SubscriptionModel = {
    val __obj = js.Dynamic.literal(inputFormatter = inputFormatter.asInstanceOf[js.Any], outputFormatter = js.Any.fromFunction0(outputFormatter), params = params.asInstanceOf[js.Any], subscriptionHandler = js.Any.fromFunction0(subscriptionHandler), subscriptionName = subscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionModel]
  }
  
  @scala.inline
  implicit class SubscriptionModelOps[Self <: SubscriptionModel] (val x: Self) extends AnyVal {
    
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
    def setInputFormatterVarargs(value: js.Function0[Unit]*): Self = this.set("inputFormatter", js.Array(value :_*))
    
    @scala.inline
    def setInputFormatter(value: js.Array[js.Function0[Unit]]): Self = this.set("inputFormatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFormatter(value: () => Unit): Self = this.set("outputFormatter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParams(value: Double): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionHandler(value: () => Unit): Self = this.set("subscriptionHandler", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSubscriptionName(value: String): Self = this.set("subscriptionName", value.asInstanceOf[js.Any])
  }
}

package typings.winrt.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IComponentLoadFailedEventArgs extends js.Object {
  
  var completion: MediaProtectionServiceCompletion = js.native
  
  var information: RevocationAndRenewalInformation = js.native
}
object IComponentLoadFailedEventArgs {
  
  @scala.inline
  def apply(completion: MediaProtectionServiceCompletion, information: RevocationAndRenewalInformation): IComponentLoadFailedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponentLoadFailedEventArgs]
  }
  
  @scala.inline
  implicit class IComponentLoadFailedEventArgsOps[Self <: IComponentLoadFailedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCompletion(value: MediaProtectionServiceCompletion): Self = this.set("completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformation(value: RevocationAndRenewalInformation): Self = this.set("information", value.asInstanceOf[js.Any])
  }
}

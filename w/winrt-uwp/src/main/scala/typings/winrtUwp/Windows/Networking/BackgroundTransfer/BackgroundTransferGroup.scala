package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A named group used to associate multiple download or upload operations. This class makes it easy for your app to create these groups and to complete downloads and uploads simultaneously, in serial, or based on priority. */
@js.native
trait BackgroundTransferGroup extends js.Object {
  
  /** Gets the name of the group. */
  var name: String = js.native
  
  /** Gets or sets the property used to specify if transfers within this group run simultaneously or in serial. Possible values are defined by BackgroundTransferBehavior . */
  var transferBehavior: BackgroundTransferBehavior = js.native
}
object BackgroundTransferGroup {
  
  @scala.inline
  def apply(name: String, transferBehavior: BackgroundTransferBehavior): BackgroundTransferGroup = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], transferBehavior = transferBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundTransferGroup]
  }
  
  @scala.inline
  implicit class BackgroundTransferGroupOps[Self <: BackgroundTransferGroup] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferBehavior(value: BackgroundTransferBehavior): Self = this.set("transferBehavior", value.asInstanceOf[js.Any])
  }
}

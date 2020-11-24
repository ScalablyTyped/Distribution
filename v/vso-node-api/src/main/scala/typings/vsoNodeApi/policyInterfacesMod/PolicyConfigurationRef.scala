package typings.vsoNodeApi.policyInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyConfigurationRef extends js.Object {
  
  /**
    * The policy configuration ID.
    */
  var id: Double = js.native
  
  /**
    * The policy configuration type.
    */
  var `type`: PolicyTypeRef = js.native
  
  /**
    * The URL where the policy configuration can be retrieved.
    */
  var url: String = js.native
}
object PolicyConfigurationRef {
  
  @scala.inline
  def apply(id: Double, `type`: PolicyTypeRef, url: String): PolicyConfigurationRef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyConfigurationRef]
  }
  
  @scala.inline
  implicit class PolicyConfigurationRefOps[Self <: PolicyConfigurationRef] (val x: Self) extends AnyVal {
    
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PolicyTypeRef): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}

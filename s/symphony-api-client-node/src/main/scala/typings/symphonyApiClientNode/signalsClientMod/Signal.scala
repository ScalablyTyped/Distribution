package typings.symphonyApiClientNode.signalsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signal extends js.Object {
  
  var companyWide: Boolean = js.native
  
  var id: String = js.native
  
  var name: String = js.native
  
  var query: String = js.native
  
  var timestamp: Double = js.native
  
  var visibleOnProfile: Boolean = js.native
}
object Signal {
  
  @scala.inline
  def apply(
    companyWide: Boolean,
    id: String,
    name: String,
    query: String,
    timestamp: Double,
    visibleOnProfile: Boolean
  ): Signal = {
    val __obj = js.Dynamic.literal(companyWide = companyWide.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], visibleOnProfile = visibleOnProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signal]
  }
  
  @scala.inline
  implicit class SignalOps[Self <: Signal] (val x: Self) extends AnyVal {
    
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
    def setCompanyWide(value: Boolean): Self = this.set("companyWide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleOnProfile(value: Boolean): Self = this.set("visibleOnProfile", value.asInstanceOf[js.Any])
  }
}

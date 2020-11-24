package typings.symphonyApiClientNode.streamsClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseRoomAttributes extends js.Object {
  
  var crossPod: js.UndefOr[Boolean] = js.native
  
  var description: String = js.native
  
  var discoverable: js.UndefOr[Boolean] = js.native
  
  var keywords: js.UndefOr[js.Array[Keyword]] = js.native
  
  var membersCanInvite: js.UndefOr[Boolean] = js.native
  
  var multiLateralRoom: js.UndefOr[Boolean] = js.native
  
  var name: String = js.native
  
  var viewHistory: js.UndefOr[Boolean] = js.native
}
object BaseRoomAttributes {
  
  @scala.inline
  def apply(description: String, name: String): BaseRoomAttributes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRoomAttributes]
  }
  
  @scala.inline
  implicit class BaseRoomAttributesOps[Self <: BaseRoomAttributes] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossPod(value: Boolean): Self = this.set("crossPod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossPod: Self = this.set("crossPod", js.undefined)
    
    @scala.inline
    def setDiscoverable(value: Boolean): Self = this.set("discoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscoverable: Self = this.set("discoverable", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: Keyword*): Self = this.set("keywords", js.Array(value :_*))
    
    @scala.inline
    def setKeywords(value: js.Array[Keyword]): Self = this.set("keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeywords: Self = this.set("keywords", js.undefined)
    
    @scala.inline
    def setMembersCanInvite(value: Boolean): Self = this.set("membersCanInvite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembersCanInvite: Self = this.set("membersCanInvite", js.undefined)
    
    @scala.inline
    def setMultiLateralRoom(value: Boolean): Self = this.set("multiLateralRoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiLateralRoom: Self = this.set("multiLateralRoom", js.undefined)
    
    @scala.inline
    def setViewHistory(value: Boolean): Self = this.set("viewHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewHistory: Self = this.set("viewHistory", js.undefined)
  }
}

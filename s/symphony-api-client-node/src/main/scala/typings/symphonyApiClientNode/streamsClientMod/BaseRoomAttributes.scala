package typings.symphonyApiClientNode.streamsClientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseRoomAttributes extends StObject {
  
  var crossPod: js.UndefOr[Boolean] = js.undefined
  
  var description: String
  
  var discoverable: js.UndefOr[Boolean] = js.undefined
  
  var keywords: js.UndefOr[js.Array[Keyword]] = js.undefined
  
  var membersCanInvite: js.UndefOr[Boolean] = js.undefined
  
  var multiLateralRoom: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var viewHistory: js.UndefOr[Boolean] = js.undefined
}
object BaseRoomAttributes {
  
  @scala.inline
  def apply(description: String, name: String): BaseRoomAttributes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRoomAttributes]
  }
  
  @scala.inline
  implicit class BaseRoomAttributesMutableBuilder[Self <: BaseRoomAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrossPod(value: Boolean): Self = StObject.set(x, "crossPod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossPodUndefined: Self = StObject.set(x, "crossPod", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoverable(value: Boolean): Self = StObject.set(x, "discoverable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscoverableUndefined: Self = StObject.set(x, "discoverable", js.undefined)
    
    @scala.inline
    def setKeywords(value: js.Array[Keyword]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    @scala.inline
    def setKeywordsVarargs(value: Keyword*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    
    @scala.inline
    def setMembersCanInvite(value: Boolean): Self = StObject.set(x, "membersCanInvite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersCanInviteUndefined: Self = StObject.set(x, "membersCanInvite", js.undefined)
    
    @scala.inline
    def setMultiLateralRoom(value: Boolean): Self = StObject.set(x, "multiLateralRoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiLateralRoomUndefined: Self = StObject.set(x, "multiLateralRoom", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewHistory(value: Boolean): Self = StObject.set(x, "viewHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewHistoryUndefined: Self = StObject.set(x, "viewHistory", js.undefined)
  }
}

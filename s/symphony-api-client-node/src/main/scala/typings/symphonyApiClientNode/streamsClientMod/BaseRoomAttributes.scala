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
  
  inline def apply(description: String, name: String): BaseRoomAttributes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseRoomAttributes]
  }
  
  extension [Self <: BaseRoomAttributes](x: Self) {
    
    inline def setCrossPod(value: Boolean): Self = StObject.set(x, "crossPod", value.asInstanceOf[js.Any])
    
    inline def setCrossPodUndefined: Self = StObject.set(x, "crossPod", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDiscoverable(value: Boolean): Self = StObject.set(x, "discoverable", value.asInstanceOf[js.Any])
    
    inline def setDiscoverableUndefined: Self = StObject.set(x, "discoverable", js.undefined)
    
    inline def setKeywords(value: js.Array[Keyword]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
    
    inline def setKeywordsVarargs(value: Keyword*): Self = StObject.set(x, "keywords", js.Array(value :_*))
    
    inline def setMembersCanInvite(value: Boolean): Self = StObject.set(x, "membersCanInvite", value.asInstanceOf[js.Any])
    
    inline def setMembersCanInviteUndefined: Self = StObject.set(x, "membersCanInvite", js.undefined)
    
    inline def setMultiLateralRoom(value: Boolean): Self = StObject.set(x, "multiLateralRoom", value.asInstanceOf[js.Any])
    
    inline def setMultiLateralRoomUndefined: Self = StObject.set(x, "multiLateralRoom", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setViewHistory(value: Boolean): Self = StObject.set(x, "viewHistory", value.asInstanceOf[js.Any])
    
    inline def setViewHistoryUndefined: Self = StObject.set(x, "viewHistory", js.undefined)
  }
}

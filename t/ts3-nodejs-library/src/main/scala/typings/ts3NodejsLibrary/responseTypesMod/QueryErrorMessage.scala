package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryErrorMessage extends ResponseEntry {
  
  var extraMsg: js.UndefOr[String] = js.native
  
  var failedPermid: js.UndefOr[Double] = js.native
  
  var id: String = js.native
  
  var msg: String = js.native
}
object QueryErrorMessage {
  
  @scala.inline
  def apply(id: String, msg: String): QueryErrorMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryErrorMessage]
  }
  
  @scala.inline
  implicit class QueryErrorMessageMutableBuilder[Self <: QueryErrorMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraMsg(value: String): Self = StObject.set(x, "extraMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraMsgUndefined: Self = StObject.set(x, "extraMsg", js.undefined)
    
    @scala.inline
    def setFailedPermid(value: Double): Self = StObject.set(x, "failedPermid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedPermidUndefined: Self = StObject.set(x, "failedPermid", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}

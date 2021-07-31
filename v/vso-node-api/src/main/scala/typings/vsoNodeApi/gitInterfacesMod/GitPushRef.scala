package typings.vsoNodeApi.gitInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitPushRef extends StObject {
  
  var _links: js.Any
  
  var date: Date
  
  var pushCorrelationId: String
  
  var pushId: Double
  
  var pushedBy: IdentityRef
  
  var url: String
}
object GitPushRef {
  
  @scala.inline
  def apply(
    _links: js.Any,
    date: Date,
    pushCorrelationId: String,
    pushId: Double,
    pushedBy: IdentityRef,
    url: String
  ): GitPushRef = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], pushCorrelationId = pushCorrelationId.asInstanceOf[js.Any], pushId = pushId.asInstanceOf[js.Any], pushedBy = pushedBy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPushRef]
  }
  
  @scala.inline
  implicit class GitPushRefMutableBuilder[Self <: GitPushRef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushCorrelationId(value: String): Self = StObject.set(x, "pushCorrelationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushId(value: Double): Self = StObject.set(x, "pushId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushedBy(value: IdentityRef): Self = StObject.set(x, "pushedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: js.Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}

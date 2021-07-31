package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.enumMod.ApiKeyScope
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiKeyEntry
  extends StObject
     with ResponseEntry {
  
  var cldbid: Double
  
  var count: Double
  
  var createdAt: Double
  
  var expiresAt: Double
  
  var id: String
  
  var scope: ApiKeyScope
  
  var sid: Double
  
  var timeLeft: Double
}
object ApiKeyEntry {
  
  @scala.inline
  def apply(
    cldbid: Double,
    count: Double,
    createdAt: Double,
    expiresAt: Double,
    id: String,
    scope: ApiKeyScope,
    sid: Double,
    timeLeft: Double
  ): ApiKeyEntry = {
    val __obj = js.Dynamic.literal(cldbid = cldbid.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], timeLeft = timeLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyEntry]
  }
  
  @scala.inline
  implicit class ApiKeyEntryMutableBuilder[Self <: ApiKeyEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCldbid(value: Double): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresAt(value: Double): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: ApiKeyScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSid(value: Double): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeLeft(value: Double): Self = StObject.set(x, "timeLeft", value.asInstanceOf[js.Any])
  }
}

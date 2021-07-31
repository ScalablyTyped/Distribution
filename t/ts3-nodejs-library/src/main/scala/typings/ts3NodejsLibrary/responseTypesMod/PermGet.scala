package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermGet
  extends StObject
     with ResponseEntry {
  
  var permid: Double
  
  var permsid: String
  
  var permvalue: Double
}
object PermGet {
  
  @scala.inline
  def apply(permid: Double, permsid: String, permvalue: Double): PermGet = {
    val __obj = js.Dynamic.literal(permid = permid.asInstanceOf[js.Any], permsid = permsid.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermGet]
  }
  
  @scala.inline
  implicit class PermGetMutableBuilder[Self <: PermGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermsid(value: String): Self = StObject.set(x, "permsid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
  }
}

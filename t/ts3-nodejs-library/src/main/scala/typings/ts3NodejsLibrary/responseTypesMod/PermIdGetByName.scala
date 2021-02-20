package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermIdGetByName extends ResponseEntry {
  
  var permid: Double = js.native
  
  var permsid: String = js.native
}
object PermIdGetByName {
  
  @scala.inline
  def apply(permid: Double, permsid: String): PermIdGetByName = {
    val __obj = js.Dynamic.literal(permid = permid.asInstanceOf[js.Any], permsid = permsid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermIdGetByName]
  }
  
  @scala.inline
  implicit class PermIdGetByNameMutableBuilder[Self <: PermIdGetByName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermsid(value: String): Self = StObject.set(x, "permsid", value.asInstanceOf[js.Any])
  }
}

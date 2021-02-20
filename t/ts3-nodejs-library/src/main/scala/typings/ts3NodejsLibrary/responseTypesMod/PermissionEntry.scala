package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionEntry extends ResponseEntry {
  
  var permdesc: String = js.native
  
  var permid: Double = js.native
  
  var permname: String = js.native
}
object PermissionEntry {
  
  @scala.inline
  def apply(permdesc: String, permid: Double, permname: String): PermissionEntry = {
    val __obj = js.Dynamic.literal(permdesc = permdesc.asInstanceOf[js.Any], permid = permid.asInstanceOf[js.Any], permname = permname.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionEntry]
  }
  
  @scala.inline
  implicit class PermissionEntryMutableBuilder[Self <: PermissionEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermdesc(value: String): Self = StObject.set(x, "permdesc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermname(value: String): Self = StObject.set(x, "permname", value.asInstanceOf[js.Any])
  }
}

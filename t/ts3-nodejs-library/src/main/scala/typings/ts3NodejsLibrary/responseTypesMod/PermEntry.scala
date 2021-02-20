package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermEntry extends ResponseEntry {
  
  var permid: js.UndefOr[Double] = js.native
  
  var permnegated: Boolean = js.native
  
  var permsid: js.UndefOr[String] = js.native
  
  var permskip: Boolean = js.native
  
  var permvalue: Double = js.native
}
object PermEntry {
  
  @scala.inline
  def apply(permnegated: Boolean, permskip: Boolean, permvalue: Double): PermEntry = {
    val __obj = js.Dynamic.literal(permnegated = permnegated.asInstanceOf[js.Any], permskip = permskip.asInstanceOf[js.Any], permvalue = permvalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermEntry]
  }
  
  @scala.inline
  implicit class PermEntryMutableBuilder[Self <: PermEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermid(value: Double): Self = StObject.set(x, "permid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermidUndefined: Self = StObject.set(x, "permid", js.undefined)
    
    @scala.inline
    def setPermnegated(value: Boolean): Self = StObject.set(x, "permnegated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermsid(value: String): Self = StObject.set(x, "permsid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermsidUndefined: Self = StObject.set(x, "permsid", js.undefined)
    
    @scala.inline
    def setPermskip(value: Boolean): Self = StObject.set(x, "permskip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermvalue(value: Double): Self = StObject.set(x, "permvalue", value.asInstanceOf[js.Any])
  }
}

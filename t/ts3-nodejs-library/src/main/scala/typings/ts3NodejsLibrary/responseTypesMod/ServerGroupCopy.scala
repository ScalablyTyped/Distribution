package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerGroupCopy extends ResponseEntry {
  
  /** only available when a new group gets created */
  var sgid: js.UndefOr[String] = js.native
}
object ServerGroupCopy {
  
  @scala.inline
  def apply(): ServerGroupCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroupCopy]
  }
  
  @scala.inline
  implicit class ServerGroupCopyMutableBuilder[Self <: ServerGroupCopy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSgid(value: String): Self = StObject.set(x, "sgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSgidUndefined: Self = StObject.set(x, "sgid", js.undefined)
  }
}

package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelGroupCopy extends ResponseEntry {
  
  /** only available when a new group gets created */
  var cgid: js.UndefOr[String] = js.native
}
object ChannelGroupCopy {
  
  @scala.inline
  def apply(): ChannelGroupCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelGroupCopy]
  }
  
  @scala.inline
  implicit class ChannelGroupCopyMutableBuilder[Self <: ChannelGroupCopy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCgid(value: String): Self = StObject.set(x, "cgid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCgidUndefined: Self = StObject.set(x, "cgid", js.undefined)
  }
}

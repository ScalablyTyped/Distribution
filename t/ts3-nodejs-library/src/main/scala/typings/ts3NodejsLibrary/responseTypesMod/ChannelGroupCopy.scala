package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelGroupCopy
  extends StObject
     with ResponseEntry {
  
  /** only available when a new group gets created */
  var cgid: js.UndefOr[String] = js.undefined
}
object ChannelGroupCopy {
  
  inline def apply(): ChannelGroupCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelGroupCopy]
  }
  
  extension [Self <: ChannelGroupCopy](x: Self) {
    
    inline def setCgid(value: String): Self = StObject.set(x, "cgid", value.asInstanceOf[js.Any])
    
    inline def setCgidUndefined: Self = StObject.set(x, "cgid", js.undefined)
  }
}

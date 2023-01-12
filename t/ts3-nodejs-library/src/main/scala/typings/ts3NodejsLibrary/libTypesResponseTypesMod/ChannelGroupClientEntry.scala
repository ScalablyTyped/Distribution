package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelGroupClientEntry
  extends StObject
     with ResponseEntry {
  
  var cgid: js.UndefOr[String] = js.undefined
  
  var cid: js.UndefOr[String] = js.undefined
  
  var cldbid: js.UndefOr[String] = js.undefined
}
object ChannelGroupClientEntry {
  
  inline def apply(): ChannelGroupClientEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelGroupClientEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelGroupClientEntry] (val x: Self) extends AnyVal {
    
    inline def setCgid(value: String): Self = StObject.set(x, "cgid", value.asInstanceOf[js.Any])
    
    inline def setCgidUndefined: Self = StObject.set(x, "cgid", js.undefined)
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
    
    inline def setCldbid(value: String): Self = StObject.set(x, "cldbid", value.asInstanceOf[js.Any])
    
    inline def setCldbidUndefined: Self = StObject.set(x, "cldbid", js.undefined)
  }
}

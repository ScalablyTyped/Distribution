package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelFind
  extends StObject
     with ResponseEntry {
  
  var channelName: String
  
  var cid: String
}
object ChannelFind {
  
  inline def apply(channelName: String, cid: String): ChannelFind = {
    val __obj = js.Dynamic.literal(channelName = channelName.asInstanceOf[js.Any], cid = cid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelFind]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelFind] (val x: Self) extends AnyVal {
    
    inline def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
  }
}

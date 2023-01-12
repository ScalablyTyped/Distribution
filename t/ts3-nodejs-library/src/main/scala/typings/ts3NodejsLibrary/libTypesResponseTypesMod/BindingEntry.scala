package typings.ts3NodejsLibrary.libTypesResponseTypesMod

import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingEntry
  extends StObject
     with ResponseEntry {
  
  var ip: String
}
object BindingEntry {
  
  inline def apply(ip: String): BindingEntry = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingEntry] (val x: Self) extends AnyVal {
    
    inline def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
  }
}

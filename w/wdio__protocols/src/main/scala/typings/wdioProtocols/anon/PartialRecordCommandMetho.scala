package typings.wdioProtocols.anon

import typings.wdioProtocols.buildTypesMod.CommandEndpoint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<@wdio/protocols.@wdio/protocols/build/types.CommandMethod, @wdio/protocols.@wdio/protocols/build/types.CommandEndpoint>> */
trait PartialRecordCommandMetho extends StObject {
  
  var DELETE: js.UndefOr[CommandEndpoint] = js.undefined
  
  var GET: js.UndefOr[CommandEndpoint] = js.undefined
  
  var POST: js.UndefOr[CommandEndpoint] = js.undefined
  
  var socket: js.UndefOr[CommandEndpoint] = js.undefined
}
object PartialRecordCommandMetho {
  
  inline def apply(): PartialRecordCommandMetho = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordCommandMetho]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordCommandMetho] (val x: Self) extends AnyVal {
    
    inline def setDELETE(value: CommandEndpoint): Self = StObject.set(x, "DELETE", value.asInstanceOf[js.Any])
    
    inline def setDELETEUndefined: Self = StObject.set(x, "DELETE", js.undefined)
    
    inline def setGET(value: CommandEndpoint): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
    
    inline def setGETUndefined: Self = StObject.set(x, "GET", js.undefined)
    
    inline def setPOST(value: CommandEndpoint): Self = StObject.set(x, "POST", value.asInstanceOf[js.Any])
    
    inline def setPOSTUndefined: Self = StObject.set(x, "POST", js.undefined)
    
    inline def setSocket(value: CommandEndpoint): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    
    inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
  }
}

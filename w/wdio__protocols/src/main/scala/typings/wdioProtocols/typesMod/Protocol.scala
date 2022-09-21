package typings.wdioProtocols.typesMod

import typings.wdioProtocols.anon.RecordCommandMethodComman
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@wdio/protocols.@wdio/protocols/build/types.CommandPath, std.Record<@wdio/protocols.@wdio/protocols/build/types.CommandMethod, @wdio/protocols.@wdio/protocols/build/types.CommandEndpoint>> */
trait Protocol extends StObject {
  
  var string: RecordCommandMethodComman
}
object Protocol {
  
  inline def apply(string: RecordCommandMethodComman): Protocol = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protocol]
  }
  
  extension [Self <: Protocol](x: Self) {
    
    inline def setString(value: RecordCommandMethodComman): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}

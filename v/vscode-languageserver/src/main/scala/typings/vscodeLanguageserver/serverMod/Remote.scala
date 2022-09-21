package typings.vscodeLanguageserver.serverMod

import typings.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import typings.vscodeLanguageserverTypes.mod.LSPAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Remote
  extends StObject
     with FeatureBase {
  
  /**
    * Attach the remote to the given connection.
    *
    * @param connection The connection this remote is operating on.
    */
  def attach(connection: Connection): Unit
  
  /**
    * The connection this remote is attached to.
    */
  var connection: Connection
}
object Remote {
  
  inline def apply(
    attach: Connection => Unit,
    connection: Connection,
    fillServerCapabilities: ServerCapabilities[LSPAny] => Unit,
    initialize: ClientCapabilities => Unit
  ): Remote = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), connection = connection.asInstanceOf[js.Any], fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), initialize = js.Any.fromFunction1(initialize))
    __obj.asInstanceOf[Remote]
  }
  
  extension [Self <: Remote](x: Self) {
    
    inline def setAttach(value: Connection => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
  }
}

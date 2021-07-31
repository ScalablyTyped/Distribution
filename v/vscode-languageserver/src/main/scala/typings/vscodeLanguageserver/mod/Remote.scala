package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserverProtocol.protocolMod.ClientCapabilities
import typings.vscodeLanguageserverProtocol.protocolMod.ServerCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  */
trait Remote extends StObject {
  
  /**
    * Attach the remote to the given connection.
    *
    * @param connection The connection this remote is operating on.
    */
  def attach(connection: IConnection): Unit
  
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection
  
  /**
    * Called to fill in the server capabilities this feature implements.
    *
    * @param capabilities The server capabilities to fill.
    */
  def fillServerCapabilities(capabilities: ServerCapabilities[js.Any]): Unit
  
  /**
    * Called to initialize the remote with the given
    * client capabilities
    *
    * @param capabilities The client capabilities
    */
  def initialize(capabilities: ClientCapabilities): Unit
}
object Remote {
  
  @scala.inline
  def apply(
    attach: IConnection => Unit,
    connection: IConnection,
    fillServerCapabilities: ServerCapabilities[js.Any] => Unit,
    initialize: ClientCapabilities => Unit
  ): Remote = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction1(attach), connection = connection.asInstanceOf[js.Any], fillServerCapabilities = js.Any.fromFunction1(fillServerCapabilities), initialize = js.Any.fromFunction1(initialize))
    __obj.asInstanceOf[Remote]
  }
  
  @scala.inline
  implicit class RemoteMutableBuilder[Self <: Remote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttach(value: IConnection => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction1(value))
    
    @scala.inline
    def setConnection(value: IConnection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillServerCapabilities(value: ServerCapabilities[js.Any] => Unit): Self = StObject.set(x, "fillServerCapabilities", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitialize(value: ClientCapabilities => Unit): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
  }
}

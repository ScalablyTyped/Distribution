package typings
package vscodeDashLanguageserverLib.libMainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Remote extends js.Object {
  /**
    * The connection this remote is attached to.
    */
  var connection: IConnection
  /**
    * Attach the remote to the given connection.
    *
    * @param connection The connection this remote is operating on.
    */
  def attach(connection: IConnection): scala.Unit
  /**
    * Called to fill in the server capabilities this feature implements.
    *
    * @param capabilities The server capabilities to fill.
    */
  def fillServerCapabilities(capabilities: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ServerCapabilities): scala.Unit
  /**
    * Called to initialize the remote with the given
    * client capabilities
    *
    * @param capabilities The client capabilities
    */
  def initialize(capabilities: vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ClientCapabilities): scala.Unit
}

object Remote {
  @scala.inline
  def apply(
    attach: js.Function1[IConnection, scala.Unit],
    connection: IConnection,
    fillServerCapabilities: js.Function1[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ServerCapabilities, 
      scala.Unit
    ],
    initialize: js.Function1[
      vscodeDashLanguageserverDashProtocolLib.libProtocolMod.ClientCapabilities, 
      scala.Unit
    ]
  ): Remote = {
    val __obj = js.Dynamic.literal(attach = attach, connection = connection, fillServerCapabilities = fillServerCapabilities, initialize = initialize)
  
    __obj.asInstanceOf[Remote]
  }
}


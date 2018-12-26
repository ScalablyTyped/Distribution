package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ErrorHandler extends js.Object {
  /**
       * The connection to the server got closed.
       */
  def closed(): CloseAction
  /**
       * An error has occurred while writing or reading from the connection.
       *
       * @param error - the error received
       * @param message - the message to be delivered to the server if know.
       * @param count - a count indicating how often an error is received. Will
       *  be reset if a message got successfully send or received.
       */
  def error(error: nodeLib.Error, message: vscodeDashJsonrpcLib.libMessagesMod.Message, count: scala.Double): ErrorAction
}


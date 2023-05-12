package typings.vscodeLanguageclient.libCommonClientMod

import typings.vscodeJsonrpc.libCommonMessagesMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorHandler extends StObject {
  
  /**
    * The connection to the server got closed.
    */
  def closed(): CloseHandlerResult | js.Promise[CloseHandlerResult] = js.native
  
  /**
    * An error has occurred while writing or reading from the connection.
    *
    * @param error - the error received
    * @param message - the message to be delivered to the server if know.
    * @param count - a count indicating how often an error is received. Will
    *  be reset if a message got successfully send or received.
    */
  def error(error: js.Error): ErrorHandlerResult | js.Promise[ErrorHandlerResult] = js.native
  def error(error: js.Error, message: Unit, count: Double): ErrorHandlerResult | js.Promise[ErrorHandlerResult] = js.native
  def error(error: js.Error, message: Message): ErrorHandlerResult | js.Promise[ErrorHandlerResult] = js.native
  def error(error: js.Error, message: Message, count: Double): ErrorHandlerResult | js.Promise[ErrorHandlerResult] = js.native
}

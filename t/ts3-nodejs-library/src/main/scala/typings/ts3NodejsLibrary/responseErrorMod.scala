package typings.ts3NodejsLibrary

import typings.std.Error
import typings.ts3NodejsLibrary.commandMod.Command
import typings.ts3NodejsLibrary.responseTypesMod.QueryErrorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/exception/ResponseError", JSImport.Namespace)
@js.native
object responseErrorMod extends js.Object {
  @js.native
  class ResponseError protected ()
    extends Error
       with QueryErrorMessage {
    def this(error: QueryErrorMessage, source: Command) = this()
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var msg: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    val source: Command = js.native
    /**
      * returns a json encodeable object for this error
      */
    def toJSON(): AnonExtramsg = js.native
  }
  
}


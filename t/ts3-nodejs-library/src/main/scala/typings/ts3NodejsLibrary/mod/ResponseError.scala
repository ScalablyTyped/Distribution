package typings.ts3NodejsLibrary.mod

import typings.ts3NodejsLibrary.commandMod.Command
import typings.ts3NodejsLibrary.responseTypesMod.QueryErrorMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib", "ResponseError")
@js.native
class ResponseError protected ()
  extends typings.ts3NodejsLibrary.responseErrorMod.ResponseError {
  def this(error: QueryErrorMessage, source: Command) = this()
}


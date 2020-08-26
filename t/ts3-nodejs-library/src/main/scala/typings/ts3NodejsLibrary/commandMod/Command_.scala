package typings.ts3NodejsLibrary.commandMod

import typings.std.Record
import typings.ts3NodejsLibrary.commandMod.Command.ParserCallback
import typings.ts3NodejsLibrary.commandMod.Command.flags
import typings.ts3NodejsLibrary.commandMod.Command.multiOpts
import typings.ts3NodejsLibrary.commandMod.Command.options
import typings.ts3NodejsLibrary.responseErrorMod.ResponseError
import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/transport/Command", "Command")
@js.native
class Command_ () extends js.Object {
  var cmd: js.Any = js.native
  var error: js.Any = js.native
  var flags: js.Any = js.native
  var multiOpts: js.Any = js.native
  var options: js.Any = js.native
  var requestParser: js.Any = js.native
  var response: js.Any = js.native
  var responseParser: js.Any = js.native
  var stack: js.Any = js.native
  /** runs the parser of this instance */
  def build(): String = js.native
  /** builds the query string for flags */
  def buildFlags(): String = js.native
  /** builds the query string for options */
  def buildOption(options: Record[String, _]): String = js.native
  /**
    * builds the query string for options
    * @return the parsed String which is readable by the TeamSpeak Querytt
    */
  def buildOptions(): String = js.native
  /** get the parsed error object which has been received from the TeamSpeak Query */
  def getError(): ResponseError | Null = js.native
  /** get the parsed response object which has been received from the TeamSpeak Query */
  def getResponse(): Response = js.native
  /** checks if a error has been received */
  def hasError(): Boolean = js.native
  /** checks wether there are flags used with this command */
  def hasFlags(): Boolean = js.native
  /** checks wether there are options used with this command */
  def hasMultiOptions(): Boolean = js.native
  /** checks wether there are options used with this command */
  def hasOptions(): Boolean = js.native
  /** runs the parser of this instance */
  def parse(raw: String): Response = js.native
  /** Initializes the Respone with default values */
  def reset(): Command = js.native
  /** Sets the main command to send */
  def setCommand(cmd: String): Command = js.native
  /**
    * Set the error line which has been received from the TeamSpeak Query
    * @param error the error line which has been received from the TeamSpeak Query
    */
  def setError(error: String): Command = js.native
  /**
    * set TeamSpeak flags
    * @param flags sets the flags which should get sent to the teamspeak query
    */
  def setFlags(flags: flags): Command = js.native
  /**
    * Sets the TeamSpeak Key Value Pairs
    * @param opts sets the Object with the key value pairs which should get sent to the TeamSpeak Query
    */
  def setMultiOptions(options: multiOpts): Command = js.native
  /**
    * Sets the TeamSpeak Key Value Pairs
    * @param opts sets the Object with the key value pairs which should get sent to the TeamSpeak Query
    */
  def setOptions(options: options): Command = js.native
  /**
    * adds a customparser
    * @param parsers
    */
  def setParser(parsers: ParserCallback): this.type = js.native
  /**
    * set the Line which has been received from the TeamSpeak Query
    * @param line the line which has been received from the teamSpeak query
    */
  def setResponse(line: String): Command = js.native
}


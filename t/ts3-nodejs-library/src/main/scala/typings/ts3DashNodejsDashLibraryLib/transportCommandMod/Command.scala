package typings
package ts3DashNodejsDashLibraryLib.transportCommandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Command extends js.Object {
  /**
    * Checks if a error has been received
    * @version 1.0
    * @returns the parsed String which is readable by the TeamSpeak Query
    */
  def build(): java.lang.String
  /**
    * Get the Parsed Error Object which has been received from the TeamSpeak Query
    * @returns the Parsed Error Object
    */
  def getError(): js.Any
  /**
    * Get the Parsed Response Object which has been received from the TeamSpeak Query
    * @returns the Parsed Response Object
    */
  def getResponse(): js.Any
  /**
    * Checks if a error has been received
    * @returns true when a error has been received
    */
  def hasError(): scala.Boolean
  /**
    * Checks wether there are flags used with this command
    */
  def hasFlags(): scala.Boolean
  /**
    * Checks wether there are options used with this command
    */
  def hasMultiOptions(): scala.Boolean
  /**
    * Checks wether there are options used with this command
    */
  def hasOptions(): scala.Boolean
  /**
    * Initializes the Respone with default values
    */
  def reset(): this.type
  /**
    * Sets the main command to send
    * @param - Sets the command which will be sent to the TeamSpeak Query
    */
  def setCommand(cmd: java.lang.String): this.type
  /**
    * Set the error line which has been received from the TeamSpeak Query
    * @param - The error Line which has been received from the TeamSpeak Query
    */
  def setError(error: java.lang.String): this.type
  /**
    * Set TeamSpeak Flags
    * @param - Sets the Flags which should get sent to the TeamSpeak Query
    */
  def setFlags(flags: js.Any): this.type
  /**
    * Sets the TeamSpeak Key Value Pairs
    * @param - Sets the Object with the key value pairs which should get sent to the TeamSpeak Query
    */
  def setMultiOptions(opts: js.Array[js.Any]): this.type
  /**
    * Sets the TeamSpeak Key Value Pairs
    * @param - Sets the Object with the key value pairs which should get sent to the TeamSpeak Query
    */
  def setOptions(opts: js.Any): this.type
  /**
    * Set the Line which has been received from the TeamSpeak Query
    * @param - The Line which has been received from the TeamSpeak Query
    */
  def setResponse(line: java.lang.String): this.type
}

object Command {
  @scala.inline
  def apply(
    build: () => java.lang.String,
    getError: () => js.Any,
    getResponse: () => js.Any,
    hasError: () => scala.Boolean,
    hasFlags: () => scala.Boolean,
    hasMultiOptions: () => scala.Boolean,
    hasOptions: () => scala.Boolean,
    reset: () => Command,
    setCommand: java.lang.String => Command,
    setError: java.lang.String => Command,
    setFlags: js.Any => Command,
    setMultiOptions: js.Array[js.Any] => Command,
    setOptions: js.Any => Command,
    setResponse: java.lang.String => Command
  ): Command = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), getError = js.Any.fromFunction0(getError), getResponse = js.Any.fromFunction0(getResponse), hasError = js.Any.fromFunction0(hasError), hasFlags = js.Any.fromFunction0(hasFlags), hasMultiOptions = js.Any.fromFunction0(hasMultiOptions), hasOptions = js.Any.fromFunction0(hasOptions), reset = js.Any.fromFunction0(reset), setCommand = js.Any.fromFunction1(setCommand), setError = js.Any.fromFunction1(setError), setFlags = js.Any.fromFunction1(setFlags), setMultiOptions = js.Any.fromFunction1(setMultiOptions), setOptions = js.Any.fromFunction1(setOptions), setResponse = js.Any.fromFunction1(setResponse))
  
    __obj.asInstanceOf[Command]
  }
}


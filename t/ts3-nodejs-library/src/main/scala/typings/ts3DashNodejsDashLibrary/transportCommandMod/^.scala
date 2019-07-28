package typings.ts3DashNodejsDashLibrary.transportCommandMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/transport/Command", JSImport.Namespace)
@js.native
class ^ () extends Command {
  /**
    * Checks if a error has been received
    * @version 1.0
    * @returns the parsed String which is readable by the TeamSpeak Query
    */
  /* CompleteClass */
  override def build(): String = js.native
  /**
    * Get the Parsed Error Object which has been received from the TeamSpeak Query
    * @returns the Parsed Error Object
    */
  /* CompleteClass */
  override def getError(): js.Any = js.native
  /**
    * Get the Parsed Response Object which has been received from the TeamSpeak Query
    * @returns the Parsed Response Object
    */
  /* CompleteClass */
  override def getResponse(): js.Any = js.native
  /**
    * Checks if a error has been received
    * @returns true when a error has been received
    */
  /* CompleteClass */
  override def hasError(): Boolean = js.native
  /**
    * Checks wether there are flags used with this command
    */
  /* CompleteClass */
  override def hasFlags(): Boolean = js.native
  /**
    * Checks wether there are options used with this command
    */
  /* CompleteClass */
  override def hasMultiOptions(): Boolean = js.native
  /**
    * Checks wether there are options used with this command
    */
  /* CompleteClass */
  override def hasOptions(): Boolean = js.native
  /**
    * Initializes the Respone with default values
    */
  /* CompleteClass */
  override def reset(): this.type = js.native
  /**
    * Sets the main command to send
    * @param - Sets the command which will be sent to the TeamSpeak Query
    */
  /* CompleteClass */
  override def setCommand(cmd: String): this.type = js.native
  /**
    * Set the error line which has been received from the TeamSpeak Query
    * @param - The error Line which has been received from the TeamSpeak Query
    */
  /* CompleteClass */
  override def setError(error: String): this.type = js.native
  /**
    * Set TeamSpeak Flags
    * @param - Sets the Flags which should get sent to the TeamSpeak Query
    */
  /* CompleteClass */
  override def setFlags(flags: js.Any): this.type = js.native
  /**
    * Sets the TeamSpeak Key Value Pairs
    * @param - Sets the Object with the key value pairs which should get sent to the TeamSpeak Query
    */
  /* CompleteClass */
  override def setMultiOptions(opts: js.Array[js.Any]): this.type = js.native
  /**
    * Sets the TeamSpeak Key Value Pairs
    * @param - Sets the Object with the key value pairs which should get sent to the TeamSpeak Query
    */
  /* CompleteClass */
  override def setOptions(opts: js.Any): this.type = js.native
  /**
    * Set the Line which has been received from the TeamSpeak Query
    * @param - The Line which has been received from the TeamSpeak Query
    */
  /* CompleteClass */
  override def setResponse(line: String): this.type = js.native
}

@JSImport("ts3-nodejs-library/transport/Command", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Parses a Query Response
    * @param - The Line which has been received
    * @returns the parsed Data
    */
  def parse(data: String): js.Any = js.native
  /**
    * Parses a value to the type which the key represents
    * @param - The Key which should get looked up
    * @param - The value which should get parsed
    * @returns the parsed Data
    */
  def parseValue(k: String, v: js.Any): js.Any = js.native
}


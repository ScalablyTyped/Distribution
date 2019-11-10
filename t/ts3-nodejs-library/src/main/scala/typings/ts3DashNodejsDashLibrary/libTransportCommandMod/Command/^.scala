package typings.ts3DashNodejsDashLibrary.libTransportCommandMod.Command

import org.scalablytyped.runtime.StringDictionary
import typings.std.Partial
import typings.std.Pick
import typings.std.Record
import typings.ts3DashNodejsDashLibrary.Anon_Key
import typings.ts3DashNodejsDashLibrary.libTypesQueryResponseMod.QueryResponseTypes
import typings.ts3DashNodejsDashLibrary.ts3DashNodejsDashLibraryStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ts3-nodejs-library/lib/transport/Command", "Command")
@js.native
object ^ extends js.Object {
  /**
    * Checks if a error has been received
    * @return The parsed String which is readable by the TeamSpeak Query
    */
  def build(command: typings.ts3DashNodejsDashLibrary.libTransportCommandMod.Command): String = js.native
  /**
    * the custom snapshot request parser
    * @param data snapshot string
    * @param cmd command object
    */
  def buildSnapshotDeploy(data: String, cmd: typings.ts3DashNodejsDashLibrary.libTransportCommandMod.Command): String = js.native
  /** escapes a string */
  def escape(str: String): String = js.native
  /**
    * escapes a key value pair
    * @param {string} key the key used
    * @param {string|string[]} value the value or an array of values
    * @return the parsed String which is readable by the TeamSpeak Query
    */
  def escapeKeyValue(key: String, value: String): String = js.native
  def escapeKeyValue(key: String, value: js.Array[String]): String = js.native
  /**
    * retrieves the default parsers
    */
  def getParsers(): Parsers = js.native
  /**
    * merges two objects into each other, if one key does not exist in target
    * which exists in source then target gets this key added
    * @param target object which gets keys from source
    * @param source the additional keys which get added to target
    */
  def mergeObjects(target: Record[String, _], source: Record[String, _]): StringDictionary[js.Any] = js.native
  /**
    * parses a number
    * @param value string to parse
    */
  def parseNumber(value: String): Double = js.native
  /**
    * parses a number array
    * @param value string to parse
    */
  def parseNumberArray(value: String): js.Array[Double] = js.native
  def parseRecursive(value: String): js.Array[Partial[Partial[QueryResponseTypes]]] = js.native
  /**
    *
    * @param param0 the custom snapshot response parser
    */
  @JSName("parseSnapshotCreate")
  def parseSnapshotCreate_raw(hasRaw: Pick[ParserArgument, raw]): js.Array[Partial[Partial[QueryResponseTypes]]] = js.native
  /**
    * parses a string value
    * @param value string to parse
    */
  def parseString(value: String): String = js.native
  /**
    * parses a string array
    * @param value string to parse
    */
  def parseStringArray(value: String): js.Array[String] = js.native
  def parseValue(k: String): js.Any = js.native
  /**
    * Parses a value to the type which the key represents
    * @param k the key which should get looked up
    * @param v the value which should get parsed
    */
  def parseValue(k: String, v: String): js.Any = js.native
  /**
    * parses a query response
    * @param data the query response received
    */
  @JSName("parse")
  def parse_raw(hasRaw: Pick[ParserArgument, raw]): js.Array[Partial[Partial[QueryResponseTypes]]] = js.native
  /** unescapes a string */
  def unescape(str: String): String = js.native
  /**
    * unescapes a key value pair
    * @param str the key value pair to unescape eg foo=bar
    */
  def unescapeKeyValue(str: String): Anon_Key = js.native
}


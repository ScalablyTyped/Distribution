package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.Instantiable0
import typings.ts3NodejsLibrary.libTransportCommandMod.Command
import typings.ts3NodejsLibrary.libTransportCommandMod.Command.Parsers
import typings.ts3NodejsLibrary.libTransportTeamSpeakQueryMod.TeamSpeakQuery.Response
import typings.ts3NodejsLibrary.libTypesResponseTypesMod.Version
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable
  extends StObject
     with Instantiable0[Command] {
  
  val Identifier: Apikey = js.native
  
  var SNAKE_CASE_IDENTIFIER: String = js.native
  
  /**
    * Checks if a error has been received
    * @return The parsed String which is readable by the TeamSpeak Query
    */
  def build(command: Command): String = js.native
  
  /**
    * the custom snapshot request parser
    * @param data snapshot string
    * @param cmd command object
    */
  def buildSnapshotDeploy(data: String, cmd: Command, hasVersion: Version): String = js.native
  def buildSnapshotDeploy(data: String, cmd: Command, hasVersion: Version, snapshotVersion: String): String = js.native
  
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
  def escapeKeyValue(key: String, value: Boolean): String = js.native
  
  /**
    * retrieves the key value pair from a string
    * @param str the key value pair to unescape eg foo=bar
    */
  def getKeyValue(str: String): Key = js.native
  
  /**
    * retrieves the default parsers
    */
  def getParsers(): Parsers = js.native
  
  /**
    * checks if a version string has a minimum of x
    * @param minimum minimum the version string should have
    * @param version version string to compare
    */
  def minVersion(minimum: String, version: String): Boolean = js.native
  
  /**
    * parses a query response
    * @param data the query response received
    */
  def parse(hasRaw: PickParserArgumentraw): Response = js.native
  
  /**
    * parses a number
    * @param value string to parse
    */
  def parseBoolean(value: String): Boolean = js.native
  
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
  
  def parseRecursive(value: String): Response = js.native
  
  /**
    * parses a snapshot create request
    * @param param0 the custom snapshot response parser
    */
  def parseSnapshotCreate(hasRaw: PickParserArgumentraw): Response = js.native
  
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
  
  /**
    * Parses a value to the type which the key represents
    * @param k the key which should get looked up
    * @param v the value which should get parsed
    */
  def parseValue(k: String): Any = js.native
  def parseValue(k: String, v: String): Any = js.native
  
  /** converts a string to camel case */
  def toCamelCase(str: String): String = js.native
  
  /** converts a string to snake case */
  def toSnakeCase(str: String): String = js.native
  
  /** unescapes a string */
  def unescape(str: String): String = js.native
}

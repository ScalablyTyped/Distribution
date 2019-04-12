package typings
package uaDashParserDashJsLib.uaDashParserDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ua-parser-js", "UAParser")
@js.native
/**
  * Create a new parser with UA prepopulated and extensions extended
  */
class UAParser () extends js.Object {
  def this(uastring: java.lang.String) = this()
  def this(uastring: java.lang.String, extensions: js.Any) = this()
  /**
    *  Returns browser information
    */
  def getBrowser(): uaDashParserDashJsLib.IUAParserNs.IBrowser = js.native
  /**
    *  Returns parsed CPU information
    */
  def getCPU(): uaDashParserDashJsLib.IUAParserNs.ICPU = js.native
  /**
    *  Returns device information
    */
  def getDevice(): uaDashParserDashJsLib.IUAParserNs.IDevice = js.native
  /**
    *  Returns browsers engine information
    */
  def getEngine(): uaDashParserDashJsLib.IUAParserNs.IEngine = js.native
  /**
    *  Returns OS information
    */
  def getOS(): uaDashParserDashJsLib.IUAParserNs.IOS = js.native
  /**
    *  Returns parse result
    */
  def getResult(): uaDashParserDashJsLib.IUAParserNs.IResult = js.native
  /**
    *  Returns UA string of current instance
    */
  def getUA(): java.lang.String = js.native
  /**
    *  Set & parse UA string
    */
  def setUA(uastring: java.lang.String): UAParser = js.native
}

/* static members */
@JSImport("ua-parser-js", "UAParser")
@js.native
object UAParser extends js.Object {
  var BROWSER: uaDashParserDashJsLib.IUAParserNs.BROWSER = js.native
  var CPU: uaDashParserDashJsLib.IUAParserNs.CPU = js.native
  var DEVICE: uaDashParserDashJsLib.IUAParserNs.DEVICE = js.native
  var ENGINE: uaDashParserDashJsLib.IUAParserNs.ENGINE = js.native
  var OS: uaDashParserDashJsLib.IUAParserNs.OS = js.native
  var VERSION: java.lang.String = js.native
}


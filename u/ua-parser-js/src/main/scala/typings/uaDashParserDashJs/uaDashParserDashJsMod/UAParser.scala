package typings.uaDashParserDashJs.uaDashParserDashJsMod

import typings.uaDashParserDashJs.IUAParserNs.IBrowser
import typings.uaDashParserDashJs.IUAParserNs.ICPU
import typings.uaDashParserDashJs.IUAParserNs.IDevice
import typings.uaDashParserDashJs.IUAParserNs.IEngine
import typings.uaDashParserDashJs.IUAParserNs.IOS
import typings.uaDashParserDashJs.IUAParserNs.IResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ua-parser-js", "UAParser")
@js.native
/**
  * Create a new parser with UA prepopulated and extensions extended
  */
class UAParser () extends js.Object {
  def this(uastring: String) = this()
  def this(uastring: String, extensions: js.Any) = this()
  /**
    *  Returns browser information
    */
  def getBrowser(): IBrowser = js.native
  /**
    *  Returns parsed CPU information
    */
  def getCPU(): ICPU = js.native
  /**
    *  Returns device information
    */
  def getDevice(): IDevice = js.native
  /**
    *  Returns browsers engine information
    */
  def getEngine(): IEngine = js.native
  /**
    *  Returns OS information
    */
  def getOS(): IOS = js.native
  /**
    *  Returns parse result
    */
  def getResult(): IResult = js.native
  /**
    *  Returns UA string of current instance
    */
  def getUA(): String = js.native
  /**
    *  Set & parse UA string
    */
  def setUA(uastring: String): UAParser = js.native
}

/* static members */
@JSImport("ua-parser-js", "UAParser")
@js.native
object UAParser extends js.Object {
  var BROWSER: typings.uaDashParserDashJs.IUAParserNs.BROWSER = js.native
  var CPU: typings.uaDashParserDashJs.IUAParserNs.CPU = js.native
  var DEVICE: typings.uaDashParserDashJs.IUAParserNs.DEVICE = js.native
  var ENGINE: typings.uaDashParserDashJs.IUAParserNs.ENGINE = js.native
  var OS: typings.uaDashParserDashJs.IUAParserNs.OS = js.native
  var VERSION: String = js.native
}


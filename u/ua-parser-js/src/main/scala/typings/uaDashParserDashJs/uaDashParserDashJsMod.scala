package typings.uaDashParserDashJs

import typings.uaDashParserDashJs.IUAParser.IBrowser
import typings.uaDashParserDashJs.IUAParser.ICPU
import typings.uaDashParserDashJs.IUAParser.IDevice
import typings.uaDashParserDashJs.IUAParser.IEngine
import typings.uaDashParserDashJs.IUAParser.IOS
import typings.uaDashParserDashJs.IUAParser.IResult
import typings.uaDashParserDashJs.uaDashParserDashJsMod.UAParser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ua-parser-js", JSImport.Namespace)
@js.native
object uaDashParserDashJsMod extends js.Object {
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
  @js.native
  object UAParser extends js.Object {
    var BROWSER: typings.uaDashParserDashJs.IUAParser.BROWSER = js.native
    var CPU: typings.uaDashParserDashJs.IUAParser.CPU = js.native
    var DEVICE: typings.uaDashParserDashJs.IUAParser.DEVICE = js.native
    var ENGINE: typings.uaDashParserDashJs.IUAParser.ENGINE = js.native
    var OS: typings.uaDashParserDashJs.IUAParser.OS = js.native
    var VERSION: String = js.native
  }
  
}


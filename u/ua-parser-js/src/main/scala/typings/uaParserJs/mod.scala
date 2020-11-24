package typings.uaParserJs

import typings.uaParserJs.IUAParser.IBrowser
import typings.uaParserJs.IUAParser.ICPU
import typings.uaParserJs.IUAParser.IDevice
import typings.uaParserJs.IUAParser.IEngine
import typings.uaParserJs.IUAParser.IOS
import typings.uaParserJs.IUAParser.IResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ua-parser-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  /**
    * Create a new parser with UA prepopulated and extensions extended
    */
  class UAParser () extends js.Object {
    def this(uastring: String) = this()
    def this(uastring: js.UndefOr[scala.Nothing], extensions: js.Any) = this()
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
    
    var BROWSER: typings.uaParserJs.IUAParser.BROWSER = js.native
    
    var CPU: typings.uaParserJs.IUAParser.CPU = js.native
    
    var DEVICE: typings.uaParserJs.IUAParser.DEVICE = js.native
    
    var ENGINE: typings.uaParserJs.IUAParser.ENGINE = js.native
    
    var OS: typings.uaParserJs.IUAParser.OS = js.native
    
    var VERSION: String = js.native
  }
}

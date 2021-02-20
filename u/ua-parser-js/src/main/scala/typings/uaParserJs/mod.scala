package typings.uaParserJs

import typings.uaParserJs.IUAParser.BROWSER
import typings.uaParserJs.IUAParser.CPU
import typings.uaParserJs.IUAParser.DEVICE
import typings.uaParserJs.IUAParser.ENGINE
import typings.uaParserJs.IUAParser.IBrowser
import typings.uaParserJs.IUAParser.ICPU
import typings.uaParserJs.IUAParser.IDevice
import typings.uaParserJs.IUAParser.IEngine
import typings.uaParserJs.IUAParser.IOS
import typings.uaParserJs.IUAParser.IResult
import typings.uaParserJs.IUAParser.OS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ua-parser-js", "UAParser")
  @js.native
  /**
    * Create a new parser with UA prepopulated and extensions extended
    */
  class UAParser () extends StObject {
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
  object UAParser {
    
    @JSImport("ua-parser-js", "UAParser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ua-parser-js", "UAParser.BROWSER")
    @js.native
    def BROWSER: typings.uaParserJs.IUAParser.BROWSER = js.native
    @scala.inline
    def BROWSER_=(x: BROWSER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BROWSER")(x.asInstanceOf[js.Any])
    
    @JSImport("ua-parser-js", "UAParser.CPU")
    @js.native
    def CPU: typings.uaParserJs.IUAParser.CPU = js.native
    @scala.inline
    def CPU_=(x: CPU): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CPU")(x.asInstanceOf[js.Any])
    
    @JSImport("ua-parser-js", "UAParser.DEVICE")
    @js.native
    def DEVICE: typings.uaParserJs.IUAParser.DEVICE = js.native
    @scala.inline
    def DEVICE_=(x: DEVICE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEVICE")(x.asInstanceOf[js.Any])
    
    @JSImport("ua-parser-js", "UAParser.ENGINE")
    @js.native
    def ENGINE: typings.uaParserJs.IUAParser.ENGINE = js.native
    @scala.inline
    def ENGINE_=(x: ENGINE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENGINE")(x.asInstanceOf[js.Any])
    
    @JSImport("ua-parser-js", "UAParser.OS")
    @js.native
    def OS: typings.uaParserJs.IUAParser.OS = js.native
    @scala.inline
    def OS_=(x: OS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
    
    @JSImport("ua-parser-js", "UAParser.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
}

package typings.uaParserJs

import typings.std.Record
import typings.uaParserJs.anon.TypeofuaParserJs
import typings.uaParserJs.mod.BROWSER
import typings.uaParserJs.mod.CPU
import typings.uaParserJs.mod.DEVICE
import typings.uaParserJs.mod.ENGINE
import typings.uaParserJs.mod.IBrowser
import typings.uaParserJs.mod.ICPU
import typings.uaParserJs.mod.IDevice
import typings.uaParserJs.mod.IEngine
import typings.uaParserJs.mod.IOS
import typings.uaParserJs.mod.IResult
import typings.uaParserJs.mod.OS
import typings.uaParserJs.mod.UAParserInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object UAParser {
    
    inline def apply(): IResult = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[IResult]
    inline def apply(extensions: Record[String, Any]): IResult = ^.asInstanceOf[js.Dynamic].apply(extensions.asInstanceOf[js.Any]).asInstanceOf[IResult]
    inline def apply(uastring: String): IResult = ^.asInstanceOf[js.Dynamic].apply(uastring.asInstanceOf[js.Any]).asInstanceOf[IResult]
    inline def apply(uastring: String, extensions: Record[String, Any]): IResult = (^.asInstanceOf[js.Dynamic].apply(uastring.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[IResult]
    inline def apply(uastring: Unit, extensions: Record[String, Any]): IResult = (^.asInstanceOf[js.Dynamic].apply(uastring.asInstanceOf[js.Any], extensions.asInstanceOf[js.Any])).asInstanceOf[IResult]
    
    @JSGlobal("UAParser")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("UAParser.BROWSER")
    @js.native
    def BROWSER: typings.uaParserJs.mod.BROWSER = js.native
    inline def BROWSER_=(x: BROWSER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BROWSER")(x.asInstanceOf[js.Any])
    
    @JSGlobal("UAParser.CPU")
    @js.native
    def CPU: typings.uaParserJs.mod.CPU = js.native
    inline def CPU_=(x: CPU): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CPU")(x.asInstanceOf[js.Any])
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("UAParser")
    @js.native
    /**
      * Create a new parser with UA prepopulated and extensions extended
      */
    open class Class ()
      extends StObject
         with UAParserInstance {
      def this(extensions: Record[String, Any]) = this()
      def this(uastring: String) = this()
      def this(uastring: String, extensions: Record[String, Any]) = this()
      def this(uastring: Unit, extensions: Record[String, Any]) = this()
      
      /**
        *  Returns browser information
        */
      /* CompleteClass */
      override def getBrowser(): IBrowser = js.native
      
      /**
        *  Returns parsed CPU information
        */
      /* CompleteClass */
      override def getCPU(): ICPU = js.native
      
      /**
        *  Returns device information
        */
      /* CompleteClass */
      override def getDevice(): IDevice = js.native
      
      /**
        *  Returns browsers engine information
        */
      /* CompleteClass */
      override def getEngine(): IEngine = js.native
      
      /**
        *  Returns OS information
        */
      /* CompleteClass */
      override def getOS(): IOS = js.native
      
      /**
        *  Returns parse result
        */
      /* CompleteClass */
      override def getResult(): IResult = js.native
      
      /**
        *  Returns UA string of current instance
        */
      /* CompleteClass */
      override def getUA(): String = js.native
      
      /**
        *  Set & parse UA string
        */
      /* CompleteClass */
      override def setUA(uastring: String): UAParserInstance = js.native
    }
    
    @JSGlobal("UAParser.DEVICE")
    @js.native
    def DEVICE: typings.uaParserJs.mod.DEVICE = js.native
    inline def DEVICE_=(x: DEVICE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEVICE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("UAParser.ENGINE")
    @js.native
    def ENGINE: typings.uaParserJs.mod.ENGINE = js.native
    inline def ENGINE_=(x: ENGINE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENGINE")(x.asInstanceOf[js.Any])
    
    @JSGlobal("UAParser.OS")
    @js.native
    def OS: typings.uaParserJs.mod.OS = js.native
    inline def OS_=(x: OS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
    
    // alias for older syntax
    @JSGlobal("UAParser.UAParser")
    @js.native
    def UAParser: TypeofuaParserJs = js.native
    inline def UAParser_=(x: TypeofuaParserJs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UAParser")(x.asInstanceOf[js.Any])
    
    @JSGlobal("UAParser.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
}

package typings.wdioConfig

import typings.wdioConfig.anon.After
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configParserMod {
  
  @JSImport("@wdio/config/build/lib/ConfigParser", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ConfigParser
  /* static members */
  object default {
    
    @JSImport("@wdio/config/build/lib/ConfigParser", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getFilePaths(patterns: js.Any, omitWarnings: js.Any): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  }
  
  @js.native
  trait ConfigParser extends StObject {
    
    var _capabilities: js.Array[js.Any] = js.native
    
    var _config: After = js.native
    
    def addConfigFile(filename: String): Unit = js.native
    
    def addService(service: js.Object): Unit = js.native
    
    def getCapabilities(i: js.Any): js.Any = js.native
    
    def getConfig(): After = js.native
    
    def getSpecs(capSpecs: js.Any, capExclude: js.Any): js.Array[String] = js.native
    
    def merge(): Unit = js.native
    def merge(`object`: js.Object): Unit = js.native
    
    def setFilePathToFilterOptions(cliArgFileList: String, config: js.Object): js.Array[String] = js.native
  }
}

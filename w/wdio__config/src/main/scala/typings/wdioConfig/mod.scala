package typings.wdioConfig

import typings.wdioConfig.anon.OmitTestrunnercapabilitie
import typings.wdioConfig.anon.PartialTestrunnerOptionsW
import typings.wdioConfig.buildLibConfigParserMod.Spec
import typings.wdioConfig.buildLibConfigParserMod.default
import typings.wdioConfig.buildTypesMod.ModuleImportService
import typings.wdioConfig.buildTypesMod.PathService
import typings.wdioTypes.buildCapabilitiesMod.Capabilities
import typings.wdioTypes.buildOptionsMod.Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wdio/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wdio/config", "ConfigParser")
  @js.native
  open class ConfigParser protected () extends default {
    def this(configFilePath: String) = this()
    def this(
      configFilePath: String,
      /**
      * config options parsed in via CLI arguments and applied before
      * trying to compile config file
      */
    _initialConfig: PartialTestrunnerOptionsW
    ) = this()
    def this(
      configFilePath: String,
      /**
      * config options parsed in via CLI arguments and applied before
      * trying to compile config file
      */
    _initialConfig: Unit,
      _pathService: PathService
    ) = this()
    def this(
      configFilePath: String,
      /**
      * config options parsed in via CLI arguments and applied before
      * trying to compile config file
      */
    _initialConfig: PartialTestrunnerOptionsW,
      _pathService: PathService
    ) = this()
    def this(
      configFilePath: String,
      /**
      * config options parsed in via CLI arguments and applied before
      * trying to compile config file
      */
    _initialConfig: Unit,
      _pathService: Unit,
      _moduleRequireService: ModuleImportService
    ) = this()
    def this(
      configFilePath: String,
      /**
      * config options parsed in via CLI arguments and applied before
      * trying to compile config file
      */
    _initialConfig: Unit,
      _pathService: PathService,
      _moduleRequireService: ModuleImportService
    ) = this()
    def this(
      configFilePath: String,
      /**
      * config options parsed in via CLI arguments and applied before
      * trying to compile config file
      */
    _initialConfig: PartialTestrunnerOptionsW,
      _pathService: Unit,
      _moduleRequireService: ModuleImportService
    ) = this()
    def this(
      configFilePath: String,
      /**
      * config options parsed in via CLI arguments and applied before
      * trying to compile config file
      */
    _initialConfig: PartialTestrunnerOptionsW,
      _pathService: PathService,
      _moduleRequireService: ModuleImportService
    ) = this()
  }
  /* static members */
  object ConfigParser {
    
    @JSImport("@wdio/config", "ConfigParser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * returns a flattened list of globbed files
      *
      * @param  {String[] | String[][]} patterns list of files to glob
      * @param  {Boolean} omitWarnings to indicate omission of warnings
      * @param  {FileSystemPathService} findAndGlob system path service for expanding globbed file names
      * @param  {number} hierarchyDepth depth to prevent recursive calling beyond a depth of 1
      * @return {String[] | String[][]} list of files
      */
    inline def getFilePaths(patterns: js.Array[Spec], rootDir: String): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], rootDir: String, findAndGlob: Unit, hierarchyDepth: Double): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any], hierarchyDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], rootDir: String, findAndGlob: PathService): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], rootDir: String, findAndGlob: PathService, hierarchyDepth: Double): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], rootDir.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any], hierarchyDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
  }
  
  inline def DEFAULT_CONFIGS(): OmitTestrunnercapabilitie = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_CONFIGS")().asInstanceOf[OmitTestrunnercapabilitie]
  
  inline def isCloudCapability(caps: Capabilities): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCloudCapability")(caps.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateConfig[T](defaults: Definition[T], options: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def validateConfig[T](defaults: Definition[T], options: T, keysToKeep: js.Array[/* keyof T */ String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], keysToKeep.asInstanceOf[js.Any])).asInstanceOf[T]
}

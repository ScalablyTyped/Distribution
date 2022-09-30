package typings.wdioConfig

import typings.wdioConfig.anon.OmitTestrunnercapabilitie
import typings.wdioConfig.configParserMod.Spec
import typings.wdioConfig.configParserMod.default
import typings.wdioConfig.typesMod.ModuleRequireService
import typings.wdioConfig.typesMod.PathService
import typings.wdioTypes.capabilitiesMod.Capabilities
import typings.wdioTypes.optionsMod.Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wdio/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@wdio/config", "ConfigParser")
  @js.native
  open class ConfigParser () extends default {
    def this(_pathService: PathService) = this()
    def this(_pathService: Unit, _moduleRequireService: ModuleRequireService) = this()
    def this(_pathService: PathService, _moduleRequireService: ModuleRequireService) = this()
  }
  /* static members */
  object ConfigParser {
    
    @JSImport("@wdio/config", "ConfigParser")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * returns a flattened list of globbed files
      *
      * @param  {String[] | String[][]} filenames list of files to glob
      * @param  {Boolean} flag to indicate omission of warnings
      * @param  {FileSystemPathService} file system path service for expanding globbed file names
      * @param  {number} hierarchy depth to prevent recursive calling beyond a depth of 1
      * @return {String[] | String[][]} list of files
      */
    inline def getFilePaths(patterns: js.Array[Spec]): js.Array[Spec] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Boolean): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Boolean, findAndGlob: Unit, hierarchyDepth: Double): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any], hierarchyDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Boolean, findAndGlob: PathService): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Boolean, findAndGlob: PathService, hierarchyDepth: Double): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any], hierarchyDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Unit, findAndGlob: Unit, hierarchyDepth: Double): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any], hierarchyDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Unit, findAndGlob: PathService): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
    inline def getFilePaths(patterns: js.Array[Spec], omitWarnings: Unit, findAndGlob: PathService, hierarchyDepth: Double): js.Array[Spec] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFilePaths")(patterns.asInstanceOf[js.Any], omitWarnings.asInstanceOf[js.Any], findAndGlob.asInstanceOf[js.Any], hierarchyDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[Spec]]
  }
  
  inline def DEFAULT_CONFIGS(): OmitTestrunnercapabilitie = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_CONFIGS")().asInstanceOf[OmitTestrunnercapabilitie]
  
  inline def isCloudCapability(caps: Capabilities): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCloudCapability")(caps.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateConfig[T](defaults: Definition[T], options: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def validateConfig[T](defaults: Definition[T], options: T, keysToKeep: js.Array[/* keyof T */ String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(defaults.asInstanceOf[js.Any], options.asInstanceOf[js.Any], keysToKeep.asInstanceOf[js.Any])).asInstanceOf[T]
}

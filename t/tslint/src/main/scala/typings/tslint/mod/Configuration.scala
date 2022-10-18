package typings.tslint.mod

import typings.std.Map
import typings.tslint.anon.PartialIOptions
import typings.tslint.libConfigurationMod.IConfigurationFile
import typings.tslint.libConfigurationMod.IConfigurationLoadResult
import typings.tslint.libConfigurationMod.RawConfigFile
import typings.tslint.libLanguageRuleRuleMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Configuration {
  
  @JSImport("tslint", "Configuration")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tslint", "Configuration.CONFIG_FILENAME")
  @js.native
  val CONFIG_FILENAME: /* "tslint.json" */ String = js.native
  
  @JSImport("tslint", "Configuration.CONFIG_FILENAMES")
  @js.native
  val CONFIG_FILENAMES: js.Array[String] = js.native
  
  @JSImport("tslint", "Configuration.DEFAULT_CONFIG")
  @js.native
  val DEFAULT_CONFIG: IConfigurationFile = js.native
  
  @JSImport("tslint", "Configuration.EMPTY_CONFIG")
  @js.native
  val EMPTY_CONFIG: IConfigurationFile = js.native
  
  @JSImport("tslint", "Configuration.JSON_CONFIG_FILENAME")
  @js.native
  val JSON_CONFIG_FILENAME: /* "tslint.json" */ String = js.native
  
  inline def convertRuleOptions(ruleConfiguration: Map[String, PartialIOptions]): js.Array[IOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertRuleOptions")(ruleConfiguration.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOptions]]
  
  inline def extendConfigurationFile(targetConfig: IConfigurationFile, nextConfigSource: IConfigurationFile): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("extendConfigurationFile")(targetConfig.asInstanceOf[js.Any], nextConfigSource.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  
  inline def findConfiguration(configFile: String): IConfigurationLoadResult = ^.asInstanceOf[js.Dynamic].applyDynamic("findConfiguration")(configFile.asInstanceOf[js.Any]).asInstanceOf[IConfigurationLoadResult]
  inline def findConfiguration(configFile: String, inputFilePath: String): IConfigurationLoadResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfiguration")(configFile.asInstanceOf[js.Any], inputFilePath.asInstanceOf[js.Any])).asInstanceOf[IConfigurationLoadResult]
  inline def findConfiguration(configFile: Null, inputFilePath: String): IConfigurationLoadResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfiguration")(configFile.asInstanceOf[js.Any], inputFilePath.asInstanceOf[js.Any])).asInstanceOf[IConfigurationLoadResult]
  
  inline def findConfigurationPath(suppliedConfigFilePath: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findConfigurationPath")(suppliedConfigFilePath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def findConfigurationPath(suppliedConfigFilePath: String, inputFilePath: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfigurationPath")(suppliedConfigFilePath.asInstanceOf[js.Any], inputFilePath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def findConfigurationPath(suppliedConfigFilePath: Null, inputFilePath: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfigurationPath")(suppliedConfigFilePath.asInstanceOf[js.Any], inputFilePath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getRelativePath(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")().asInstanceOf[js.UndefOr[String]]
  inline def getRelativePath(directory: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")(directory.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def getRelativePath(directory: String, relativeTo: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")(directory.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def getRelativePath(directory: Null, relativeTo: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")(directory.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def getRelativePath(directory: Unit, relativeTo: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRelativePath")(directory.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def getRulesDirectories(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")().asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: String, relativeTo: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: js.Array[String], relativeTo: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: Unit, relativeTo: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def isFileExcluded(filepath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFileExcluded")(filepath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isFileExcluded(filepath: String, configFile: IConfigurationFile): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFileExcluded")(filepath.asInstanceOf[js.Any], configFile.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def loadConfigurationFromPath(): IConfigurationFile = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigurationFromPath")().asInstanceOf[IConfigurationFile]
  inline def loadConfigurationFromPath(configFilePath: String): IConfigurationFile = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigurationFromPath")(configFilePath.asInstanceOf[js.Any]).asInstanceOf[IConfigurationFile]
  inline def loadConfigurationFromPath(configFilePath: String, _originalFilePath: String): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigurationFromPath")(configFilePath.asInstanceOf[js.Any], _originalFilePath.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  inline def loadConfigurationFromPath(configFilePath: Unit, _originalFilePath: String): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigurationFromPath")(configFilePath.asInstanceOf[js.Any], _originalFilePath.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  
  inline def parseConfigFile(configFile: RawConfigFile): IConfigurationFile = ^.asInstanceOf[js.Dynamic].applyDynamic("parseConfigFile")(configFile.asInstanceOf[js.Any]).asInstanceOf[IConfigurationFile]
  inline def parseConfigFile(configFile: RawConfigFile, configFileDir: String): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfigFile")(configFile.asInstanceOf[js.Any], configFileDir.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  inline def parseConfigFile(
    configFile: RawConfigFile,
    configFileDir: String,
    readConfig: js.Function1[/* path */ String, RawConfigFile]
  ): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfigFile")(configFile.asInstanceOf[js.Any], configFileDir.asInstanceOf[js.Any], readConfig.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  inline def parseConfigFile(
    configFile: RawConfigFile,
    configFileDir: Unit,
    readConfig: js.Function1[/* path */ String, RawConfigFile]
  ): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("parseConfigFile")(configFile.asInstanceOf[js.Any], configFileDir.asInstanceOf[js.Any], readConfig.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  
  inline def readConfigurationFile(filepath: String): RawConfigFile = ^.asInstanceOf[js.Dynamic].applyDynamic("readConfigurationFile")(filepath.asInstanceOf[js.Any]).asInstanceOf[RawConfigFile]
  
  inline def stringifyConfiguration(configFile: IConfigurationFile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyConfiguration")(configFile.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useAsPath(directory: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsPath")(directory.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}

package typings.tslint.mod

import typings.std.Map
import typings.tslint.anon.PartialIOptions
import typings.tslint.configurationMod.IConfigurationFile
import typings.tslint.configurationMod.IConfigurationLoadResult
import typings.tslint.configurationMod.RawConfigFile
import typings.tslint.ruleMod.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Configuration {
  
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
  
  @JSImport("tslint", "Configuration.convertRuleOptions")
  @js.native
  def convertRuleOptions(ruleConfiguration: Map[String, PartialIOptions]): js.Array[IOptions] = js.native
  
  @JSImport("tslint", "Configuration.extendConfigurationFile")
  @js.native
  def extendConfigurationFile(targetConfig: IConfigurationFile, nextConfigSource: IConfigurationFile): IConfigurationFile = js.native
  
  @JSImport("tslint", "Configuration.findConfiguration")
  @js.native
  def findConfiguration(configFile: String): IConfigurationLoadResult = js.native
  @JSImport("tslint", "Configuration.findConfiguration")
  @js.native
  def findConfiguration(configFile: String, inputFilePath: String): IConfigurationLoadResult = js.native
  @JSImport("tslint", "Configuration.findConfiguration")
  @js.native
  def findConfiguration(configFile: Null, inputFilePath: String): IConfigurationLoadResult = js.native
  
  @JSImport("tslint", "Configuration.findConfigurationPath")
  @js.native
  def findConfigurationPath(suppliedConfigFilePath: String): js.UndefOr[String] = js.native
  @JSImport("tslint", "Configuration.findConfigurationPath")
  @js.native
  def findConfigurationPath(suppliedConfigFilePath: String, inputFilePath: String): js.UndefOr[String] = js.native
  @JSImport("tslint", "Configuration.findConfigurationPath")
  @js.native
  def findConfigurationPath(suppliedConfigFilePath: Null, inputFilePath: String): js.UndefOr[String] = js.native
  
  @JSImport("tslint", "Configuration.getRelativePath")
  @js.native
  def getRelativePath(): js.UndefOr[String] = js.native
  @JSImport("tslint", "Configuration.getRelativePath")
  @js.native
  def getRelativePath(directory: js.UndefOr[scala.Nothing], relativeTo: String): js.UndefOr[String] = js.native
  @JSImport("tslint", "Configuration.getRelativePath")
  @js.native
  def getRelativePath(directory: String): js.UndefOr[String] = js.native
  @JSImport("tslint", "Configuration.getRelativePath")
  @js.native
  def getRelativePath(directory: String, relativeTo: String): js.UndefOr[String] = js.native
  @JSImport("tslint", "Configuration.getRelativePath")
  @js.native
  def getRelativePath(directory: Null, relativeTo: String): js.UndefOr[String] = js.native
  
  @JSImport("tslint", "Configuration.getRulesDirectories")
  @js.native
  def getRulesDirectories(): js.Array[String] = js.native
  @JSImport("tslint", "Configuration.getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: js.UndefOr[scala.Nothing], relativeTo: String): js.Array[String] = js.native
  @JSImport("tslint", "Configuration.getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: String): js.Array[String] = js.native
  @JSImport("tslint", "Configuration.getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: String, relativeTo: String): js.Array[String] = js.native
  @JSImport("tslint", "Configuration.getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: js.Array[String]): js.Array[String] = js.native
  @JSImport("tslint", "Configuration.getRulesDirectories")
  @js.native
  def getRulesDirectories(directories: js.Array[String], relativeTo: String): js.Array[String] = js.native
  
  @JSImport("tslint", "Configuration.isFileExcluded")
  @js.native
  def isFileExcluded(filepath: String): Boolean = js.native
  @JSImport("tslint", "Configuration.isFileExcluded")
  @js.native
  def isFileExcluded(filepath: String, configFile: IConfigurationFile): Boolean = js.native
  
  @JSImport("tslint", "Configuration.loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath(): IConfigurationFile = js.native
  @JSImport("tslint", "Configuration.loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath(configFilePath: js.UndefOr[scala.Nothing], _originalFilePath: String): IConfigurationFile = js.native
  @JSImport("tslint", "Configuration.loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath(configFilePath: String): IConfigurationFile = js.native
  @JSImport("tslint", "Configuration.loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath(configFilePath: String, _originalFilePath: String): IConfigurationFile = js.native
  
  @JSImport("tslint", "Configuration.parseConfigFile")
  @js.native
  def parseConfigFile(configFile: RawConfigFile): IConfigurationFile = js.native
  @JSImport("tslint", "Configuration.parseConfigFile")
  @js.native
  def parseConfigFile(
    configFile: RawConfigFile,
    configFileDir: js.UndefOr[scala.Nothing],
    readConfig: js.Function1[/* path */ String, RawConfigFile]
  ): IConfigurationFile = js.native
  @JSImport("tslint", "Configuration.parseConfigFile")
  @js.native
  def parseConfigFile(configFile: RawConfigFile, configFileDir: String): IConfigurationFile = js.native
  @JSImport("tslint", "Configuration.parseConfigFile")
  @js.native
  def parseConfigFile(
    configFile: RawConfigFile,
    configFileDir: String,
    readConfig: js.Function1[/* path */ String, RawConfigFile]
  ): IConfigurationFile = js.native
  
  @JSImport("tslint", "Configuration.readConfigurationFile")
  @js.native
  def readConfigurationFile(filepath: String): RawConfigFile = js.native
  
  @JSImport("tslint", "Configuration.stringifyConfiguration")
  @js.native
  def stringifyConfiguration(configFile: IConfigurationFile): String = js.native
  
  @JSImport("tslint", "Configuration.useAsPath")
  @js.native
  def useAsPath(directory: String): Boolean = js.native
}

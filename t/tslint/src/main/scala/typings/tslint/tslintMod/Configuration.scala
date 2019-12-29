package typings.tslint.tslintMod

import typings.std.Map
import typings.std.Partial
import typings.tslint.libConfigurationMod.IConfigurationFile
import typings.tslint.libConfigurationMod.IConfigurationLoadResult
import typings.tslint.libConfigurationMod.RawConfigFile
import typings.tslint.libLanguageRuleRuleMod.IOptions
import typings.tslint.tslintStrings.tslintDotjson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "Configuration")
@js.native
object Configuration extends js.Object {
  val CONFIG_FILENAME: tslintDotjson = js.native
  val CONFIG_FILENAMES: js.Array[String] = js.native
  val DEFAULT_CONFIG: IConfigurationFile = js.native
  val EMPTY_CONFIG: IConfigurationFile = js.native
  val JSON_CONFIG_FILENAME: tslintDotjson = js.native
  def convertRuleOptions(ruleConfiguration: Map[String, Partial[IOptions]]): js.Array[IOptions] = js.native
  def extendConfigurationFile(targetConfig: IConfigurationFile, nextConfigSource: IConfigurationFile): IConfigurationFile = js.native
  def findConfiguration(configFile: String): IConfigurationLoadResult = js.native
  def findConfiguration(configFile: String, inputFilePath: String): IConfigurationLoadResult = js.native
  def findConfiguration(configFile: Null, inputFilePath: String): IConfigurationLoadResult = js.native
  def findConfigurationPath(suppliedConfigFilePath: String): js.UndefOr[String] = js.native
  def findConfigurationPath(suppliedConfigFilePath: String, inputFilePath: String): js.UndefOr[String] = js.native
  def findConfigurationPath(suppliedConfigFilePath: Null, inputFilePath: String): js.UndefOr[String] = js.native
  def getRelativePath(): js.UndefOr[String] = js.native
  def getRelativePath(directory: String): js.UndefOr[String] = js.native
  def getRelativePath(directory: String, relativeTo: String): js.UndefOr[String] = js.native
  def getRelativePath(directory: Null, relativeTo: String): js.UndefOr[String] = js.native
  def getRulesDirectories(): js.Array[String] = js.native
  def getRulesDirectories(directories: String): js.Array[String] = js.native
  def getRulesDirectories(directories: String, relativeTo: String): js.Array[String] = js.native
  def getRulesDirectories(directories: js.Array[String]): js.Array[String] = js.native
  def getRulesDirectories(directories: js.Array[String], relativeTo: String): js.Array[String] = js.native
  def isFileExcluded(filepath: String): Boolean = js.native
  def isFileExcluded(filepath: String, configFile: IConfigurationFile): Boolean = js.native
  def loadConfigurationFromPath(): IConfigurationFile = js.native
  def loadConfigurationFromPath(configFilePath: String): IConfigurationFile = js.native
  def loadConfigurationFromPath(configFilePath: String, _originalFilePath: String): IConfigurationFile = js.native
  def parseConfigFile(configFile: RawConfigFile): IConfigurationFile = js.native
  def parseConfigFile(configFile: RawConfigFile, configFileDir: String): IConfigurationFile = js.native
  def parseConfigFile(
    configFile: RawConfigFile,
    configFileDir: String,
    readConfig: js.Function1[/* path */ String, RawConfigFile]
  ): IConfigurationFile = js.native
  def readConfigurationFile(filepath: String): RawConfigFile = js.native
  def stringifyConfiguration(configFile: IConfigurationFile): String = js.native
  def useAsPath(directory: String): Boolean = js.native
}


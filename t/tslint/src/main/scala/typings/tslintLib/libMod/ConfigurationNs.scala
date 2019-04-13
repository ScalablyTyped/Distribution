package typings
package tslintLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib", "Configuration")
@js.native
object ConfigurationNs extends js.Object {
  val CONFIG_FILENAME: tslintLib.tslintLibStrings.tslintDOTjson = js.native
  val CONFIG_FILENAMES: js.Array[java.lang.String] = js.native
  val DEFAULT_CONFIG: tslintLib.libConfigurationMod.IConfigurationFile = js.native
  val EMPTY_CONFIG: tslintLib.libConfigurationMod.IConfigurationFile = js.native
  val JSON_CONFIG_FILENAME: tslintLib.tslintLibStrings.tslintDOTjson = js.native
  def convertRuleOptions(
    ruleConfiguration: stdLib.Map[java.lang.String, stdLib.Partial[tslintLib.libLanguageRuleRuleMod.IOptions]]
  ): js.Array[tslintLib.libLanguageRuleRuleMod.IOptions] = js.native
  def extendConfigurationFile(
    targetConfig: tslintLib.libConfigurationMod.IConfigurationFile,
    nextConfigSource: tslintLib.libConfigurationMod.IConfigurationFile
  ): tslintLib.libConfigurationMod.IConfigurationFile = js.native
  def findConfiguration(configFile: java.lang.String): tslintLib.libConfigurationMod.IConfigurationLoadResult = js.native
  def findConfiguration(configFile: java.lang.String, inputFilePath: java.lang.String): tslintLib.libConfigurationMod.IConfigurationLoadResult = js.native
  def findConfiguration(configFile: scala.Null, inputFilePath: java.lang.String): tslintLib.libConfigurationMod.IConfigurationLoadResult = js.native
  def findConfigurationPath(suppliedConfigFilePath: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def findConfigurationPath(suppliedConfigFilePath: java.lang.String, inputFilePath: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def findConfigurationPath(suppliedConfigFilePath: scala.Null, inputFilePath: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getRelativePath(): js.UndefOr[java.lang.String] = js.native
  def getRelativePath(directory: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getRelativePath(directory: java.lang.String, relativeTo: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getRelativePath(directory: scala.Null, relativeTo: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def getRulesDirectories(): js.Array[java.lang.String] = js.native
  def getRulesDirectories(directories: java.lang.String): js.Array[java.lang.String] = js.native
  def getRulesDirectories(directories: java.lang.String, relativeTo: java.lang.String): js.Array[java.lang.String] = js.native
  def getRulesDirectories(directories: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def getRulesDirectories(directories: js.Array[java.lang.String], relativeTo: java.lang.String): js.Array[java.lang.String] = js.native
  def isFileExcluded(filepath: java.lang.String): scala.Boolean = js.native
  def isFileExcluded(filepath: java.lang.String, configFile: tslintLib.libConfigurationMod.IConfigurationFile): scala.Boolean = js.native
  def loadConfigurationFromPath(): tslintLib.libConfigurationMod.IConfigurationFile = js.native
  def loadConfigurationFromPath(configFilePath: java.lang.String): tslintLib.libConfigurationMod.IConfigurationFile = js.native
  def loadConfigurationFromPath(configFilePath: java.lang.String, _originalFilePath: java.lang.String): tslintLib.libConfigurationMod.IConfigurationFile = js.native
  def parseConfigFile(configFile: tslintLib.libConfigurationMod.RawConfigFile): tslintLib.libConfigurationMod.IConfigurationFile = js.native
  def parseConfigFile(configFile: tslintLib.libConfigurationMod.RawConfigFile, configFileDir: java.lang.String): tslintLib.libConfigurationMod.IConfigurationFile = js.native
  def parseConfigFile(
    configFile: tslintLib.libConfigurationMod.RawConfigFile,
    configFileDir: java.lang.String,
    readConfig: js.Function1[/* path */ java.lang.String, tslintLib.libConfigurationMod.RawConfigFile]
  ): tslintLib.libConfigurationMod.IConfigurationFile = js.native
  def readConfigurationFile(filepath: java.lang.String): tslintLib.libConfigurationMod.RawConfigFile = js.native
  def useAsPath(directory: java.lang.String): scala.Boolean = js.native
}


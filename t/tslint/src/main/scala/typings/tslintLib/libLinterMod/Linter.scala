package typings
package tslintLib.libLinterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint/lib/linter", "Linter")
@js.native
class Linter protected () extends js.Object {
  def this(options: tslintLib.libMod.ILinterOptions) = this()
  def this(options: tslintLib.libMod.ILinterOptions, program: typescriptLib.typescriptMod.tsNs.Program) = this()
  var applyAllFixes: js.Any = js.native
  var applyRule: js.Any = js.native
  var failures: js.Any = js.native
  var fixes: js.Any = js.native
  var getAllFailures: js.Any = js.native
  var getEnabledRules: js.Any = js.native
  var getSourceFile: js.Any = js.native
  val options: js.Any = js.native
  var program: js.UndefOr[js.Any] = js.native
  var updateProgram: js.Any = js.native
  /* protected */ def applyFixes(
    sourceFilePath: java.lang.String,
    source: java.lang.String,
    fixableFailures: js.Array[tslintLib.libLanguageRuleRuleMod.RuleFailure]
  ): java.lang.String = js.native
  def getResult(): tslintLib.libMod.LintResult = js.native
  def lint(fileName: java.lang.String, source: java.lang.String): scala.Unit = js.native
  def lint(
    fileName: java.lang.String,
    source: java.lang.String,
    configuration: tslintLib.libConfigurationMod.IConfigurationFile
  ): scala.Unit = js.native
}

@JSImport("tslint/lib/linter", "Linter")
@js.native
object Linter extends js.Object {
  var VERSION: java.lang.String = js.native
  @JSName("findConfigurationPath")
  var findConfigurationPath_Original: tslintLib.Anon_InputFilePath = js.native
  @JSName("findConfiguration")
  var findConfiguration_Original: tslintLib.Anon_ConfigFile = js.native
  @JSName("getRulesDirectories")
  var getRulesDirectories_Original: js.Function2[
    /* directories */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
    /* relativeTo */ js.UndefOr[java.lang.String], 
    js.Array[java.lang.String]
  ] = js.native
  @JSName("loadConfigurationFromPath")
  var loadConfigurationFromPath_Original: js.Function2[
    /* configFilePath */ js.UndefOr[java.lang.String], 
    /* _originalFilePath */ js.UndefOr[java.lang.String], 
    tslintLib.libConfigurationMod.IConfigurationFile
  ] = js.native
  /**
    * Creates a TypeScript program object from a tsconfig.json file path and optional project directory.
    */
  def createProgram(configFile: java.lang.String): typescriptLib.typescriptMod.tsNs.Program = js.native
  def createProgram(configFile: java.lang.String, projectDirectory: java.lang.String): typescriptLib.typescriptMod.tsNs.Program = js.native
  def findConfiguration(configFile: java.lang.String): tslintLib.libConfigurationMod.IConfigurationLoadResult = js.native
  def findConfiguration(configFile: java.lang.String, inputFilePath: java.lang.String): tslintLib.libConfigurationMod.IConfigurationLoadResult = js.native
  def findConfiguration(configFile: scala.Null, inputFilePath: java.lang.String): tslintLib.libConfigurationMod.IConfigurationLoadResult = js.native
  def findConfigurationPath(suppliedConfigFilePath: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def findConfigurationPath(suppliedConfigFilePath: java.lang.String, inputFilePath: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def findConfigurationPath(suppliedConfigFilePath: scala.Null, inputFilePath: java.lang.String): js.UndefOr[java.lang.String] = js.native
  /**
    * Returns a list of source file names from a TypeScript program. This includes all referenced
    * files and excludes declaration (".d.ts") files.
    */
  def getFileNames(program: typescriptLib.typescriptMod.tsNs.Program): js.Array[java.lang.String] = js.native
  def getRulesDirectories(): js.Array[java.lang.String] = js.native
  def getRulesDirectories(directories: java.lang.String): js.Array[java.lang.String] = js.native
  def getRulesDirectories(directories: java.lang.String, relativeTo: java.lang.String): js.Array[java.lang.String] = js.native
  def getRulesDirectories(directories: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
  def getRulesDirectories(directories: js.Array[java.lang.String], relativeTo: java.lang.String): js.Array[java.lang.String] = js.native
  def loadConfigurationFromPath(): tslintLib.libConfigurationMod.IConfigurationFile = js.native
  def loadConfigurationFromPath(configFilePath: java.lang.String): tslintLib.libConfigurationMod.IConfigurationFile = js.native
  def loadConfigurationFromPath(configFilePath: java.lang.String, _originalFilePath: java.lang.String): tslintLib.libConfigurationMod.IConfigurationFile = js.native
}


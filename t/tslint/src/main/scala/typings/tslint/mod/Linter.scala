package typings.tslint.mod

import typings.tslint.anon.FnCall
import typings.tslint.anon.FnCallSuppliedConfigFilePathInputFilePath
import typings.tslint.configurationMod.IConfigurationFile
import typings.tslint.configurationMod.IConfigurationLoadResult
import typings.typescript.mod.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tslint", "Linter")
@js.native
class Linter protected ()
  extends typings.tslint.linterMod.Linter {
  def this(options: ILinterOptions) = this()
  def this(options: ILinterOptions, program: Program) = this()
}

/* static members */
@JSImport("tslint", "Linter")
@js.native
object Linter extends js.Object {
  var VERSION: String = js.native
  @JSName("findConfigurationPath")
  var findConfigurationPath_Original: FnCallSuppliedConfigFilePathInputFilePath = js.native
  @JSName("findConfiguration")
  var findConfiguration_Original: FnCall = js.native
  @JSName("getRulesDirectories")
  var getRulesDirectories_Original: js.Function2[
    /* directories */ js.UndefOr[String | js.Array[String]], 
    /* relativeTo */ js.UndefOr[String], 
    js.Array[String]
  ] = js.native
  @JSName("loadConfigurationFromPath")
  var loadConfigurationFromPath_Original: js.Function2[
    /* configFilePath */ js.UndefOr[String], 
    /* _originalFilePath */ js.UndefOr[String], 
    IConfigurationFile
  ] = js.native
  /**
    * Creates a TypeScript program object from a tsconfig.json file path and optional project directory.
    */
  def createProgram(configFile: String): Program = js.native
  def createProgram(configFile: String, projectDirectory: String): Program = js.native
  def findConfiguration(configFile: String): IConfigurationLoadResult = js.native
  def findConfiguration(configFile: String, inputFilePath: String): IConfigurationLoadResult = js.native
  def findConfiguration(configFile: Null, inputFilePath: String): IConfigurationLoadResult = js.native
  def findConfigurationPath(suppliedConfigFilePath: String): js.UndefOr[String] = js.native
  def findConfigurationPath(suppliedConfigFilePath: String, inputFilePath: String): js.UndefOr[String] = js.native
  def findConfigurationPath(suppliedConfigFilePath: Null, inputFilePath: String): js.UndefOr[String] = js.native
  /**
    * Returns a list of source file names from a TypeScript program. This includes all referenced
    * files and excludes declaration (".d.ts") files, as well as JSON files, to avoid problems with
    * `resolveJsonModule`.
    */
  def getFileNames(program: Program): js.Array[String] = js.native
  def getRulesDirectories(): js.Array[String] = js.native
  def getRulesDirectories(directories: String): js.Array[String] = js.native
  def getRulesDirectories(directories: String, relativeTo: String): js.Array[String] = js.native
  def getRulesDirectories(directories: js.Array[String]): js.Array[String] = js.native
  def getRulesDirectories(directories: js.Array[String], relativeTo: String): js.Array[String] = js.native
  def loadConfigurationFromPath(): IConfigurationFile = js.native
  def loadConfigurationFromPath(configFilePath: String): IConfigurationFile = js.native
  def loadConfigurationFromPath(configFilePath: String, _originalFilePath: String): IConfigurationFile = js.native
}


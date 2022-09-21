package typings.tslint.mod

import typings.tslint.anon.FnCall
import typings.tslint.anon.FnCallSuppliedConfigFilePathInputFilePath
import typings.tslint.configurationMod.IConfigurationFile
import typings.tslint.configurationMod.IConfigurationLoadResult
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint", "Linter")
@js.native
open class Linter protected ()
  extends typings.tslint.linterMod.Linter {
  def this(options: ILinterOptions) = this()
  def this(options: ILinterOptions, program: Program) = this()
}
/* static members */
object Linter {
  
  @JSImport("tslint", "Linter")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tslint", "Linter.VERSION")
  @js.native
  def VERSION: String = js.native
  inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  /**
    * Creates a TypeScript program object from a tsconfig.json file path and optional project directory.
    */
  inline def createProgram(configFile: String): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(configFile.asInstanceOf[js.Any]).asInstanceOf[Program]
  inline def createProgram(configFile: String, projectDirectory: String): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("createProgram")(configFile.asInstanceOf[js.Any], projectDirectory.asInstanceOf[js.Any])).asInstanceOf[Program]
  
  @JSImport("tslint", "Linter.findConfiguration")
  @js.native
  def findConfiguration: FnCall = js.native
  inline def findConfiguration(configFile: String): IConfigurationLoadResult = ^.asInstanceOf[js.Dynamic].applyDynamic("findConfiguration")(configFile.asInstanceOf[js.Any]).asInstanceOf[IConfigurationLoadResult]
  inline def findConfiguration(configFile: String, inputFilePath: String): IConfigurationLoadResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfiguration")(configFile.asInstanceOf[js.Any], inputFilePath.asInstanceOf[js.Any])).asInstanceOf[IConfigurationLoadResult]
  inline def findConfiguration(configFile: Null, inputFilePath: String): IConfigurationLoadResult = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfiguration")(configFile.asInstanceOf[js.Any], inputFilePath.asInstanceOf[js.Any])).asInstanceOf[IConfigurationLoadResult]
  
  @JSImport("tslint", "Linter.findConfigurationPath")
  @js.native
  def findConfigurationPath: FnCallSuppliedConfigFilePathInputFilePath = js.native
  inline def findConfigurationPath(suppliedConfigFilePath: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findConfigurationPath")(suppliedConfigFilePath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  inline def findConfigurationPath(suppliedConfigFilePath: String, inputFilePath: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfigurationPath")(suppliedConfigFilePath.asInstanceOf[js.Any], inputFilePath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def findConfigurationPath(suppliedConfigFilePath: Null, inputFilePath: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("findConfigurationPath")(suppliedConfigFilePath.asInstanceOf[js.Any], inputFilePath.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def findConfigurationPath_=(x: FnCallSuppliedConfigFilePathInputFilePath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findConfigurationPath")(x.asInstanceOf[js.Any])
  
  inline def findConfiguration_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findConfiguration")(x.asInstanceOf[js.Any])
  
  /**
    * Returns a list of source file names from a TypeScript program. This includes all referenced
    * files and excludes declaration (".d.ts") files, as well as JSON files, to avoid problems with
    * `resolveJsonModule`.
    */
  inline def getFileNames(program: Program): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFileNames")(program.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def getRulesDirectories(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")().asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: String, relativeTo: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: js.Array[String], relativeTo: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def getRulesDirectories(directories: Unit, relativeTo: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRulesDirectories")(directories.asInstanceOf[js.Any], relativeTo.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  @JSImport("tslint", "Linter.getRulesDirectories")
  @js.native
  def getRulesDirectories_FLinter: js.Function2[
    /* directories */ js.UndefOr[String | js.Array[String]], 
    /* relativeTo */ js.UndefOr[String], 
    js.Array[String]
  ] = js.native
  
  inline def getRulesDirectories_FLinter_=(
    x: js.Function2[
      /* directories */ js.UndefOr[String | js.Array[String]], 
      /* relativeTo */ js.UndefOr[String], 
      js.Array[String]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRulesDirectories")(x.asInstanceOf[js.Any])
  
  inline def loadConfigurationFromPath(): IConfigurationFile = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigurationFromPath")().asInstanceOf[IConfigurationFile]
  inline def loadConfigurationFromPath(configFilePath: String): IConfigurationFile = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigurationFromPath")(configFilePath.asInstanceOf[js.Any]).asInstanceOf[IConfigurationFile]
  inline def loadConfigurationFromPath(configFilePath: String, _originalFilePath: String): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigurationFromPath")(configFilePath.asInstanceOf[js.Any], _originalFilePath.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  inline def loadConfigurationFromPath(configFilePath: Unit, _originalFilePath: String): IConfigurationFile = (^.asInstanceOf[js.Dynamic].applyDynamic("loadConfigurationFromPath")(configFilePath.asInstanceOf[js.Any], _originalFilePath.asInstanceOf[js.Any])).asInstanceOf[IConfigurationFile]
  @JSImport("tslint", "Linter.loadConfigurationFromPath")
  @js.native
  def loadConfigurationFromPath_FLinter: js.Function2[
    /* configFilePath */ js.UndefOr[String], 
    /* _originalFilePath */ js.UndefOr[String], 
    IConfigurationFile
  ] = js.native
  
  inline def loadConfigurationFromPath_FLinter_=(
    x: js.Function2[
      /* configFilePath */ js.UndefOr[String], 
      /* _originalFilePath */ js.UndefOr[String], 
      IConfigurationFile
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadConfigurationFromPath")(x.asInstanceOf[js.Any])
}

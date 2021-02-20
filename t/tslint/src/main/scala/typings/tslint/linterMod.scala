package typings.tslint

import typings.tslint.anon.FnCall
import typings.tslint.anon.FnCallSuppliedConfigFilePathInputFilePath
import typings.tslint.configurationMod.IConfigurationFile
import typings.tslint.configurationMod.IConfigurationLoadResult
import typings.tslint.mod.ILinterOptions
import typings.tslint.mod.LintResult
import typings.tslint.ruleMod.RuleFailure
import typings.typescript.mod.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linterMod {
  
  @JSImport("tslint/lib/linter", "Linter")
  @js.native
  class Linter protected () extends StObject {
    def this(options: ILinterOptions) = this()
    def this(options: ILinterOptions, program: Program) = this()
    
    var applyAllFixes: js.Any = js.native
    
    /* protected */ def applyFixes(sourceFilePath: String, source: String, fixableFailures: js.Array[RuleFailure]): String = js.native
    
    var applyRule: js.Any = js.native
    
    var failures: js.Any = js.native
    
    val fileNames: js.Any = js.native
    
    var fixes: js.Any = js.native
    
    var getAllFailures: js.Any = js.native
    
    var getEnabledRules: js.Any = js.native
    
    def getResult(): LintResult = js.native
    
    var getSourceFile: js.Any = js.native
    
    def lint(fileName: String, source: String): Unit = js.native
    def lint(fileName: String, source: String, configuration: IConfigurationFile): Unit = js.native
    
    val options: js.Any = js.native
    
    var program: js.Any = js.native
    
    var updateProgram: js.Any = js.native
  }
  /* static members */
  object Linter {
    
    @JSImport("tslint/lib/linter", "Linter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("tslint/lib/linter", "Linter.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a TypeScript program object from a tsconfig.json file path and optional project directory.
      */
    @JSImport("tslint/lib/linter", "Linter.createProgram")
    @js.native
    def createProgram(configFile: String): Program = js.native
    @JSImport("tslint/lib/linter", "Linter.createProgram")
    @js.native
    def createProgram(configFile: String, projectDirectory: String): Program = js.native
    
    @JSImport("tslint/lib/linter", "Linter.findConfiguration")
    @js.native
    def findConfiguration: FnCall = js.native
    @JSImport("tslint/lib/linter", "Linter.findConfiguration")
    @js.native
    def findConfiguration(configFile: String): IConfigurationLoadResult = js.native
    @JSImport("tslint/lib/linter", "Linter.findConfiguration")
    @js.native
    def findConfiguration(configFile: String, inputFilePath: String): IConfigurationLoadResult = js.native
    @JSImport("tslint/lib/linter", "Linter.findConfiguration")
    @js.native
    def findConfiguration(configFile: Null, inputFilePath: String): IConfigurationLoadResult = js.native
    
    @JSImport("tslint/lib/linter", "Linter.findConfigurationPath")
    @js.native
    def findConfigurationPath: FnCallSuppliedConfigFilePathInputFilePath = js.native
    @JSImport("tslint/lib/linter", "Linter.findConfigurationPath")
    @js.native
    def findConfigurationPath(suppliedConfigFilePath: String): js.UndefOr[String] = js.native
    @JSImport("tslint/lib/linter", "Linter.findConfigurationPath")
    @js.native
    def findConfigurationPath(suppliedConfigFilePath: String, inputFilePath: String): js.UndefOr[String] = js.native
    @JSImport("tslint/lib/linter", "Linter.findConfigurationPath")
    @js.native
    def findConfigurationPath(suppliedConfigFilePath: Null, inputFilePath: String): js.UndefOr[String] = js.native
    @scala.inline
    def findConfigurationPath_=(x: FnCallSuppliedConfigFilePathInputFilePath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findConfigurationPath")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def findConfiguration_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("findConfiguration")(x.asInstanceOf[js.Any])
    
    /**
      * Returns a list of source file names from a TypeScript program. This includes all referenced
      * files and excludes declaration (".d.ts") files, as well as JSON files, to avoid problems with
      * `resolveJsonModule`.
      */
    @JSImport("tslint/lib/linter", "Linter.getFileNames")
    @js.native
    def getFileNames(program: Program): js.Array[String] = js.native
    
    @JSImport("tslint/lib/linter", "Linter.getRulesDirectories")
    @js.native
    def getRulesDirectories(): js.Array[String] = js.native
    @JSImport("tslint/lib/linter", "Linter.getRulesDirectories")
    @js.native
    def getRulesDirectories(directories: js.UndefOr[scala.Nothing], relativeTo: String): js.Array[String] = js.native
    @JSImport("tslint/lib/linter", "Linter.getRulesDirectories")
    @js.native
    def getRulesDirectories(directories: String): js.Array[String] = js.native
    @JSImport("tslint/lib/linter", "Linter.getRulesDirectories")
    @js.native
    def getRulesDirectories(directories: String, relativeTo: String): js.Array[String] = js.native
    @JSImport("tslint/lib/linter", "Linter.getRulesDirectories")
    @js.native
    def getRulesDirectories(directories: js.Array[String]): js.Array[String] = js.native
    @JSImport("tslint/lib/linter", "Linter.getRulesDirectories")
    @js.native
    def getRulesDirectories(directories: js.Array[String], relativeTo: String): js.Array[String] = js.native
    @JSImport("tslint/lib/linter", "Linter.getRulesDirectories")
    @js.native
    def getRulesDirectories_FLinter: js.Function2[
        /* directories */ js.UndefOr[String | js.Array[String]], 
        /* relativeTo */ js.UndefOr[String], 
        js.Array[String]
      ] = js.native
    
    @scala.inline
    def getRulesDirectories_FLinter_=(
      x: js.Function2[
          /* directories */ js.UndefOr[String | js.Array[String]], 
          /* relativeTo */ js.UndefOr[String], 
          js.Array[String]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getRulesDirectories")(x.asInstanceOf[js.Any])
    
    @JSImport("tslint/lib/linter", "Linter.loadConfigurationFromPath")
    @js.native
    def loadConfigurationFromPath(): IConfigurationFile = js.native
    @JSImport("tslint/lib/linter", "Linter.loadConfigurationFromPath")
    @js.native
    def loadConfigurationFromPath(configFilePath: js.UndefOr[scala.Nothing], _originalFilePath: String): IConfigurationFile = js.native
    @JSImport("tslint/lib/linter", "Linter.loadConfigurationFromPath")
    @js.native
    def loadConfigurationFromPath(configFilePath: String): IConfigurationFile = js.native
    @JSImport("tslint/lib/linter", "Linter.loadConfigurationFromPath")
    @js.native
    def loadConfigurationFromPath(configFilePath: String, _originalFilePath: String): IConfigurationFile = js.native
    @JSImport("tslint/lib/linter", "Linter.loadConfigurationFromPath")
    @js.native
    def loadConfigurationFromPath_FLinter: js.Function2[
        /* configFilePath */ js.UndefOr[String], 
        /* _originalFilePath */ js.UndefOr[String], 
        IConfigurationFile
      ] = js.native
    
    @scala.inline
    def loadConfigurationFromPath_FLinter_=(
      x: js.Function2[
          /* configFilePath */ js.UndefOr[String], 
          /* _originalFilePath */ js.UndefOr[String], 
          IConfigurationFile
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadConfigurationFromPath")(x.asInstanceOf[js.Any])
  }
}

package typings.tsLoader.interfacesMod

import typings.chalk.mod.Chalk
import typings.std.Set
import typings.std.TemplateStringsArray
import typings.tsLoader.anon.Typeoftypescript
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.CustomTransformers
import typings.typescript.mod.EmitAndSemanticDiagnosticsBuilderProgram
import typings.typescript.mod.LanguageService
import typings.typescript.mod.Program
import typings.typescript.mod.SolutionBuilder
import typings.typescript.mod.WatchOfFilesAndCompilerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSInstance extends js.Object {
  
  /** Used for Vue for the most part */
  def appendTsTsxSuffixesIfRequired(filePath: String): String = js.native
  
  var builderProgram: js.UndefOr[EmitAndSemanticDiagnosticsBuilderProgram] = js.native
  
  var changedFilesList: js.UndefOr[Boolean] = js.native
  
  def colors(text: js.Any*): String = js.native
  /**
  		Use a template string.
  		@remarks Template literals are unsupported for nested calls (see [issue #341](https://github.com/chalk/chalk/issues/341))
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk`
  		CPU: {red ${cpu.totalPercent}%}
  		RAM: {green ${ram.used / ram.total * 100}%}
  		DISK: {rgb(255,131,0) ${disk.used / disk.total * 100}%}
  		`);
  		```
  		@example
  		```
  		import chalk = require('chalk');
  		log(chalk.red.bgBlack`2 + 3 = {bold ${2 + 3}}`)
  		```
  		*/
  def colors(text: TemplateStringsArray, placeholders: js.Any*): String = js.native
  @JSName("colors")
  var colors_Original: Chalk = js.native
  
  var compiler: Typeoftypescript = js.native
  
  var compilerOptions: CompilerOptions = js.native
  
  var configFilePath: js.UndefOr[String] = js.native
  
  var dependencyGraph: DependencyGraph = js.native
  
  /**
    * a cache of all the files
    */
  var files: TSFiles = js.native
  
  var filesWithErrors: js.UndefOr[TSFiles] = js.native
  
  var hasUnaccountedModifiedFiles: js.UndefOr[Boolean] = js.native
  
  var languageService: js.UndefOr[LanguageService | Null] = js.native
  
  var loaderOptions: LoaderOptions = js.native
  
  /**
    * contains the modified files - cleared each time after-compile is called
    */
  var modifiedFiles: js.UndefOr[TSFiles] = js.native
  
  var otherFiles: TSFiles = js.native
  
  var program: js.UndefOr[Program] = js.native
  
  /**
    * Paths to project references that are missing source maps.
    * Cleared each time after-compile is called. Used to dedupe
    * warnings about source maps during a single compilation.
    */
  var projectsMissingSourceMaps: js.UndefOr[Set[String]] = js.native
  
  var reverseDependencyGraph: ReverseDependencyGraph = js.native
  
  var rootFileNames: Set[String] = js.native
  
  var solutionBuilder: js.UndefOr[SolutionBuilder[EmitAndSemanticDiagnosticsBuilderProgram]] = js.native
  
  var solutionBuilderHost: js.UndefOr[SolutionBuilderWithWatchHost] = js.native
  
  var transformers: CustomTransformers = js.native
  
  var version: js.UndefOr[Double] = js.native
  
  var watchHost: js.UndefOr[WatchHost] = js.native
  
  var watchOfFilesAndCompilerOptions: js.UndefOr[WatchOfFilesAndCompilerOptions[EmitAndSemanticDiagnosticsBuilderProgram]] = js.native
}

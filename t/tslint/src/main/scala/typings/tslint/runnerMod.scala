package typings.tslint

import typings.tslint.tslintNumbers.`0`
import typings.tslint.tslintNumbers.`1`
import typings.tslint.tslintNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runnerMod {
  
  @JSImport("tslint/lib/runner", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def run(options: Options, logger: Logger): js.Promise[Status] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(options.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Status]]
  
  trait Logger extends StObject {
    
    def error(message: String): Unit
    
    def log(message: String): Unit
  }
  object Logger {
    
    inline def apply(error: String => Unit, log: String => Unit): Logger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setLog(value: String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Path to a configuration file.
      */
    var config: js.UndefOr[String] = js.undefined
    
    /**
      * Exclude globs from path expansion.
      */
    var exclude: js.Array[String]
    
    /**
      * File paths to lint.
      */
    var files: js.Array[String]
    
    /**
      * Whether to fixes linting errors for select rules. This may overwrite linted files.
      */
    var fix: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to return status code 0 even if there are lint errors.
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Output format.
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * Formatters directory path.
      */
    var formattersDirectory: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to generate a tslint.json config file in the current working directory.
      */
    var init: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Output file path.
      */
    var out: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to output absolute paths
      */
    var outputAbsolutePaths: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Outputs the configuration to be used instead of linting.
      */
    var printConfig: js.UndefOr[Boolean] = js.undefined
    
    /**
      * tsconfig.json file.
      */
    var project: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to hide warnings
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Rules directory paths.
      */
    var rulesDirectory: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Run the tests in the given directories to ensure a (custom) TSLint rule's output matches the expected output.
      * When this property is `true` the `files` property is used to specify the directories from which the tests should be executed.
      */
    var test: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to enable type checking when linting a project.
      */
    var typeCheck: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(exclude: js.Array[String], files: js.Array[String]): Options = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConfig(value: String): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      inline def setFix(value: Boolean): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      inline def setFixUndefined: Self = StObject.set(x, "fix", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setFormattersDirectory(value: String): Self = StObject.set(x, "formattersDirectory", value.asInstanceOf[js.Any])
      
      inline def setFormattersDirectoryUndefined: Self = StObject.set(x, "formattersDirectory", js.undefined)
      
      inline def setInit(value: Boolean): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
      
      inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
      
      inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
      
      inline def setOutUndefined: Self = StObject.set(x, "out", js.undefined)
      
      inline def setOutputAbsolutePaths(value: Boolean): Self = StObject.set(x, "outputAbsolutePaths", value.asInstanceOf[js.Any])
      
      inline def setOutputAbsolutePathsUndefined: Self = StObject.set(x, "outputAbsolutePaths", js.undefined)
      
      inline def setPrintConfig(value: Boolean): Self = StObject.set(x, "printConfig", value.asInstanceOf[js.Any])
      
      inline def setPrintConfigUndefined: Self = StObject.set(x, "printConfig", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setRulesDirectory(value: String | js.Array[String]): Self = StObject.set(x, "rulesDirectory", value.asInstanceOf[js.Any])
      
      inline def setRulesDirectoryUndefined: Self = StObject.set(x, "rulesDirectory", js.undefined)
      
      inline def setRulesDirectoryVarargs(value: String*): Self = StObject.set(x, "rulesDirectory", js.Array(value :_*))
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTypeCheck(value: Boolean): Self = StObject.set(x, "typeCheck", value.asInstanceOf[js.Any])
      
      inline def setTypeCheckUndefined: Self = StObject.set(x, "typeCheck", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tslint.tslintNumbers.`0`
    - typings.tslint.tslintNumbers.`1`
    - typings.tslint.tslintNumbers.`2`
  */
  trait Status extends StObject
  object Status {
    
    inline def FatalError: `1` = 1.asInstanceOf[`1`]
    
    inline def LintError: `2` = 2.asInstanceOf[`2`]
    
    inline def Ok: `0` = 0.asInstanceOf[`0`]
  }
}

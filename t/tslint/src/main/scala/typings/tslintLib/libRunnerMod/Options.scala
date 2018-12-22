package typings
package tslintLib.libRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  /**
       * Path to a configuration file.
       */
  var config: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Exclude globs from path expansion.
       */
  var exclude: js.Array[java.lang.String]
  /**
       * File paths to lint.
       */
  var files: js.Array[java.lang.String]
  /**
       * Whether to fixes linting errors for select rules. This may overwrite linted files.
       */
  var fix: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether to return status code 0 even if there are lint errors.
       */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Output format.
       */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Formatters directory path.
       */
  var formattersDirectory: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether to generate a tslint.json config file in the current working directory.
       */
  var init: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Output file path.
       */
  var out: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether to output absolute paths
       */
  var outputAbsolutePaths: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * tsconfig.json file.
       */
  var project: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Whether to hide warnings
       */
  var quiet: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Rules directory paths.
       */
  var rulesDirectory: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
       * Run the tests in the given directories to ensure a (custom) TSLint rule's output matches the expected output.
       * When this property is `true` the `files` property is used to specify the directories from which the tests should be executed.
       */
  var test: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Whether to enable type checking when linting a project.
       */
  var typeCheck: js.UndefOr[scala.Boolean] = js.undefined
}


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

object Options {
  @scala.inline
  def apply(
    exclude: js.Array[java.lang.String],
    files: js.Array[java.lang.String],
    config: java.lang.String = null,
    fix: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    formattersDirectory: java.lang.String = null,
    init: js.UndefOr[scala.Boolean] = js.undefined,
    out: java.lang.String = null,
    outputAbsolutePaths: js.UndefOr[scala.Boolean] = js.undefined,
    project: java.lang.String = null,
    quiet: js.UndefOr[scala.Boolean] = js.undefined,
    rulesDirectory: java.lang.String | js.Array[java.lang.String] = null,
    test: js.UndefOr[scala.Boolean] = js.undefined,
    typeCheck: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exclude")(exclude)
    __obj.updateDynamic("files")(files)
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formattersDirectory != null) __obj.updateDynamic("formattersDirectory")(formattersDirectory)
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init)
    if (out != null) __obj.updateDynamic("out")(out)
    if (!js.isUndefined(outputAbsolutePaths)) __obj.updateDynamic("outputAbsolutePaths")(outputAbsolutePaths)
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet)
    if (rulesDirectory != null) __obj.updateDynamic("rulesDirectory")(rulesDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test)
    if (!js.isUndefined(typeCheck)) __obj.updateDynamic("typeCheck")(typeCheck)
    __obj.asInstanceOf[Options]
  }
}


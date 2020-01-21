package typings.tslint.runnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
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
  @scala.inline
  def apply(
    exclude: js.Array[String],
    files: js.Array[String],
    config: String = null,
    fix: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    formattersDirectory: String = null,
    init: js.UndefOr[Boolean] = js.undefined,
    out: String = null,
    outputAbsolutePaths: js.UndefOr[Boolean] = js.undefined,
    printConfig: js.UndefOr[Boolean] = js.undefined,
    project: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    rulesDirectory: String | js.Array[String] = null,
    test: js.UndefOr[Boolean] = js.undefined,
    typeCheck: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formattersDirectory != null) __obj.updateDynamic("formattersDirectory")(formattersDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(init)) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (out != null) __obj.updateDynamic("out")(out.asInstanceOf[js.Any])
    if (!js.isUndefined(outputAbsolutePaths)) __obj.updateDynamic("outputAbsolutePaths")(outputAbsolutePaths.asInstanceOf[js.Any])
    if (!js.isUndefined(printConfig)) __obj.updateDynamic("printConfig")(printConfig.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (rulesDirectory != null) __obj.updateDynamic("rulesDirectory")(rulesDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (!js.isUndefined(typeCheck)) __obj.updateDynamic("typeCheck")(typeCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


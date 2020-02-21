package typings.yargs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionalOptions extends js.Object {
  /** string or array of strings, see `alias()` */
  var alias: js.UndefOr[String | js.Array[String]] = js.undefined
  /** boolean, interpret option as an array, see `array()` */
  var array: js.UndefOr[Boolean] = js.undefined
  /** value or array of values, limit valid option arguments to a predefined set, see `choices()` */
  var choices: js.UndefOr[Choices] = js.undefined
  /** function, coerce or transform parsed command line values into another value, see `coerce()` */
  var coerce: js.UndefOr[js.Function1[/* arg */ js.Any, _]] = js.undefined
  /** string or object, require certain keys not to be set, see `conflicts()` */
  var conflicts: js.UndefOr[String | js.Array[String] | (StringDictionary[String | js.Array[String]])] = js.undefined
  /** value, set a default value for the option, see `default()` */
  var default: js.UndefOr[js.Any] = js.undefined
  /** boolean or string, demand the option be given, with optional error message, see `demandOption()` */
  var demandOption: js.UndefOr[Boolean | String] = js.undefined
  /** string, the option description for help content, see `describe()` */
  var desc: js.UndefOr[String] = js.undefined
  /** string, the option description for help content, see `describe()` */
  var describe: js.UndefOr[String] = js.undefined
  /** string, the option description for help content, see `describe()` */
  var description: js.UndefOr[String] = js.undefined
  /** string or object, require certain keys to be set, see `implies()` */
  var implies: js.UndefOr[String | js.Array[String] | (StringDictionary[String | js.Array[String]])] = js.undefined
  /** boolean, apply path.normalize() to the option, see normalize() */
  var normalize: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[PositionalOptionsType] = js.undefined
}

object PositionalOptions {
  @scala.inline
  def apply(
    alias: String | js.Array[String] = null,
    array: js.UndefOr[Boolean] = js.undefined,
    choices: Choices = null,
    coerce: /* arg */ js.Any => _ = null,
    conflicts: String | js.Array[String] | (StringDictionary[String | js.Array[String]]) = null,
    default: js.Any = null,
    demandOption: Boolean | String = null,
    desc: String = null,
    describe: String = null,
    description: String = null,
    implies: String | js.Array[String] | (StringDictionary[String | js.Array[String]]) = null,
    normalize: js.UndefOr[Boolean] = js.undefined,
    `type`: PositionalOptionsType = null
  ): PositionalOptions = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(array)) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (coerce != null) __obj.updateDynamic("coerce")(js.Any.fromFunction1(coerce))
    if (conflicts != null) __obj.updateDynamic("conflicts")(conflicts.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (demandOption != null) __obj.updateDynamic("demandOption")(demandOption.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc.asInstanceOf[js.Any])
    if (describe != null) __obj.updateDynamic("describe")(describe.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (implies != null) __obj.updateDynamic("implies")(implies.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionalOptions]
  }
}


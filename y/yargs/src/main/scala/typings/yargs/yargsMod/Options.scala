package typings.yargs.yargsMod

import org.scalablytyped.runtime.StringDictionary
import typings.yargs.yargsStrings.array
import typings.yargs.yargsStrings.count
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** string or array of strings, alias(es) for the canonical option key, see `alias()` */
  var alias: js.UndefOr[String | js.Array[String]] = js.undefined
  /** boolean, interpret option as an array, see `array()` */
  var array: js.UndefOr[Boolean] = js.undefined
  /**  boolean, interpret option as a boolean flag, see `boolean()` */
  var boolean: js.UndefOr[Boolean] = js.undefined
  /** value or array of values, limit valid option arguments to a predefined set, see `choices()` */
  var choices: js.UndefOr[Choices] = js.undefined
  /** function, coerce or transform parsed command line values into another value, see `coerce()` */
  var coerce: js.UndefOr[js.Function1[/* arg */ js.Any, _]] = js.undefined
  /** boolean, interpret option as a path to a JSON config file, see `config()` */
  var config: js.UndefOr[Boolean] = js.undefined
  /** function, provide a custom config parsing function, see `config()` */
  var configParser: js.UndefOr[js.Function1[/* configPath */ String, js.Object]] = js.undefined
  /** string or object, require certain keys not to be set, see `conflicts()` */
  var conflicts: js.UndefOr[String | js.Array[String] | (StringDictionary[String | js.Array[String]])] = js.undefined
  /** boolean, interpret option as a count of boolean flags, see `count()` */
  var count: js.UndefOr[Boolean] = js.undefined
  /** value, set a default value for the option, see `default()` */
  var default: js.UndefOr[js.Any] = js.undefined
  /** string, use this description for the default value in help content, see `default()` */
  var defaultDescription: js.UndefOr[String] = js.undefined
  /**
    *  @deprecated since version 6.6.0
    *  Use 'demandOption' instead
    */
  var demand: js.UndefOr[Boolean | String] = js.undefined
  /** boolean or string, demand the option be given, with optional error message, see `demandOption()` */
  var demandOption: js.UndefOr[Boolean | String] = js.undefined
  /** string, the option description for help content, see `describe()` */
  var desc: js.UndefOr[String] = js.undefined
  /** string, the option description for help content, see `describe()` */
  var describe: js.UndefOr[String] = js.undefined
  /** string, the option description for help content, see `describe()` */
  var description: js.UndefOr[String] = js.undefined
  /** boolean, indicate that this key should not be reset when a command is invoked, see `global()` */
  var global: js.UndefOr[Boolean] = js.undefined
  /** string, when displaying usage instructions place the option under an alternative group heading, see `group()` */
  var group: js.UndefOr[String] = js.undefined
  /** don't display option in help output. */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /**  string or object, require certain keys to be set, see `implies()` */
  var implies: js.UndefOr[String | js.Array[String] | (StringDictionary[String | js.Array[String]])] = js.undefined
  /** number, specify how many arguments should be consumed for the option, see `nargs()` */
  var nargs: js.UndefOr[Double] = js.undefined
  /** boolean, apply path.normalize() to the option, see `normalize()` */
  var normalize: js.UndefOr[Boolean] = js.undefined
  /** boolean, interpret option as a number, `number()` */
  var number: js.UndefOr[Boolean] = js.undefined
  /**
    *  @deprecated since version 6.6.0
    *  Use 'demandOption' instead
    */
  var require: js.UndefOr[Boolean | String] = js.undefined
  /**
    *  @deprecated since version 6.6.0
    *  Use 'demandOption' instead
    */
  var required: js.UndefOr[Boolean | String] = js.undefined
  /** boolean, require the option be specified with a value, see `requiresArg()` */
  var requiresArg: js.UndefOr[Boolean] = js.undefined
  /** boolean, skips validation if the option is present, see `skipValidation()` */
  var skipValidation: js.UndefOr[Boolean] = js.undefined
  /** boolean, interpret option as a string, see `string()` */
  var string: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[array | count | PositionalOptionsType] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alias: String | js.Array[String] = null,
    array: js.UndefOr[Boolean] = js.undefined,
    boolean: js.UndefOr[Boolean] = js.undefined,
    choices: Choices = null,
    coerce: /* arg */ js.Any => _ = null,
    config: js.UndefOr[Boolean] = js.undefined,
    configParser: /* configPath */ String => js.Object = null,
    conflicts: String | js.Array[String] | (StringDictionary[String | js.Array[String]]) = null,
    count: js.UndefOr[Boolean] = js.undefined,
    default: js.Any = null,
    defaultDescription: String = null,
    demand: Boolean | String = null,
    demandOption: Boolean | String = null,
    desc: String = null,
    describe: String = null,
    description: String = null,
    global: js.UndefOr[Boolean] = js.undefined,
    group: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    implies: String | js.Array[String] | (StringDictionary[String | js.Array[String]]) = null,
    nargs: Int | Double = null,
    normalize: js.UndefOr[Boolean] = js.undefined,
    number: js.UndefOr[Boolean] = js.undefined,
    require: Boolean | String = null,
    required: Boolean | String = null,
    requiresArg: js.UndefOr[Boolean] = js.undefined,
    skipValidation: js.UndefOr[Boolean] = js.undefined,
    string: js.UndefOr[Boolean] = js.undefined,
    `type`: array | count | PositionalOptionsType = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(array)) __obj.updateDynamic("array")(array)
    if (!js.isUndefined(boolean)) __obj.updateDynamic("boolean")(boolean)
    if (choices != null) __obj.updateDynamic("choices")(choices)
    if (coerce != null) __obj.updateDynamic("coerce")(js.Any.fromFunction1(coerce))
    if (!js.isUndefined(config)) __obj.updateDynamic("config")(config)
    if (configParser != null) __obj.updateDynamic("configParser")(js.Any.fromFunction1(configParser))
    if (conflicts != null) __obj.updateDynamic("conflicts")(conflicts.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count)
    if (default != null) __obj.updateDynamic("default")(default)
    if (defaultDescription != null) __obj.updateDynamic("defaultDescription")(defaultDescription)
    if (demand != null) __obj.updateDynamic("demand")(demand.asInstanceOf[js.Any])
    if (demandOption != null) __obj.updateDynamic("demandOption")(demandOption.asInstanceOf[js.Any])
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (describe != null) __obj.updateDynamic("describe")(describe)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (group != null) __obj.updateDynamic("group")(group)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (implies != null) __obj.updateDynamic("implies")(implies.asInstanceOf[js.Any])
    if (nargs != null) __obj.updateDynamic("nargs")(nargs.asInstanceOf[js.Any])
    if (!js.isUndefined(normalize)) __obj.updateDynamic("normalize")(normalize)
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number)
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(requiresArg)) __obj.updateDynamic("requiresArg")(requiresArg)
    if (!js.isUndefined(skipValidation)) __obj.updateDynamic("skipValidation")(skipValidation)
    if (!js.isUndefined(string)) __obj.updateDynamic("string")(string)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


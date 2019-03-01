package typings
package yargsLib.yargsMod.yargsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var alias: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var array: js.UndefOr[scala.Boolean] = js.undefined
  var boolean: js.UndefOr[scala.Boolean] = js.undefined
  var choices: js.UndefOr[Choices] = js.undefined
  var coerce: js.UndefOr[js.Function1[/* arg */ js.Any, _]] = js.undefined
  var config: js.UndefOr[scala.Boolean] = js.undefined
  var configParser: js.UndefOr[js.Function1[/* configPath */ java.lang.String, js.Object]] = js.undefined
  var conflicts: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]])
  ] = js.undefined
  var count: js.UndefOr[scala.Boolean] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var defaultDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    *  @deprecated since version 6.6.0
    *  Use 'demandOption' instead
    */
  var demand: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var demandOption: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var desc: js.UndefOr[java.lang.String] = js.undefined
  var describe: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var group: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var implies: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]])
  ] = js.undefined
  var nargs: js.UndefOr[scala.Double] = js.undefined
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  var number: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  @deprecated since version 6.6.0
    *  Use 'demandOption' instead
    */
  var require: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /**
    *  @deprecated since version 6.6.0
    *  Use 'demandOption' instead
    */
  var required: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  var requiresArg: js.UndefOr[scala.Boolean] = js.undefined
  var skipValidation: js.UndefOr[scala.Boolean] = js.undefined
  var string: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[
    yargsLib.yargsLibStrings.array | yargsLib.yargsLibStrings.count | PositionalOptionsType
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alias: java.lang.String | js.Array[java.lang.String] = null,
    array: js.UndefOr[scala.Boolean] = js.undefined,
    boolean: js.UndefOr[scala.Boolean] = js.undefined,
    choices: Choices = null,
    coerce: js.Function1[/* arg */ js.Any, _] = null,
    config: js.UndefOr[scala.Boolean] = js.undefined,
    configParser: js.Function1[/* configPath */ java.lang.String, js.Object] = null,
    conflicts: java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]) = null,
    count: js.UndefOr[scala.Boolean] = js.undefined,
    default: js.Any = null,
    defaultDescription: java.lang.String = null,
    demand: scala.Boolean | java.lang.String = null,
    demandOption: scala.Boolean | java.lang.String = null,
    desc: java.lang.String = null,
    describe: java.lang.String = null,
    description: java.lang.String = null,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    group: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    implies: java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]) = null,
    nargs: scala.Int | scala.Double = null,
    normalize: js.UndefOr[scala.Boolean] = js.undefined,
    number: js.UndefOr[scala.Boolean] = js.undefined,
    require: scala.Boolean | java.lang.String = null,
    required: scala.Boolean | java.lang.String = null,
    requiresArg: js.UndefOr[scala.Boolean] = js.undefined,
    skipValidation: js.UndefOr[scala.Boolean] = js.undefined,
    string: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: yargsLib.yargsLibStrings.array | yargsLib.yargsLibStrings.count | PositionalOptionsType = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(array)) __obj.updateDynamic("array")(array)
    if (!js.isUndefined(boolean)) __obj.updateDynamic("boolean")(boolean)
    if (choices != null) __obj.updateDynamic("choices")(choices)
    if (coerce != null) __obj.updateDynamic("coerce")(coerce)
    if (!js.isUndefined(config)) __obj.updateDynamic("config")(config)
    if (configParser != null) __obj.updateDynamic("configParser")(configParser)
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


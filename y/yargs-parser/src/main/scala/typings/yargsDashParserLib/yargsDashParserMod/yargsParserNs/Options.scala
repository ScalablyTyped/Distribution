package typings
package yargsDashParserLib.yargsDashParserMod.yargsParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var `--`: js.UndefOr[scala.Boolean] = js.undefined
  var alias: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ] = js.undefined
  var array: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var boolean: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var coerce: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Function1[/* arg */ js.Any, _]]] = js.undefined
  var config: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  ] = js.undefined
  var configuration: js.UndefOr[stdLib.Partial[Configuration]] = js.undefined
  var count: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var default: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var envPrefix: js.UndefOr[java.lang.String] = js.undefined
  var narg: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  var normalize: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var number: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var string: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    `--`: js.UndefOr[scala.Boolean] = js.undefined,
    alias: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]] = null,
    array: js.Array[java.lang.String] = null,
    boolean: js.Array[java.lang.String] = null,
    coerce: org.scalablytyped.runtime.StringDictionary[js.Function1[/* arg */ js.Any, _]] = null,
    config: java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Boolean] = null,
    configuration: stdLib.Partial[Configuration] = null,
    count: js.Array[java.lang.String] = null,
    default: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    envPrefix: java.lang.String = null,
    narg: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    normalize: js.Array[java.lang.String] = null,
    number: js.Array[java.lang.String] = null,
    string: js.Array[java.lang.String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`--`)) __obj.updateDynamic("--")(`--`)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (array != null) __obj.updateDynamic("array")(array)
    if (boolean != null) __obj.updateDynamic("boolean")(boolean)
    if (coerce != null) __obj.updateDynamic("coerce")(coerce)
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (count != null) __obj.updateDynamic("count")(count)
    if (default != null) __obj.updateDynamic("default")(default)
    if (envPrefix != null) __obj.updateDynamic("envPrefix")(envPrefix)
    if (narg != null) __obj.updateDynamic("narg")(narg)
    if (normalize != null) __obj.updateDynamic("normalize")(normalize)
    if (number != null) __obj.updateDynamic("number")(number)
    if (string != null) __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[Options]
  }
}


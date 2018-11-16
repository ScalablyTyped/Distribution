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
    java.lang.String | js.Array[java.lang.String] | (ScalablyTyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]])
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
    java.lang.String | js.Array[java.lang.String] | (ScalablyTyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]])
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


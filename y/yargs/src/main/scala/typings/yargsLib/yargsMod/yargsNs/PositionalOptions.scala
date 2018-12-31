package typings
package yargsLib.yargsMod.yargsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionalOptions extends js.Object {
  var alias: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var choices: js.UndefOr[Choices] = js.undefined
  var coerce: js.UndefOr[js.Function1[/* arg */ js.Any, _]] = js.undefined
  var conflicts: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]])
  ] = js.undefined
  var default: js.UndefOr[js.Any] = js.undefined
  var desc: js.UndefOr[java.lang.String] = js.undefined
  var describe: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var implies: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]])
  ] = js.undefined
  var normalize: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[PositionalOptionsType] = js.undefined
}


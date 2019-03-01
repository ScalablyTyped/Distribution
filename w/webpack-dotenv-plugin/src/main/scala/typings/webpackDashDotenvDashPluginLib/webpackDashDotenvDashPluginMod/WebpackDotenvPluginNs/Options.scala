package typings
package webpackDashDotenvDashPluginLib.webpackDashDotenvDashPluginMod.WebpackDotenvPluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowEmptyValues: js.UndefOr[scala.Boolean] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var sample: js.UndefOr[java.lang.String] = js.undefined
  var silent: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowEmptyValues: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    path: java.lang.String = null,
    sample: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmptyValues)) __obj.updateDynamic("allowEmptyValues")(allowEmptyValues)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (path != null) __obj.updateDynamic("path")(path)
    if (sample != null) __obj.updateDynamic("sample")(sample)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[Options]
  }
}


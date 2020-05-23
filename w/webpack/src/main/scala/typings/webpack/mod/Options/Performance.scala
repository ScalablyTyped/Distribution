package typings.webpack.mod.Options

import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackStrings.error
import typings.webpack.webpackStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Performance extends js.Object {
  /** This property allows webpack to control what files are used to calculate performance hints. */
  var assetFilter: js.UndefOr[js.Function1[/* assetFilename */ String, Boolean]] = js.undefined
  /**
    * Turns hints on/off. In addition, tells webpack to throw either an error or a warning when hints are
    * found. This property is set to "warning" by default.
    */
  var hints: js.UndefOr[warning | error | `false`] = js.undefined
  /**
    * An asset is any emitted file from webpack. This option controls when webpack emits a performance hint
    * based on individual asset size. The default value is 250000 (bytes).
    */
  var maxAssetSize: js.UndefOr[Double] = js.undefined
  /**
    * An entrypoint represents all assets that would be utilized during initial load time for a specific entry.
    * This option controls when webpack should emit performance hints based on the maximum entrypoint size.
    * The default value is 250000 (bytes).
    */
  var maxEntrypointSize: js.UndefOr[Double] = js.undefined
}

object Performance {
  @scala.inline
  def apply(
    assetFilter: /* assetFilename */ String => Boolean = null,
    hints: warning | error | `false` = null,
    maxAssetSize: js.UndefOr[Double] = js.undefined,
    maxEntrypointSize: js.UndefOr[Double] = js.undefined
  ): Performance = {
    val __obj = js.Dynamic.literal()
    if (assetFilter != null) __obj.updateDynamic("assetFilter")(js.Any.fromFunction1(assetFilter))
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAssetSize)) __obj.updateDynamic("maxAssetSize")(maxAssetSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxEntrypointSize)) __obj.updateDynamic("maxEntrypointSize")(maxEntrypointSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Performance]
  }
}


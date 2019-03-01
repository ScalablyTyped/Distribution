package typings
package yeomanDashTestLib.yeomanDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunContextSettings extends js.Object {
  /**
  	 * Namespace (only used if Generator is a constructor)
  	 * @default 'gen:test'
  	 */
  var namespace: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * File path to the generator (only used if Generator is a constructor)
  	 */
  var resolved: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Automatically run this generator in a tmp dir
  	 * @default true
  	 */
  var tmpdir: js.UndefOr[scala.Boolean] = js.undefined
}

object RunContextSettings {
  @scala.inline
  def apply(
    namespace: java.lang.String = null,
    resolved: java.lang.String = null,
    tmpdir: js.UndefOr[scala.Boolean] = js.undefined
  ): RunContextSettings = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (resolved != null) __obj.updateDynamic("resolved")(resolved)
    if (!js.isUndefined(tmpdir)) __obj.updateDynamic("tmpdir")(tmpdir)
    __obj.asInstanceOf[RunContextSettings]
  }
}


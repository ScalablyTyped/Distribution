package typings.yeomanDashTest.yeomanDashTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunContextSettings extends js.Object {
  /**
  	 * Namespace (only used if Generator is a constructor)
  	 * @default 'gen:test'
  	 */
  var namespace: js.UndefOr[String] = js.undefined
  /**
  	 * File path to the generator (only used if Generator is a constructor)
  	 */
  var resolved: js.UndefOr[String] = js.undefined
  /**
  	 * Automatically run this generator in a tmp dir
  	 * @default true
  	 */
  var tmpdir: js.UndefOr[Boolean] = js.undefined
}

object RunContextSettings {
  @scala.inline
  def apply(namespace: String = null, resolved: String = null, tmpdir: js.UndefOr[Boolean] = js.undefined): RunContextSettings = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (resolved != null) __obj.updateDynamic("resolved")(resolved.asInstanceOf[js.Any])
    if (!js.isUndefined(tmpdir)) __obj.updateDynamic("tmpdir")(tmpdir.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunContextSettings]
  }
}


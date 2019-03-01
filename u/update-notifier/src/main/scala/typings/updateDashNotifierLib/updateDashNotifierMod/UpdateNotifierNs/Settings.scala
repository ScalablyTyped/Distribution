package typings
package updateDashNotifierLib.updateDashNotifierMod.UpdateNotifierNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var callback: js.UndefOr[
    js.Function2[/* error */ stdLib.Error | scala.Null, /* update */ js.UndefOr[UpdateInfo], _]
  ] = js.undefined
  var packageName: js.UndefOr[java.lang.String] = js.undefined
  var packageVersion: js.UndefOr[java.lang.String] = js.undefined
  var pkg: js.UndefOr[Package] = js.undefined
   // in milliseconds, default 1000 * 60 * 60 * 24 (1 day)
  var shouldNotifyInNpmScript: js.UndefOr[scala.Boolean] = js.undefined
  var updateCheckInterval: js.UndefOr[scala.Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* update */ js.UndefOr[UpdateInfo], _] = null,
    packageName: java.lang.String = null,
    packageVersion: java.lang.String = null,
    pkg: Package = null,
    shouldNotifyInNpmScript: js.UndefOr[scala.Boolean] = js.undefined,
    updateCheckInterval: scala.Int | scala.Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (packageName != null) __obj.updateDynamic("packageName")(packageName)
    if (packageVersion != null) __obj.updateDynamic("packageVersion")(packageVersion)
    if (pkg != null) __obj.updateDynamic("pkg")(pkg)
    if (!js.isUndefined(shouldNotifyInNpmScript)) __obj.updateDynamic("shouldNotifyInNpmScript")(shouldNotifyInNpmScript)
    if (updateCheckInterval != null) __obj.updateDynamic("updateCheckInterval")(updateCheckInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}


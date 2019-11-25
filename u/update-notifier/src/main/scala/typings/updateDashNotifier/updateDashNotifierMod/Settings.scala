package typings.updateDashNotifier.updateDashNotifierMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var callback: js.UndefOr[js.Function2[/* error */ Error | Null, /* update */ js.UndefOr[UpdateInfo], _]] = js.undefined
  var packageName: js.UndefOr[String] = js.undefined
  var packageVersion: js.UndefOr[String] = js.undefined
  var pkg: js.UndefOr[Package] = js.undefined
   // in milliseconds, default 1000 * 60 * 60 * 24 (1 day)
  var shouldNotifyInNpmScript: js.UndefOr[Boolean] = js.undefined
  var updateCheckInterval: js.UndefOr[Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    callback: (/* error */ Error | Null, /* update */ js.UndefOr[UpdateInfo]) => _ = null,
    packageName: String = null,
    packageVersion: String = null,
    pkg: Package = null,
    shouldNotifyInNpmScript: js.UndefOr[Boolean] = js.undefined,
    updateCheckInterval: Int | Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (packageVersion != null) __obj.updateDynamic("packageVersion")(packageVersion.asInstanceOf[js.Any])
    if (pkg != null) __obj.updateDynamic("pkg")(pkg.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldNotifyInNpmScript)) __obj.updateDynamic("shouldNotifyInNpmScript")(shouldNotifyInNpmScript.asInstanceOf[js.Any])
    if (updateCheckInterval != null) __obj.updateDynamic("updateCheckInterval")(updateCheckInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}


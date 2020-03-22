package typings.updateNotifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /** Which dist-tag to use to find the latest version */
  var distTag: js.UndefOr[String] = js.undefined
  /**
    * @deprecated use `pkg.name`
    */
  var packageName: js.UndefOr[String] = js.undefined
  /**
    * @deprecated use `pkg.version`
    */
  var packageVersion: js.UndefOr[String] = js.undefined
  var pkg: js.UndefOr[Package] = js.undefined
  /** Allows notification to be shown when running as an npm script */
  var shouldNotifyInNpmScript: js.UndefOr[Boolean] = js.undefined
  /** How often to check for updates */
  var updateCheckInterval: js.UndefOr[Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    distTag: String = null,
    packageName: String = null,
    packageVersion: String = null,
    pkg: Package = null,
    shouldNotifyInNpmScript: js.UndefOr[Boolean] = js.undefined,
    updateCheckInterval: Int | Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (distTag != null) __obj.updateDynamic("distTag")(distTag.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (packageVersion != null) __obj.updateDynamic("packageVersion")(packageVersion.asInstanceOf[js.Any])
    if (pkg != null) __obj.updateDynamic("pkg")(pkg.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldNotifyInNpmScript)) __obj.updateDynamic("shouldNotifyInNpmScript")(shouldNotifyInNpmScript.asInstanceOf[js.Any])
    if (updateCheckInterval != null) __obj.updateDynamic("updateCheckInterval")(updateCheckInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}


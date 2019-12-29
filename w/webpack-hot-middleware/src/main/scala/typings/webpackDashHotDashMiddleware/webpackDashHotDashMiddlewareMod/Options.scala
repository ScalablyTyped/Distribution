package typings.webpackDashHotDashMiddleware.webpackDashHotDashMiddlewareMod

import org.scalablytyped.runtime.StringDictionary
import typings.webpackDashHotDashMiddleware.webpackDashHotDashMiddlewareBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var ansiColors: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var autoConnect: js.UndefOr[Boolean] = js.undefined
  var dynamicPublicPath: js.UndefOr[Boolean] = js.undefined
  var heartbeat: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[`false` | Logger] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var noInfo: js.UndefOr[Boolean] = js.undefined
  var overlay: js.UndefOr[Boolean] = js.undefined
  var overlayStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var overlayWarnings: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
  var reload: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    ansiColors: StringDictionary[js.Any] = null,
    autoConnect: js.UndefOr[Boolean] = js.undefined,
    dynamicPublicPath: js.UndefOr[Boolean] = js.undefined,
    heartbeat: Int | Double = null,
    log: `false` | Logger = null,
    name: String = null,
    noInfo: js.UndefOr[Boolean] = js.undefined,
    overlay: js.UndefOr[Boolean] = js.undefined,
    overlayStyles: StringDictionary[js.Any] = null,
    overlayWarnings: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    reload: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (ansiColors != null) __obj.updateDynamic("ansiColors")(ansiColors.asInstanceOf[js.Any])
    if (!js.isUndefined(autoConnect)) __obj.updateDynamic("autoConnect")(autoConnect.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicPublicPath)) __obj.updateDynamic("dynamicPublicPath")(dynamicPublicPath.asInstanceOf[js.Any])
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noInfo)) __obj.updateDynamic("noInfo")(noInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (overlayStyles != null) __obj.updateDynamic("overlayStyles")(overlayStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayWarnings)) __obj.updateDynamic("overlayWarnings")(overlayWarnings.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


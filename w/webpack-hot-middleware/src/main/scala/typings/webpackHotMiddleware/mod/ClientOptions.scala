package typings.webpackHotMiddleware.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var ansiColors: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var autoConnect: js.UndefOr[Boolean] = js.undefined
  var dynamicPublicPath: js.UndefOr[Boolean] = js.undefined
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

object ClientOptions {
  @scala.inline
  def apply(
    ansiColors: StringDictionary[js.Any] = null,
    autoConnect: js.UndefOr[Boolean] = js.undefined,
    dynamicPublicPath: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    noInfo: js.UndefOr[Boolean] = js.undefined,
    overlay: js.UndefOr[Boolean] = js.undefined,
    overlayStyles: StringDictionary[js.Any] = null,
    overlayWarnings: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    reload: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (ansiColors != null) __obj.updateDynamic("ansiColors")(ansiColors.asInstanceOf[js.Any])
    if (!js.isUndefined(autoConnect)) __obj.updateDynamic("autoConnect")(autoConnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicPublicPath)) __obj.updateDynamic("dynamicPublicPath")(dynamicPublicPath.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(noInfo)) __obj.updateDynamic("noInfo")(noInfo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.get.asInstanceOf[js.Any])
    if (overlayStyles != null) __obj.updateDynamic("overlayStyles")(overlayStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(overlayWarnings)) __obj.updateDynamic("overlayWarnings")(overlayWarnings.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reload)) __obj.updateDynamic("reload")(reload.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}


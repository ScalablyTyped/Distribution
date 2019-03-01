package typings
package webpackDashEnvLib.underscoreUnderscoreWebpackModuleApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptOptions extends js.Object {
  /**
    * Indicates that apply() is automatically called by check function
    */
  var autoApply: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Ignore changes made to declined modules.
    */
  var ignoreDeclined: js.UndefOr[scala.Boolean] = js.undefined
  /**
    *  Ignore errors throw in accept handlers, error handlers and while reevaluating module.
    */
  var ignoreErrored: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true the update process continues even if some modules are not accepted (and would bubble to the entry point).
    */
  var ignoreUnaccepted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Notifier for accepted modules.
    */
  var onAccepted: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, scala.Unit]] = js.undefined
  /**
    * Notifier for declined modules.
    */
  var onDeclined: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, scala.Unit]] = js.undefined
  /**
    * Notifier for disposed modules.
    */
  var onDisposed: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, scala.Unit]] = js.undefined
  /**
    * Notifier for errors.
    */
  var onErrored: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, scala.Unit]] = js.undefined
  /**
    * Notifier for unaccepted modules.
    */
  var onUnaccepted: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, scala.Unit]] = js.undefined
}

object AcceptOptions {
  @scala.inline
  def apply(
    autoApply: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreDeclined: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreErrored: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreUnaccepted: js.UndefOr[scala.Boolean] = js.undefined,
    onAccepted: js.Function1[/* info */ HotNotifierInfo, scala.Unit] = null,
    onDeclined: js.Function1[/* info */ HotNotifierInfo, scala.Unit] = null,
    onDisposed: js.Function1[/* info */ HotNotifierInfo, scala.Unit] = null,
    onErrored: js.Function1[/* info */ HotNotifierInfo, scala.Unit] = null,
    onUnaccepted: js.Function1[/* info */ HotNotifierInfo, scala.Unit] = null
  ): AcceptOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoApply)) __obj.updateDynamic("autoApply")(autoApply)
    if (!js.isUndefined(ignoreDeclined)) __obj.updateDynamic("ignoreDeclined")(ignoreDeclined)
    if (!js.isUndefined(ignoreErrored)) __obj.updateDynamic("ignoreErrored")(ignoreErrored)
    if (!js.isUndefined(ignoreUnaccepted)) __obj.updateDynamic("ignoreUnaccepted")(ignoreUnaccepted)
    if (onAccepted != null) __obj.updateDynamic("onAccepted")(onAccepted)
    if (onDeclined != null) __obj.updateDynamic("onDeclined")(onDeclined)
    if (onDisposed != null) __obj.updateDynamic("onDisposed")(onDisposed)
    if (onErrored != null) __obj.updateDynamic("onErrored")(onErrored)
    if (onUnaccepted != null) __obj.updateDynamic("onUnaccepted")(onUnaccepted)
    __obj.asInstanceOf[AcceptOptions]
  }
}


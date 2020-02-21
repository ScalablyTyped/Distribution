package typings.welldoneSoftwareWhyDidYouRender.WhyDidYouRender

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhyDidYouRenderOptions extends js.Object {
  var collapseGroups: js.UndefOr[Boolean] = js.undefined
  var diffNameColor: js.UndefOr[String] = js.undefined
  var diffPathColor: js.UndefOr[String] = js.undefined
  var exclude: js.UndefOr[js.Array[RegExp]] = js.undefined
  var hotReloadBufferMs: js.UndefOr[Double] = js.undefined
  var include: js.UndefOr[js.Array[RegExp]] = js.undefined
  var logOnDifferentValues: js.UndefOr[Boolean] = js.undefined
  var notifier: js.UndefOr[js.Function1[/* options */ UpdateInfo, Unit]] = js.undefined
  var onlyLogs: js.UndefOr[Boolean] = js.undefined
  var titleColor: js.UndefOr[String] = js.undefined
  var trackExtraHooks: js.UndefOr[js.Array[ExtraHookToTrack]] = js.undefined
  var trackHooks: js.UndefOr[Boolean] = js.undefined
}

object WhyDidYouRenderOptions {
  @scala.inline
  def apply(
    collapseGroups: js.UndefOr[Boolean] = js.undefined,
    diffNameColor: String = null,
    diffPathColor: String = null,
    exclude: js.Array[RegExp] = null,
    hotReloadBufferMs: Int | Double = null,
    include: js.Array[RegExp] = null,
    logOnDifferentValues: js.UndefOr[Boolean] = js.undefined,
    notifier: /* options */ UpdateInfo => Unit = null,
    onlyLogs: js.UndefOr[Boolean] = js.undefined,
    titleColor: String = null,
    trackExtraHooks: js.Array[ExtraHookToTrack] = null,
    trackHooks: js.UndefOr[Boolean] = js.undefined
  ): WhyDidYouRenderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapseGroups)) __obj.updateDynamic("collapseGroups")(collapseGroups.asInstanceOf[js.Any])
    if (diffNameColor != null) __obj.updateDynamic("diffNameColor")(diffNameColor.asInstanceOf[js.Any])
    if (diffPathColor != null) __obj.updateDynamic("diffPathColor")(diffPathColor.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (hotReloadBufferMs != null) __obj.updateDynamic("hotReloadBufferMs")(hotReloadBufferMs.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(logOnDifferentValues)) __obj.updateDynamic("logOnDifferentValues")(logOnDifferentValues.asInstanceOf[js.Any])
    if (notifier != null) __obj.updateDynamic("notifier")(js.Any.fromFunction1(notifier))
    if (!js.isUndefined(onlyLogs)) __obj.updateDynamic("onlyLogs")(onlyLogs.asInstanceOf[js.Any])
    if (titleColor != null) __obj.updateDynamic("titleColor")(titleColor.asInstanceOf[js.Any])
    if (trackExtraHooks != null) __obj.updateDynamic("trackExtraHooks")(trackExtraHooks.asInstanceOf[js.Any])
    if (!js.isUndefined(trackHooks)) __obj.updateDynamic("trackHooks")(trackHooks.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhyDidYouRenderOptions]
  }
}


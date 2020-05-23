package typings.typescript.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatchOptions
  extends /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] {
  var fallbackPolling: js.UndefOr[PollingWatchKind] = js.undefined
  var synchronousWatchDirectory: js.UndefOr[Boolean] = js.undefined
  var watchDirectory: js.UndefOr[WatchDirectoryKind] = js.undefined
  var watchFile: js.UndefOr[WatchFileKind] = js.undefined
}

object WatchOptions {
  @scala.inline
  def apply(
    StringDictionary: /* option */ StringDictionary[js.UndefOr[CompilerOptionsValue]] = null,
    fallbackPolling: PollingWatchKind = null,
    synchronousWatchDirectory: js.UndefOr[Boolean] = js.undefined,
    watchDirectory: WatchDirectoryKind = null,
    watchFile: WatchFileKind = null
  ): WatchOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (fallbackPolling != null) __obj.updateDynamic("fallbackPolling")(fallbackPolling.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronousWatchDirectory)) __obj.updateDynamic("synchronousWatchDirectory")(synchronousWatchDirectory.get.asInstanceOf[js.Any])
    if (watchDirectory != null) __obj.updateDynamic("watchDirectory")(watchDirectory.asInstanceOf[js.Any])
    if (watchFile != null) __obj.updateDynamic("watchFile")(watchFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatchOptions]
  }
}


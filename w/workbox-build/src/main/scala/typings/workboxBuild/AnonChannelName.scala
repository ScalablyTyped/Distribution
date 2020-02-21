package typings.workboxBuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannelName extends js.Object {
  /**
    * The `channelName` property to use when creating the
    * [`BroadcastCacheUpdatePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-broadcast-update.BroadcastUpdatePlugin).
    */
  var channelName: js.UndefOr[String] = js.undefined
  /**
    * The `options` property to use when creating the
    * [`BroadcastCacheUpdatePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-broadcast-update.BroadcastUpdatePlugin).
    */
  var options: js.UndefOr[js.Object] = js.undefined
}

object AnonChannelName {
  @scala.inline
  def apply(channelName: String = null, options: js.Object = null): AnonChannelName = {
    val __obj = js.Dynamic.literal()
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannelName]
  }
}


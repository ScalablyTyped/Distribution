package typings.workboxBuild.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelName extends js.Object {
  /**
    * The `channelName` property to use when creating the
    * [`BroadcastCacheUpdatePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-broadcast-update.BroadcastUpdatePlugin).
    */
  var channelName: js.UndefOr[String] = js.native
  /**
    * The `options` property to use when creating the
    * [`BroadcastCacheUpdatePlugin`](https://developers.google.com/web/tools/workbox/reference-docs/latest/module-workbox-broadcast-update.BroadcastUpdatePlugin).
    */
  var options: js.UndefOr[js.Object] = js.native
}

object ChannelName {
  @scala.inline
  def apply(): ChannelName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelName]
  }
  @scala.inline
  implicit class ChannelNameOps[Self <: ChannelName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannelName(value: String): Self = this.set("channelName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelName: Self = this.set("channelName", js.undefined)
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}


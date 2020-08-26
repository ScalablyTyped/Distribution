package typings.webpackAssetsManifest.anon

import typings.tapable.mod.SyncHook
import typings.tapable.mod.SyncWaterfallHook
import typings.webpackAssetsManifest.mod.AnyObject
import typings.webpackAssetsManifest.mod.Entry
import typings.webpackAssetsManifest.mod.Options
import typings.webpackAssetsManifest.mod.WebpackAssetsManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterOptions extends js.Object {
  var afterOptions: SyncHook[Options, _, _] = js.native
  @JSName("apply")
  var apply: SyncHook[WebpackAssetsManifest, _, _] = js.native
  /**
    * The `SyncWaterfallHook` class supports 3 type parameters only but this hook actually has 4 parameters. The type of 4th parameter is `AnyObject`.
    *
    * Refer to https://github.com/webdeveric/webpack-assets-manifest#hooks for details
    */
  var customize: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest] = js.native
  var done: SyncHook[WebpackAssetsManifest, AnyObject, _] = js.native
  var options: SyncWaterfallHook[Options, _, _] = js.native
  var transform: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, _] = js.native
}

object AfterOptions {
  @scala.inline
  def apply(
    afterOptions: SyncHook[Options, _, _],
    apply: SyncHook[WebpackAssetsManifest, _, _],
    customize: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest],
    done: SyncHook[WebpackAssetsManifest, AnyObject, _],
    options: SyncWaterfallHook[Options, _, _],
    transform: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, _]
  ): AfterOptions = {
    val __obj = js.Dynamic.literal(afterOptions = afterOptions.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], customize = customize.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterOptions]
  }
  @scala.inline
  implicit class AfterOptionsOps[Self <: AfterOptions] (val x: Self) extends AnyVal {
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
    def setAfterOptions(value: SyncHook[Options, _, _]): Self = this.set("afterOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setApply(value: SyncHook[WebpackAssetsManifest, _, _]): Self = this.set("apply", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomize(value: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest]): Self = this.set("customize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDone(value: SyncHook[WebpackAssetsManifest, AnyObject, _]): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: SyncWaterfallHook[Options, _, _]): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransform(value: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, _]): Self = this.set("transform", value.asInstanceOf[js.Any])
  }
  
}


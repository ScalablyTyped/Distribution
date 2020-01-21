package typings.webpackAssetsManifest

import typings.tapable.mod.SyncHook
import typings.tapable.mod.SyncWaterfallHook
import typings.webpackAssetsManifest.mod.AnyObject
import typings.webpackAssetsManifest.mod.Entry
import typings.webpackAssetsManifest.mod.Options
import typings.webpackAssetsManifest.mod.WebpackAssetsManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterOptions extends js.Object {
  var afterOptions: SyncHook[Options, _, _]
  @JSName("apply")
  var apply: SyncHook[WebpackAssetsManifest, _, _]
  /**
  		 * The `SyncWaterfallHook` class supports 3 type parameters only but this hook actually has 4 parameters. The type of 4th parameter is `AnyObject`.
  		 *
  		 * Refer to https://github.com/webdeveric/webpack-assets-manifest#hooks for details
  		 */
  var customize: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest]
  var done: SyncHook[WebpackAssetsManifest, AnyObject, _]
  var options: SyncWaterfallHook[Options, _, _]
  var transform: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, _]
}

object AnonAfterOptions {
  @scala.inline
  def apply(
    afterOptions: SyncHook[Options, _, _],
    apply: SyncHook[WebpackAssetsManifest, _, _],
    customize: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest],
    done: SyncHook[WebpackAssetsManifest, AnyObject, _],
    options: SyncWaterfallHook[Options, _, _],
    transform: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, _]
  ): AnonAfterOptions = {
    val __obj = js.Dynamic.literal(afterOptions = afterOptions.asInstanceOf[js.Any], apply = apply.asInstanceOf[js.Any], customize = customize.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAfterOptions]
  }
}


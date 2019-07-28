package typings.webpackDashAssetsDashManifest

import typings.tapable.tapableMod.SyncHook
import typings.tapable.tapableMod.SyncWaterfallHook
import typings.webpackDashAssetsDashManifest.webpackDashAssetsDashManifestMod.AnyObject
import typings.webpackDashAssetsDashManifest.webpackDashAssetsDashManifestMod.Entry
import typings.webpackDashAssetsDashManifest.webpackDashAssetsDashManifestMod.Options
import typings.webpackDashAssetsDashManifest.webpackDashAssetsDashManifestMod.WebpackAssetsManifest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterOptions extends js.Object {
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

object Anon_AfterOptions {
  @scala.inline
  def apply(
    afterOptions: SyncHook[Options, _, _],
    apply: SyncHook[WebpackAssetsManifest, _, _],
    customize: SyncWaterfallHook[Entry, AnyObject, WebpackAssetsManifest],
    done: SyncHook[WebpackAssetsManifest, AnyObject, _],
    options: SyncWaterfallHook[Options, _, _],
    transform: SyncWaterfallHook[AnyObject, WebpackAssetsManifest, _]
  ): Anon_AfterOptions = {
    val __obj = js.Dynamic.literal(afterOptions = afterOptions, apply = apply, customize = customize, done = done, options = options, transform = transform)
  
    __obj.asInstanceOf[Anon_AfterOptions]
  }
}


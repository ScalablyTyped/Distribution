package typings.webpack.mod.compilation

import typings.tapable.mod.SyncHook
import typings.tapable.mod.SyncWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleTemplateHooks extends js.Object {
  @JSName("package")
  var _package: SyncWaterfallHook[_, _, _]
  var content: SyncWaterfallHook[_, _, _]
  var hash: SyncHook[_, _, _]
  var module: SyncWaterfallHook[_, _, _]
  var render: SyncWaterfallHook[_, _, _]
}

object ModuleTemplateHooks {
  @scala.inline
  def apply(
    _package: SyncWaterfallHook[_, _, _],
    content: SyncWaterfallHook[_, _, _],
    hash: SyncHook[_, _, _],
    module: SyncWaterfallHook[_, _, _],
    render: SyncWaterfallHook[_, _, _]
  ): ModuleTemplateHooks = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleTemplateHooks]
  }
}


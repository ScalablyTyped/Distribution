package typings.webpack.webpackMod.compilation

import typings.tapable.tapableMod.SyncHook
import typings.tapable.tapableMod.SyncWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleTemplateHooks extends js.Object {
  var content: SyncWaterfallHook[_, _, _]
  var hash: SyncHook[_, _, _]
  var module: SyncWaterfallHook[_, _, _]
  var `package`: SyncWaterfallHook[_, _, _]
  var render: SyncWaterfallHook[_, _, _]
}

object ModuleTemplateHooks {
  @scala.inline
  def apply(
    content: SyncWaterfallHook[_, _, _],
    hash: SyncHook[_, _, _],
    module: SyncWaterfallHook[_, _, _],
    `package`: SyncWaterfallHook[_, _, _],
    render: SyncWaterfallHook[_, _, _]
  ): ModuleTemplateHooks = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(`package`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleTemplateHooks]
  }
}


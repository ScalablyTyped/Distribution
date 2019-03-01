package typings
package webpackLib.webpackMod.webpackNs.compilationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleTemplateHooks extends js.Object {
  var content: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
  var hash: tapableLib.tapableMod.SyncHook[_, _, _]
  var module: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
  var `package`: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
  var render: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
}

object ModuleTemplateHooks {
  @scala.inline
  def apply(
    content: tapableLib.tapableMod.SyncWaterfallHook[_, _, _],
    hash: tapableLib.tapableMod.SyncHook[_, _, _],
    module: tapableLib.tapableMod.SyncWaterfallHook[_, _, _],
    `package`: tapableLib.tapableMod.SyncWaterfallHook[_, _, _],
    render: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
  ): ModuleTemplateHooks = {
    val __obj = js.Dynamic.literal(`package` = `package`)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("module")(module)
    __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[ModuleTemplateHooks]
  }
}


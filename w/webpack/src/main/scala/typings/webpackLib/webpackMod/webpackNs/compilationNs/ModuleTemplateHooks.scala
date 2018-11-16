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


package typings
package webpackLib.webpackMod.webpackNs.compilationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalModuleFactoryHooks extends js.Object {
  var afterResolve: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _]
  var beforeResolve: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _]
  var createGenerator: tapableLib.tapableMod.HookMap[_, _, _]
  var createModule: tapableLib.tapableMod.SyncBailHook[_, _, _, _]
  var createParser: tapableLib.tapableMod.HookMap[_, _, _]
  var factory: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
  var generator: tapableLib.tapableMod.HookMap[_, _, _]
  var module: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
  var parser: tapableLib.tapableMod.HookMap[_, _, _]
  var resolver: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
}


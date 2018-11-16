package typings
package webpackLib.webpackMod.webpackNs.compilationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContextModuleFactoryHooks extends js.Object {
  var afterResolve: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _]
  var alternatives: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _]
  var beforeResolve: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _]
  var contextModuleFiles: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
}


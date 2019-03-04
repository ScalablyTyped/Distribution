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

object ContextModuleFactoryHooks {
  @scala.inline
  def apply(
    afterResolve: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _],
    alternatives: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _],
    beforeResolve: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _],
    contextModuleFiles: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
  ): ContextModuleFactoryHooks = {
    val __obj = js.Dynamic.literal(afterResolve = afterResolve, alternatives = alternatives, beforeResolve = beforeResolve, contextModuleFiles = contextModuleFiles)
  
    __obj.asInstanceOf[ContextModuleFactoryHooks]
  }
}


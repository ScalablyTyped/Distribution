package typings.webpack.webpackMod.compilation

import typings.tapable.tapableMod.AsyncSeriesWaterfallHook
import typings.tapable.tapableMod.SyncWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextModuleFactoryHooks extends js.Object {
  var afterResolve: AsyncSeriesWaterfallHook[_, _, _]
  var alternatives: AsyncSeriesWaterfallHook[_, _, _]
  var beforeResolve: AsyncSeriesWaterfallHook[_, _, _]
  var contextModuleFiles: SyncWaterfallHook[_, _, _]
}

object ContextModuleFactoryHooks {
  @scala.inline
  def apply(
    afterResolve: AsyncSeriesWaterfallHook[_, _, _],
    alternatives: AsyncSeriesWaterfallHook[_, _, _],
    beforeResolve: AsyncSeriesWaterfallHook[_, _, _],
    contextModuleFiles: SyncWaterfallHook[_, _, _]
  ): ContextModuleFactoryHooks = {
    val __obj = js.Dynamic.literal(afterResolve = afterResolve, alternatives = alternatives, beforeResolve = beforeResolve, contextModuleFiles = contextModuleFiles)
  
    __obj.asInstanceOf[ContextModuleFactoryHooks]
  }
}


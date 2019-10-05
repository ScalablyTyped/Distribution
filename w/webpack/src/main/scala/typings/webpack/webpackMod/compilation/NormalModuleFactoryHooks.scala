package typings.webpack.webpackMod.compilation

import typings.tapable.tapableMod.AsyncSeriesWaterfallHook
import typings.tapable.tapableMod.HookMap
import typings.tapable.tapableMod.SyncBailHook
import typings.tapable.tapableMod.SyncWaterfallHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NormalModuleFactoryHooks extends js.Object {
  var afterResolve: AsyncSeriesWaterfallHook[_, _, _]
  var beforeResolve: AsyncSeriesWaterfallHook[_, _, _]
  var createGenerator: HookMap[_, _, _]
  var createModule: SyncBailHook[_, _, _, _]
  var createParser: HookMap[_, _, _]
  var factory: SyncWaterfallHook[_, _, _]
  var generator: HookMap[_, _, _]
  var module: SyncWaterfallHook[_, _, _]
  var parser: HookMap[_, _, _]
  var resolver: SyncWaterfallHook[_, _, _]
}

object NormalModuleFactoryHooks {
  @scala.inline
  def apply(
    afterResolve: AsyncSeriesWaterfallHook[_, _, _],
    beforeResolve: AsyncSeriesWaterfallHook[_, _, _],
    createGenerator: HookMap[_, _, _],
    createModule: SyncBailHook[_, _, _, _],
    createParser: HookMap[_, _, _],
    factory: SyncWaterfallHook[_, _, _],
    generator: HookMap[_, _, _],
    module: SyncWaterfallHook[_, _, _],
    parser: HookMap[_, _, _],
    resolver: SyncWaterfallHook[_, _, _]
  ): NormalModuleFactoryHooks = {
    val __obj = js.Dynamic.literal(afterResolve = afterResolve, beforeResolve = beforeResolve, createGenerator = createGenerator, createModule = createModule, createParser = createParser, factory = factory, generator = generator, module = module, parser = parser, resolver = resolver)
  
    __obj.asInstanceOf[NormalModuleFactoryHooks]
  }
}


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

object NormalModuleFactoryHooks {
  @scala.inline
  def apply(
    afterResolve: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _],
    beforeResolve: tapableLib.tapableMod.AsyncSeriesWaterfallHook[_, _, _],
    createGenerator: tapableLib.tapableMod.HookMap[_, _, _],
    createModule: tapableLib.tapableMod.SyncBailHook[_, _, _, _],
    createParser: tapableLib.tapableMod.HookMap[_, _, _],
    factory: tapableLib.tapableMod.SyncWaterfallHook[_, _, _],
    generator: tapableLib.tapableMod.HookMap[_, _, _],
    module: tapableLib.tapableMod.SyncWaterfallHook[_, _, _],
    parser: tapableLib.tapableMod.HookMap[_, _, _],
    resolver: tapableLib.tapableMod.SyncWaterfallHook[_, _, _]
  ): NormalModuleFactoryHooks = {
    val __obj = js.Dynamic.literal(afterResolve = afterResolve, beforeResolve = beforeResolve, createGenerator = createGenerator, createModule = createModule, createParser = createParser, factory = factory, generator = generator, module = module, parser = parser, resolver = resolver)
  
    __obj.asInstanceOf[NormalModuleFactoryHooks]
  }
}


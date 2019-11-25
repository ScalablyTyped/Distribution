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
    val __obj = js.Dynamic.literal(afterResolve = afterResolve.asInstanceOf[js.Any], beforeResolve = beforeResolve.asInstanceOf[js.Any], createGenerator = createGenerator.asInstanceOf[js.Any], createModule = createModule.asInstanceOf[js.Any], createParser = createParser.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], parser = parser.asInstanceOf[js.Any], resolver = resolver.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NormalModuleFactoryHooks]
  }
}


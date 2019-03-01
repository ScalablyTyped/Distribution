package typings
package webpackLib.webpackMod.webpackNs.compilationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerHooks extends js.Object {
  var additionalPass: tapableLib.tapableMod.AsyncSeriesHook[_, _, _]
  var afterCompile: tapableLib.tapableMod.AsyncSeriesHook[Compilation, _, _]
  var afterEmit: tapableLib.tapableMod.AsyncSeriesHook[Compilation, _, _]
  var afterEnvironment: tapableLib.tapableMod.SyncHook[_, _, _]
  var afterPlugins: tapableLib.tapableMod.SyncHook[webpackLib.webpackMod.webpackNs.Compiler, _, _]
  var afterResolvers: tapableLib.tapableMod.SyncHook[webpackLib.webpackMod.webpackNs.Compiler, _, _]
  var beforeCompile: tapableLib.tapableMod.AsyncSeriesHook[js.Object, _, _]
  var beforeRun: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.webpackNs.Compiler, _, _]
  var compilation: tapableLib.tapableMod.SyncHook[Compilation, webpackLib.Anon_NormalModuleFactory, _]
  var compile: tapableLib.tapableMod.SyncHook[js.Object, _, _]
  var contextModuleFactory: tapableLib.tapableMod.SyncHook[ContextModuleFactory, _, _]
  var done: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.webpackNs.Stats, _, _]
  var emit: tapableLib.tapableMod.AsyncSeriesHook[Compilation, _, _]
  var entryOption: tapableLib.tapableMod.SyncBailHook[_, _, _, _]
  var environment: tapableLib.tapableMod.SyncHook[_, _, _]
  var failed: tapableLib.tapableMod.SyncHook[nodeLib.Error, _, _]
  var invalid: tapableLib.tapableMod.SyncHook[java.lang.String, stdLib.Date, _]
  var make: tapableLib.tapableMod.AsyncParallelHook[Compilation, _, _]
  var normalModuleFactory: tapableLib.tapableMod.SyncHook[NormalModuleFactory, _, _]
  var run: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.webpackNs.Compiler, _, _]
  var shouldEmit: tapableLib.tapableMod.SyncBailHook[Compilation, _, _, _]
  var thisCompilation: tapableLib.tapableMod.SyncHook[Compilation, webpackLib.Anon_NormalModuleFactory, _]
  var watchClose: tapableLib.tapableMod.SyncHook[_, _, _]
  var watchRun: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.webpackNs.Compiler, _, _]
}

object CompilerHooks {
  @scala.inline
  def apply(
    additionalPass: tapableLib.tapableMod.AsyncSeriesHook[_, _, _],
    afterCompile: tapableLib.tapableMod.AsyncSeriesHook[Compilation, _, _],
    afterEmit: tapableLib.tapableMod.AsyncSeriesHook[Compilation, _, _],
    afterEnvironment: tapableLib.tapableMod.SyncHook[_, _, _],
    afterPlugins: tapableLib.tapableMod.SyncHook[webpackLib.webpackMod.webpackNs.Compiler, _, _],
    afterResolvers: tapableLib.tapableMod.SyncHook[webpackLib.webpackMod.webpackNs.Compiler, _, _],
    beforeCompile: tapableLib.tapableMod.AsyncSeriesHook[js.Object, _, _],
    beforeRun: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.webpackNs.Compiler, _, _],
    compilation: tapableLib.tapableMod.SyncHook[Compilation, webpackLib.Anon_NormalModuleFactory, _],
    compile: tapableLib.tapableMod.SyncHook[js.Object, _, _],
    contextModuleFactory: tapableLib.tapableMod.SyncHook[ContextModuleFactory, _, _],
    done: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.webpackNs.Stats, _, _],
    emit: tapableLib.tapableMod.AsyncSeriesHook[Compilation, _, _],
    entryOption: tapableLib.tapableMod.SyncBailHook[_, _, _, _],
    environment: tapableLib.tapableMod.SyncHook[_, _, _],
    failed: tapableLib.tapableMod.SyncHook[nodeLib.Error, _, _],
    invalid: tapableLib.tapableMod.SyncHook[java.lang.String, stdLib.Date, _],
    make: tapableLib.tapableMod.AsyncParallelHook[Compilation, _, _],
    normalModuleFactory: tapableLib.tapableMod.SyncHook[NormalModuleFactory, _, _],
    run: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.webpackNs.Compiler, _, _],
    shouldEmit: tapableLib.tapableMod.SyncBailHook[Compilation, _, _, _],
    thisCompilation: tapableLib.tapableMod.SyncHook[Compilation, webpackLib.Anon_NormalModuleFactory, _],
    watchClose: tapableLib.tapableMod.SyncHook[_, _, _],
    watchRun: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.webpackNs.Compiler, _, _]
  ): CompilerHooks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("additionalPass")(additionalPass)
    __obj.updateDynamic("afterCompile")(afterCompile)
    __obj.updateDynamic("afterEmit")(afterEmit)
    __obj.updateDynamic("afterEnvironment")(afterEnvironment)
    __obj.updateDynamic("afterPlugins")(afterPlugins)
    __obj.updateDynamic("afterResolvers")(afterResolvers)
    __obj.updateDynamic("beforeCompile")(beforeCompile)
    __obj.updateDynamic("beforeRun")(beforeRun)
    __obj.updateDynamic("compilation")(compilation)
    __obj.updateDynamic("compile")(compile)
    __obj.updateDynamic("contextModuleFactory")(contextModuleFactory)
    __obj.updateDynamic("done")(done)
    __obj.updateDynamic("emit")(emit)
    __obj.updateDynamic("entryOption")(entryOption)
    __obj.updateDynamic("environment")(environment)
    __obj.updateDynamic("failed")(failed)
    __obj.updateDynamic("invalid")(invalid)
    __obj.updateDynamic("make")(make)
    __obj.updateDynamic("normalModuleFactory")(normalModuleFactory)
    __obj.updateDynamic("run")(run)
    __obj.updateDynamic("shouldEmit")(shouldEmit)
    __obj.updateDynamic("thisCompilation")(thisCompilation)
    __obj.updateDynamic("watchClose")(watchClose)
    __obj.updateDynamic("watchRun")(watchRun)
    __obj.asInstanceOf[CompilerHooks]
  }
}


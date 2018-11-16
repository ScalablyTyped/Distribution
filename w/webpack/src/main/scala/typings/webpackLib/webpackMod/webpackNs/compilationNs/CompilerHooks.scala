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
  var beforeRun: tapableLib.tapableMod.AsyncSeriesHook[Compilation, _, _]
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
  var run: tapableLib.tapableMod.AsyncSeriesHook[Compilation, _, _]
  var shouldEmit: tapableLib.tapableMod.SyncBailHook[Compilation, _, _, _]
  var thisCompilation: tapableLib.tapableMod.SyncHook[Compilation, webpackLib.Anon_NormalModuleFactory, _]
  var watchClose: tapableLib.tapableMod.SyncHook[_, _, _]
  var watchRun: tapableLib.tapableMod.AsyncSeriesHook[webpackLib.webpackMod.webpackNs.Compiler, _, _]
}


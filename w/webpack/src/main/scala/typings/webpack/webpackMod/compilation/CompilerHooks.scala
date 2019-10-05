package typings.webpack.webpackMod.compilation

import typings.std.Date
import typings.std.Error
import typings.tapable.tapableMod.AsyncParallelHook
import typings.tapable.tapableMod.AsyncSeriesHook
import typings.tapable.tapableMod.SyncBailHook
import typings.tapable.tapableMod.SyncHook
import typings.webpack.Anon_NormalModuleFactory
import typings.webpack.webpackMod.Compiler
import typings.webpack.webpackMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerHooks extends js.Object {
  var additionalPass: AsyncSeriesHook[_, _, _]
  var afterCompile: AsyncSeriesHook[Compilation, _, _]
  var afterEmit: AsyncSeriesHook[Compilation, _, _]
  var afterEnvironment: SyncHook[_, _, _]
  var afterPlugins: SyncHook[Compiler, _, _]
  var afterResolvers: SyncHook[Compiler, _, _]
  var beforeCompile: AsyncSeriesHook[js.Object, _, _]
  var beforeRun: AsyncSeriesHook[Compiler, _, _]
  var compilation: SyncHook[Compilation, Anon_NormalModuleFactory, _]
  var compile: SyncHook[js.Object, _, _]
  var contextModuleFactory: SyncHook[ContextModuleFactory, _, _]
  var done: AsyncSeriesHook[Stats, _, _]
  var emit: AsyncSeriesHook[Compilation, _, _]
  var entryOption: SyncBailHook[_, _, _, _]
  var environment: SyncHook[_, _, _]
  var failed: SyncHook[Error, _, _]
  var invalid: SyncHook[String, Date, _]
  var make: AsyncParallelHook[Compilation, _, _]
  var normalModuleFactory: SyncHook[NormalModuleFactory, _, _]
  var run: AsyncSeriesHook[Compiler, _, _]
  var shouldEmit: SyncBailHook[Compilation, _, _, _]
  var thisCompilation: SyncHook[Compilation, Anon_NormalModuleFactory, _]
  var watchClose: SyncHook[_, _, _]
  var watchRun: AsyncSeriesHook[Compiler, _, _]
}

object CompilerHooks {
  @scala.inline
  def apply(
    additionalPass: AsyncSeriesHook[_, _, _],
    afterCompile: AsyncSeriesHook[Compilation, _, _],
    afterEmit: AsyncSeriesHook[Compilation, _, _],
    afterEnvironment: SyncHook[_, _, _],
    afterPlugins: SyncHook[Compiler, _, _],
    afterResolvers: SyncHook[Compiler, _, _],
    beforeCompile: AsyncSeriesHook[js.Object, _, _],
    beforeRun: AsyncSeriesHook[Compiler, _, _],
    compilation: SyncHook[Compilation, Anon_NormalModuleFactory, _],
    compile: SyncHook[js.Object, _, _],
    contextModuleFactory: SyncHook[ContextModuleFactory, _, _],
    done: AsyncSeriesHook[Stats, _, _],
    emit: AsyncSeriesHook[Compilation, _, _],
    entryOption: SyncBailHook[_, _, _, _],
    environment: SyncHook[_, _, _],
    failed: SyncHook[Error, _, _],
    invalid: SyncHook[String, Date, _],
    make: AsyncParallelHook[Compilation, _, _],
    normalModuleFactory: SyncHook[NormalModuleFactory, _, _],
    run: AsyncSeriesHook[Compiler, _, _],
    shouldEmit: SyncBailHook[Compilation, _, _, _],
    thisCompilation: SyncHook[Compilation, Anon_NormalModuleFactory, _],
    watchClose: SyncHook[_, _, _],
    watchRun: AsyncSeriesHook[Compiler, _, _]
  ): CompilerHooks = {
    val __obj = js.Dynamic.literal(additionalPass = additionalPass, afterCompile = afterCompile, afterEmit = afterEmit, afterEnvironment = afterEnvironment, afterPlugins = afterPlugins, afterResolvers = afterResolvers, beforeCompile = beforeCompile, beforeRun = beforeRun, compilation = compilation, compile = compile, contextModuleFactory = contextModuleFactory, done = done, emit = emit, entryOption = entryOption, environment = environment, failed = failed, invalid = invalid, make = make, normalModuleFactory = normalModuleFactory, run = run, shouldEmit = shouldEmit, thisCompilation = thisCompilation, watchClose = watchClose, watchRun = watchRun)
  
    __obj.asInstanceOf[CompilerHooks]
  }
}


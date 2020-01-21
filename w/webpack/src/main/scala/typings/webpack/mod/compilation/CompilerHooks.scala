package typings.webpack.mod.compilation

import typings.std.Date
import typings.std.Error
import typings.tapable.mod.AsyncParallelHook
import typings.tapable.mod.AsyncSeriesHook
import typings.tapable.mod.SyncBailHook
import typings.tapable.mod.SyncHook
import typings.webpack.AnonNormalModuleFactory
import typings.webpack.mod.Compiler_
import typings.webpack.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompilerHooks extends js.Object {
  var additionalPass: AsyncSeriesHook[_, _, _]
  var afterCompile: AsyncSeriesHook[Compilation, _, _]
  var afterEmit: AsyncSeriesHook[Compilation, _, _]
  var afterEnvironment: SyncHook[_, _, _]
  var afterPlugins: SyncHook[Compiler_, _, _]
  var afterResolvers: SyncHook[Compiler_, _, _]
  var beforeCompile: AsyncSeriesHook[js.Object, _, _]
  var beforeRun: AsyncSeriesHook[Compiler_, _, _]
  var compilation: SyncHook[Compilation, AnonNormalModuleFactory, _]
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
  var run: AsyncSeriesHook[Compiler_, _, _]
  var shouldEmit: SyncBailHook[Compilation, _, _, _]
  var thisCompilation: SyncHook[Compilation, AnonNormalModuleFactory, _]
  var watchClose: SyncHook[_, _, _]
  var watchRun: AsyncSeriesHook[Compiler_, _, _]
}

object CompilerHooks {
  @scala.inline
  def apply(
    additionalPass: AsyncSeriesHook[_, _, _],
    afterCompile: AsyncSeriesHook[Compilation, _, _],
    afterEmit: AsyncSeriesHook[Compilation, _, _],
    afterEnvironment: SyncHook[_, _, _],
    afterPlugins: SyncHook[Compiler_, _, _],
    afterResolvers: SyncHook[Compiler_, _, _],
    beforeCompile: AsyncSeriesHook[js.Object, _, _],
    beforeRun: AsyncSeriesHook[Compiler_, _, _],
    compilation: SyncHook[Compilation, AnonNormalModuleFactory, _],
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
    run: AsyncSeriesHook[Compiler_, _, _],
    shouldEmit: SyncBailHook[Compilation, _, _, _],
    thisCompilation: SyncHook[Compilation, AnonNormalModuleFactory, _],
    watchClose: SyncHook[_, _, _],
    watchRun: AsyncSeriesHook[Compiler_, _, _]
  ): CompilerHooks = {
    val __obj = js.Dynamic.literal(additionalPass = additionalPass.asInstanceOf[js.Any], afterCompile = afterCompile.asInstanceOf[js.Any], afterEmit = afterEmit.asInstanceOf[js.Any], afterEnvironment = afterEnvironment.asInstanceOf[js.Any], afterPlugins = afterPlugins.asInstanceOf[js.Any], afterResolvers = afterResolvers.asInstanceOf[js.Any], beforeCompile = beforeCompile.asInstanceOf[js.Any], beforeRun = beforeRun.asInstanceOf[js.Any], compilation = compilation.asInstanceOf[js.Any], compile = compile.asInstanceOf[js.Any], contextModuleFactory = contextModuleFactory.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], emit = emit.asInstanceOf[js.Any], entryOption = entryOption.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], make = make.asInstanceOf[js.Any], normalModuleFactory = normalModuleFactory.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any], shouldEmit = shouldEmit.asInstanceOf[js.Any], thisCompilation = thisCompilation.asInstanceOf[js.Any], watchClose = watchClose.asInstanceOf[js.Any], watchRun = watchRun.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CompilerHooks]
  }
}


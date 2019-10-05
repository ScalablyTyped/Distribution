package typings.webpack.webpackMod.compilation

import typings.std.Date
import typings.tapable.tapableMod.AsyncSeriesHook
import typings.tapable.tapableMod.SyncHook
import typings.webpack.webpackMod.Compiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiCompilerHooks extends js.Object {
  var done: SyncHook[MultiStats, _, _]
  var invalid: SyncHook[String, Date, _]
  var run: AsyncSeriesHook[Compiler, _, _]
  var watchClose: SyncHook[_, _, _]
  var watchRun: AsyncSeriesHook[Compiler, _, _]
}

object MultiCompilerHooks {
  @scala.inline
  def apply(
    done: SyncHook[MultiStats, _, _],
    invalid: SyncHook[String, Date, _],
    run: AsyncSeriesHook[Compiler, _, _],
    watchClose: SyncHook[_, _, _],
    watchRun: AsyncSeriesHook[Compiler, _, _]
  ): MultiCompilerHooks = {
    val __obj = js.Dynamic.literal(done = done, invalid = invalid, run = run, watchClose = watchClose, watchRun = watchRun)
  
    __obj.asInstanceOf[MultiCompilerHooks]
  }
}


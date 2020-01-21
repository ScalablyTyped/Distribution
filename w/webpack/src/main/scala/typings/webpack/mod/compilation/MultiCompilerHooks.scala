package typings.webpack.mod.compilation

import typings.std.Date
import typings.tapable.mod.AsyncSeriesHook
import typings.tapable.mod.SyncHook
import typings.webpack.mod.Compiler_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiCompilerHooks extends js.Object {
  var done: SyncHook[MultiStats, _, _]
  var invalid: SyncHook[String, Date, _]
  var run: AsyncSeriesHook[Compiler_, _, _]
  var watchClose: SyncHook[_, _, _]
  var watchRun: AsyncSeriesHook[Compiler_, _, _]
}

object MultiCompilerHooks {
  @scala.inline
  def apply(
    done: SyncHook[MultiStats, _, _],
    invalid: SyncHook[String, Date, _],
    run: AsyncSeriesHook[Compiler_, _, _],
    watchClose: SyncHook[_, _, _],
    watchRun: AsyncSeriesHook[Compiler_, _, _]
  ): MultiCompilerHooks = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], run = run.asInstanceOf[js.Any], watchClose = watchClose.asInstanceOf[js.Any], watchRun = watchRun.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiCompilerHooks]
  }
}


package typings.webpack.webpackMod

import typings.webpack.webpackMod.ICompilerNs.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait ICompiler extends js.Object {
  def run(handler: Handler): Unit
  def watch(watchOptions: typings.webpack.webpackMod.ICompilerNs.WatchOptions, handler: Handler): Watching
}

object ICompiler {
  @scala.inline
  def apply(
    run: Handler => Unit,
    watch: (typings.webpack.webpackMod.ICompilerNs.WatchOptions, Handler) => Watching
  ): ICompiler = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run), watch = js.Any.fromFunction2(watch))
  
    __obj.asInstanceOf[ICompiler]
  }
}


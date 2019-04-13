package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait ICompiler extends js.Object {
  def run(handler: webpackLib.webpackMod.ICompilerNs.Handler): scala.Unit
  def watch(
    watchOptions: webpackLib.webpackMod.ICompilerNs.WatchOptions,
    handler: webpackLib.webpackMod.ICompilerNs.Handler
  ): Watching
}

object ICompiler {
  @scala.inline
  def apply(
    run: webpackLib.webpackMod.ICompilerNs.Handler => scala.Unit,
    watch: (webpackLib.webpackMod.ICompilerNs.WatchOptions, webpackLib.webpackMod.ICompilerNs.Handler) => Watching
  ): ICompiler = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run), watch = js.Any.fromFunction2(watch))
  
    __obj.asInstanceOf[ICompiler]
  }
}


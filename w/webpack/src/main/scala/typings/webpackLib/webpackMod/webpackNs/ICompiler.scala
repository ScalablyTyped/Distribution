package typings
package webpackLib.webpackMod.webpackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
trait ICompiler extends js.Object {
  def run(handler: webpackLib.webpackMod.webpackNs.ICompilerNs.Handler): scala.Unit
  def watch(
    watchOptions: webpackLib.webpackMod.webpackNs.ICompilerNs.WatchOptions,
    handler: webpackLib.webpackMod.webpackNs.ICompilerNs.Handler
  ): Watching
}

object ICompiler {
  @scala.inline
  def apply(
    run: js.Function1[webpackLib.webpackMod.webpackNs.ICompilerNs.Handler, scala.Unit],
    watch: js.Function2[
      webpackLib.webpackMod.webpackNs.ICompilerNs.WatchOptions, 
      webpackLib.webpackMod.webpackNs.ICompilerNs.Handler, 
      Watching
    ]
  ): ICompiler = {
    val __obj = js.Dynamic.literal(run = run, watch = watch)
  
    __obj.asInstanceOf[ICompiler]
  }
}


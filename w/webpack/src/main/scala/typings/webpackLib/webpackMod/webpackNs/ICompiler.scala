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


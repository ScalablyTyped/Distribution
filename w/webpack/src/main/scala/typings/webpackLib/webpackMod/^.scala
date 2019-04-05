package typings
package webpackLib.webpackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Webpack package version. */
  val version: js.UndefOr[java.lang.String] = js.native
  def apply(): webpackLib.webpackMod.webpackNs.Compiler = js.native
  def apply(options: js.Array[webpackLib.webpackMod.webpackNs.Configuration]): webpackLib.webpackMod.webpackNs.MultiCompiler = js.native
  def apply(
    options: js.Array[webpackLib.webpackMod.webpackNs.Configuration],
    handler: webpackLib.webpackMod.webpackNs.MultiCompilerNs.Handler
  ): webpackLib.webpackMod.webpackNs.MultiWatching | webpackLib.webpackMod.webpackNs.MultiCompiler = js.native
  def apply(options: webpackLib.webpackMod.webpackNs.Configuration): webpackLib.webpackMod.webpackNs.Compiler = js.native
  def apply(
    options: webpackLib.webpackMod.webpackNs.Configuration,
    handler: webpackLib.webpackMod.webpackNs.CompilerNs.Handler
  ): webpackLib.webpackMod.webpackNs.CompilerNs.Watching | webpackLib.webpackMod.webpackNs.Compiler = js.native
}


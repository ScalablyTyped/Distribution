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
  def apply(): Compiler = js.native
  def apply(options: js.Array[Configuration]): MultiCompiler = js.native
  def apply(options: js.Array[Configuration], handler: webpackLib.webpackMod.MultiCompilerNs.Handler): MultiWatching | MultiCompiler = js.native
  def apply(options: Configuration): Compiler = js.native
  def apply(options: Configuration, handler: webpackLib.webpackMod.CompilerNs.Handler): webpackLib.webpackMod.CompilerNs.Watching | Compiler = js.native
}


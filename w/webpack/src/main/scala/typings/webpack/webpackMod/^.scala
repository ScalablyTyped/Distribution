package typings.webpack.webpackMod

import typings.webpack.webpackMod.MultiCompilerNs.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /** Webpack package version. */
  val version: js.UndefOr[String] = js.native
  def apply(): Compiler = js.native
  def apply(options: js.Array[Configuration]): MultiCompiler = js.native
  def apply(options: js.Array[Configuration], handler: Handler): MultiWatching | MultiCompiler = js.native
  def apply(options: Configuration): Compiler = js.native
  def apply(options: Configuration, handler: typings.webpack.webpackMod.CompilerNs.Handler): typings.webpack.webpackMod.CompilerNs.Watching | Compiler = js.native
}


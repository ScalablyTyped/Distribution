package typings.webpack.webpackMod

import typings.webpack.webpackMod.Compiler.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Compiler = js.native
  def apply(
    options: ConfigurationFactory | MultiConfigurationFactory,
    handler: Handler | typings.webpack.webpackMod.MultiCompiler.Handler
  ): typings.webpack.webpackMod.Compiler.Watching | Compiler = js.native
  def apply(options: js.Array[Configuration]): MultiCompiler = js.native
  def apply(options: js.Array[Configuration], handler: typings.webpack.webpackMod.MultiCompiler.Handler): MultiWatching | MultiCompiler = js.native
  def apply(options: Configuration): Compiler = js.native
  def apply(options: Configuration, handler: Handler): typings.webpack.webpackMod.Compiler.Watching | Compiler = js.native
}


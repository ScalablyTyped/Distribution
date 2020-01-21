package typings.webpack.mod

import typings.webpack.mod.MultiCompiler.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Compiler_ = js.native
  def apply(
    options: ConfigurationFactory | MultiConfigurationFactory,
    handler: Handler | typings.webpack.mod.Compiler_.Handler
  ): typings.webpack.mod.Compiler_.Watching | Compiler_ = js.native
  def apply(options: js.Array[Configuration]): MultiCompiler = js.native
  def apply(options: js.Array[Configuration], handler: Handler): MultiWatching | MultiCompiler = js.native
  def apply(options: Configuration): Compiler_ = js.native
  def apply(options: Configuration, handler: typings.webpack.mod.Compiler_.Handler): typings.webpack.mod.Compiler_.Watching | Compiler_ = js.native
}


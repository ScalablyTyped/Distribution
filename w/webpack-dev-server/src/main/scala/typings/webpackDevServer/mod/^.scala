package typings.webpackDevServer.mod

import typings.webpack.mod.Compiler_
import typings.webpack.mod.MultiCompiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-dev-server", JSImport.Namespace)
@js.native
class ^ protected () extends WebpackDevServer {
  def this(webpack: Compiler_) = this()
  def this(webpack: MultiCompiler) = this()
  def this(webpack: Compiler_, config: Configuration) = this()
  def this(webpack: MultiCompiler, config: Configuration) = this()
}

@JSImport("webpack-dev-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addDevServerEntrypoints(webpackOptions: js.Array[typings.webpack.mod.Configuration], config: Configuration): Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: js.Array[typings.webpack.mod.Configuration],
    config: Configuration,
    listeningApp: ListeningApp
  ): Unit = js.native
  def addDevServerEntrypoints(webpackOptions: typings.webpack.mod.Configuration, config: Configuration): Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: typings.webpack.mod.Configuration,
    config: Configuration,
    listeningApp: ListeningApp
  ): Unit = js.native
}


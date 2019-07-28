package typings.webpackDashDevDashServer.webpackDashDevDashServerMod

import typings.webpack.webpackMod.Compiler
import typings.webpack.webpackMod.MultiCompiler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-dev-server", JSImport.Namespace)
@js.native
class ^ protected () extends WebpackDevServer {
  def this(webpack: Compiler) = this()
  def this(webpack: MultiCompiler) = this()
  def this(webpack: Compiler, config: Configuration) = this()
  def this(webpack: MultiCompiler, config: Configuration) = this()
}

@JSImport("webpack-dev-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addDevServerEntrypoints(webpackOptions: js.Array[typings.webpack.webpackMod.Configuration], config: Configuration): Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: js.Array[typings.webpack.webpackMod.Configuration],
    config: Configuration,
    listeningApp: ListeningApp
  ): Unit = js.native
  def addDevServerEntrypoints(webpackOptions: typings.webpack.webpackMod.Configuration, config: Configuration): Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: typings.webpack.webpackMod.Configuration,
    config: Configuration,
    listeningApp: ListeningApp
  ): Unit = js.native
}


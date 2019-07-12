package typings
package webpackDashDevDashServerLib.webpackDashDevDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-dev-server", JSImport.Namespace)
@js.native
class ^ protected () extends WebpackDevServer {
  def this(webpack: webpackLib.webpackMod.Compiler) = this()
  def this(webpack: webpackLib.webpackMod.MultiCompiler) = this()
  def this(webpack: webpackLib.webpackMod.Compiler, config: Configuration) = this()
  def this(webpack: webpackLib.webpackMod.MultiCompiler, config: Configuration) = this()
}

@JSImport("webpack-dev-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addDevServerEntrypoints(webpackOptions: js.Array[webpackLib.webpackMod.Configuration], config: Configuration): scala.Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: js.Array[webpackLib.webpackMod.Configuration],
    config: Configuration,
    listeningApp: ListeningApp
  ): scala.Unit = js.native
  def addDevServerEntrypoints(webpackOptions: webpackLib.webpackMod.Configuration, config: Configuration): scala.Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: webpackLib.webpackMod.Configuration,
    config: Configuration,
    listeningApp: ListeningApp
  ): scala.Unit = js.native
}


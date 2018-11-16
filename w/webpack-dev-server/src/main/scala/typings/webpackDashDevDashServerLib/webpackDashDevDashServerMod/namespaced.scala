package typings
package webpackDashDevDashServerLib.webpackDashDevDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack-dev-server", JSImport.Namespace)
@js.native
class namespaced protected () extends WebpackDevServer {
  def this(webpack: webpackLib.webpackMod.Compiler, config: webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServerNs.Configuration) = this()
  def this(webpack: webpackLib.webpackMod.MultiCompiler, config: webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServerNs.Configuration) = this()
}

@JSImport("webpack-dev-server", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def addDevServerEntrypoints(
    webpackOptions: js.Array[webpackDashDevDashServerLib.webpackDashDevDashServerMod.webpackMod.Configuration],
    config: webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServerNs.Configuration
  ): scala.Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: js.Array[webpackDashDevDashServerLib.webpackDashDevDashServerMod.webpackMod.Configuration],
    config: webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServerNs.Configuration,
    listeningApp: webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServerNs.ListeningApp
  ): scala.Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: webpackDashDevDashServerLib.webpackDashDevDashServerMod.webpackMod.Configuration,
    config: webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServerNs.Configuration
  ): scala.Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: webpackDashDevDashServerLib.webpackDashDevDashServerMod.webpackMod.Configuration,
    config: webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServerNs.Configuration,
    listeningApp: webpackDashDevDashServerLib.webpackDashDevDashServerMod.WebpackDevServerNs.ListeningApp
  ): scala.Unit = js.native
}


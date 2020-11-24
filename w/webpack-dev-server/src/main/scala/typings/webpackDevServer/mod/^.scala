package typings.webpackDevServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack-dev-server", JSImport.Namespace)
@js.native
class ^ protected () extends WebpackDevServer {
  def this(webpack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any) = this()
  def this(
    webpack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Compiler */ js.Any,
    config: Configuration
  ) = this()
}
@JSImport("webpack-dev-server", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def addDevServerEntrypoints(
    webpackOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any,
    config: Configuration
  ): Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ js.Any,
    config: Configuration,
    listeningApp: ListeningApp
  ): Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ _
    ],
    config: Configuration
  ): Unit = js.native
  def addDevServerEntrypoints(
    webpackOptions: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Configuration */ _
    ],
    config: Configuration,
    listeningApp: ListeningApp
  ): Unit = js.native
}

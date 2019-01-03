package typings
package typedocLib.distLibConverterPluginsGitHubPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/converter/plugins/GitHubPlugin", "Repository")
@js.native
class Repository protected () extends js.Object {
  def this(path: java.lang.String, gitRevision: java.lang.String, repoLinks: js.Array[java.lang.String]) = this()
  var branch: java.lang.String = js.native
  var files: js.Array[java.lang.String] = js.native
  var gitHubHostname: java.lang.String = js.native
  var gitHubProject: js.UndefOr[java.lang.String] = js.native
  var gitHubUser: js.UndefOr[java.lang.String] = js.native
  var path: java.lang.String = js.native
  def contains(fileName: java.lang.String): scala.Boolean = js.native
  def getGitHubURL(fileName: java.lang.String): js.UndefOr[java.lang.String] = js.native
}

@JSImport("typedoc/dist/lib/converter/plugins/GitHubPlugin", "Repository")
@js.native
object Repository extends js.Object {
  def tryCreateRepository(path: java.lang.String, gitRevision: java.lang.String): js.UndefOr[typedocLib.distLibConverterPluginsGitHubPluginMod.Repository] = js.native
}


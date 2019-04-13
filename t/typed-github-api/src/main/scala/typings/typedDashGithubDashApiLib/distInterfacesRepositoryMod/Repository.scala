package typings
package typedDashGithubDashApiLib.distInterfacesRepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Repository extends RepositoryRef {
  var allowMergeCommit: scala.Boolean = js.native
  var allowRebasemerge: scala.Boolean = js.native
  var allowSquashMerge: scala.Boolean = js.native
  var created: momentLib.momentMod.Moment = js.native
  var defaultBranch: java.lang.String = js.native
  var description: java.lang.String = js.native
  var forksCount: scala.Double = js.native
  var fullName: java.lang.String = js.native
  var hasDownloads: scala.Boolean = js.native
  var hasIssues: scala.Boolean = js.native
  var hasPages: scala.Boolean = js.native
  var hasWiki: scala.Boolean = js.native
  var homePage: java.lang.String = js.native
  var htmlUri: java.lang.String = js.native
  var id: scala.Double = js.native
  var isFork: scala.Boolean = js.native
  var isPrivate: scala.Boolean = js.native
  var language: js.UndefOr[java.lang.String] = js.native
  var networkCount: scala.Double = js.native
  var openIssuesCount: scala.Double = js.native
  @JSName("owner")
  var owner_Repository: typedDashGithubDashApiLib.distInterfacesUserMod.UserSummary = js.native
  var permissions: typedDashGithubDashApiLib.Anon_Admin = js.native
  var pushed: momentLib.momentMod.Moment = js.native
  var size: scala.Double = js.native
  var starGazersCount: scala.Double = js.native
  var subscribersCount: scala.Double = js.native
  var topics: js.Array[java.lang.String] = js.native
  var updated: momentLib.momentMod.Moment = js.native
  var watchersCount: scala.Double = js.native
}


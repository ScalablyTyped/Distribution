package typings.typedDashGithubDashApi.distInterfacesRepositoryMod

import typings.moment.momentMod.Moment
import typings.typedDashGithubDashApi.Anon_Admin
import typings.typedDashGithubDashApi.distInterfacesUserMod.UserSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Repository extends RepositoryRef {
  var allowMergeCommit: Boolean = js.native
  var allowRebasemerge: Boolean = js.native
  var allowSquashMerge: Boolean = js.native
  var created: Moment = js.native
  var defaultBranch: String = js.native
  var description: String = js.native
  var forksCount: Double = js.native
  var fullName: String = js.native
  var hasDownloads: Boolean = js.native
  var hasIssues: Boolean = js.native
  var hasPages: Boolean = js.native
  var hasWiki: Boolean = js.native
  var homePage: String = js.native
  var htmlUri: String = js.native
  var id: Double = js.native
  var isFork: Boolean = js.native
  var isPrivate: Boolean = js.native
  var language: js.UndefOr[String] = js.native
  var networkCount: Double = js.native
  var openIssuesCount: Double = js.native
  @JSName("owner")
  var owner_Repository: UserSummary = js.native
  var permissions: Anon_Admin = js.native
  var pushed: Moment = js.native
  var size: Double = js.native
  var starGazersCount: Double = js.native
  var subscribersCount: Double = js.native
  var topics: js.Array[String] = js.native
  var updated: Moment = js.native
  var watchersCount: Double = js.native
}


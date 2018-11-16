package typings
package typedDashGithubDashApiLib.distInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CommitRef extends js.Object {
  val repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.RepositoryRef
  val sha: java.lang.String
  def loadAsync(): stdLib.Promise[Commit | scala.Null]
  def loadGitAsync(): stdLib.Promise[GitCommit | scala.Null]
}


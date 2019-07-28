package typings.turbostatus.turbostatusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("turbostatus", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkout(folder: String, commit: String): js.Promise[String] = js.native
  def clone(origin: String, folder: String): js.Promise[String] = js.native
  def describe(folder: String): js.Promise[Description] = js.native
  def getBranch(folder: String): js.Promise[String] = js.native
  def getBranchFast(folder: String): js.Promise[String] = js.native
  def getLocalCommit(folder: String): js.Promise[String] = js.native
  def getMergeBase(folder: String): js.Promise[String] = js.native
  def getOrigin(folder: String): js.Promise[String] = js.native
  def getRemoteCommit(folder: String): js.Promise[String] = js.native
  def getRepos(folder: String): js.Promise[js.Array[Repository]] = js.native
  def getRepos(folder: String, wildcard: String): js.Promise[js.Array[Repository]] = js.native
  def hasUncommited(folder: String): js.Promise[Boolean] = js.native
  def hasUntracked(folder: String): js.Promise[Boolean] = js.native
  def info(repo: Repository): js.Promise[Repository] = js.native
  def info(repo: Repository, remotes: Boolean): js.Promise[Repository] = js.native
  def isRepo(folder: String): js.Promise[Boolean] = js.native
  def references(folder: String): js.Promise[String] = js.native
}


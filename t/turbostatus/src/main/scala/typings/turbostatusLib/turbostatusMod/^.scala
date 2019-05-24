package typings
package turbostatusLib.turbostatusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("turbostatus", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def checkout(folder: java.lang.String, commit: java.lang.String): js.Promise[java.lang.String] = js.native
  def clone(origin: java.lang.String, folder: java.lang.String): js.Promise[java.lang.String] = js.native
  def describe(folder: java.lang.String): js.Promise[Description] = js.native
  def getBranch(folder: java.lang.String): js.Promise[java.lang.String] = js.native
  def getBranchFast(folder: java.lang.String): js.Promise[java.lang.String] = js.native
  def getLocalCommit(folder: java.lang.String): js.Promise[java.lang.String] = js.native
  def getMergeBase(folder: java.lang.String): js.Promise[java.lang.String] = js.native
  def getOrigin(folder: java.lang.String): js.Promise[java.lang.String] = js.native
  def getRemoteCommit(folder: java.lang.String): js.Promise[java.lang.String] = js.native
  def getRepos(folder: java.lang.String): js.Promise[js.Array[Repository]] = js.native
  def getRepos(folder: java.lang.String, wildcard: java.lang.String): js.Promise[js.Array[Repository]] = js.native
  def hasUncommited(folder: java.lang.String): js.Promise[scala.Boolean] = js.native
  def hasUntracked(folder: java.lang.String): js.Promise[scala.Boolean] = js.native
  def info(repo: Repository): js.Promise[Repository] = js.native
  def info(repo: Repository, remotes: scala.Boolean): js.Promise[Repository] = js.native
  def isRepo(folder: java.lang.String): js.Promise[scala.Boolean] = js.native
  def references(folder: java.lang.String): js.Promise[java.lang.String] = js.native
}


package typings.webgme.GmeClasses

import typings.webgme.Core.DataObject
import typings.webgme.Core.ObjectHash
import typings.webgme.GmeCommon.Dictionary
import typings.webgme.GmeCommon.ProjectStart
import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeStorage.CommitHash
import typings.webgme.GmeStorage.CommitHashCallback
import typings.webgme.GmeStorage.CommitObject
import typings.webgme.GmeStorage.CommitResult
import typings.webgme.GmeStorage.ErrorOnlyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Project extends js.Object {
  /**
    * Unique ID of project, built up by the ownerId and projectName.
    */
  var projectId: String = js.native
  /**
    * Creates a new branch with head pointing to the provided commit hash.
    */
  def createBranch(branchName: String, newHash: CommitHash): js.Promise[CommitResult] = js.native
  /**
    * Creates a new branch with head pointing to the provided commit hash.
    */
  def createBranch(branchName: String, newHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
  /**
    * Creates a new tag pointing to the provided commit hash.
    */
  def createTag(tagName: String, commitHash: CommitHash): js.Promise[ErrorOnlyCallback] = js.native
  /**
    * Creates a new tag pointing to the provided commit hash.
    */
  def createTag(tagName: String, commitHash: CommitHash, callback: ErrorOnlyCallback): Unit = js.native
  /**
    * Deletes the given branch.
    */
  def deleteBranch(branchName: String, oldHash: CommitHash): js.Promise[CommitResult] = js.native
  /**
    * Deletes the given branch.
    */
  def deleteBranch(branchName: String, oldHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
  /**
    * Deletes the given tag.
    */
  def deleteTag(tagName: String, callback: ErrorOnlyCallback): Unit = js.native
  /**
    * Deletes the given tag.
    */
  def deleteTag(tagname: String): js.Promise[Unit] = js.native
  /**
    * Retrieves the commit hash for the head of the branch.
    */
  def getBranchHash(branchName: String): js.Promise[CommitHash] = js.native
  /**
    * Retrieves the commit hash for the head of the branch.
    */
  def getBranchHash(branchName: String, callback: CommitHashCallback): Unit = js.native
  /**
    * Retrieves all branches and their current heads within the project.
    */
  def getBranches(): js.Promise[Dictionary[CommitHash]] = js.native
  /**
    * Retrieves all branches and their current heads within the project.
    */
  def getBranches(callback: ResultCallback[Dictionary[CommitHash]]): Unit = js.native
  /**
    * Retrieves the Class ancestor of two commits. 
    * If no ancestor exists it will result in an error.
    */
  def getClassAncestorCommit(commitA: CommitHash, commitB: CommitHash): js.Promise[CommitHash] = js.native
  /**
    * Retrieves the Class ancestor of two commits. 
    * If no ancestor exists it will result in an error.
    */
  def getClassAncestorCommit(commitA: CommitHash, commitB: CommitHash, callback: CommitHashCallback): Unit = js.native
  /**
    * Retrieves and array of the latest 
    * (sorted by timestamp) commits for the project. 
    * If timestamp is given it will get number 
    * of commits strictly before before. 
    * If commit hash is specified that 
    * commit will be included too. 
    * n.b. due to slight time differences on different machines, 
    * ancestors may be returned before their descendants. 
    * Unless looking for 'headless' commits 
    * 'getHistory' is the preferred method.
    */
  def getCommits(before: Double, number: Double): js.Promise[CommitObject] = js.native
  /**
    * Retrieves and array of the latest 
    * (sorted by timestamp) commits for the project. 
    * If timestamp is given it will get number 
    * of commits strictly before before. 
    * If commit hash is specified that 
    * commit will be included too. 
    * n.b. due to slight time differences on different machines, 
    * ancestors may be returned before their descendants. 
    * Unless looking for 'headless' commits 
    * 'getHistory' is the preferred method.
    */
  def getCommits(before: Double, number: Double, callback: ResultCallback[CommitObject]): Unit = js.native
  def getCommits(before: CommitHash, number: Double): js.Promise[CommitObject] = js.native
  def getCommits(before: CommitHash, number: Double, callback: ResultCallback[CommitObject]): Unit = js.native
  /**
    * Retrieves an array of commits starting from a branch(es) and/or commitHash(es). 
    * The result is ordered by the rules (applied in order) 
    *  1. Descendants are always returned before their ancestors.
    *  2. By their timestamp.
    */
  def getHistory(start: ProjectStart, number: Double): js.Promise[js.Array[CommitObject]] = js.native
  /**
    * Retrieves an array of commits starting from a branch(es) and/or commitHash(es). 
    * The result is ordered by the rules (applied in order) 
    *  1. Descendants are always returned before their ancestors.
    *  2. By their timestamp.
    */
  def getHistory(start: ProjectStart, number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
  /**
    * Retrieves all tags and their commits hashes within the project.
    */
  def getTags(): js.Promise[CommitHash] = js.native
  /**
    * Retrieves all tags and their commits hashes within the project.
    */
  def getTags(callback: CommitHashCallback): Unit = js.native
  def loadObject(key: String): js.Promise[CommitObject] = js.native
  def loadObject(key: String, callback: ResultCallback[CommitObject]): Unit = js.native
  /** 
    * Collects the objects from the server and pre-loads 
    * them into the cache making the load of multiple objects faster.
    * 
    * @param rootKey Hash of the object at the entry point of the paths.
    * @param paths List of paths that needs to be pre-loaded.
    */
  def loadPaths(rootKey: String, paths: js.Array[String]): js.Promise[ErrorOnlyCallback] = js.native
  /** 
    * Collects the objects from the server and pre-loads 
    * them into the cache making the load of multiple objects faster.
    * 
    * @param rootKey Hash of the object at the entry point of the paths.
    * @param paths List of paths that needs to be pre-loaded.
    */
  def loadPaths(rootKey: String, paths: js.Array[String], callback: ErrorOnlyCallback): Unit = js.native
  /**
    * Makes a commit to data base. 
    * Based on the root hash and commit message a 
    * new module:Storage.CommitObject (with returned hash) 
    * is generated and insert together with the 
    * core objects to the database on the server.
    */
  def makeCommit(
    branchName: String,
    parents: js.Array[CommitHash],
    rootHash: ObjectHash,
    coreObjects: DataObject,
    msg: String
  ): js.Promise[CommitResult] = js.native
  /**
    * Makes a commit to data base. 
    * Based on the root hash and commit message a 
    * new module:Storage.CommitObject (with returned hash) 
    * is generated and insert together with the 
    * core objects to the database on the server.
    */
  def makeCommit(
    branchName: String,
    parents: js.Array[CommitHash],
    rootHash: ObjectHash,
    coreObjects: DataObject,
    msg: String,
    callback: ResultCallback[CommitResult]
  ): Unit = js.native
  /**
    * Updates the head of the branch.
    */
  def setBranchHash(branchName: String, newHash: CommitHash, oldHash: CommitHash): js.Promise[CommitResult] = js.native
  /**
    * Updates the head of the branch.
    */
  def setBranchHash(
    branchName: String,
    newHash: CommitHash,
    oldHash: CommitHash,
    callback: ResultCallback[CommitResult]
  ): Unit = js.native
}


package typings.webgme.GmeClassesNs

import typings.webgme.CoreNs.DataObject
import typings.webgme.CoreNs.ObjectHash
import typings.webgme.Fn_BeforeCallback
import typings.webgme.Fn_BranchNameCallbackCommitHashCommitHashCallback
import typings.webgme.Fn_BranchNameCallbackCoreObjects
import typings.webgme.Fn_BranchNameCallbackNewHashCommitHash
import typings.webgme.Fn_BranchNameCallbackNewHashOldHash
import typings.webgme.Fn_BranchNameCallbackOldHashCommitHash
import typings.webgme.Fn_CallbackCommitACommitB
import typings.webgme.Fn_CallbackCommitHashCommitHashCallback
import typings.webgme.Fn_CallbackCommitHashDictionary
import typings.webgme.Fn_CallbackCommitHashTagNameErrorOnlyCallback
import typings.webgme.Fn_CallbackKey
import typings.webgme.Fn_CallbackNumberStart
import typings.webgme.Fn_CallbackPaths
import typings.webgme.Fn_CallbackTagNameTagname
import typings.webgme.GmeCommonNs.Dictionary
import typings.webgme.GmeCommonNs.ProjectStart
import typings.webgme.GmeCommonNs.ResultCallback
import typings.webgme.GmeStorageNs.CommitHash
import typings.webgme.GmeStorageNs.CommitHashCallback
import typings.webgme.GmeStorageNs.CommitObject
import typings.webgme.GmeStorageNs.CommitResult
import typings.webgme.GmeStorageNs.ErrorOnlyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GmeClasses.Project")
@js.native
class Project () extends js.Object {
  /**
    * Creates a new branch with head pointing to the provided commit hash.
    */
  @JSName("createBranch")
  var createBranch_Original: Fn_BranchNameCallbackNewHashCommitHash = js.native
  /**
    * Creates a new tag pointing to the provided commit hash.
    */
  @JSName("createTag")
  var createTag_Original: Fn_CallbackCommitHashTagNameErrorOnlyCallback = js.native
  /**
    * Deletes the given branch.
    */
  @JSName("deleteBranch")
  var deleteBranch_Original: Fn_BranchNameCallbackOldHashCommitHash = js.native
  /**
    * Deletes the given tag.
    */
  @JSName("deleteTag")
  var deleteTag_Original: Fn_CallbackTagNameTagname = js.native
  /**
    * Retrieves the commit hash for the head of the branch.
    */
  @JSName("getBranchHash")
  var getBranchHash_Original: Fn_BranchNameCallbackCommitHashCommitHashCallback = js.native
  /**
    * Retrieves all branches and their current heads within the project.
    */
  @JSName("getBranches")
  var getBranches_Original: Fn_CallbackCommitHashDictionary = js.native
  /**
    * Retrieves the Class ancestor of two commits. 
    * If no ancestor exists it will result in an error.
    */
  @JSName("getClassAncestorCommit")
  var getClassAncestorCommit_Original: Fn_CallbackCommitACommitB = js.native
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
  @JSName("getCommits")
  var getCommits_Original: Fn_BeforeCallback = js.native
  /**
    * Retrieves an array of commits starting from a branch(es) and/or commitHash(es). 
    * The result is ordered by the rules (applied in order) 
    *  1. Descendants are always returned before their ancestors.
    *  2. By their timestamp.
    */
  @JSName("getHistory")
  var getHistory_Original: Fn_CallbackNumberStart = js.native
  /**
    * Retrieves all tags and their commits hashes within the project.
    */
  @JSName("getTags")
  var getTags_Original: Fn_CallbackCommitHashCommitHashCallback = js.native
  @JSName("loadObject")
  var loadObject_Original: Fn_CallbackKey = js.native
  /** 
    * Collects the objects from the server and pre-loads 
    * them into the cache making the load of multiple objects faster.
    * 
    * @param rootKey Hash of the object at the entry point of the paths.
    * @param paths List of paths that needs to be pre-loaded.
    */
  @JSName("loadPaths")
  var loadPaths_Original: Fn_CallbackPaths = js.native
  /**
    * Makes a commit to data base. 
    * Based on the root hash and commit message a 
    * new module:Storage.CommitObject (with returned hash) 
    * is generated and insert together with the 
    * core objects to the database on the server.
    */
  @JSName("makeCommit")
  var makeCommit_Original: Fn_BranchNameCallbackCoreObjects = js.native
  /**
    * Unique ID of project, built up by the ownerId and projectName.
    */
  var projectId: String = js.native
  /**
    * Updates the head of the branch.
    */
  @JSName("setBranchHash")
  var setBranchHash_Original: Fn_BranchNameCallbackNewHashOldHash = js.native
  /**
    * Creates a new branch with head pointing to the provided commit hash.
    */
  def createBranch(branchName: String, newHash: CommitHash): js.Promise[CommitResult] = js.native
  /** Name of branch to create. */
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
  /** Name of branch to delete. */
  /**
    * Deletes the given branch.
    */
  def deleteBranch(branchName: String, oldHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
  /** Name of tag to delete. */
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
  /** On success the promise will be resolved with Object.module:Storage~CommitHash> result. */
  /**
    * Retrieves all branches and their current heads within the project.
    */
  def getBranches(): js.Promise[Dictionary[CommitHash]] = js.native
  /** On success the callback will run with Object.module:Storage~CommitHash result. */
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
  /** Hash of object to load. */
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


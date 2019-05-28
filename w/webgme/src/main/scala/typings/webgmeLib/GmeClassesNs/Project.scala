package typings
package webgmeLib.GmeClassesNs

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
  var createBranch_Original: webgmeLib.Fn_BranchNameCallbackNewHashCommitHash = js.native
  /**
    * Creates a new tag pointing to the provided commit hash.
    */
  @JSName("createTag")
  var createTag_Original: webgmeLib.Fn_CallbackCommitHashTagNameErrorOnlyCallback = js.native
  /**
    * Deletes the given branch.
    */
  @JSName("deleteBranch")
  var deleteBranch_Original: webgmeLib.Fn_BranchNameCallbackOldHashCommitHash = js.native
  /**
    * Deletes the given tag.
    */
  @JSName("deleteTag")
  var deleteTag_Original: webgmeLib.Fn_CallbackTagNameTagname = js.native
  /**
    * Retrieves the commit hash for the head of the branch.
    */
  @JSName("getBranchHash")
  var getBranchHash_Original: webgmeLib.Fn_BranchNameCallbackCommitHashCommitHashCallback = js.native
  /**
    * Retrieves all branches and their current heads within the project.
    */
  @JSName("getBranches")
  var getBranches_Original: webgmeLib.Fn_CallbackCommitHashDictionary = js.native
  /**
    * Retrieves the Class ancestor of two commits. 
    * If no ancestor exists it will result in an error.
    */
  @JSName("getClassAncestorCommit")
  var getClassAncestorCommit_Original: webgmeLib.Fn_CallbackCommitACommitB = js.native
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
  var getCommits_Original: webgmeLib.Fn_BeforeCallback = js.native
  /**
    * Retrieves an array of commits starting from a branch(es) and/or commitHash(es). 
    * The result is ordered by the rules (applied in order) 
    *  1. Descendants are always returned before their ancestors.
    *  2. By their timestamp.
    */
  @JSName("getHistory")
  var getHistory_Original: webgmeLib.Fn_CallbackNumberStart = js.native
  /**
    * Retrieves all tags and their commits hashes within the project.
    */
  @JSName("getTags")
  var getTags_Original: webgmeLib.Fn_CallbackCommitHashCommitHashCallback = js.native
  @JSName("loadObject")
  var loadObject_Original: webgmeLib.Fn_CallbackKey = js.native
  /** 
    * Collects the objects from the server and pre-loads 
    * them into the cache making the load of multiple objects faster.
    * 
    * @param rootKey Hash of the object at the entry point of the paths.
    * @param paths List of paths that needs to be pre-loaded.
    */
  @JSName("loadPaths")
  var loadPaths_Original: webgmeLib.Fn_CallbackPaths = js.native
  /**
    * Makes a commit to data base. 
    * Based on the root hash and commit message a 
    * new module:Storage.CommitObject (with returned hash) 
    * is generated and insert together with the 
    * core objects to the database on the server.
    */
  @JSName("makeCommit")
  var makeCommit_Original: webgmeLib.Fn_BranchNameCallbackCoreObjects = js.native
  /**
    * Unique ID of project, built up by the ownerId and projectName.
    */
  var projectId: java.lang.String = js.native
  /**
    * Updates the head of the branch.
    */
  @JSName("setBranchHash")
  var setBranchHash_Original: webgmeLib.Fn_BranchNameCallbackNewHashOldHash = js.native
  /**
    * Creates a new branch with head pointing to the provided commit hash.
    */
  def createBranch(branchName: java.lang.String, newHash: webgmeLib.GmeStorageNs.CommitHash): js.Promise[webgmeLib.GmeStorageNs.CommitResult] = js.native
  /** Name of branch to create. */
  /**
    * Creates a new branch with head pointing to the provided commit hash.
    */
  def createBranch(
    branchName: java.lang.String,
    newHash: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitResult]
  ): scala.Unit = js.native
  /**
    * Creates a new tag pointing to the provided commit hash.
    */
  def createTag(tagName: java.lang.String, commitHash: webgmeLib.GmeStorageNs.CommitHash): js.Promise[webgmeLib.GmeStorageNs.ErrorOnlyCallback] = js.native
  /**
    * Creates a new tag pointing to the provided commit hash.
    */
  def createTag(
    tagName: java.lang.String,
    commitHash: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeStorageNs.ErrorOnlyCallback
  ): scala.Unit = js.native
  /**
    * Deletes the given branch.
    */
  def deleteBranch(branchName: java.lang.String, oldHash: webgmeLib.GmeStorageNs.CommitHash): js.Promise[webgmeLib.GmeStorageNs.CommitResult] = js.native
  /** Name of branch to delete. */
  /**
    * Deletes the given branch.
    */
  def deleteBranch(
    branchName: java.lang.String,
    oldHash: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitResult]
  ): scala.Unit = js.native
  /** Name of tag to delete. */
  /**
    * Deletes the given tag.
    */
  def deleteTag(tagName: java.lang.String, callback: webgmeLib.GmeStorageNs.ErrorOnlyCallback): scala.Unit = js.native
  /**
    * Deletes the given tag.
    */
  def deleteTag(tagname: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Retrieves the commit hash for the head of the branch.
    */
  def getBranchHash(branchName: java.lang.String): js.Promise[webgmeLib.GmeStorageNs.CommitHash] = js.native
  /**
    * Retrieves the commit hash for the head of the branch.
    */
  def getBranchHash(branchName: java.lang.String, callback: webgmeLib.GmeStorageNs.CommitHashCallback): scala.Unit = js.native
  /** On success the promise will be resolved with Object.module:Storage~CommitHash> result. */
  /**
    * Retrieves all branches and their current heads within the project.
    */
  def getBranches(): js.Promise[webgmeLib.GmeCommonNs.Dictionary[webgmeLib.GmeStorageNs.CommitHash]] = js.native
  /** On success the callback will run with Object.module:Storage~CommitHash result. */
  /**
    * Retrieves all branches and their current heads within the project.
    */
  def getBranches(
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.Dictionary[webgmeLib.GmeStorageNs.CommitHash]]
  ): scala.Unit = js.native
  /**
    * Retrieves the Class ancestor of two commits. 
    * If no ancestor exists it will result in an error.
    */
  def getClassAncestorCommit(commitA: webgmeLib.GmeStorageNs.CommitHash, commitB: webgmeLib.GmeStorageNs.CommitHash): js.Promise[webgmeLib.GmeStorageNs.CommitHash] = js.native
  /**
    * Retrieves the Class ancestor of two commits. 
    * If no ancestor exists it will result in an error.
    */
  def getClassAncestorCommit(
    commitA: webgmeLib.GmeStorageNs.CommitHash,
    commitB: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeStorageNs.CommitHashCallback
  ): scala.Unit = js.native
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
  def getCommits(before: scala.Double, number: scala.Double): js.Promise[webgmeLib.GmeStorageNs.CommitObject] = js.native
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
  def getCommits(
    before: scala.Double,
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitObject]
  ): scala.Unit = js.native
  def getCommits(before: webgmeLib.GmeStorageNs.CommitHash, number: scala.Double): js.Promise[webgmeLib.GmeStorageNs.CommitObject] = js.native
  def getCommits(
    before: webgmeLib.GmeStorageNs.CommitHash,
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitObject]
  ): scala.Unit = js.native
  /**
    * Retrieves an array of commits starting from a branch(es) and/or commitHash(es). 
    * The result is ordered by the rules (applied in order) 
    *  1. Descendants are always returned before their ancestors.
    *  2. By their timestamp.
    */
  def getHistory(start: webgmeLib.GmeCommonNs.ProjectStart, number: scala.Double): js.Promise[js.Array[webgmeLib.GmeStorageNs.CommitObject]] = js.native
  /**
    * Retrieves an array of commits starting from a branch(es) and/or commitHash(es). 
    * The result is ordered by the rules (applied in order) 
    *  1. Descendants are always returned before their ancestors.
    *  2. By their timestamp.
    */
  def getHistory(
    start: webgmeLib.GmeCommonNs.ProjectStart,
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeStorageNs.CommitObject]]
  ): scala.Unit = js.native
  /**
    * Retrieves all tags and their commits hashes within the project.
    */
  def getTags(): js.Promise[webgmeLib.GmeStorageNs.CommitHash] = js.native
  /**
    * Retrieves all tags and their commits hashes within the project.
    */
  def getTags(callback: webgmeLib.GmeStorageNs.CommitHashCallback): scala.Unit = js.native
  def loadObject(key: java.lang.String): js.Promise[webgmeLib.GmeStorageNs.CommitObject] = js.native
  /** Hash of object to load. */
  def loadObject(
    key: java.lang.String,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitObject]
  ): scala.Unit = js.native
  /** 
    * Collects the objects from the server and pre-loads 
    * them into the cache making the load of multiple objects faster.
    * 
    * @param rootKey Hash of the object at the entry point of the paths.
    * @param paths List of paths that needs to be pre-loaded.
    */
  def loadPaths(rootKey: java.lang.String, paths: js.Array[java.lang.String]): js.Promise[webgmeLib.GmeStorageNs.ErrorOnlyCallback] = js.native
  /** 
    * Collects the objects from the server and pre-loads 
    * them into the cache making the load of multiple objects faster.
    * 
    * @param rootKey Hash of the object at the entry point of the paths.
    * @param paths List of paths that needs to be pre-loaded.
    */
  def loadPaths(
    rootKey: java.lang.String,
    paths: js.Array[java.lang.String],
    callback: webgmeLib.GmeStorageNs.ErrorOnlyCallback
  ): scala.Unit = js.native
  /**
    * Makes a commit to data base. 
    * Based on the root hash and commit message a 
    * new module:Storage.CommitObject (with returned hash) 
    * is generated and insert together with the 
    * core objects to the database on the server.
    */
  def makeCommit(
    branchName: java.lang.String,
    parents: js.Array[webgmeLib.GmeStorageNs.CommitHash],
    rootHash: webgmeLib.CoreNs.ObjectHash,
    coreObjects: webgmeLib.CoreNs.DataObject,
    msg: java.lang.String
  ): js.Promise[webgmeLib.GmeStorageNs.CommitResult] = js.native
  /**
    * Makes a commit to data base. 
    * Based on the root hash and commit message a 
    * new module:Storage.CommitObject (with returned hash) 
    * is generated and insert together with the 
    * core objects to the database on the server.
    */
  def makeCommit(
    branchName: java.lang.String,
    parents: js.Array[webgmeLib.GmeStorageNs.CommitHash],
    rootHash: webgmeLib.CoreNs.ObjectHash,
    coreObjects: webgmeLib.CoreNs.DataObject,
    msg: java.lang.String,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitResult]
  ): scala.Unit = js.native
  /**
    * Updates the head of the branch.
    */
  def setBranchHash(
    branchName: java.lang.String,
    newHash: webgmeLib.GmeStorageNs.CommitHash,
    oldHash: webgmeLib.GmeStorageNs.CommitHash
  ): js.Promise[webgmeLib.GmeStorageNs.CommitResult] = js.native
  /**
    * Updates the head of the branch.
    */
  def setBranchHash(
    branchName: java.lang.String,
    newHash: webgmeLib.GmeStorageNs.CommitHash,
    oldHash: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitResult]
  ): scala.Unit = js.native
}


package typings.webgme.GmeClasses

import typings.webgme.Core.DataObject
import typings.webgme.Core.ObjectHash
import typings.webgme.Global.GmeLogger
import typings.webgme.GmeCommon.Dictionary
import typings.webgme.GmeCommon.LoadObject
import typings.webgme.GmeCommon.MetadataHash
import typings.webgme.GmeCommon.Name
import typings.webgme.GmeCommon.Path
import typings.webgme.GmeCommon.ResultCallback
import typings.webgme.GmeConfig.GmeConfig
import typings.webgme.GmeStorage.CommitHash
import typings.webgme.GmeStorage.CommitObject
import typings.webgme.GmeStorage.CommitResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectInterface extends js.Object {
  var CONSTANTS: Dictionary[String] = js.native
  var ID_NAME: String = js.native
  var logger: GmeLogger = js.native
  /**
    * Unique ID of project, built up by the ownerId and projectName.
    * @example
    * 'guest+TestProject', 'organization+TestProject2'
    */
  var projectId: String = js.native
  var projectName: Name = js.native
  /**
    * Creates a new branch with head pointing to the provided commit hash.
    * @param {string} branchName - Name of branch to create.
    * @param {module:Storage~CommitHash} newHash - New commit hash for branch head.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * {@link module:Storage~CommitResult} <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def createBranch(branchName: Name, newHash: CommitHash): js.Promise[CommitResult] = js.native
  /**
    * Creates a new branch with head pointing to the provided commit hash.
    * @param {string} branchName - Name of branch to create.
    * @param {module:Storage~CommitHash} newHash - New commit hash for branch head.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * {@link module:Storage~CommitResult} <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def createBranch(branchName: Name, newHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
  /**
    * Creates a new tag pointing to the provided commit hash.
    * @param {string} tagName - Name of tag to create.
    * @param {module:Storage~CommitHash} commitHash - Commit hash tag will point to.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def createTag(tagName: Name, commitHash: CommitHash): js.Promise[Unit] = js.native
  /**
    * Creates a new tag pointing to the provided commit hash.
    * @param {string} tagName - Name of tag to create.
    * @param {module:Storage~CommitHash} commitHash - Commit hash tag will point to.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def createTag(tagName: Name, commitHash: CommitHash, callback: ResultCallback[Unit]): Unit = js.native
  /**
    * Deletes the branch.
    * @param {string} branchName - Name of branch to create.
    * @param {module:Storage~CommitHash} oldHash - Previous commit hash for branch head.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * {@link module:Storage~CommitResult} <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def deleteBranch(branchName: Name, oldHash: CommitHash): js.Promise[CommitResult] = js.native
  /**
    * Deletes the branch.
    * @param {string} branchName - Name of branch to create.
    * @param {module:Storage~CommitHash} oldHash - Previous commit hash for branch head.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * {@link module:Storage~CommitResult} <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def deleteBranch(branchName: Name, oldHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
  /**
    * Deletes the given tag.
    * @param {string} tagName - Name of tag to delete.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def deleteTag(tagName: Name): js.Promise[Unit] = js.native
  /**
    * Deletes the given tag.
    * @param {string} tagName - Name of tag to delete.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def deleteTag(tagName: Name, callback: ResultCallback[Unit]): Unit = js.native
  /**
    * Retrieves the commit hash for the head of the branch.
    * @param {string} branchName - Name of branch.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * {module:Storage~CommitHash} <b>branchHash</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def getBranchHash(branchName: Name): js.Promise[CommitHash] = js.native
  /**
    * Retrieves the commit hash for the head of the branch.
    * @param {string} branchName - Name of branch.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * {module:Storage~CommitHash} <b>branchHash</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def getBranchHash(branchName: Name, callback: ResultCallback[CommitHash]): Unit = js.native
  /**
    * Retrieves all branches and their current heads within the project.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def getBranches(): js.Promise[CommitHash] = js.native
  /**
    * Retrieves all branches and their current heads within the project.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def getBranches(callback: ResultCallback[CommitHash]): Unit = js.native
  /**
    * Retrieves and array of the latest (sorted by timestamp) commits for the project.
    * If timestamp is given it will get <b>number</b> of commits strictly <b>before</b>.
    * If commit hash is specified that commit will be included too.
    * <br> N.B. due to slight time differences on different machines, 
    * ancestors may be returned before
    * their descendants. 
    * Unless looking for 'headless' commits 'getHistory' is the preferred method.
    * @param {number|module:Storage~CommitHash} before - Timestamp or commitHash to load history from.
    * @param {number} number - Number of commits to load.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * Array.<{@link module:Storage~CommitObject}> <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def getCommits(before: Double, number: Double): js.Promise[js.Array[CommitObject]] = js.native
  /**
    * Retrieves and array of the latest (sorted by timestamp) commits for the project.
    * If timestamp is given it will get <b>number</b> of commits strictly <b>before</b>.
    * If commit hash is specified that commit will be included too.
    * <br> N.B. due to slight time differences on different machines, 
    * ancestors may be returned before
    * their descendants. 
    * Unless looking for 'headless' commits 'getHistory' is the preferred method.
    * @param {number|module:Storage~CommitHash} before - Timestamp or commitHash to load history from.
    * @param {number} number - Number of commits to load.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * Array.<{@link module:Storage~CommitObject}> <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def getCommits(before: Double, number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
  def getCommits(before: CommitHash, number: Double): js.Promise[js.Array[CommitObject]] = js.native
  def getCommits(before: CommitHash, number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
  /**
    * Retrieves the common ancestor of two commits. If no ancestor exists it will result in an error.
    *
    * @param {module:Storage~CommitHash} commitA - Commit hash.
    * @param {module:Storage~CommitHash} commitB - Commit hash.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * {@link module:Storage~CommitHash} <b>commonCommitHash</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def getCommonAncestorCommit(commitA: CommitHash, commitB: CommitHash): js.Promise[CommitHash] = js.native
  /**
    * Retrieves the common ancestor of two commits. If no ancestor exists it will result in an error.
    *
    * @param {module:Storage~CommitHash} commitA - Commit hash.
    * @param {module:Storage~CommitHash} commitB - Commit hash.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * {@link module:Storage~CommitHash} <b>commonCommitHash</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def getCommonAncestorCommit(commitA: CommitHash, commitB: CommitHash, callback: ResultCallback[CommitHash]): Unit = js.native
  /**
    * Retrieves an array of commits starting from a branch(es) and/or commitHash(es).
    * <br> The result is ordered by the rules (applied in order)
    * <br> 1. Descendants are always returned before their ancestors.
    * <br> 2. By their timestamp.
    * @param {string|module:Storage~CommitHash|Array} start - Branch name, commit hash or array of these.
    * @param {number} number - Number of commits to load.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * Array.<{@link module:Storage~CommitObject}> <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def getHistory(start: CommitHash | String, number: Double): js.Promise[js.Array[CommitObject]] = js.native
  /**
    * Retrieves an array of commits starting from a branch(es) and/or commitHash(es).
    * <br> The result is ordered by the rules (applied in order)
    * <br> 1. Descendants are always returned before their ancestors.
    * <br> 2. By their timestamp.
    * @param {string|module:Storage~CommitHash|Array} start - Branch name, commit hash or array of these.
    * @param {number} number - Number of commits to load.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * Array.<{@link module:Storage~CommitObject}> <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def getHistory(start: CommitHash | String, number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
  def getHistory(start: js.Array[String], number: Double): js.Promise[js.Array[CommitObject]] = js.native
  def getHistory(start: js.Array[String], number: Double, callback: ResultCallback[js.Array[CommitObject]]): Unit = js.native
  /**
    * Retrieves all tags and their commits hashes within the project.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def getTags(): js.Promise[Unit] = js.native
  /**
    * Retrieves all tags and their commits hashes within the project.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def getTags(callback: ResultCallback[Unit]): Unit = js.native
  // projectCache: ProjectCache;
  // Functions forwarded to project cache.
  /**
    * Inserts the given object to project-cache.
    *
    * @param {module:Storage~CommitObject|module:Core~ObjectData} obj - Object to be inserted in database.
    * @param {Object.<module:Core~ObjectHash, module:Core~ObjectData>} [stackedObjects] - When used by the core, inserts between persists are stored here.
    * @func
    * @private
    */
  def insertObject(obj: CommitObject, stackedObjects: Dictionary[DataObject]): Unit = js.native
  def insertPatchObject(obj: DataObject): Unit = js.native
  /**
    * Try to create the full object from the patch 
    * object by looking for the base object in the cache.
    * If the base has been found it applies the patch and inserts the result. 
    * If any step fails it simply ignores the insert.
    *
    * @param {module:Storage~CommitObject|module:Core~ObjectData} obj - Object to be inserted in database.
    * @func
    * @private
    */
  def insertPatchObject(obj: CommitObject): Unit = js.native
  /**
    * Loads the object with hash key from the database or
    * directly from the cache if recently loaded.
    *
    * @param {string} key - Hash of object to load.
    * @param {ProjectInterface~loadObjectCallback} callback - Invoked when object is loaded.
    * @func
    */
  def loadObject(key: String, callback: ResultCallback[LoadObject]): Unit = js.native
  /**
    * Collects the objects from the server and pre-loads them into the cache
    * making the load of multiple objects faster.
    *
    * @param {string} rootKey - Hash of the object at the entry point of the paths.
    * @param {string[]} paths - List of paths that needs to be pre-loaded.
    * @param {function} callback - Invoked when objects have been collected.
    * @func
    */
  def loadPaths(rootKey: MetadataHash, paths: js.Array[Path], callback: ResultCallback[_]): Unit = js.native
  /**
    * Makes a commit to data base. Based on the root hash and commit message a new
    * {@link module:Storage.CommitObject} (with returned hash)
    * is generated and insert together with the core objects to the database on the server.
    *
    * @example
    * var persisted = core.persist(rootNode);
    *
    * project.makeCommit('master', ['#thePreviousCommitHash'], persisted.rootHash, persisted.objects, 'new commit')
    *   .then(function (result) {
    *     // result = {
    *     //   status: 'SYNCED',
    *     //   hash: '#thisCommitHash'
    *     // }
    *   })
    *   .catch(function (error) {
    *     // error.message = 'Not authorized to read project: guest+project'
    *   });
    * @example
    * project.makeCommit('master', ['#notPreviousCommitHash'], persisted.rootHash, persisted.objects, 'new commit')
    *   .then(function (result) {
    *     // result = {
    *     //   status: 'FORKED',
    *     //   hash: '#thisCommitHash'
    *     // }
    *   })...
    * @example
    * project.makeCommit(null, ['#anExistingCommitHash'], persisted.rootHash, persisted.objects, 'new commit')
    *   .then(function (result) {
    *     // result = {
    *     //   hash: '#thisCommitHash'
    *     // }
    *   })...
    * @example
    * project.makeCommit('master', ['#aPreviousCommitHash'], previousRootHash, {}, 'just adding a commit to master')
    *   .then(function (result) {
    *     // result = {
    *     //   status: 'SYNCED',
    *     //   hash: '#thisCommitHash'
    *     // }
    *   })...
    * @param {string} branchName - Name of branch to update (none if null).
    * @param {module:Storage~CommitHash[]} parents - Parent commit hashes.
    * @param {module:Core~ObjectHash} rootHash - Hash of root object.
    * @param {module:Core~DataObject} coreObjects - Core objects associated with the commit.
    * @param {string} msg='n/a' - Commit message.
    * @param {function} [callback] - If provided no promise will be returned.
    * @async
    * @return {external:Promise}  On success the promise will be resolved with
    * {@link module:Storage~CommitResult} <b>result</b>.<br>
    * On error the promise will be rejected with {Error} <b>error</b>.
    */
  def makeCommit(branchName: Name, parents: CommitHash, rootHash: ObjectHash, coreObjects: DataObject, msg: String): js.Promise[CommitResult] = js.native
  /**
    * Makes a commit to data base. Based on the root hash and commit message a new
    * {@link module:Storage.CommitObject} (with returned hash)
    * is generated and insert together with the core objects to the database on the server.
    *
    * @example
    * var persisted = core.persist(rootNode);
    *
    * project.makeCommit('master', ['#thePreviousCommitHash'], persisted.rootHash, persisted.objects, 'new commit')
    *   .then(function (result) {
    *     // result = {
    *     //   status: 'SYNCED',
    *     //   hash: '#thisCommitHash'
    *     // }
    *   })
    *   .catch(function (error) {
    *     // error.message = 'Not authorized to read project: guest+project'
    *   });
    * @example
    * project.makeCommit('master', ['#notPreviousCommitHash'], persisted.rootHash, persisted.objects, 'new commit')
    *   .then(function (result) {
    *     // result = {
    *     //   status: 'FORKED',
    *     //   hash: '#thisCommitHash'
    *     // }
    *   })...
    * @example
    * project.makeCommit(null, ['#anExistingCommitHash'], persisted.rootHash, persisted.objects, 'new commit')
    *   .then(function (result) {
    *     // result = {
    *     //   hash: '#thisCommitHash'
    *     // }
    *   })...
    * @example
    * project.makeCommit('master', ['#aPreviousCommitHash'], previousRootHash, {}, 'just adding a commit to master')
    *   .then(function (result) {
    *     // result = {
    *     //   status: 'SYNCED',
    *     //   hash: '#thisCommitHash'
    *     // }
    *   })...
    * @param {string} branchName - Name of branch to update (none if null).
    * @param {module:Storage~CommitHash[]} parents - Parent commit hashes.
    * @param {module:Core~ObjectHash} rootHash - Hash of root object.
    * @param {module:Core~DataObject} coreObjects - Core objects associated with the commit.
    * @param {string} msg='n/a' - Commit message.
    * @param {function} [callback] - If provided no promise will be returned.
    * @async
    * @return {external:Promise}  On success the promise will be resolved with
    * {@link module:Storage~CommitResult} <b>result</b>.<br>
    * On error the promise will be rejected with {Error} <b>error</b>.
    */
  def makeCommit(
    branchName: Name,
    parents: CommitHash,
    rootHash: ObjectHash,
    coreObjects: DataObject,
    msg: String,
    callback: ResultCallback[CommitResult]
  ): Unit = js.native
  /**
    * Updates the head of the branch.
    * @param {string} branchName - Name of branch to update.
    * @param {module:Storage~CommitHash} newHash - New commit hash for branch head.
    * @param {module:Storage~CommitHash} oldHash - Current state of the branch head inside the database.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * {@link module:Storage~CommitResult} <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def setBranchHash(branchName: Name, newHash: CommitHash, oldHash: CommitHash): js.Promise[CommitResult] = js.native
  /**
    * Updates the head of the branch.
    * @param {string} branchName - Name of branch to update.
    * @param {module:Storage~CommitHash} newHash - New commit hash for branch head.
    * @param {module:Storage~CommitHash} oldHash - Current state of the branch head inside the database.
    * @param {function} [callback] - if provided no promise will be returned.
    *
    * @return {external:Promise}  On success the promise will be resolved with
    * {@link module:Storage~CommitResult} <b>result</b>.<br>
    * On error the promise will be rejected with {@link Error} <b>error</b>.
    */
  def setBranchHash(branchName: Name, newHash: CommitHash, oldHash: CommitHash, callback: ResultCallback[CommitResult]): Unit = js.native
}


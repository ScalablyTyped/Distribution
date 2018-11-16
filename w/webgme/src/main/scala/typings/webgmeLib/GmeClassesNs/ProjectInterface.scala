package typings
package webgmeLib.GmeClassesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectInterface extends js.Object {
  var CONSTANTS: webgmeLib.GmeCommonNs.Dictionary[java.lang.String] = js.native
  var ID_NAME: java.lang.String = js.native
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
  @JSName("createBranch")
  var createBranch_Original: webgmeLib.Anon_BranchNameNewHashCallbackName = js.native
  /**
           * Creates a new tag pointing to the provided commit hash.
           * @param {string} tagName - Name of tag to create.
           * @param {module:Storage~CommitHash} commitHash - Commit hash tag will point to.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  @JSName("createTag")
  var createTag_Original: webgmeLib.Anon_TagNameCommitHashCallback = js.native
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
  @JSName("deleteBranch")
  var deleteBranch_Original: webgmeLib.Anon_BranchNameOldHashCallback = js.native
  /**
           * Deletes the given tag.
           * @param {string} tagName - Name of tag to delete.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  @JSName("deleteTag")
  var deleteTag_Original: webgmeLib.Anon_TagNameCallback = js.native
  /**
           * Retrieves the commit hash for the head of the branch.
           * @param {string} branchName - Name of branch.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with
           * {module:Storage~CommitHash} <b>branchHash</b>.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  @JSName("getBranchHash")
  var getBranchHash_Original: webgmeLib.Anon_BranchNameCallbackName = js.native
  /**
           * Retrieves all branches and their current heads within the project.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with
           * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  @JSName("getBranches")
  var getBranches_Original: webgmeLib.Anon_CallbackResultCallbackCommitHash = js.native
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
  @JSName("getCommits")
  var getCommits_Original: webgmeLib.Anon_BeforeNumber = js.native
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
  @JSName("getCommonAncestorCommit")
  var getCommonAncestorCommit_Original: webgmeLib.Anon_CommitACommitB = js.native
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
  @JSName("getHistory")
  var getHistory_Original: webgmeLib.Anon_StartNumber = js.native
  /**
           * Retrieves all tags and their commits hashes within the project.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with
           * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  @JSName("getTags")
  var getTags_Original: webgmeLib.Anon_CallbackResultCallbackVoid = js.native
  var logger: webgmeLib.GlobalNs.GmeLogger = js.native
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
  @JSName("makeCommit")
  var makeCommit_Original: webgmeLib.Anon_BranchNameParents = js.native
  /**
           * Unique ID of project, built up by the ownerId and projectName.
           * @example
           * 'guest+TestProject', 'organization+TestProject2'
           */
  var projectId: java.lang.String = js.native
  var projectName: webgmeLib.GmeCommonNs.Name = js.native
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
  @JSName("setBranchHash")
  var setBranchHash_Original: webgmeLib.Anon_BranchNameNewHashOldHash = js.native
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
  def createBranch(branchName: webgmeLib.GmeCommonNs.Name, newHash: webgmeLib.GmeStorageNs.CommitHash): stdLib.Promise[webgmeLib.GmeStorageNs.CommitResult] = js.native
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
  def createBranch(
    branchName: webgmeLib.GmeCommonNs.Name,
    newHash: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitResult]
  ): scala.Unit = js.native
  /**
           * Creates a new tag pointing to the provided commit hash.
           * @param {string} tagName - Name of tag to create.
           * @param {module:Storage~CommitHash} commitHash - Commit hash tag will point to.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  def createTag(tagName: webgmeLib.GmeCommonNs.Name, commitHash: webgmeLib.GmeStorageNs.CommitHash): stdLib.Promise[scala.Unit] = js.native
  /**
           * Creates a new tag pointing to the provided commit hash.
           * @param {string} tagName - Name of tag to create.
           * @param {module:Storage~CommitHash} commitHash - Commit hash tag will point to.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  def createTag(
    tagName: webgmeLib.GmeCommonNs.Name,
    commitHash: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[scala.Unit]
  ): scala.Unit = js.native
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
  def deleteBranch(branchName: webgmeLib.GmeCommonNs.Name, oldHash: webgmeLib.GmeStorageNs.CommitHash): stdLib.Promise[webgmeLib.GmeStorageNs.CommitResult] = js.native
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
  def deleteBranch(
    branchName: webgmeLib.GmeCommonNs.Name,
    oldHash: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitResult]
  ): scala.Unit = js.native
  /**
           * Deletes the given tag.
           * @param {string} tagName - Name of tag to delete.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  def deleteTag(tagName: webgmeLib.GmeCommonNs.Name): stdLib.Promise[scala.Unit] = js.native
  /**
           * Deletes the given tag.
           * @param {string} tagName - Name of tag to delete.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with nothing.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  def deleteTag(tagName: webgmeLib.GmeCommonNs.Name, callback: webgmeLib.GmeCommonNs.ResultCallback[scala.Unit]): scala.Unit = js.native
  /**
           * Retrieves the commit hash for the head of the branch.
           * @param {string} branchName - Name of branch.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with
           * {module:Storage~CommitHash} <b>branchHash</b>.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  def getBranchHash(branchName: webgmeLib.GmeCommonNs.Name): stdLib.Promise[webgmeLib.GmeStorageNs.CommitHash] = js.native
  /**
           * Retrieves the commit hash for the head of the branch.
           * @param {string} branchName - Name of branch.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with
           * {module:Storage~CommitHash} <b>branchHash</b>.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  def getBranchHash(
    branchName: webgmeLib.GmeCommonNs.Name,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitHash]
  ): scala.Unit = js.native
  /**
           * Retrieves all branches and their current heads within the project.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with
           * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  def getBranches(): stdLib.Promise[webgmeLib.GmeStorageNs.CommitHash] = js.native
  /**
           * Retrieves all branches and their current heads within the project.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with
           * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  def getBranches(callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitHash]): scala.Unit = js.native
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
  def getCommits(before: scala.Double, number: scala.Double): stdLib.Promise[js.Array[webgmeLib.GmeStorageNs.CommitObject]] = js.native
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
  def getCommits(
    before: scala.Double,
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeStorageNs.CommitObject]]
  ): scala.Unit = js.native
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
  def getCommits(before: webgmeLib.GmeStorageNs.CommitHash, number: scala.Double): stdLib.Promise[js.Array[webgmeLib.GmeStorageNs.CommitObject]] = js.native
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
  def getCommits(
    before: webgmeLib.GmeStorageNs.CommitHash,
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeStorageNs.CommitObject]]
  ): scala.Unit = js.native
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
  def getCommonAncestorCommit(commitA: webgmeLib.GmeStorageNs.CommitHash, commitB: webgmeLib.GmeStorageNs.CommitHash): stdLib.Promise[webgmeLib.GmeStorageNs.CommitHash] = js.native
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
  def getCommonAncestorCommit(
    commitA: webgmeLib.GmeStorageNs.CommitHash,
    commitB: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitHash]
  ): scala.Unit = js.native
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
  def getHistory(start: java.lang.String | webgmeLib.GmeStorageNs.CommitHash, number: scala.Double): stdLib.Promise[js.Array[webgmeLib.GmeStorageNs.CommitObject]] = js.native
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
  def getHistory(
    start: java.lang.String | webgmeLib.GmeStorageNs.CommitHash,
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeStorageNs.CommitObject]]
  ): scala.Unit = js.native
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
  def getHistory(start: js.Array[java.lang.String], number: scala.Double): stdLib.Promise[js.Array[webgmeLib.GmeStorageNs.CommitObject]] = js.native
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
  def getHistory(
    start: js.Array[java.lang.String],
    number: scala.Double,
    callback: webgmeLib.GmeCommonNs.ResultCallback[js.Array[webgmeLib.GmeStorageNs.CommitObject]]
  ): scala.Unit = js.native
  /**
           * Retrieves all tags and their commits hashes within the project.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with
           * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  def getTags(): stdLib.Promise[scala.Unit] = js.native
  /**
           * Retrieves all tags and their commits hashes within the project.
           * @param {function} [callback] - if provided no promise will be returned.
           *
           * @return {external:Promise}  On success the promise will be resolved with
           * Object.<string, {@link module:Storage~CommitHash}> <b>result</b>.<br>
           * On error the promise will be rejected with {@link Error} <b>error</b>.
           */
  def getTags(callback: webgmeLib.GmeCommonNs.ResultCallback[scala.Unit]): scala.Unit = js.native
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
  def insertObject(
    obj: webgmeLib.GmeStorageNs.CommitObject,
    stackedObjects: webgmeLib.GmeCommonNs.Dictionary[webgmeLib.CoreNs.DataObject]
  ): scala.Unit = js.native
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
  def insertPatchObject(obj: webgmeLib.CoreNs.DataObject): scala.Unit = js.native
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
  def insertPatchObject(obj: webgmeLib.GmeStorageNs.CommitObject): scala.Unit = js.native
  /**
           * Loads the object with hash key from the database or
           * directly from the cache if recently loaded.
           *
           * @param {string} key - Hash of object to load.
           * @param {ProjectInterface~loadObjectCallback} callback - Invoked when object is loaded.
           * @func
           */
  def loadObject(
    key: java.lang.String,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeCommonNs.LoadObject]
  ): scala.Unit = js.native
  /**
           * Collects the objects from the server and pre-loads them into the cache
           * making the load of multiple objects faster.
           *
           * @param {string} rootKey - Hash of the object at the entry point of the paths.
           * @param {string[]} paths - List of paths that needs to be pre-loaded.
           * @param {function} callback - Invoked when objects have been collected.
           * @func
           */
  def loadPaths(
    rootKey: webgmeLib.GmeCommonNs.MetadataHash,
    paths: js.Array[webgmeLib.GmeCommonNs.Path],
    callback: webgmeLib.GmeCommonNs.ResultCallback[_]
  ): scala.Unit = js.native
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
    branchName: webgmeLib.GmeCommonNs.Name,
    parents: webgmeLib.GmeStorageNs.CommitHash,
    rootHash: webgmeLib.CoreNs.ObjectHash,
    coreObjects: webgmeLib.CoreNs.DataObject,
    msg: java.lang.String
  ): stdLib.Promise[webgmeLib.GmeStorageNs.CommitResult] = js.native
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
    branchName: webgmeLib.GmeCommonNs.Name,
    parents: webgmeLib.GmeStorageNs.CommitHash,
    rootHash: webgmeLib.CoreNs.ObjectHash,
    coreObjects: webgmeLib.CoreNs.DataObject,
    msg: java.lang.String,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitResult]
  ): scala.Unit = js.native
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
  def setBranchHash(
    branchName: webgmeLib.GmeCommonNs.Name,
    newHash: webgmeLib.GmeStorageNs.CommitHash,
    oldHash: webgmeLib.GmeStorageNs.CommitHash
  ): stdLib.Promise[webgmeLib.GmeStorageNs.CommitResult] = js.native
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
  def setBranchHash(
    branchName: webgmeLib.GmeCommonNs.Name,
    newHash: webgmeLib.GmeStorageNs.CommitHash,
    oldHash: webgmeLib.GmeStorageNs.CommitHash,
    callback: webgmeLib.GmeCommonNs.ResultCallback[webgmeLib.GmeStorageNs.CommitResult]
  ): scala.Unit = js.native
}


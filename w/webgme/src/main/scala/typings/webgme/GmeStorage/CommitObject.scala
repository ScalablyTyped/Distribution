package typings.webgme.GmeStorage

import typings.webgme.Core.ObjectHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitObject extends js.Object {
  /**
    * Hash of the commit object, a.k.a commitHash.
    */
  var _id: CommitHash
  /**
    * Commit message.
    */
  var message: String
  /**
    * Commits from where this commit evolved.
    */
  var parents: js.Array[CommitHash]
  /**
    * Hash of the associated root object, a.k.a. rootHash.
    */
  var root: ObjectHash
  /**
    * When the commit object was created (new Date()).getTime().
    */
  var time: Double
  /**
    * A constant 'commit'.
    */
  var `type`: String
  /**
    * Who performed the update.
    */
  var updater: js.Array[String]
}

object CommitObject {
  @scala.inline
  def apply(
    _id: CommitHash,
    message: String,
    parents: js.Array[CommitHash],
    root: ObjectHash,
    time: Double,
    `type`: String,
    updater: js.Array[String]
  ): CommitObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], parents = parents.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], updater = updater.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommitObject]
  }
}


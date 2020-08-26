package typings.webgme.GmeStorage

import typings.webgme.Core.ObjectHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommitObject extends js.Object {
  /**
    * Hash of the commit object, a.k.a commitHash.
    */
  var _id: CommitHash = js.native
  /**
    * Commit message.
    */
  var message: String = js.native
  /**
    * Commits from where this commit evolved.
    */
  var parents: js.Array[CommitHash] = js.native
  /**
    * Hash of the associated root object, a.k.a. rootHash.
    */
  var root: ObjectHash = js.native
  /**
    * When the commit object was created (new Date()).getTime().
    */
  var time: Double = js.native
  /**
    * A constant 'commit'.
    */
  var `type`: String = js.native
  /**
    * Who performed the update.
    */
  var updater: js.Array[String] = js.native
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
  @scala.inline
  implicit class CommitObjectOps[Self <: CommitObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_id(value: CommitHash): Self = this.set("_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentsVarargs(value: CommitHash*): Self = this.set("parents", js.Array(value :_*))
    @scala.inline
    def setParents(value: js.Array[CommitHash]): Self = this.set("parents", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: ObjectHash): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdaterVarargs(value: String*): Self = this.set("updater", js.Array(value :_*))
    @scala.inline
    def setUpdater(value: js.Array[String]): Self = this.set("updater", value.asInstanceOf[js.Any])
  }
  
}


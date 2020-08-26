package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeList[T] extends js.Object {
  var allChangesIncluded: Boolean = js.native
  var changeCounts: NumberDictionary[Double] = js.native
  var changes: js.Array[Change[T]] = js.native
  var comment: String = js.native
  var commentTruncated: Boolean = js.native
  var creationDate: Date = js.native
  var notes: js.Array[CheckinNote] = js.native
  var owner: String = js.native
  var ownerDisplayName: String = js.native
  var ownerId: String = js.native
  var sortDate: Date = js.native
  var version: String = js.native
}

object ChangeList {
  @scala.inline
  def apply[T](
    allChangesIncluded: Boolean,
    changeCounts: NumberDictionary[Double],
    changes: js.Array[Change[T]],
    comment: String,
    commentTruncated: Boolean,
    creationDate: Date,
    notes: js.Array[CheckinNote],
    owner: String,
    ownerDisplayName: String,
    ownerId: String,
    sortDate: Date,
    version: String
  ): ChangeList[T] = {
    val __obj = js.Dynamic.literal(allChangesIncluded = allChangesIncluded.asInstanceOf[js.Any], changeCounts = changeCounts.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ownerDisplayName = ownerDisplayName.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], sortDate = sortDate.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeList[T]]
  }
  @scala.inline
  implicit class ChangeListOps[Self <: ChangeList[_], T] (val x: Self with ChangeList[T]) extends AnyVal {
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
    def setAllChangesIncluded(value: Boolean): Self = this.set("allChangesIncluded", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangeCounts(value: NumberDictionary[Double]): Self = this.set("changeCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangesVarargs(value: Change[T]*): Self = this.set("changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: js.Array[Change[T]]): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommentTruncated(value: Boolean): Self = this.set("commentTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationDate(value: Date): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotesVarargs(value: CheckinNote*): Self = this.set("notes", js.Array(value :_*))
    @scala.inline
    def setNotes(value: js.Array[CheckinNote]): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerDisplayName(value: String): Self = this.set("ownerDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortDate(value: Date): Self = this.set("sortDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}


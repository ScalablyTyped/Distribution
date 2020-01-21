package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeList[T] extends js.Object {
  var allChangesIncluded: Boolean
  var changeCounts: NumberDictionary[Double]
  var changes: js.Array[Change[T]]
  var comment: String
  var commentTruncated: Boolean
  var creationDate: Date
  var notes: js.Array[CheckinNote]
  var owner: String
  var ownerDisplayName: String
  var ownerId: String
  var sortDate: Date
  var version: String
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
}


package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeList[T] extends StObject {
  
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
  implicit class ChangeListMutableBuilder[Self <: ChangeList[_], T] (val x: Self with ChangeList[T]) extends AnyVal {
    
    @scala.inline
    def setAllChangesIncluded(value: Boolean): Self = StObject.set(x, "allChangesIncluded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeCounts(value: NumberDictionary[Double]): Self = StObject.set(x, "changeCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChanges(value: js.Array[Change[T]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: Change[T]*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentTruncated(value: Boolean): Self = StObject.set(x, "commentTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotes(value: js.Array[CheckinNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesVarargs(value: CheckinNote*): Self = StObject.set(x, "notes", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerDisplayName(value: String): Self = StObject.set(x, "ownerDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortDate(value: Date): Self = StObject.set(x, "sortDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

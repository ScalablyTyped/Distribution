package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeList[T] extends StObject {
  
  var allChangesIncluded: Boolean
  
  var changeCounts: NumberDictionary[Double]
  
  var changes: js.Array[Change[T]]
  
  var comment: String
  
  var commentTruncated: Boolean
  
  var creationDate: js.Date
  
  var notes: js.Array[CheckinNote]
  
  var owner: String
  
  var ownerDisplayName: String
  
  var ownerId: String
  
  var sortDate: js.Date
  
  var version: String
}
object ChangeList {
  
  inline def apply[T](
    allChangesIncluded: Boolean,
    changeCounts: NumberDictionary[Double],
    changes: js.Array[Change[T]],
    comment: String,
    commentTruncated: Boolean,
    creationDate: js.Date,
    notes: js.Array[CheckinNote],
    owner: String,
    ownerDisplayName: String,
    ownerId: String,
    sortDate: js.Date,
    version: String
  ): ChangeList[T] = {
    val __obj = js.Dynamic.literal(allChangesIncluded = allChangesIncluded.asInstanceOf[js.Any], changeCounts = changeCounts.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], commentTruncated = commentTruncated.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], ownerDisplayName = ownerDisplayName.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], sortDate = sortDate.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeList[T]]
  }
  
  extension [Self <: ChangeList[?], T](x: Self & ChangeList[T]) {
    
    inline def setAllChangesIncluded(value: Boolean): Self = StObject.set(x, "allChangesIncluded", value.asInstanceOf[js.Any])
    
    inline def setChangeCounts(value: NumberDictionary[Double]): Self = StObject.set(x, "changeCounts", value.asInstanceOf[js.Any])
    
    inline def setChanges(value: js.Array[Change[T]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: Change[T]*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentTruncated(value: Boolean): Self = StObject.set(x, "commentTruncated", value.asInstanceOf[js.Any])
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setNotes(value: js.Array[CheckinNote]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesVarargs(value: CheckinNote*): Self = StObject.set(x, "notes", js.Array(value*))
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerDisplayName(value: String): Self = StObject.set(x, "ownerDisplayName", value.asInstanceOf[js.Any])
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
    
    inline def setSortDate(value: js.Date): Self = StObject.set(x, "sortDate", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

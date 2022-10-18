package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentThread extends StObject {
  
  /**
    * Links to other related objects.
    */
  var _links: Any
  
  /**
    * A list of the comments.
    */
  var comments: js.Array[Comment]
  
  /**
    * The comment thread id.
    */
  var id: Double
  
  /**
    * Specify if the thread is deleted which happens when all comments are deleted.
    */
  var isDeleted: Boolean
  
  /**
    * The time this thread was last updated.
    */
  var lastUpdatedDate: js.Date
  
  /**
    * Optional properties associated with the thread as a collection of key-value pairs.
    */
  var properties: Any
  
  /**
    * The time this thread was published.
    */
  var publishedDate: js.Date
  
  /**
    * The status of the comment thread.
    */
  var status: CommentThreadStatus
  
  /**
    * Specify thread context such as position in left/right file.
    */
  var threadContext: CommentThreadContext
}
object CommentThread {
  
  inline def apply(
    _links: Any,
    comments: js.Array[Comment],
    id: Double,
    isDeleted: Boolean,
    lastUpdatedDate: js.Date,
    properties: Any,
    publishedDate: js.Date,
    status: CommentThreadStatus,
    threadContext: CommentThreadContext
  ): CommentThread = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], threadContext = threadContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentThread]
  }
  
  extension [Self <: CommentThread](x: Self) {
    
    inline def setComments(value: js.Array[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDate(value: js.Date): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPublishedDate(value: js.Date): Self = StObject.set(x, "publishedDate", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CommentThreadStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setThreadContext(value: CommentThreadContext): Self = StObject.set(x, "threadContext", value.asInstanceOf[js.Any])
    
    inline def set_links(value: Any): Self = StObject.set(x, "_links", value.asInstanceOf[js.Any])
  }
}

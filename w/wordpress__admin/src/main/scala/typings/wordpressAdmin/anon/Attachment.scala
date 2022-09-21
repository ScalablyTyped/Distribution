package typings.wordpressAdmin.anon

import typings.std.Selection
import typings.wordpressAdmin.mediaModelsMod.Attachments
import typings.wordpressAdmin.mediaModelsMod.PostImage
import typings.wordpressAdmin.mediaModelsMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  var Attachment: typings.wordpressAdmin.mediaModelsMod.Attachment
  
  var Attachments: typings.wordpressAdmin.mediaModelsMod.Attachments
  
  var PostImage: typings.wordpressAdmin.mediaModelsMod.PostImage
  
  var Query: typings.wordpressAdmin.mediaModelsMod.Query
  
  var Selection: typings.std.Selection
}
object Attachment {
  
  inline def apply(
    Attachment: typings.wordpressAdmin.mediaModelsMod.Attachment,
    Attachments: Attachments,
    PostImage: PostImage,
    Query: Query,
    Selection: Selection
  ): Attachment = {
    val __obj = js.Dynamic.literal(Attachment = Attachment.asInstanceOf[js.Any], Attachments = Attachments.asInstanceOf[js.Any], PostImage = PostImage.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  extension [Self <: Attachment](x: Self) {
    
    inline def setAttachment(value: typings.wordpressAdmin.mediaModelsMod.Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachments(value: Attachments): Self = StObject.set(x, "Attachments", value.asInstanceOf[js.Any])
    
    inline def setPostImage(value: PostImage): Self = StObject.set(x, "PostImage", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Query): Self = StObject.set(x, "Query", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: Selection): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
  }
}

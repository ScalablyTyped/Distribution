package typings.watsonDeveloperCloud.personalityInsightsV3GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** ContentItem. */
trait ContentItem extends StObject {
  
  /** The content that is to be analyzed. The service supports up to 20 MB of content for all `ContentItem` objects combined. */
  var content: String
  
  /** The MIME type of the content. The default is plain text. The tags are stripped from HTML content before it is analyzed; plain text is processed as submitted. */
  var contenttype: js.UndefOr[String] = js.undefined
  
  /** A timestamp that identifies when this content was created. Specify a value in milliseconds since the UNIX Epoch (January 1, 1970, at 0:00 UTC). Required only for results that include temporal behavior data. */
  var created: js.UndefOr[Double] = js.undefined
  
  /** Indicates whether this content item is a forwarded/copied version of another content item. */
  var forward: js.UndefOr[Boolean] = js.undefined
  
  /** A unique identifier for this content item. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The language identifier (two-letter ISO 639-1 identifier) for the language of the content item. The default is `en` (English). Regional variants are treated as their parent language; for example, `en-US` is interpreted as `en`. A language specified with the **Content-Type** parameter overrides the value of this parameter; any content items that specify a different language are ignored. Omit the **Content-Type** parameter to base the language on the most prevalent specification among the content items; again, content items that specify a different language are ignored. You can specify any combination of languages for the input and response content. */
  var language: js.UndefOr[String] = js.undefined
  
  /** The unique ID of the parent content item for this item. Used to identify hierarchical relationships between posts/replies, messages/replies, and so on. */
  var parentid: js.UndefOr[String] = js.undefined
  
  /** Indicates whether this content item is a reply to another content item. */
  var reply: js.UndefOr[Boolean] = js.undefined
  
  /** A timestamp that identifies when this content was last updated. Specify a value in milliseconds since the UNIX Epoch (January 1, 1970, at 0:00 UTC). Required only for results that include temporal behavior data. */
  var updated: js.UndefOr[Double] = js.undefined
}
object ContentItem {
  
  inline def apply(content: String): ContentItem = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentItem]
  }
  
  extension [Self <: ContentItem](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContenttype(value: String): Self = StObject.set(x, "contenttype", value.asInstanceOf[js.Any])
    
    inline def setContenttypeUndefined: Self = StObject.set(x, "contenttype", js.undefined)
    
    inline def setCreated(value: Double): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setForward(value: Boolean): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setParentid(value: String): Self = StObject.set(x, "parentid", value.asInstanceOf[js.Any])
    
    inline def setParentidUndefined: Self = StObject.set(x, "parentid", js.undefined)
    
    inline def setReply(value: Boolean): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
    
    inline def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
    
    inline def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}

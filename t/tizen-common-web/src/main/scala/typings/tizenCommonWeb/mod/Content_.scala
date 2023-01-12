package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content_ extends StObject {
  
  /**
    * The URI to access the content.
    */
  val contentURI: String
  
  /**
    * The content description.
    *
    * The attribute is marked as read-only since Tizen 5.5.
    */
  val description: String | Null
  
  /**
    * The list of attributes that are editable to the local backend using the update() or updateBatch() method.
    */
  val editableAttributes: js.Array[String]
  
  /**
    * The opaque content identifier.
    */
  val id: ContentId
  
  /**
    * Boolean value that indicates whether a content item is marked as a favorite.
    *
    * @since 2.3
    */
  var isFavorite: Boolean
  
  /**
    * The content MIME type.
    */
  val mimeType: String
  
  /**
    * The last modified date for a content item.
    */
  val modifiedDate: js.Date | Null
  
  /**
    * The content name. The initial value is the file name of the content.
    *
    * The attribute is marked as read-only since Tizen 5.5.
    *
    * @since 2.1
    */
  val name: String
  
  /**
    * The content rating. This value can range from 0 to 10.
    *
    * The attribute is marked as read-only since Tizen 5.5.
    */
  val rating: Double
  
  /**
    * The date when content has been released publicly. If only the release year is known, then the month and date are set to January and 1st respectively.
    */
  val releaseDate: js.Date | Null
  
  /**
    * The file size of the content in bytes.
    */
  val size: Double
  
  /**
    * The array of content thumbnail URIs.
    */
  val thumbnailURIs: js.Array[String] | Null
  
  /**
    * The content title.
    */
  val title: String
  
  /**
    * The content type.
    */
  val `type`: ContentType
}
object Content_ {
  
  inline def apply(
    contentURI: String,
    editableAttributes: js.Array[String],
    id: ContentId,
    isFavorite: Boolean,
    mimeType: String,
    name: String,
    rating: Double,
    size: Double,
    title: String,
    `type`: ContentType
  ): Content_ = {
    val __obj = js.Dynamic.literal(contentURI = contentURI.asInstanceOf[js.Any], editableAttributes = editableAttributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFavorite = isFavorite.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], description = null, modifiedDate = null, releaseDate = null, thumbnailURIs = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Content_] (val x: Self) extends AnyVal {
    
    inline def setContentURI(value: String): Self = StObject.set(x, "contentURI", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setEditableAttributes(value: js.Array[String]): Self = StObject.set(x, "editableAttributes", value.asInstanceOf[js.Any])
    
    inline def setEditableAttributesVarargs(value: String*): Self = StObject.set(x, "editableAttributes", js.Array(value*))
    
    inline def setId(value: ContentId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsFavorite(value: Boolean): Self = StObject.set(x, "isFavorite", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setModifiedDate(value: js.Date): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateNull: Self = StObject.set(x, "modifiedDate", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setReleaseDate(value: js.Date): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setReleaseDateNull: Self = StObject.set(x, "releaseDate", null)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setThumbnailURIs(value: js.Array[String]): Self = StObject.set(x, "thumbnailURIs", value.asInstanceOf[js.Any])
    
    inline def setThumbnailURIsNull: Self = StObject.set(x, "thumbnailURIs", null)
    
    inline def setThumbnailURIsVarargs(value: String*): Self = StObject.set(x, "thumbnailURIs", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

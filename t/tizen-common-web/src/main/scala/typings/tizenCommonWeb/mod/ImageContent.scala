package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageContent
  extends StObject
     with Content_ {
  
  /**
    * The geographical location where the image has been made.
    *
    * The attribute is marked as read-only since Tizen 5.5. Modifying it or its attributes has no effect.
    */
  val geolocation: SimpleCoordinates | Null
  
  /**
    * The height of an image in pixels.
    */
  val height: Double
  
  /**
    * The image orientation.
    *
    * The attribute is marked as read-only since Tizen 5.5.
    */
  val orientation: ImageContentOrientation
  
  /**
    * The width of an image in pixels.
    */
  val width: Double
}
object ImageContent {
  
  inline def apply(
    contentURI: String,
    editableAttributes: js.Array[String],
    height: Double,
    id: ContentId,
    isFavorite: Boolean,
    mimeType: String,
    name: String,
    orientation: ImageContentOrientation,
    rating: Double,
    size: Double,
    title: String,
    `type`: ContentType,
    width: Double
  ): ImageContent = {
    val __obj = js.Dynamic.literal(contentURI = contentURI.asInstanceOf[js.Any], editableAttributes = editableAttributes.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFavorite = isFavorite.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], description = null, geolocation = null, modifiedDate = null, releaseDate = null, thumbnailURIs = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageContent] (val x: Self) extends AnyVal {
    
    inline def setGeolocation(value: SimpleCoordinates): Self = StObject.set(x, "geolocation", value.asInstanceOf[js.Any])
    
    inline def setGeolocationNull: Self = StObject.set(x, "geolocation", null)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: ImageContentOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

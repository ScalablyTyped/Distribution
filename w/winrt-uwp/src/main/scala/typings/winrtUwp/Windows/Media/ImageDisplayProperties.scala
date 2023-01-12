package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties for image information that is displayed by SystemMediaTransportControlsDisplayUpdater class. */
trait ImageDisplayProperties extends StObject {
  
  /** Gets or sets the subtitle of the image. */
  var subtitle: String
  
  /** Gets or sets the title of the image. */
  var title: String
}
object ImageDisplayProperties {
  
  inline def apply(subtitle: String, title: String): ImageDisplayProperties = {
    val __obj = js.Dynamic.literal(subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDisplayProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageDisplayProperties] (val x: Self) extends AnyVal {
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

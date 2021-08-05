package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides properties for video information that is displayed by SystemMediaTransportControlsDisplayUpdater class. */
trait VideoDisplayProperties extends StObject {
  
  /** Gets a modifiable list of strings representing genre names. */
  var genres: IVector[String]
  
  /** Gets or sets the subtitle of the video. */
  var subtitle: String
  
  /** Gets or sets the title of the video. */
  var title: String
}
object VideoDisplayProperties {
  
  inline def apply(genres: IVector[String], subtitle: String, title: String): VideoDisplayProperties = {
    val __obj = js.Dynamic.literal(genres = genres.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDisplayProperties]
  }
  
  extension [Self <: VideoDisplayProperties](x: Self) {
    
    inline def setGenres(value: IVector[String]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

package typings.videoReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PosterImageProps extends StObject {
  
  /**
    * A URL indicating a poster frame to show until the user plays or
    * seeks. If this attribute isn't specified, nothing is displayed
    * until the first frame is available; then the first frame is shown
    * as the poster frame.
    */
  var poster: String
}
object PosterImageProps {
  
  inline def apply(poster: String): PosterImageProps = {
    val __obj = js.Dynamic.literal(poster = poster.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosterImageProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PosterImageProps] (val x: Self) extends AnyVal {
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
  }
}

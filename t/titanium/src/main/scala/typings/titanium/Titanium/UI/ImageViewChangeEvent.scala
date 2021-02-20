package typings.titanium.Titanium.UI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired for each frame change during an animation.
  */
@js.native
trait ImageViewChangeEvent extends ImageViewBaseEvent {
  
  /**
    * Index of the image frame being displayed.
    */
  var index: Double = js.native
}
object ImageViewChangeEvent {
  
  @scala.inline
  def apply(index: Double, source: ImageView): ImageViewChangeEvent = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageViewChangeEvent]
  }
  
  @scala.inline
  implicit class ImageViewChangeEventMutableBuilder[Self <: ImageViewChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}

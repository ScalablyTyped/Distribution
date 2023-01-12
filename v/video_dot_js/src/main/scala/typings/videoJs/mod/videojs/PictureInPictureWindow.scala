package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The `PictureInPictureWindow` interface represents an object able to programmatically obtain the `width` and `height` of the floating video window.
  * @see {@link https://developer.mozilla.org/en-US/docs/Web/API/PictureInPictureWindow}
  */
trait PictureInPictureWindow extends StObject {
  
  /**
    * Determines the height of the floating video window.
    */
  var height: Double
  
  /**
    * Determines the width of the floating video window.
    */
  var width: Double
}
object PictureInPictureWindow {
  
  inline def apply(height: Double, width: Double): PictureInPictureWindow = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureInPictureWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PictureInPictureWindow] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

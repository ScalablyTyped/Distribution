package typings.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the size of a bitmap, in pixels. */
trait BitmapSize extends StObject {
  
  /** The height of a bitmap, in pixels. */
  var height: Double
  
  /** The width of a bitmap, in pixels. */
  var width: Double
}
object BitmapSize {
  
  @scala.inline
  def apply(height: Double, width: Double): BitmapSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapSize]
  }
  
  @scala.inline
  implicit class BitmapSizeMutableBuilder[Self <: BitmapSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

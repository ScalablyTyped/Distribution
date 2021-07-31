package typings.winrtUwp.Windows.Graphics.Imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the format of a bitmap plane. */
trait BitmapPlaneDescription extends StObject {
  
  /** The height of the plane, in pixels. */
  var height: Double
  
  /** The start index of the pixel data within the plane. */
  var startIndex: Double
  
  /** The stride of the bitmap data. */
  var stride: Double
  
  /** The width of the plane, in pixels. */
  var width: Double
}
object BitmapPlaneDescription {
  
  @scala.inline
  def apply(height: Double, startIndex: Double, stride: Double, width: Double): BitmapPlaneDescription = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], stride = stride.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitmapPlaneDescription]
  }
  
  @scala.inline
  implicit class BitmapPlaneDescriptionMutableBuilder[Self <: BitmapPlaneDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStride(value: Double): Self = StObject.set(x, "stride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}

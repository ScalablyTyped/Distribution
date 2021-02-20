package typings.titanium

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object for defining a single image in a cover flow view.
  */
@js.native
trait CoverFlowImageType extends StObject {
  
  /**
    * Display height of the image, in Apple points.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Image to use, as a local file URL, `Blob`, or `File`.
    */
  var image: js.UndefOr[String | Blob | File] = js.native
  
  /**
    * Display width for the image, in Apple points.
    */
  var width: js.UndefOr[Double] = js.native
}
object CoverFlowImageType {
  
  @scala.inline
  def apply(): CoverFlowImageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverFlowImageType]
  }
  
  @scala.inline
  implicit class CoverFlowImageTypeMutableBuilder[Self <: CoverFlowImageType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImage(value: String | Blob | File): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

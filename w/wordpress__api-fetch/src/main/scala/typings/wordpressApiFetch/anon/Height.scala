package typings.wordpressApiFetch.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Height extends StObject {
  
  var file: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var image_meta: js.UndefOr[Aperture] = js.native
  
  var sizes: Record[String, File] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Height {
  
  @scala.inline
  def apply(sizes: Record[String, File]): Height = {
    val __obj = js.Dynamic.literal(sizes = sizes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setImage_meta(value: Aperture): Self = StObject.set(x, "image_meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage_metaUndefined: Self = StObject.set(x, "image_meta", js.undefined)
    
    @scala.inline
    def setSizes(value: Record[String, File]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

package typings.winrt.Windows.Storage.FileProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IThumbnailProperties extends StObject {
  
  var originalHeight: Double = js.native
  
  var originalWidth: Double = js.native
  
  var returnedSmallerCachedSize: Boolean = js.native
  
  var `type`: ThumbnailType = js.native
}
object IThumbnailProperties {
  
  @scala.inline
  def apply(
    originalHeight: Double,
    originalWidth: Double,
    returnedSmallerCachedSize: Boolean,
    `type`: ThumbnailType
  ): IThumbnailProperties = {
    val __obj = js.Dynamic.literal(originalHeight = originalHeight.asInstanceOf[js.Any], originalWidth = originalWidth.asInstanceOf[js.Any], returnedSmallerCachedSize = returnedSmallerCachedSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThumbnailProperties]
  }
  
  @scala.inline
  implicit class IThumbnailPropertiesMutableBuilder[Self <: IThumbnailProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOriginalHeight(value: Double): Self = StObject.set(x, "originalHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalWidth(value: Double): Self = StObject.set(x, "originalWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnedSmallerCachedSize(value: Boolean): Self = StObject.set(x, "returnedSmallerCachedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ThumbnailType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

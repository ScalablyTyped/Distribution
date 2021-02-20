package typings.titanium

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Filesystem.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object describing a button bar or tabbed bar item.
  */
@js.native
trait BarItemType extends StObject {
  
  /**
    * A succint label associated with the bar item for the device's accessibility service.
    */
  var accessibilityLabel: js.UndefOr[String] = js.native
  
  /**
    * Whether the button is enabled initially.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Button icon. If specified, takes precedence over `title`.
    */
  var image: js.UndefOr[String | Blob | File] = js.native
  
  /**
    * Button title, used if no `image` is specified.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Width for this button.
    */
  var width: js.UndefOr[Double] = js.native
}
object BarItemType {
  
  @scala.inline
  def apply(): BarItemType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarItemType]
  }
  
  @scala.inline
  implicit class BarItemTypeMutableBuilder[Self <: BarItemType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setImage(value: String | Blob | File): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

package typings.tabris.anon

import typings.tabris.mod.ImageValue
import typings.tabris.tabrisStrings.cancel
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.destructive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  var children: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[ImageValue] = js.undefined
  
  var style: js.UndefOr[default | cancel | destructive] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object Style {
  
  @scala.inline
  def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setImage(value: ImageValue): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageNull: Self = StObject.set(x, "image", null)
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setStyle(value: default | cancel | destructive): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

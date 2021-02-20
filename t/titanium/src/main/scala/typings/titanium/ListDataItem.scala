package typings.titanium

import org.scalablytyped.runtime.StringDictionary
import typings.titanium.Titanium.UI.ListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents displayed item data.
  */
@js.native
trait ListDataItem
  extends /* index */ StringDictionary[js.Any] {
  
  /**
    * Contains key-value pairs of view properties and their values that are applied to the
    * `ListItem`.
    */
  var properties: js.UndefOr[Dictionary[ListItem]] = js.native
  
  /**
    * Template ID configured with the <Titanium.UI.ListView.templates> property or
    * <Titanium.UI.LIST_ITEM_TEMPLATE_DEFAULT>.
    */
  var template: js.UndefOr[String | Double] = js.native
}
object ListDataItem {
  
  @scala.inline
  def apply(): ListDataItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataItem]
  }
  
  @scala.inline
  implicit class ListDataItemMutableBuilder[Self <: ListDataItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: Dictionary[ListItem]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setTemplate(value: String | Double): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}

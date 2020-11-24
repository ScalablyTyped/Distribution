package typings.titanium

import typings.titanium.Titanium.UI.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template that represents the basic appearance of a list item.
  */
@js.native
trait ItemTemplate extends js.Object {
  
  /**
    * Contains an array of subview templates to be added (in order) as children to this view.
    */
  var childTemplates: js.UndefOr[js.Array[ViewTemplate]] = js.native
  
  /**
    * Contains key-value pairs of view events and their listeners that are applied to the ListItem.
    */
  var events: js.UndefOr[js.Any] = js.native
  
  /**
    * Contains key-value pairs of view properties and their values that are applied to the ListItem.
    */
  var properties: js.UndefOr[Dictionary[ListItem]] = js.native
}
object ItemTemplate {
  
  @scala.inline
  def apply(): ItemTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemTemplate]
  }
  
  @scala.inline
  implicit class ItemTemplateOps[Self <: ItemTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildTemplatesVarargs(value: ViewTemplate*): Self = this.set("childTemplates", js.Array(value :_*))
    
    @scala.inline
    def setChildTemplates(value: js.Array[ViewTemplate]): Self = this.set("childTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildTemplates: Self = this.set("childTemplates", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setProperties(value: Dictionary[ListItem]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}

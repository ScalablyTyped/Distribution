package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template that represents a view subcomponent of an <ItemTemplate>.
  */
@js.native
trait ViewTemplate extends js.Object {
  
  /**
    * View's ID (or set of IDs) used for data binding. This value must be unique.
    */
  var bindId: js.UndefOr[String] = js.native
  
  /**
    * Contains an array of subview templates to be added (in order) as children to this view.
    */
  var childTemplates: js.UndefOr[js.Array[ViewTemplate]] = js.native
  
  /**
    * Contains key-value pairs of view events and their listeners that are applied to this view component.
    */
  var events: js.UndefOr[js.Any] = js.native
  
  /**
    * Contains key-value pairs of view properties and their values that are applied to this view component.
    */
  var properties: js.UndefOr[js.Any] = js.native
  
  /**
    * View's class name, for example, `Ti.UI.Button`.
    */
  var `type`: String = js.native
}
object ViewTemplate {
  
  @scala.inline
  def apply(`type`: String): ViewTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewTemplate]
  }
  
  @scala.inline
  implicit class ViewTemplateOps[Self <: ViewTemplate] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindId(value: String): Self = this.set("bindId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBindId: Self = this.set("bindId", js.undefined)
    
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
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}

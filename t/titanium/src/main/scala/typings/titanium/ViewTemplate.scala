package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Template that represents a view subcomponent of an <ItemTemplate>.
  */
@js.native
trait ViewTemplate extends StObject {
  
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
  implicit class ViewTemplateMutableBuilder[Self <: ViewTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindId(value: String): Self = StObject.set(x, "bindId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindIdUndefined: Self = StObject.set(x, "bindId", js.undefined)
    
    @scala.inline
    def setChildTemplates(value: js.Array[ViewTemplate]): Self = StObject.set(x, "childTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildTemplatesUndefined: Self = StObject.set(x, "childTemplates", js.undefined)
    
    @scala.inline
    def setChildTemplatesVarargs(value: ViewTemplate*): Self = StObject.set(x, "childTemplates", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

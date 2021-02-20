package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the custom edit action for a ListItem.
  */
@js.native
trait RowActionType extends StObject {
  
  /**
    * The background color of the row action.
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * The [identifier](RowActionType. identifier) of the row action. Only included in the event
    * if previously defined. Available in Titanium 6.0.0 and later.
    */
  var identifier: js.UndefOr[String] = js.native
  
  /**
    * The style of the row action.
    */
  var style: Double = js.native
  
  /**
    * The title of the row action.
    */
  var title: String = js.native
}
object RowActionType {
  
  @scala.inline
  def apply(style: Double, title: String): RowActionType = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowActionType]
  }
  
  @scala.inline
  implicit class RowActionTypeMutableBuilder[Self <: RowActionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setStyle(value: Double): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

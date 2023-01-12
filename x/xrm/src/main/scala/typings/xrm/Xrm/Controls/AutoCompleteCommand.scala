package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for command of AutoCompleteResultSet.  This is displayed at the bottom of the auto complete view
  */
trait AutoCompleteCommand extends StObject {
  
  /**
    * Action to perform when user clicks on label
    */
  def action(): Unit
  
  /**
    * Url of the icon to display
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * The Identifier
    */
  var id: String
  
  /**
    * Label to display at the bottom of the auto complete view
    */
  var label: String
}
object AutoCompleteCommand {
  
  inline def apply(action: () => Unit, id: String, label: String): AutoCompleteCommand = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction0(action), id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteCommand]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoCompleteCommand] (val x: Self) extends AnyVal {
    
    inline def setAction(value: () => Unit): Self = StObject.set(x, "action", js.Any.fromFunction0(value))
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}

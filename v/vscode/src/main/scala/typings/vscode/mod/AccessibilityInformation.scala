package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityInformation extends StObject {
  
  /**
    * Label to be read out by a screen reader once the item has focus.
    */
  val label: String
  
  /**
    * Role of the widget which defines how a screen reader interacts with it.
    * The role should be set in special cases when for example a tree-like element behaves like a checkbox.
    * If role is not specified the editor will pick the appropriate role automatically.
    * More about aria roles can be found here https://w3c.github.io/aria/#widget_roles
    */
  val role: js.UndefOr[String] = js.undefined
}
object AccessibilityInformation {
  
  inline def apply(label: String): AccessibilityInformation = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityInformation]
  }
  
  extension [Self <: AccessibilityInformation](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}

package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewBadge extends StObject {
  
  /**
    * A label to present in tooltip for the badge.
    */
  val tooltip: String
  
  /**
    * The value to present in the badge.
    */
  val value: Double
}
object ViewBadge {
  
  inline def apply(tooltip: String, value: Double): ViewBadge = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewBadge]
  }
  
  extension [Self <: ViewBadge](x: Self) {
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

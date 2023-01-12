package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hyperlink extends StObject {
  
  /** Target of the link (HREF) */
  var Target: String
  
  /** Plaintext tooltip to display when mouse is over cell */
  var Tooltip: js.UndefOr[String] = js.undefined
}
object Hyperlink {
  
  inline def apply(Target: String): Hyperlink = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hyperlink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hyperlink] (val x: Self) extends AnyVal {
    
    inline def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
  }
}

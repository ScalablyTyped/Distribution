package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hyperlink extends StObject {
  
  /** Target of the link (HREF) */
  var Target: String = js.native
  
  /** Plaintext tooltip to display when mouse is over cell */
  var Tooltip: js.UndefOr[String] = js.native
}
object Hyperlink {
  
  @scala.inline
  def apply(Target: String): Hyperlink = {
    val __obj = js.Dynamic.literal(Target = Target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hyperlink]
  }
  
  @scala.inline
  implicit class HyperlinkMutableBuilder[Self <: Hyperlink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
  }
}

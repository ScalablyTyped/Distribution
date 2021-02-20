package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WBView extends StObject {
  
  /** Right-to-left mode */
  var RTL: js.UndefOr[Boolean] = js.native
}
object WBView {
  
  @scala.inline
  def apply(): WBView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WBView]
  }
  
  @scala.inline
  implicit class WBViewMutableBuilder[Self <: WBView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRTL(value: Boolean): Self = StObject.set(x, "RTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRTLUndefined: Self = StObject.set(x, "RTL", js.undefined)
  }
}

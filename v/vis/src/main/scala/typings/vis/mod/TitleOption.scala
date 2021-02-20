package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TitleOption extends StObject {
  
  var style: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object TitleOption {
  
  @scala.inline
  def apply(): TitleOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TitleOption]
  }
  
  @scala.inline
  implicit class TitleOptionMutableBuilder[Self <: TitleOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}

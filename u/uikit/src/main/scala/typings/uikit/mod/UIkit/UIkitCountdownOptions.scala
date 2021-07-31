package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Components
trait UIkitCountdownOptions extends StObject {
  
  var date: js.UndefOr[String | Boolean] = js.undefined
}
object UIkitCountdownOptions {
  
  @scala.inline
  def apply(): UIkitCountdownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitCountdownOptions]
  }
  
  @scala.inline
  implicit class UIkitCountdownOptionsMutableBuilder[Self <: UIkitCountdownOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String | Boolean): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
  }
}

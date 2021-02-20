package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dictionary of options for the <Titanium.UI.OptionDialog.hide> method.
  */
@js.native
trait hideParams extends StObject {
  
  /**
    * Determines whether to animate the dialog as it is dismissed.
    */
  var animated: js.UndefOr[Boolean] = js.native
}
object hideParams {
  
  @scala.inline
  def apply(): hideParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[hideParams]
  }
  
  @scala.inline
  implicit class hideParamsMutableBuilder[Self <: hideParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
  }
}

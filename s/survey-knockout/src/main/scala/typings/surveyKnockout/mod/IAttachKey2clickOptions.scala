package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAttachKey2clickOptions extends StObject {
  
  var disableTabStop: js.UndefOr[Boolean] = js.undefined
  
  var processEsc: js.UndefOr[Boolean] = js.undefined
}
object IAttachKey2clickOptions {
  
  inline def apply(): IAttachKey2clickOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAttachKey2clickOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAttachKey2clickOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableTabStop(value: Boolean): Self = StObject.set(x, "disableTabStop", value.asInstanceOf[js.Any])
    
    inline def setDisableTabStopUndefined: Self = StObject.set(x, "disableTabStop", js.undefined)
    
    inline def setProcessEsc(value: Boolean): Self = StObject.set(x, "processEsc", value.asInstanceOf[js.Any])
    
    inline def setProcessEscUndefined: Self = StObject.set(x, "processEsc", js.undefined)
  }
}

package typings.tengitsui.mod

import typings.tengitsui.tengitsuiStrings.circle
import typings.tengitsui.tengitsuiStrings.dashboard
import typings.tengitsui.tengitsuiStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressProps extends StObject {
  
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var opts: js.UndefOr[js.Object] = js.undefined
  
  var showPrecent: js.UndefOr[Boolean] = js.undefined
  
  var strokeColor: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[line | circle | dashboard] = js.undefined
}
object ProgressProps {
  
  inline def apply(): ProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressProps]
  }
  
  extension [Self <: ProgressProps](x: Self) {
    
    inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setOpts(value: js.Object): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
    
    inline def setOptsUndefined: Self = StObject.set(x, "opts", js.undefined)
    
    inline def setShowPrecent(value: Boolean): Self = StObject.set(x, "showPrecent", value.asInstanceOf[js.Any])
    
    inline def setShowPrecentUndefined: Self = StObject.set(x, "showPrecent", js.undefined)
    
    inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
    
    inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: line | circle | dashboard): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

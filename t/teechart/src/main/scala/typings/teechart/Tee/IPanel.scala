package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanel extends StObject {
  
  var format: IFormat
  
  var margins: IMargins
  
  var transparent: Boolean
}
object IPanel {
  
  inline def apply(format: IFormat, margins: IMargins, transparent: Boolean): IPanel = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPanel] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: IFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setMargins(value: IMargins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
  }
}

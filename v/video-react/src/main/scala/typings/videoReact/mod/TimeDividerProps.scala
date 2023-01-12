package typings.videoReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeDividerProps
  extends StObject
     with ControlBarControlProps {
  
  var separator: js.UndefOr[String] = js.undefined
}
object TimeDividerProps {
  
  inline def apply(): TimeDividerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeDividerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeDividerProps] (val x: Self) extends AnyVal {
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}

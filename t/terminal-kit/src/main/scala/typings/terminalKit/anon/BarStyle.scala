package typings.terminalKit.anon

import typings.terminalKit.terminalMod.CTerminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarStyle extends StObject {
  
  var barStyle: js.UndefOr[CTerminal] = js.undefined
  
  var innerSize: js.UndefOr[Double] = js.undefined
}
object BarStyle {
  
  inline def apply(): BarStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarStyle] (val x: Self) extends AnyVal {
    
    inline def setBarStyle(value: CTerminal): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    inline def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    inline def setInnerSize(value: Double): Self = StObject.set(x, "innerSize", value.asInstanceOf[js.Any])
    
    inline def setInnerSizeUndefined: Self = StObject.set(x, "innerSize", js.undefined)
  }
}

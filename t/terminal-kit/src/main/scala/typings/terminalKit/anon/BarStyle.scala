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
  
  @scala.inline
  def apply(): BarStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BarStyle]
  }
  
  @scala.inline
  implicit class BarStyleMutableBuilder[Self <: BarStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarStyle(value: CTerminal): Self = StObject.set(x, "barStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarStyleUndefined: Self = StObject.set(x, "barStyle", js.undefined)
    
    @scala.inline
    def setInnerSize(value: Double): Self = StObject.set(x, "innerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerSizeUndefined: Self = StObject.set(x, "innerSize", js.undefined)
  }
}

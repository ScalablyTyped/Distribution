package typings.terminalKit.anon

import typings.terminalKit.terminalMod.CTerminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delay extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var flashDelay: js.UndefOr[Double] = js.undefined
  
  var flashStyle: js.UndefOr[CTerminal] = js.undefined
  
  var style: js.UndefOr[CTerminal] = js.undefined
}
object Delay {
  
  @scala.inline
  def apply(): Delay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Delay]
  }
  
  @scala.inline
  implicit class DelayMutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setFlashDelay(value: Double): Self = StObject.set(x, "flashDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashDelayUndefined: Self = StObject.set(x, "flashDelay", js.undefined)
    
    @scala.inline
    def setFlashStyle(value: CTerminal): Self = StObject.set(x, "flashStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlashStyleUndefined: Self = StObject.set(x, "flashStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: CTerminal): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}

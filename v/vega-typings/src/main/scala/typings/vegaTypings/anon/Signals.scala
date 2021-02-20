package typings.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signals extends StObject {
  
  var data: js.UndefOr[js.Any] = js.native
  
  var signals: js.UndefOr[js.Any] = js.native
}
object Signals {
  
  @scala.inline
  def apply(): Signals = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Signals]
  }
  
  @scala.inline
  implicit class SignalsMutableBuilder[Self <: Signals] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setSignals(value: js.Any): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
  }
}

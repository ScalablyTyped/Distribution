package typings.vegaTypings.anon

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Nice extends StObject {
  
  var count: js.UndefOr[Double | SignalRef] = js.native
  
  var nice: js.UndefOr[Double | SignalRef] = js.native
}
object Nice {
  
  @scala.inline
  def apply(): Nice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nice]
  }
  
  @scala.inline
  implicit class NiceMutableBuilder[Self <: Nice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double | SignalRef): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setNice(value: Double | SignalRef): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
  }
}

package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaEncodeEntry extends LineEncodeEntry {
  
  var orient: js.UndefOr[ProductionRule[ScaledValueRef[Orientation]]] = js.native
}
object AreaEncodeEntry {
  
  @scala.inline
  def apply(): AreaEncodeEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaEncodeEntry]
  }
  
  @scala.inline
  implicit class AreaEncodeEntryMutableBuilder[Self <: AreaEncodeEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOrient(value: ProductionRule[ScaledValueRef[Orientation]]): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
    
    @scala.inline
    def setOrientVarargs(value: (Test with ScaledValueRef[Orientation])*): Self = StObject.set(x, "orient", js.Array(value :_*))
  }
}

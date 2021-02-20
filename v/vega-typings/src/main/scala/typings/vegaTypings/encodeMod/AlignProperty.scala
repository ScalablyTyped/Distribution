package typings.vegaTypings.encodeMod

import typings.vegaTypings.anon.Test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignProperty extends StObject {
  
  var align: js.UndefOr[ProductionRule[ScaledValueRef[Align]]] = js.native
}
object AlignProperty {
  
  @scala.inline
  def apply(): AlignProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignProperty]
  }
  
  @scala.inline
  implicit class AlignPropertyMutableBuilder[Self <: AlignProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: ProductionRule[ScaledValueRef[Align]]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setAlignVarargs(value: (Test with ScaledValueRef[Align])*): Self = StObject.set(x, "align", js.Array(value :_*))
  }
}

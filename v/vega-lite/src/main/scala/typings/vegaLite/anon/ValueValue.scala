package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueValue extends StObject {
  
  var value: typings.vegaLite.channeldefMod.Value[Null] = js.native
}
object ValueValue {
  
  @scala.inline
  def apply(): ValueValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueValue]
  }
  
  @scala.inline
  implicit class ValueValueMutableBuilder[Self <: ValueValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: typings.vegaLite.channeldefMod.Value[Null]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueVarargs(value: (Double | String)*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}

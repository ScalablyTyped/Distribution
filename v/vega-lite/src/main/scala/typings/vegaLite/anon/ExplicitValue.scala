package typings.vegaLite.anon

import typings.vegaLite.binMod.BinParams
import typings.vegaLite.channeldefMod.FieldDefBase
import typings.vegaLite.vegaLiteStrings.binned
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplicitValue extends StObject {
  
  var explicit: Boolean = js.native
  
  var value: js.Array[FieldDefBase[String, Boolean | BinParams | binned]] = js.native
}
object ExplicitValue {
  
  @scala.inline
  def apply(explicit: Boolean, value: js.Array[FieldDefBase[String, Boolean | BinParams | binned]]): ExplicitValue = {
    val __obj = js.Dynamic.literal(explicit = explicit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitValue]
  }
  
  @scala.inline
  implicit class ExplicitValueMutableBuilder[Self <: ExplicitValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Array[FieldDefBase[String, Boolean | BinParams | binned]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: (FieldDefBase[String, Boolean | BinParams | binned])*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}

package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VssJsonCollectionWrapper extends VssJsonCollectionWrapperBase {
  
  var value: js.Array[_] = js.native
}
object VssJsonCollectionWrapper {
  
  @scala.inline
  def apply(count: Double, value: js.Array[_]): VssJsonCollectionWrapper = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VssJsonCollectionWrapper]
  }
  
  @scala.inline
  implicit class VssJsonCollectionWrapperMutableBuilder[Self <: VssJsonCollectionWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: js.Array[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}

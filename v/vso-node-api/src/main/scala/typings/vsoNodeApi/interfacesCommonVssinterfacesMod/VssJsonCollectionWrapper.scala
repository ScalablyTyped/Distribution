package typings.vsoNodeApi.interfacesCommonVssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VssJsonCollectionWrapper
  extends StObject
     with VssJsonCollectionWrapperBase {
  
  var value: js.Array[Any]
}
object VssJsonCollectionWrapper {
  
  inline def apply(count: Double, value: js.Array[Any]): VssJsonCollectionWrapper = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VssJsonCollectionWrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VssJsonCollectionWrapper] (val x: Self) extends AnyVal {
    
    inline def setValue(value: js.Array[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: Any*): Self = StObject.set(x, "value", js.Array(value*))
  }
}

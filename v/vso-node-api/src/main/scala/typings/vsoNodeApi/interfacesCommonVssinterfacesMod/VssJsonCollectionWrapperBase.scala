package typings.vsoNodeApi.interfacesCommonVssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VssJsonCollectionWrapperBase extends StObject {
  
  var count: Double
}
object VssJsonCollectionWrapperBase {
  
  inline def apply(count: Double): VssJsonCollectionWrapperBase = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[VssJsonCollectionWrapperBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VssJsonCollectionWrapperBase] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}

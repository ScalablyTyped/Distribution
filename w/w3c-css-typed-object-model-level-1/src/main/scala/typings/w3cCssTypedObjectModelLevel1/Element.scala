package typings.w3cCssTypedObjectModelLevel1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  def computedStyleMap(): StylePropertyMapReadOnly
}
object Element {
  
  inline def apply(computedStyleMap: () => StylePropertyMapReadOnly): Element = {
    val __obj = js.Dynamic.literal(computedStyleMap = js.Any.fromFunction0(computedStyleMap))
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    inline def setComputedStyleMap(value: () => StylePropertyMapReadOnly): Self = StObject.set(x, "computedStyleMap", js.Any.fromFunction0(value))
  }
}

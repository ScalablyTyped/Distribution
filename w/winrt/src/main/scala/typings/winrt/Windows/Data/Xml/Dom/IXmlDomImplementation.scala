package typings.winrt.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXmlDomImplementation extends StObject {
  
  def hasFeature(feature: String, version: Any): Boolean
}
object IXmlDomImplementation {
  
  inline def apply(hasFeature: (String, Any) => Boolean): IXmlDomImplementation = {
    val __obj = js.Dynamic.literal(hasFeature = js.Any.fromFunction2(hasFeature))
    __obj.asInstanceOf[IXmlDomImplementation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IXmlDomImplementation] (val x: Self) extends AnyVal {
    
    inline def setHasFeature(value: (String, Any) => Boolean): Self = StObject.set(x, "hasFeature", js.Any.fromFunction2(value))
  }
}

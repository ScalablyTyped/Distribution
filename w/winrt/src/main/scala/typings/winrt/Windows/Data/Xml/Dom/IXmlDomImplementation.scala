package typings.winrt.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IXmlDomImplementation extends StObject {
  
  def hasFeature(feature: String, version: js.Any): Boolean = js.native
}
object IXmlDomImplementation {
  
  @scala.inline
  def apply(hasFeature: (String, js.Any) => Boolean): IXmlDomImplementation = {
    val __obj = js.Dynamic.literal(hasFeature = js.Any.fromFunction2(hasFeature))
    __obj.asInstanceOf[IXmlDomImplementation]
  }
  
  @scala.inline
  implicit class IXmlDomImplementationMutableBuilder[Self <: IXmlDomImplementation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHasFeature(value: (String, js.Any) => Boolean): Self = StObject.set(x, "hasFeature", js.Any.fromFunction2(value))
  }
}

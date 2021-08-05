package typings.winrtUwp.Windows.Data.Xml.Dom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods that are independent of any particular instance of the document object model. */
trait XmlDomImplementation extends StObject {
  
  /**
    * Indicates support for the specified feature.
    * @param feature Specifies the feature to test. In Level 1, valid feature values are "XML", "DOM", and "MS-DOM" (case-insensitive).
    * @param version Specifies the version number to test. If NULL, tests for implementation of the feature in any version. In Level 1, "1.0" is the valid version value.
    * @return True if the specified feature is implemented; otherwise false.
    */
  def hasFeature(feature: String, version: js.Any): Boolean
}
object XmlDomImplementation {
  
  inline def apply(hasFeature: (String, js.Any) => Boolean): XmlDomImplementation = {
    val __obj = js.Dynamic.literal(hasFeature = js.Any.fromFunction2(hasFeature))
    __obj.asInstanceOf[XmlDomImplementation]
  }
  
  extension [Self <: XmlDomImplementation](x: Self) {
    
    inline def setHasFeature(value: (String, js.Any) => Boolean): Self = StObject.set(x, "hasFeature", js.Any.fromFunction2(value))
  }
}

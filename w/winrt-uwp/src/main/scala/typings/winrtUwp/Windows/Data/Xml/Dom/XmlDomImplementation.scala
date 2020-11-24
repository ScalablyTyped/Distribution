package typings.winrtUwp.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides methods that are independent of any particular instance of the document object model. */
@js.native
trait XmlDomImplementation extends js.Object {
  
  /**
    * Indicates support for the specified feature.
    * @param feature Specifies the feature to test. In Level 1, valid feature values are "XML", "DOM", and "MS-DOM" (case-insensitive).
    * @param version Specifies the version number to test. If NULL, tests for implementation of the feature in any version. In Level 1, "1.0" is the valid version value.
    * @return True if the specified feature is implemented; otherwise false.
    */
  def hasFeature(feature: String, version: js.Any): Boolean = js.native
}
object XmlDomImplementation {
  
  @scala.inline
  def apply(hasFeature: (String, js.Any) => Boolean): XmlDomImplementation = {
    val __obj = js.Dynamic.literal(hasFeature = js.Any.fromFunction2(hasFeature))
    __obj.asInstanceOf[XmlDomImplementation]
  }
  
  @scala.inline
  implicit class XmlDomImplementationOps[Self <: XmlDomImplementation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHasFeature(value: (String, js.Any) => Boolean): Self = this.set("hasFeature", js.Any.fromFunction2(value))
  }
}

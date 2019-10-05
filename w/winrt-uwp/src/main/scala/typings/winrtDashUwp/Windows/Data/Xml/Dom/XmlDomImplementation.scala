package typings.winrtDashUwp.Windows.Data.Xml.Dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides methods that are independent of any particular instance of the document object model. */
@JSGlobal("Windows.Data.Xml.Dom.XmlDomImplementation")
@js.native
abstract class XmlDomImplementation () extends js.Object {
  /**
    * Indicates support for the specified feature.
    * @param feature Specifies the feature to test. In Level 1, valid feature values are "XML", "DOM", and "MS-DOM" (case-insensitive).
    * @param version Specifies the version number to test. If NULL, tests for implementation of the feature in any version. In Level 1, "1.0" is the valid version value.
    * @return True if the specified feature is implemented; otherwise false.
    */
  def hasFeature(feature: String, version: js.Any): Boolean = js.native
}


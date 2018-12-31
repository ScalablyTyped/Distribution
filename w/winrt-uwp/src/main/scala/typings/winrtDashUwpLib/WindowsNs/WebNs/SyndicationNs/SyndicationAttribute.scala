package typings
package winrtDashUwpLib.WindowsNs.WebNs.SyndicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a custom attribute not defined in the specification. */
@JSGlobal("Windows.Web.Syndication.SyndicationAttribute")
@js.native
/** Creates a new SyndicationAttribute object. */
class SyndicationAttribute () extends js.Object {
  /**
    * Creates a new SyndicationAttribute object with the specified Name, Namespace, and Value property values.
    * @param attributeName The name of the attribute.
    * @param attributeNamespace The namespace of the attribute.
    * @param attributeValue The value of the attribute.
    */
  def this(attributeName: java.lang.String, attributeNamespace: java.lang.String, attributeValue: java.lang.String) = this()
  /** Gets the name of the syndication attribute. */
  var name: java.lang.String = js.native
  /** Gets the namespace of the attribute. */
  var namespace: java.lang.String = js.native
  /** Gets or sets the value of the attribute. */
  var value: java.lang.String = js.native
}


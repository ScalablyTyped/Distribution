package typings.xmlDashCore.xmlDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlNamespace extends js.Object {
  /**
    * Namespace URI
    * 
    * @type {(string |)}
    * @memberOf XmlNamespace
    */
  var namespace: String | Null
  /**
    * Prefix
    * 
    * @type {(string |)}
    * @memberOf XmlNamespace
    */
  var prefix: String | Null
}

object XmlNamespace {
  @scala.inline
  def apply(namespace: String = null, prefix: String = null): XmlNamespace = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlNamespace]
  }
}


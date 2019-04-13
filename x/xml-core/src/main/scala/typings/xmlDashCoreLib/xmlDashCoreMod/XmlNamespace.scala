package typings
package xmlDashCoreLib.xmlDashCoreMod

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
  var namespace: java.lang.String | scala.Null
  /**
    * Prefix
    * 
    * @type {(string |)}
    * @memberOf XmlNamespace
    */
  var prefix: java.lang.String | scala.Null
}

object XmlNamespace {
  @scala.inline
  def apply(namespace: java.lang.String = null, prefix: java.lang.String = null): XmlNamespace = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[XmlNamespace]
  }
}


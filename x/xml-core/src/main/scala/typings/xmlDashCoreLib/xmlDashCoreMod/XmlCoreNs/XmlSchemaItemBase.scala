package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlSchemaItemBase extends js.Object {
  /**
    * Local name of item
    * 
    * @type {string}
    * @memberOf XmlSchemaItemBase
    */
  var localName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Namespace URI of attribute
    * 
    * @type {(string |)}
    * @memberOf XmlSchemaItemBase
    */
  var namespaceURI: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /**
    * Default prefix for Xml element 
    * 
    * @type {(string |)}
    * @memberOf XmlSchemaItemBase
    */
  var prefix: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object XmlSchemaItemBase {
  @scala.inline
  def apply(
    localName: java.lang.String = null,
    namespaceURI: java.lang.String = null,
    prefix: java.lang.String = null
  ): XmlSchemaItemBase = {
    val __obj = js.Dynamic.literal()
    if (localName != null) __obj.updateDynamic("localName")(localName)
    if (namespaceURI != null) __obj.updateDynamic("namespaceURI")(namespaceURI)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[XmlSchemaItemBase]
  }
}


package typings.xmlCore.typesMod

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
  var localName: js.UndefOr[String] = js.undefined
  /**
    * Namespace URI of attribute
    *
    * @type {(string |)}
    * @memberOf XmlSchemaItemBase
    */
  var namespaceURI: js.UndefOr[String | Null] = js.undefined
  /**
    * Default prefix for Xml element
    *
    * @type {(string |)}
    * @memberOf XmlSchemaItemBase
    */
  var prefix: js.UndefOr[String | Null] = js.undefined
}

object XmlSchemaItemBase {
  @scala.inline
  def apply(
    localName: String = null,
    namespaceURI: js.UndefOr[Null | String] = js.undefined,
    prefix: js.UndefOr[Null | String] = js.undefined
  ): XmlSchemaItemBase = {
    val __obj = js.Dynamic.literal()
    if (localName != null) __obj.updateDynamic("localName")(localName.asInstanceOf[js.Any])
    if (!js.isUndefined(namespaceURI)) __obj.updateDynamic("namespaceURI")(namespaceURI.asInstanceOf[js.Any])
    if (!js.isUndefined(prefix)) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[XmlSchemaItemBase]
  }
}


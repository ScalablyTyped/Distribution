package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait XmlChildElementType[T]
  extends XmlSchemaItem[T]
     with XmlSchemaItemParser {
  /**
           * max occurs of items in collection
           * 
           * @type {number}
           * @memberOf XmlChildElementType
           */
  var maxOccurs: js.UndefOr[scala.Double] = js.undefined
  /**
           * min occurs of items in collection
           * 
           * @type {number}
           * @memberOf XmlChildElementType
           */
  var minOccurs: js.UndefOr[scala.Double] = js.undefined
  /**
           * Don't add root element of XmlCollection to compiled element
           * 
           * @type {boolean}
           * @memberOf XmlChildElementType
           */
  var noRoot: js.UndefOr[scala.Boolean] = js.undefined
}


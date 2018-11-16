package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait XmlSchemaItem[T] extends XmlSchemaItemBase {
  /**
           * Custom converter for item value
           * 
           * @type {IConverter<T>}
           * @memberOf XmlAttributeType
           */
  var converter: js.UndefOr[IConverter[T]] = js.undefined
  /**
           * Default value for item
           * 
           * @type {(T |)}
           * @memberOf XmlSchemaItem
           */
  var defaultValue: js.UndefOr[T | scala.Null] = js.undefined
  /**
           * Determine where item is required
           * 
           * @type {boolean}
           * @memberOf XmlSchemaItem
           */
  var required: js.UndefOr[scala.Boolean] = js.undefined
}


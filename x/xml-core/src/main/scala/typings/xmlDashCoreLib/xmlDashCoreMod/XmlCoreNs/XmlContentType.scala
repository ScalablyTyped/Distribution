package typings
package xmlDashCoreLib.xmlDashCoreMod.XmlCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlContentType[T] extends js.Object {
  /**
    * Custom converter for item value
    * 
    * @type {IConverter<T>}
    * @memberOf XmlContentType
    */
  var converter: js.UndefOr[IConverter[T]] = js.undefined
  /**
    * Default value for item
    * 
    * @type {(T |)}
    * @memberOf XmlContentType
    */
  var defaultValue: js.UndefOr[T | scala.Null] = js.undefined
  /**
    * Determine where item is required
    * 
    * @type {boolean}
    * @memberOf XmlContentType
    */
  var required: js.UndefOr[scala.Boolean] = js.undefined
}


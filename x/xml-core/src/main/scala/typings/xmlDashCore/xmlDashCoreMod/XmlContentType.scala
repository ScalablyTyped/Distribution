package typings.xmlDashCore.xmlDashCoreMod

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
  var defaultValue: js.UndefOr[T | Null] = js.undefined
  /**
    * Determine where item is required
    * 
    * @type {boolean}
    * @memberOf XmlContentType
    */
  var required: js.UndefOr[Boolean] = js.undefined
}

object XmlContentType {
  @scala.inline
  def apply[T](
    converter: IConverter[T] = null,
    defaultValue: T = null,
    required: js.UndefOr[Boolean] = js.undefined
  ): XmlContentType[T] = {
    val __obj = js.Dynamic.literal()
    if (converter != null) __obj.updateDynamic("converter")(converter)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required)
    __obj.asInstanceOf[XmlContentType[T]]
  }
}


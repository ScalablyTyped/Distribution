package typings.toJsonSchema.anon

import typings.toJsonSchema.toJsonSchemaStrings.all
import typings.toJsonSchema.toJsonSchemaStrings.first
import typings.toJsonSchema.toJsonSchemaStrings.tuple
import typings.toJsonSchema.toJsonSchemaStrings.uniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  /**
    * * `all` option causes parser to go through all array items, finding
    *   the most compatible yet most descriptive schema possible. If
    *   multiple types are found, the type is omitted so it can be
    *   validated.
    * * `first` option takes only first item in the array into account. If
    *   performance is a concern, you may consider this option.
    * * `uniform` option requires all items in array to have same structure
    *   (to convert to the same schema). If not, error is thrown.
    * * `tuple` option generates a
    *   [tuple array](https://json-schema.org/understanding-json-schema/reference/array.html#tuple-validation)
    *   (array of objects) from arrays.
    *
    * @default 'all'
    */
  var mode: js.UndefOr[all | first | uniform | tuple] = js.undefined
}

object Mode {
  @scala.inline
  def apply(mode: all | first | uniform | tuple = null): Mode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}


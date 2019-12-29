package typings.toDashJsonDashSchema

import typings.toDashJsonDashSchema.toDashJsonDashSchemaStrings.all
import typings.toDashJsonDashSchema.toDashJsonDashSchemaStrings.first
import typings.toDashJsonDashSchema.toDashJsonDashSchemaStrings.tuple
import typings.toDashJsonDashSchema.toDashJsonDashSchemaStrings.uniform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
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

object Anon_All {
  @scala.inline
  def apply(mode: all | first | uniform | tuple = null): Anon_All = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_All]
  }
}


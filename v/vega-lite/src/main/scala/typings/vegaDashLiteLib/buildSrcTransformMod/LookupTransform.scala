package typings
package vegaDashLiteLib.buildSrcTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupTransform extends Transform {
  /**
    * The field or fields for storing the computed formula value.
    * If `from.fields` is specified, the transform will use the same names for `as`.
    * If `from.fields` is not specified, `as` has to be a string and we put the whole object into the data under the specified name.
    */
  var as: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  /**
    * The default value to use if lookup fails.
    *
    * __Default value:__ `null`
    */
  var default: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Secondary data reference.
    */
  var from: LookupData
  /**
    * Key in primary data source.
    */
  var lookup: java.lang.String
}

object LookupTransform {
  @scala.inline
  def apply(
    from: LookupData,
    lookup: java.lang.String,
    as: java.lang.String | js.Array[java.lang.String] = null,
    default: java.lang.String = null
  ): LookupTransform = {
    val __obj = js.Dynamic.literal(from = from, lookup = lookup)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default)
    __obj.asInstanceOf[LookupTransform]
  }
}


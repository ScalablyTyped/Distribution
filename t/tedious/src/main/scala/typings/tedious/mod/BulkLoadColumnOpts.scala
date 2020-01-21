package typings.tedious.mod

import typings.tedious.tediousStrings.max
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkLoadColumnOpts extends ParameterOptions {
  //  Indicates whether the column accepts NULL values.
  var nullable: Boolean
  //  If the name of the column is different from the name of the property found on rowObj arguments passed to , then you can use this option to specify the property name.
  var objName: js.UndefOr[String] = js.undefined
}

object BulkLoadColumnOpts {
  @scala.inline
  def apply(
    nullable: Boolean,
    length: Double | max = null,
    objName: String = null,
    precision: Int | Double = null,
    scale: Int | Double = null
  ): BulkLoadColumnOpts = {
    val __obj = js.Dynamic.literal(nullable = nullable.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (objName != null) __obj.updateDynamic("objName")(objName.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkLoadColumnOpts]
  }
}


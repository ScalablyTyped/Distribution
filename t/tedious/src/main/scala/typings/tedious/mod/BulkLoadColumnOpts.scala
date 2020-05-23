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
    precision: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined
  ): BulkLoadColumnOpts = {
    val __obj = js.Dynamic.literal(nullable = nullable.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (objName != null) __obj.updateDynamic("objName")(objName.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkLoadColumnOpts]
  }
}


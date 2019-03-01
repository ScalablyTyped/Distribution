package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulkLoadColumnOpts extends ParameterOptions {
  //  Indicates whether the column accepts NULL values.
  var nullable: scala.Boolean
  //  If the name of the column is different from the name of the property found on rowObj arguments passed to , then you can use this option to specify the property name.
  var objName: js.UndefOr[java.lang.String] = js.undefined
}

object BulkLoadColumnOpts {
  @scala.inline
  def apply(
    nullable: scala.Boolean,
    length: scala.Double | tediousLib.tediousLibStrings.max = null,
    objName: java.lang.String = null,
    precision: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null
  ): BulkLoadColumnOpts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nullable")(nullable)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (objName != null) __obj.updateDynamic("objName")(objName)
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkLoadColumnOpts]
  }
}


package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FamilySizeWeight extends js.Object {
  var family: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object Anon_FamilySizeWeight {
  @scala.inline
  def apply(
    family: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    weight: scala.Int | scala.Double = null
  ): Anon_FamilySizeWeight = {
    val __obj = js.Dynamic.literal()
    if (family != null) __obj.updateDynamic("family")(family)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FamilySizeWeight]
  }
}


package typings.uifabricStyling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@uifabric/styling.@uifabric/styling/lib/interfaces/ISpacing.ISpacing> */
trait PartialISpacing extends js.Object {
  var l1: js.UndefOr[String] = js.undefined
  var l2: js.UndefOr[String] = js.undefined
  var m: js.UndefOr[String] = js.undefined
  var s1: js.UndefOr[String] = js.undefined
  var s2: js.UndefOr[String] = js.undefined
}

object PartialISpacing {
  @scala.inline
  def apply(l1: String = null, l2: String = null, m: String = null, s1: String = null, s2: String = null): PartialISpacing = {
    val __obj = js.Dynamic.literal()
    if (l1 != null) __obj.updateDynamic("l1")(l1.asInstanceOf[js.Any])
    if (l2 != null) __obj.updateDynamic("l2")(l2.asInstanceOf[js.Any])
    if (m != null) __obj.updateDynamic("m")(m.asInstanceOf[js.Any])
    if (s1 != null) __obj.updateDynamic("s1")(s1.asInstanceOf[js.Any])
    if (s2 != null) __obj.updateDynamic("s2")(s2.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialISpacing]
  }
}


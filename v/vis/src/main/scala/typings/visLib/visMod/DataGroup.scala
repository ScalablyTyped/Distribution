package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataGroup extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var content: java.lang.String
  var id: IdType
  var nestedGroups: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var options: js.UndefOr[DataGroupOptions] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
  var subgroupOrder: js.UndefOr[java.lang.String | js.Function0[scala.Unit]] = js.undefined
  var subgroupStack: js.UndefOr[SubGroupStackOptions | scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}


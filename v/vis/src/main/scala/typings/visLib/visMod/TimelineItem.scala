package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineItem extends js.Object {
  var align: js.UndefOr[TimelineAlignType] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var content: java.lang.String
  var editable: js.UndefOr[TimelineItemEditableType] = js.undefined
  var end: js.UndefOr[DateType] = js.undefined
  var group: js.UndefOr[IdType] = js.undefined
  var id: IdType
  var start: DateType
  var style: js.UndefOr[java.lang.String] = js.undefined
  var subgroup: js.UndefOr[IdType] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[TimelineItemType] = js.undefined
}


package typings.table.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinStruct extends js.Object {
  var bodyJoin: js.UndefOr[String] = js.undefined
  var bodyLeft: js.UndefOr[String] = js.undefined
  var bodyRight: js.UndefOr[String] = js.undefined
  var bottomBody: js.UndefOr[String] = js.undefined
  var bottomJoin: js.UndefOr[String] = js.undefined
  var bottomLeft: js.UndefOr[String] = js.undefined
  var bottomRight: js.UndefOr[String] = js.undefined
  var joinBody: js.UndefOr[String] = js.undefined
  var joinJoin: js.UndefOr[String] = js.undefined
  var joinLeft: js.UndefOr[String] = js.undefined
  var joinRight: js.UndefOr[String] = js.undefined
  var topBody: js.UndefOr[String] = js.undefined
  var topJoin: js.UndefOr[String] = js.undefined
  var topLeft: js.UndefOr[String] = js.undefined
  var topRight: js.UndefOr[String] = js.undefined
}

object JoinStruct {
  @scala.inline
  def apply(
    bodyJoin: String = null,
    bodyLeft: String = null,
    bodyRight: String = null,
    bottomBody: String = null,
    bottomJoin: String = null,
    bottomLeft: String = null,
    bottomRight: String = null,
    joinBody: String = null,
    joinJoin: String = null,
    joinLeft: String = null,
    joinRight: String = null,
    topBody: String = null,
    topJoin: String = null,
    topLeft: String = null,
    topRight: String = null
  ): JoinStruct = {
    val __obj = js.Dynamic.literal()
    if (bodyJoin != null) __obj.updateDynamic("bodyJoin")(bodyJoin)
    if (bodyLeft != null) __obj.updateDynamic("bodyLeft")(bodyLeft)
    if (bodyRight != null) __obj.updateDynamic("bodyRight")(bodyRight)
    if (bottomBody != null) __obj.updateDynamic("bottomBody")(bottomBody)
    if (bottomJoin != null) __obj.updateDynamic("bottomJoin")(bottomJoin)
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft)
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight)
    if (joinBody != null) __obj.updateDynamic("joinBody")(joinBody)
    if (joinJoin != null) __obj.updateDynamic("joinJoin")(joinJoin)
    if (joinLeft != null) __obj.updateDynamic("joinLeft")(joinLeft)
    if (joinRight != null) __obj.updateDynamic("joinRight")(joinRight)
    if (topBody != null) __obj.updateDynamic("topBody")(topBody)
    if (topJoin != null) __obj.updateDynamic("topJoin")(topJoin)
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft)
    if (topRight != null) __obj.updateDynamic("topRight")(topRight)
    __obj.asInstanceOf[JoinStruct]
  }
}


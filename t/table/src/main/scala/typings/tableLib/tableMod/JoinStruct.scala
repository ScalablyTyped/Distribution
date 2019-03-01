package typings
package tableLib.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JoinStruct extends js.Object {
  var bodyJoin: js.UndefOr[java.lang.String] = js.undefined
  var bodyLeft: js.UndefOr[java.lang.String] = js.undefined
  var bodyRight: js.UndefOr[java.lang.String] = js.undefined
  var bottomBody: js.UndefOr[java.lang.String] = js.undefined
  var bottomJoin: js.UndefOr[java.lang.String] = js.undefined
  var bottomLeft: js.UndefOr[java.lang.String] = js.undefined
  var bottomRight: js.UndefOr[java.lang.String] = js.undefined
  var joinBody: js.UndefOr[java.lang.String] = js.undefined
  var joinJoin: js.UndefOr[java.lang.String] = js.undefined
  var joinLeft: js.UndefOr[java.lang.String] = js.undefined
  var joinRight: js.UndefOr[java.lang.String] = js.undefined
  var topBody: js.UndefOr[java.lang.String] = js.undefined
  var topJoin: js.UndefOr[java.lang.String] = js.undefined
  var topLeft: js.UndefOr[java.lang.String] = js.undefined
  var topRight: js.UndefOr[java.lang.String] = js.undefined
}

object JoinStruct {
  @scala.inline
  def apply(
    bodyJoin: java.lang.String = null,
    bodyLeft: java.lang.String = null,
    bodyRight: java.lang.String = null,
    bottomBody: java.lang.String = null,
    bottomJoin: java.lang.String = null,
    bottomLeft: java.lang.String = null,
    bottomRight: java.lang.String = null,
    joinBody: java.lang.String = null,
    joinJoin: java.lang.String = null,
    joinLeft: java.lang.String = null,
    joinRight: java.lang.String = null,
    topBody: java.lang.String = null,
    topJoin: java.lang.String = null,
    topLeft: java.lang.String = null,
    topRight: java.lang.String = null
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


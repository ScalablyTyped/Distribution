package typings.swaggerStats

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClass extends js.Object {
  var `class`: String
  var clength: js.UndefOr[Double] = js.undefined
  var code: String
  var headers: js.UndefOr[OutgoingHttpHeaders] = js.undefined
  var phrase: String
}

object AnonClass {
  @scala.inline
  def apply(
    `class`: String,
    code: String,
    phrase: String,
    clength: Int | Double = null,
    headers: OutgoingHttpHeaders = null
  ): AnonClass = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], phrase = phrase.asInstanceOf[js.Any])
    __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (clength != null) __obj.updateDynamic("clength")(clength.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClass]
  }
}


package typings.typescriptServices.TypeScript.Services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpanInfo extends js.Object {
  var limChar: Double
  var minChar: Double
  var text: String
}

object SpanInfo {
  @scala.inline
  def apply(limChar: Double, minChar: Double, text: String): SpanInfo = {
    val __obj = js.Dynamic.literal(limChar = limChar.asInstanceOf[js.Any], minChar = minChar.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpanInfo]
  }
}


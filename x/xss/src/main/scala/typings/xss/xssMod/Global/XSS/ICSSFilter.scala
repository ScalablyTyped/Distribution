package typings.xss.xssMod.Global.XSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICSSFilter extends js.Object {
  def process(value: String): String
}

object ICSSFilter {
  @scala.inline
  def apply(process: String => String): ICSSFilter = {
    val __obj = js.Dynamic.literal(process = js.Any.fromFunction1(process))
  
    __obj.asInstanceOf[ICSSFilter]
  }
}


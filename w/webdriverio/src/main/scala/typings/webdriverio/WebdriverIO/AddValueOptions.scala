package typings.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddValueOptions extends js.Object {
  var translateToUnicode: Boolean
}

object AddValueOptions {
  @scala.inline
  def apply(translateToUnicode: Boolean): AddValueOptions = {
    val __obj = js.Dynamic.literal(translateToUnicode = translateToUnicode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddValueOptions]
  }
}


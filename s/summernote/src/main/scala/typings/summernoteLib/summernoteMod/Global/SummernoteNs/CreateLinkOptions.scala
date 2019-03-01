package typings
package summernoteLib.summernoteMod.Global.SummernoteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLinkOptions extends js.Object {
  var newWindow: scala.Boolean
  var text: java.lang.String
  var url: java.lang.String
}

object CreateLinkOptions {
  @scala.inline
  def apply(newWindow: scala.Boolean, text: java.lang.String, url: java.lang.String): CreateLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newWindow")(newWindow)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CreateLinkOptions]
  }
}


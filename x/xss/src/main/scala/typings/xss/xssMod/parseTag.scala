package typings.xss.xssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xss", "parseTag")
@js.native
object parseTag extends js.Object {
  def apply(
    html: String,
    onTag: js.Function5[
      /* sourcePosition */ Double, 
      /* position */ Double, 
      /* tag */ String, 
      /* html */ String, 
      /* isClosing */ Boolean, 
      String
    ],
    escapeHtml: EscapeHandler
  ): String = js.native
}


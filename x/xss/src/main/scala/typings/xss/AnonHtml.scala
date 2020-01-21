package typings.xss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHtml extends js.Object {
  def onIgnoreTag(tag: String, html: String, options: AnonIsClosing): String
  def remove(html: String): String
}

object AnonHtml {
  @scala.inline
  def apply(onIgnoreTag: (String, String, AnonIsClosing) => String, remove: String => String): AnonHtml = {
    val __obj = js.Dynamic.literal(onIgnoreTag = js.Any.fromFunction3(onIgnoreTag), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[AnonHtml]
  }
}


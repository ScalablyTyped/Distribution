package typings.xss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Html extends js.Object {
  def onIgnoreTag(tag: String, html: String, options: Anon_IsClosing): String
  def remove(html: String): String
}

object Anon_Html {
  @scala.inline
  def apply(onIgnoreTag: (String, String, Anon_IsClosing) => String, remove: String => String): Anon_Html = {
    val __obj = js.Dynamic.literal(onIgnoreTag = js.Any.fromFunction3(onIgnoreTag), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[Anon_Html]
  }
}


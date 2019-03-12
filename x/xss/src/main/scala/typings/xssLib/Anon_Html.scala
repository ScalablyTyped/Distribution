package typings
package xssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Html extends js.Object {
  def onIgnoreTag(tag: java.lang.String, html: java.lang.String, options: Anon_IsClosing): java.lang.String
  def remove(html: java.lang.String): java.lang.String
}

object Anon_Html {
  @scala.inline
  def apply(
    onIgnoreTag: (java.lang.String, java.lang.String, Anon_IsClosing) => java.lang.String,
    remove: java.lang.String => java.lang.String
  ): Anon_Html = {
    val __obj = js.Dynamic.literal(onIgnoreTag = js.Any.fromFunction3(onIgnoreTag), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[Anon_Html]
  }
}


package typings.wordpressApiFetch.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictk
  extends /* k */ StringDictionary[js.Any] {
  var href: String
}

object Dictk {
  @scala.inline
  def apply(href: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictk = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictk]
  }
}


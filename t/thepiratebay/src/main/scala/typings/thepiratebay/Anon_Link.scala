package typings.thepiratebay

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Link
  extends /* propName */ StringDictionary[js.Any] {
  var link: String
}

object Anon_Link {
  @scala.inline
  def apply(link: String, StringDictionary: /* propName */ StringDictionary[js.Any] = null): Anon_Link = {
    val __obj = js.Dynamic.literal(link = link)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Link]
  }
}


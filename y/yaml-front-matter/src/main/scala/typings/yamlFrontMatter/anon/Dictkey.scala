package typings.yamlFrontMatter.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  val __content: String
}

object Dictkey {
  @scala.inline
  def apply(__content: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictkey = {
    val __obj = js.Dynamic.literal(__content = __content.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}


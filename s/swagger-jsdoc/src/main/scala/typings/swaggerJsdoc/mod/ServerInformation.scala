package typings.swaggerJsdoc.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInformation
  extends /* key */ StringDictionary[js.Any] {
  var url: String
}

object ServerInformation {
  @scala.inline
  def apply(url: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): ServerInformation = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ServerInformation]
  }
}


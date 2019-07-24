package typings
package swaggerDashJsdocLib.swaggerDashJsdocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInformation
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var url: java.lang.String
}

object ServerInformation {
  @scala.inline
  def apply(
    url: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): ServerInformation = {
    val __obj = js.Dynamic.literal(url = url)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ServerInformation]
  }
}


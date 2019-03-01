package typings
package vueDashResourceLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var headers: js.UndefOr[vueDashResourceLib.vuejsNs.HttpHeaders] = js.undefined
}

object Anon_Headers {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    headers: vueDashResourceLib.vuejsNs.HttpHeaders = null
  ): Anon_Headers = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Anon_Headers]
  }
}


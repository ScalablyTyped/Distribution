package typings.vueResource

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeaders
  extends /* key */ StringDictionary[js.Any] {
  var headers: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpHeaders */ js.Any
  ] = js.undefined
}

object AnonHeaders {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpHeaders */ js.Any = null
  ): AnonHeaders = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeaders]
  }
}


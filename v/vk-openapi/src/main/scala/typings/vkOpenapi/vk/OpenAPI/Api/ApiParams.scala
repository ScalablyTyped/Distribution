package typings.vkOpenapi.vk.OpenAPI.Api

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiParams
  extends /* key */ StringDictionary[js.Any] {
  var v: String
}

object ApiParams {
  @scala.inline
  def apply(v: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): ApiParams = {
    val __obj = js.Dynamic.literal(v = v.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ApiParams]
  }
}


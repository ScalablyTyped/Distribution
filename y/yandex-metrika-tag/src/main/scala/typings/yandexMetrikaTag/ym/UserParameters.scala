package typings.yandexMetrikaTag.ym

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserParameters
  extends /* key */ StringDictionary[js.Any] {
  var UserID: js.UndefOr[Double] = js.undefined
}

object UserParameters {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    UserID: js.UndefOr[Double] = js.undefined
  ): UserParameters = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(UserID)) __obj.updateDynamic("UserID")(UserID.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserParameters]
  }
}


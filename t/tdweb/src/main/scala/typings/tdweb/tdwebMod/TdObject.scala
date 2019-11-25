package typings.tdweb.tdwebMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TdObject
  extends /* key */ StringDictionary[
      js.UndefOr[
        TdObject | (js.Array[Boolean | Double | String | TdObject]) | Double | String | Boolean
      ]
    ] {
  var `@extra`: js.UndefOr[String] = js.undefined
  var `@type`: String
}

object TdObject {
  @scala.inline
  def apply(
    `@type`: String,
    `@extra`: String = null,
    StringDictionary: /* key */ StringDictionary[
      js.UndefOr[
        TdObject | (js.Array[Boolean | Double | String | TdObject]) | Double | String | Boolean
      ]
    ] = null
  ): TdObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    if (`@extra` != null) __obj.updateDynamic("@extra")(`@extra`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TdObject]
  }
}


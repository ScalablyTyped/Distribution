package typings
package typeDashFestLib.typeDashFestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonObject
  extends _JsonValue
     with /* key */ org.scalablytyped.runtime.StringDictionary[JsonValue]

object JsonObject {
  @scala.inline
  def apply(StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[JsonValue] = null): JsonObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[JsonObject]
  }
}


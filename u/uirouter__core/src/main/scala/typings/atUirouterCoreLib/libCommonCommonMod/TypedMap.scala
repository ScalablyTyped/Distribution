package typings
package atUirouterCoreLib.libCommonCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedMap[T]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[T]

object TypedMap {
  @scala.inline
  def apply[T](StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[T] = null): TypedMap[T] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[TypedMap[T]]
  }
}


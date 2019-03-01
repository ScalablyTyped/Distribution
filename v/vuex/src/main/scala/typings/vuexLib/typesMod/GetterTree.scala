package typings
package vuexLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetterTree[S, R]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[Getter[S, R]]

object GetterTree {
  @scala.inline
  def apply[S, R](StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[Getter[S, R]] = null): GetterTree[S, R] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[GetterTree[S, R]]
  }
}


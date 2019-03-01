package typings
package vuexLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionTree[S, R]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[Action[S, R]]

object ActionTree {
  @scala.inline
  def apply[S, R](StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[Action[S, R]] = null): ActionTree[S, R] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ActionTree[S, R]]
  }
}


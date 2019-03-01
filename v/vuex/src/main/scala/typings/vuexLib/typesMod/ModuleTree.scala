package typings
package vuexLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleTree[R]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[Module[_, R]]

object ModuleTree {
  @scala.inline
  def apply[R](StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[Module[_, R]] = null): ModuleTree[R] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ModuleTree[R]]
  }
}


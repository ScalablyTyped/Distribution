package typings
package vuexLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationTree[S]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[Mutation[S]]

object MutationTree {
  @scala.inline
  def apply[S](StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[Mutation[S]] = null): MutationTree[S] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[MutationTree[S]]
  }
}


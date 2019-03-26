package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathsMap[TContext, TEvent /* <: EventObject */]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[PathsItem[TContext, TEvent]]

object PathsMap {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[PathsItem[TContext, TEvent]] = null
  ): PathsMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PathsMap[TContext, TEvent]]
  }
}


package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathMap[TContext, TEvent /* <: EventObject */]
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Array[Segment[TContext, TEvent]]]

object PathMap {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Array[Segment[TContext, TEvent]]] = null
  ): PathMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[PathMap[TContext, TEvent]]
  }
}


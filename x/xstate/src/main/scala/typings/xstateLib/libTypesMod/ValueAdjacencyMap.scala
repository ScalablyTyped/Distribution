package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAdjacencyMap[TContext, TEvent /* <: EventObject */]
  extends /* stateId */ org.scalablytyped.runtime.StringDictionary[stdLib.Record[java.lang.String, xstateLib.libStateMod.State[TContext, TEvent]]]

object ValueAdjacencyMap {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    StringDictionary: /* stateId */ org.scalablytyped.runtime.StringDictionary[stdLib.Record[java.lang.String, xstateLib.libStateMod.State[TContext, TEvent]]] = null
  ): ValueAdjacencyMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ValueAdjacencyMap[TContext, TEvent]]
  }
}


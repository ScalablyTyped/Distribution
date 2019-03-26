package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdjacencyMap
  extends /* stateId */ org.scalablytyped.runtime.StringDictionary[stdLib.Record[java.lang.String, TransitionMap]]

object AdjacencyMap {
  @scala.inline
  def apply(
    StringDictionary: /* stateId */ org.scalablytyped.runtime.StringDictionary[stdLib.Record[java.lang.String, TransitionMap]] = null
  ): AdjacencyMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AdjacencyMap]
  }
}


package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Properties extends js.Object {
  var edges: js.Array[java.lang.String]
  var event: js.Array[java.lang.String]
  var nodes: js.Array[java.lang.String]
  var pointer: visLib.Anon_Canvas
  var previousSelection: js.UndefOr[visLib.Anon_EdgesNodes] = js.undefined
}

object Properties {
  @scala.inline
  def apply(
    edges: js.Array[java.lang.String],
    event: js.Array[java.lang.String],
    nodes: js.Array[java.lang.String],
    pointer: visLib.Anon_Canvas,
    previousSelection: visLib.Anon_EdgesNodes = null
  ): Properties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("edges")(edges)
    __obj.updateDynamic("event")(event)
    __obj.updateDynamic("nodes")(nodes)
    __obj.updateDynamic("pointer")(pointer)
    if (previousSelection != null) __obj.updateDynamic("previousSelection")(previousSelection)
    __obj.asInstanceOf[Properties]
  }
}


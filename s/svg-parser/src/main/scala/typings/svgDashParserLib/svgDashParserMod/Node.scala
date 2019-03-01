package typings
package svgDashParserLib.svgDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var attributes: stdLib.Record[java.lang.String, java.lang.String | scala.Double]
  var children: js.Array[Node]
  var metadata: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object Node {
  @scala.inline
  def apply(
    attributes: stdLib.Record[java.lang.String, java.lang.String | scala.Double],
    children: js.Array[Node],
    name: java.lang.String,
    metadata: java.lang.String = null
  ): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("children")(children)
    __obj.updateDynamic("name")(name)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[Node]
  }
}


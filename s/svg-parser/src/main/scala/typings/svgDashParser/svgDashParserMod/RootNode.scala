package typings.svgDashParser.svgDashParserMod

import typings.svgDashParser.svgDashParserStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RootNode extends js.Object {
  var children: js.Array[Node]
  var `type`: root
}

object RootNode {
  @scala.inline
  def apply(children: js.Array[Node], `type`: root): RootNode = {
    val __obj = js.Dynamic.literal(children = children)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RootNode]
  }
}


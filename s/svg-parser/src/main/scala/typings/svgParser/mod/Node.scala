package typings.svgParser.mod

import typings.svgParser.svgParserStrings.element
import typings.svgParser.svgParserStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.svgParser.mod.TextNode
  - typings.svgParser.mod.ElementNode
*/
trait Node extends js.Object
object Node {
  
  @scala.inline
  def TextNode(`type`: text): Node = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  def ElementNode(children: js.Array[Node | String], `type`: element): Node = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

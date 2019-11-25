package typings.vara.varaMod

import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextElements extends js.Object {
  /**
    * Array of svg g elements, each representing a letter
    */
  var characters: js.Array[SVGGElement]
  /**
    * Svg g wrapping the text block
    */
  var container: SVGGElement
}

object TextElements {
  @scala.inline
  def apply(characters: js.Array[SVGGElement], container: SVGGElement): TextElements = {
    val __obj = js.Dynamic.literal(characters = characters.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextElements]
  }
}


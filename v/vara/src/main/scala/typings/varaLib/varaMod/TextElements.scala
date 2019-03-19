package typings
package varaLib.varaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextElements extends js.Object {
  /**
    * Array of svg g elements, each representing a letter
    */
  var characters: js.Array[stdLib.SVGGElement]
  /**
    * Svg g wrapping the text block
    */
  var container: stdLib.SVGGElement
}

object TextElements {
  @scala.inline
  def apply(characters: js.Array[stdLib.SVGGElement], container: stdLib.SVGGElement): TextElements = {
    val __obj = js.Dynamic.literal(characters = characters, container = container)
  
    __obj.asInstanceOf[TextElements]
  }
}


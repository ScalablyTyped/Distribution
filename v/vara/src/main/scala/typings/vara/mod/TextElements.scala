package typings.vara.mod

import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextElements extends js.Object {
  /**
    * Array of svg g elements, each representing a letter
    */
  var characters: js.Array[SVGGElement] = js.native
  /**
    * Svg g wrapping the text block
    */
  var container: SVGGElement = js.native
}

object TextElements {
  @scala.inline
  def apply(characters: js.Array[SVGGElement], container: SVGGElement): TextElements = {
    val __obj = js.Dynamic.literal(characters = characters.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextElements]
  }
  @scala.inline
  implicit class TextElementsOps[Self <: TextElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCharactersVarargs(value: SVGGElement*): Self = this.set("characters", js.Array(value :_*))
    @scala.inline
    def setCharacters(value: js.Array[SVGGElement]): Self = this.set("characters", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: SVGGElement): Self = this.set("container", value.asInstanceOf[js.Any])
  }
  
}


package typings.svgSprite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Generator extends js.Object {
  /**
    * SVG shape ID generator callback
    */
  var generator: js.UndefOr[String | (js.Function1[/* svg */ String, String])] = js.native
  /**
    * File name separator for shape states (e.g. ':hover')
    */
  var pseudo: js.UndefOr[String] = js.native
  /**
    * Separator for directory name traversal
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Whitespace replacement for shape IDs
    */
  var whitespace: js.UndefOr[String] = js.native
}

object Generator {
  @scala.inline
  def apply(): Generator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Generator]
  }
  @scala.inline
  implicit class GeneratorOps[Self <: Generator] (val x: Self) extends AnyVal {
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
    def setGeneratorFunction1(value: /* svg */ String => String): Self = this.set("generator", js.Any.fromFunction1(value))
    @scala.inline
    def setGenerator(value: String | (js.Function1[/* svg */ String, String])): Self = this.set("generator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerator: Self = this.set("generator", js.undefined)
    @scala.inline
    def setPseudo(value: String): Self = this.set("pseudo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePseudo: Self = this.set("pseudo", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setWhitespace(value: String): Self = this.set("whitespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitespace: Self = this.set("whitespace", js.undefined)
  }
  
}


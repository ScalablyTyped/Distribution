package typings.toMarkdown.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Converter extends js.Object {
  var filter: Filter = js.native
  def replacement(innerHTML: String, node: HTMLElement): String = js.native
}

object Converter {
  @scala.inline
  def apply(filter: Filter, replacement: (String, HTMLElement) => String): Converter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], replacement = js.Any.fromFunction2(replacement))
    __obj.asInstanceOf[Converter]
  }
  @scala.inline
  implicit class ConverterOps[Self <: Converter] (val x: Self) extends AnyVal {
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
    def setFilterVarargs(value: String*): Self = this.set("filter", js.Array(value :_*))
    @scala.inline
    def setFilterFunction1(value: /* node */ HTMLElement => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setFilter(value: Filter): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacement(value: (String, HTMLElement) => String): Self = this.set("replacement", js.Any.fromFunction2(value))
  }
  
}


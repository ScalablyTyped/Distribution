package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.attribute
import typings.wordpressBlocks.wordpressBlocksStrings.boolean
import typings.wordpressBlocks.wordpressBlocksStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Attribute & {  type :'boolean'} */
@js.native
trait Attributetypeboolean extends js.Object {
  var attribute: String = js.native
  var selector: js.UndefOr[String] = js.native
  var source: attribute = js.native
  var `type`: (js.UndefOr[string | boolean]) with boolean = js.native
}

object Attributetypeboolean {
  @scala.inline
  def apply(attribute: String, source: attribute, `type`: (js.UndefOr[string | boolean]) with boolean): Attributetypeboolean = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributetypeboolean]
  }
  @scala.inline
  implicit class AttributetypebooleanOps[Self <: Attributetypeboolean] (val x: Self) extends AnyVal {
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
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: attribute): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: (js.UndefOr[string | boolean]) with boolean): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
  }
  
}


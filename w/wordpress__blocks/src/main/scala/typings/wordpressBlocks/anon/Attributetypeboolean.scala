package typings.wordpressBlocks.anon

import typings.wordpressBlocks.wordpressBlocksStrings.attribute
import typings.wordpressBlocks.wordpressBlocksStrings.boolean
import typings.wordpressBlocks.wordpressBlocksStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @wordpress/blocks.@wordpress/blocks/api/parser.Schema.Attribute & {  type  :'boolean'} */
trait Attributetypeboolean extends js.Object {
  var attribute: String
  var selector: js.UndefOr[String] = js.undefined
  var source: attribute
  var `type`: js.UndefOr[(string | boolean) with boolean] = js.undefined
}

object Attributetypeboolean {
  @scala.inline
  def apply(
    attribute: String,
    source: attribute,
    selector: String = null,
    `type`: (string | boolean) with boolean = null
  ): Attributetypeboolean = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributetypeboolean]
  }
}


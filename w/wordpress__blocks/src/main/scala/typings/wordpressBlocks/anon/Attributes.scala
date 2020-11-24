package typings.wordpressBlocks.anon

import typings.wordpressBlocks.rawHandlingMod.PhrasingContentSchema
import typings.wordpressBlocks.wordpressBlocksStrings.`type`
import typings.wordpressBlocks.wordpressBlocksStrings.charset
import typings.wordpressBlocks.wordpressBlocksStrings.coords
import typings.wordpressBlocks.wordpressBlocksStrings.download
import typings.wordpressBlocks.wordpressBlocksStrings.hreflang
import typings.wordpressBlocks.wordpressBlocksStrings.name
import typings.wordpressBlocks.wordpressBlocksStrings.ping
import typings.wordpressBlocks.wordpressBlocksStrings.referrerPolicy
import typings.wordpressBlocks.wordpressBlocksStrings.rel
import typings.wordpressBlocks.wordpressBlocksStrings.relList
import typings.wordpressBlocks.wordpressBlocksStrings.rev
import typings.wordpressBlocks.wordpressBlocksStrings.shape
import typings.wordpressBlocks.wordpressBlocksStrings.target
import typings.wordpressBlocks.wordpressBlocksStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends js.Object {
  
  val attributes: js.Array[
    charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`
  ] = js.native
  
  val children: PhrasingContentSchema = js.native
}
object Attributes {
  
  @scala.inline
  def apply(
    attributes: js.Array[
      charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`
    ],
    children: PhrasingContentSchema
  ): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(
      value: (charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`)*
    ): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(
      value: js.Array[
          charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`
        ]
    ): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: PhrasingContentSchema): Self = this.set("children", value.asInstanceOf[js.Any])
  }
}

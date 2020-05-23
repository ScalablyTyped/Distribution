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
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  val attributes: js.Array[
    charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`
  ]
  val children: PhrasingContentSchema
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
}


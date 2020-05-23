package typings.wordpressBlocks.anon

import typings.wordpressBlocks.rawHandlingMod.PhrasingContentSchema
import typings.wordpressBlocks.wordpressBlocksStrings.accessKey
import typings.wordpressBlocks.wordpressBlocksStrings.accessKeyLabel
import typings.wordpressBlocks.wordpressBlocksStrings.autocapitalize
import typings.wordpressBlocks.wordpressBlocksStrings.dir
import typings.wordpressBlocks.wordpressBlocksStrings.draggable
import typings.wordpressBlocks.wordpressBlocksStrings.hidden
import typings.wordpressBlocks.wordpressBlocksStrings.innerText
import typings.wordpressBlocks.wordpressBlocksStrings.lang
import typings.wordpressBlocks.wordpressBlocksStrings.offsetHeight
import typings.wordpressBlocks.wordpressBlocksStrings.offsetLeft
import typings.wordpressBlocks.wordpressBlocksStrings.offsetParent
import typings.wordpressBlocks.wordpressBlocksStrings.offsetTop
import typings.wordpressBlocks.wordpressBlocksStrings.offsetWidth
import typings.wordpressBlocks.wordpressBlocksStrings.spellcheck
import typings.wordpressBlocks.wordpressBlocksStrings.title
import typings.wordpressBlocks.wordpressBlocksStrings.translate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Children extends js.Object {
  val attributes: js.Array[
    accessKey | accessKeyLabel | autocapitalize | dir | draggable | hidden | innerText | lang | offsetHeight | offsetLeft | offsetParent | offsetTop | offsetWidth | spellcheck | title | translate
  ]
  val children: PhrasingContentSchema
}

object Children {
  @scala.inline
  def apply(
    attributes: js.Array[
      accessKey | accessKeyLabel | autocapitalize | dir | draggable | hidden | innerText | lang | offsetHeight | offsetLeft | offsetParent | offsetTop | offsetWidth | spellcheck | title | translate
    ],
    children: PhrasingContentSchema
  ): Children = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
}


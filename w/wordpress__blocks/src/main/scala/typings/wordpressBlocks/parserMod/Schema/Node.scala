package typings.wordpressBlocks.parserMod.Schema

import typings.wordpressBlocks.parserMod.Source
import typings.wordpressBlocks.wordpressBlocksStrings.node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node
  extends Source[js.Any] {
  var selector: js.UndefOr[String] = js.undefined
  var source: node
}

object Node {
  @scala.inline
  def apply(source: node, selector: String = null): Node = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}


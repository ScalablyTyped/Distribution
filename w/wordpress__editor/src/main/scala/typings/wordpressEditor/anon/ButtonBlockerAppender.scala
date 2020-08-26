package typings.wordpressEditor.anon

import typings.react.mod.ComponentType
import typings.react.mod.global.JSX.Element
import typings.wordpressBlockEditor.anon.Children
import typings.wordpressBlockEditor.innerBlocksMod.InnerBlocks.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonBlockerAppender extends js.Object {
  /**
    * display a `+` (plus) icon button that, when clicked, displays the block picker menu. No
    * default Block is inserted.
    */
  var ButtonBlockerAppender: ComponentType[Children] = js.native
  var Content: ComponentType[Children] = js.native
  /**
    * display the default block appender as set by `wp.blocks.setDefaultBlockName`. Typically this
    * is the `paragraph` block.
    */
  var DefaultBlockAppender: ComponentType[Children] = js.native
  def apply(props: Props): Element = js.native
}


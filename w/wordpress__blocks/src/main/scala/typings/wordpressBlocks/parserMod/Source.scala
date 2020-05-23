package typings.wordpressBlocks.parserMod

import typings.wordpressBlocks.wordpressBlocksStrings.attribute
import typings.wordpressBlocks.wordpressBlocksStrings.boolean
import typings.wordpressBlocks.wordpressBlocksStrings.children
import typings.wordpressBlocks.wordpressBlocksStrings.html
import typings.wordpressBlocks.wordpressBlocksStrings.node
import typings.wordpressBlocks.wordpressBlocksStrings.query_
import typings.wordpressBlocks.wordpressBlocksStrings.string
import typings.wordpressBlocks.wordpressBlocksStrings.tag
import typings.wordpressBlocks.wordpressBlocksStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressBlocks.parserMod.Schema.Attribute
  - typings.wordpressBlocks.parserMod.Schema.Children
  - typings.wordpressBlocks.parserMod.Schema.HTML
  - typings.wordpressBlocks.parserMod.Schema.Node
  - typings.wordpressBlocks.parserMod.Schema.Query[T]
  - typings.wordpressBlocks.parserMod.Schema.Tag
  - typings.wordpressBlocks.parserMod.Schema.Text
*/
trait Source[T] extends js.Object

object Source {
  @scala.inline
  def HTML[T](
    source: html,
    multiline: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 120 */ js.Any = null,
    selector: String = null
  ): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (multiline != null) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Text[T](source: text, selector: String = null): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Children[T](source: children, selector: String = null): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Node[T](source: node, selector: String = null): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Attribute[T](attribute: String, source: attribute, selector: String = null, `type`: string | boolean = null): Source[T] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Tag[T](source: tag, selector: String = null): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Query[T](query: T, source: query_, selector: String = null): Source[T] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
}


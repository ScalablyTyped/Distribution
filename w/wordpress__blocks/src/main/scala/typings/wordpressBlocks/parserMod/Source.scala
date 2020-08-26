package typings.wordpressBlocks.parserMod

import typings.wordpressBlocks.wordpressBlocksStrings.attribute
import typings.wordpressBlocks.wordpressBlocksStrings.children
import typings.wordpressBlocks.wordpressBlocksStrings.html
import typings.wordpressBlocks.wordpressBlocksStrings.node
import typings.wordpressBlocks.wordpressBlocksStrings.query_
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
  def HTML[T](source: html): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Text[T](source: text): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Children[T](source: children): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Node[T](source: node): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Attribute[T](attribute: String, source: attribute): Source[T] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Tag[T](source: tag): Source[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
  @scala.inline
  def Query[T](query: T, source: query_): Source[T] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source[T]]
  }
}


package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.TopLevel
import typings.wordpressBlocks.wordpressBlocksStrings.array
import typings.wordpressBlocks.wordpressBlocksStrings.html
import typings.wordpressBlocks.wordpressBlocksStrings.meta
import typings.wordpressBlocks.wordpressBlocksStrings.query_
import typings.wordpressBlocks.wordpressBlocksStrings.string
import typings.wordpressBlocks.wordpressBlocksStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _BlockAttribute[T] extends StObject
object _BlockAttribute {
  
  @scala.inline
  def Children(source: typings.wordpressBlocks.wordpressBlocksStrings.children, `type`: array): typings.wordpressBlocks.mod.AttributeSource.Children = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wordpressBlocks.mod.AttributeSource.Children]
  }
  
  @scala.inline
  def HTML(source: html, `type`: string): typings.wordpressBlocks.mod.AttributeSource.HTML = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wordpressBlocks.mod.AttributeSource.HTML]
  }
  
  @scala.inline
  def Meta(meta: String, source: meta, `type`: string): typings.wordpressBlocks.mod.AttributeSource.Meta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wordpressBlocks.mod.AttributeSource.Meta]
  }
  
  @scala.inline
  def Query[T](
    query: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.Query with TopLevel[js.Any],
    selector: String,
    source: query_,
    `type`: array
  ): typings.wordpressBlocks.mod.AttributeSource.Query[T] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wordpressBlocks.mod.AttributeSource.Query[T]]
  }
  
  @scala.inline
  def Text(source: text, `type`: string): typings.wordpressBlocks.mod.AttributeSource.Text = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.wordpressBlocks.mod.AttributeSource.Text]
  }
}

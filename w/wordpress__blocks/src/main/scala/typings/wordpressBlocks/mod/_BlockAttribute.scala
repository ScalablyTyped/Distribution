package typings.wordpressBlocks.mod

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _BlockAttribute[T] extends StObject
object _BlockAttribute {
  
  @scala.inline
  def Children(): typings.wordpressBlocks.mod.AttributeSource.Children = {
    val __obj = js.Dynamic.literal(source = "children")
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.wordpressBlocks.mod.AttributeSource.Children]
  }
  
  @scala.inline
  def HTML(): typings.wordpressBlocks.mod.AttributeSource.HTML = {
    val __obj = js.Dynamic.literal(source = "html")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.wordpressBlocks.mod.AttributeSource.HTML]
  }
  
  @scala.inline
  def Meta(meta: String): typings.wordpressBlocks.mod.AttributeSource.Meta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], source = "meta")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.wordpressBlocks.mod.AttributeSource.Meta]
  }
  
  @scala.inline
  def Query[T](
    query: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.Query & TopLevel[js.Any],
    selector: String
  ): typings.wordpressBlocks.mod.AttributeSource.Query[T] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], source = "query")
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.wordpressBlocks.mod.AttributeSource.Query[T]]
  }
  
  @scala.inline
  def Text(): typings.wordpressBlocks.mod.AttributeSource.Text = {
    val __obj = js.Dynamic.literal(source = "text")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.wordpressBlocks.mod.AttributeSource.Text]
  }
}

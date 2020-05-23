package typings.wordpressBlocks.mod.AttributeSource

import org.scalablytyped.runtime.TopLevel
import typings.wordpressBlocks.mod._BlockAttribute
import typings.wordpressBlocks.wordpressBlocksStrings.array
import typings.wordpressBlocks.wordpressBlocksStrings.query_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query[T] extends _BlockAttribute[T] {
  var default: js.UndefOr[js.Array[_]] = js.undefined
  var query: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.Query with TopLevel[js.Any]
  var selector: String
  var source: query_
  var `type`: array
}

object Query {
  @scala.inline
  def apply[T](
    query: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.Query with TopLevel[js.Any],
    selector: String,
    source: query_,
    `type`: array,
    default: js.Array[_] = null
  ): Query[T] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query[T]]
  }
}


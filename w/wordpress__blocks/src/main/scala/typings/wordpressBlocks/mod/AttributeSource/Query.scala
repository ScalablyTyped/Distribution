package typings.wordpressBlocks.mod.AttributeSource

import org.scalablytyped.runtime.TopLevel
import typings.wordpressBlocks.mod._BlockAttribute
import typings.wordpressBlocks.wordpressBlocksStrings.array
import typings.wordpressBlocks.wordpressBlocksStrings.query_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Query[T] extends _BlockAttribute[T] {
  
  var default: js.UndefOr[js.Array[_]] = js.native
  
  var query: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.Query with TopLevel[js.Any] = js.native
  
  var selector: String = js.native
  
  var source: query_ = js.native
  
  var `type`: array = js.native
}
object Query {
  
  @scala.inline
  def apply[T](
    query: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
    */ typings.wordpressBlocks.wordpressBlocksStrings.Query with TopLevel[js.Any],
    selector: String,
    source: query_,
    `type`: array
  ): Query[T] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query[T]]
  }
  
  @scala.inline
  implicit class QueryOps[Self <: Query[_], T] (val x: Self with Query[T]) extends AnyVal {
    
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
    def setQuery(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof T ]: @wordpress/blocks.@wordpress/blocks.BlockAttribute<T[k] extends std.Array<infer U>? any : T[k]>}
      */ typings.wordpressBlocks.wordpressBlocksStrings.Query with TopLevel[js.Any]
    ): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: query_): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: array): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultVarargs(value: js.Any*): Self = this.set("default", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: js.Array[_]): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
  }
}

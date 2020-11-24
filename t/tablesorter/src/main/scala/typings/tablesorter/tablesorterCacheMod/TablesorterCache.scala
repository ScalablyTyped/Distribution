package typings.tablesorter.tablesorterCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TablesorterCache extends js.Object {
  
  /**
    * The maximal values of the columns.
    */
  var colMax: js.Array[_] = js.native
  
  /**
    * The normalized data.
    */
  var normalized: js.Array[_] = js.native
}
object TablesorterCache {
  
  @scala.inline
  def apply(colMax: js.Array[_], normalized: js.Array[_]): TablesorterCache = {
    val __obj = js.Dynamic.literal(colMax = colMax.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablesorterCache]
  }
  
  @scala.inline
  implicit class TablesorterCacheOps[Self <: TablesorterCache] (val x: Self) extends AnyVal {
    
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
    def setColMaxVarargs(value: js.Any*): Self = this.set("colMax", js.Array(value :_*))
    
    @scala.inline
    def setColMax(value: js.Array[_]): Self = this.set("colMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedVarargs(value: js.Any*): Self = this.set("normalized", js.Array(value :_*))
    
    @scala.inline
    def setNormalized(value: js.Array[_]): Self = this.set("normalized", value.asInstanceOf[js.Any])
  }
}

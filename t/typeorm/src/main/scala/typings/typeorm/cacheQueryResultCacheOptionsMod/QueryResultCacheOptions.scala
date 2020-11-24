package typings.typeorm.cacheQueryResultCacheOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResultCacheOptions extends js.Object {
  
  /**
    * Duration in milliseconds during which results will be returned from cache.
    */
  var duration: Double = js.native
  
  /**
    * Cache identifier set by user.
    * Can be empty.
    */
  var identifier: String = js.native
  
  /**
    * Cached query.
    */
  var query: String = js.native
  
  /**
    * Query result that will be cached.
    */
  var result: js.UndefOr[js.Any] = js.native
  
  /**
    * Time, when cache was created.
    */
  var time: js.UndefOr[Double] = js.native
}
object QueryResultCacheOptions {
  
  @scala.inline
  def apply(duration: Double, identifier: String, query: String): QueryResultCacheOptions = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResultCacheOptions]
  }
  
  @scala.inline
  implicit class QueryResultCacheOptionsOps[Self <: QueryResultCacheOptions] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setTime(value: Double): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}

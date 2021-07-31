package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object defining a cloud object store bucket to crawl. */
trait SourceOptionsBuckets extends StObject {
  
  /** The number of documents to crawl from this cloud object store bucket. If not specified, all documents in the bucket are crawled. */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** The name of the cloud object store bucket to crawl. */
  var name: String
}
object SourceOptionsBuckets {
  
  @scala.inline
  def apply(name: String): SourceOptionsBuckets = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsBuckets]
  }
  
  @scala.inline
  implicit class SourceOptionsBucketsMutableBuilder[Self <: SourceOptionsBuckets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}

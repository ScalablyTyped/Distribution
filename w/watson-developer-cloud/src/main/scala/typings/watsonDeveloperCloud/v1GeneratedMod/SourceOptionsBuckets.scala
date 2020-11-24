package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object defining a cloud object store bucket to crawl. */
@js.native
trait SourceOptionsBuckets extends js.Object {
  
  /** The number of documents to crawl from this cloud object store bucket. If not specified, all documents in the bucket are crawled. */
  var limit: js.UndefOr[Double] = js.native
  
  /** The name of the cloud object store bucket to crawl. */
  var name: String = js.native
}
object SourceOptionsBuckets {
  
  @scala.inline
  def apply(name: String): SourceOptionsBuckets = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsBuckets]
  }
  
  @scala.inline
  implicit class SourceOptionsBucketsOps[Self <: SourceOptionsBuckets] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
  }
}

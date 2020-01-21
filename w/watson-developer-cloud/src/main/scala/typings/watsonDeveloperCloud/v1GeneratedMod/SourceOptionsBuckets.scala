package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object defining a cloud object store bucket to crawl. */
trait SourceOptionsBuckets extends js.Object {
  /** The number of documents to crawl from this cloud object store bucket. If not specified, all documents in the bucket are crawled. */
  var limit: js.UndefOr[Double] = js.undefined
  /** The name of the cloud object store bucket to crawl. */
  var name: String
}

object SourceOptionsBuckets {
  @scala.inline
  def apply(name: String, limit: Int | Double = null): SourceOptionsBuckets = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsBuckets]
  }
}


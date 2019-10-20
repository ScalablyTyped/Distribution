package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object that defines a Salesforce document object type crawl with this configuration. */
trait SourceOptionsObject extends js.Object {
  /** The maximum number of documents to crawl for this document object. By default, all documents in the document object are crawled. */
  var limit: js.UndefOr[Double] = js.undefined
  /** The name of the Salesforce document object to crawl. For example, `case`. */
  var name: String
}

object SourceOptionsObject {
  @scala.inline
  def apply(name: String, limit: Int | Double = null): SourceOptionsObject = {
    val __obj = js.Dynamic.literal(name = name)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsObject]
  }
}


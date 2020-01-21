package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object that defines a box folder to crawl with this configuration. */
trait SourceOptionsFolder extends js.Object {
  /** The Box folder ID of the folder to crawl. */
  var folder_id: String
  /** The maximum number of documents to crawl for this folder. By default, all documents in the folder are crawled. */
  var limit: js.UndefOr[Double] = js.undefined
  /** The Box user ID of the user who owns the folder to crawl. */
  var owner_user_id: String
}

object SourceOptionsFolder {
  @scala.inline
  def apply(folder_id: String, owner_user_id: String, limit: Int | Double = null): SourceOptionsFolder = {
    val __obj = js.Dynamic.literal(folder_id = folder_id.asInstanceOf[js.Any], owner_user_id = owner_user_id.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceOptionsFolder]
  }
}


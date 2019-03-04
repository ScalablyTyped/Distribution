package typings
package typedDashGithubDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdditionsBloburl extends js.Object {
  var additions: scala.Double
  var blob_url: java.lang.String
  var changes: scala.Double
  var deletions: scala.Double
  var filename: java.lang.String
  var patch: java.lang.String
  var raw_url: java.lang.String
  var status: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.modified
}

object Anon_AdditionsBloburl {
  @scala.inline
  def apply(
    additions: scala.Double,
    blob_url: java.lang.String,
    changes: scala.Double,
    deletions: scala.Double,
    filename: java.lang.String,
    patch: java.lang.String,
    raw_url: java.lang.String,
    status: typedDashGithubDashApiLib.typedDashGithubDashApiLibStrings.modified
  ): Anon_AdditionsBloburl = {
    val __obj = js.Dynamic.literal(additions = additions, blob_url = blob_url, changes = changes, deletions = deletions, filename = filename, patch = patch, raw_url = raw_url, status = status)
  
    __obj.asInstanceOf[Anon_AdditionsBloburl]
  }
}


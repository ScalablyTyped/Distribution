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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("additions")(additions)
    __obj.updateDynamic("blob_url")(blob_url)
    __obj.updateDynamic("changes")(changes)
    __obj.updateDynamic("deletions")(deletions)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("raw_url")(raw_url)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Anon_AdditionsBloburl]
  }
}


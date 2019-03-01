package typings
package twitLib.twitMod.TwitNs.TwitterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults extends js.Object {
  var search_metadata: Metadata
  var statuses: js.Array[Status]
}

object SearchResults {
  @scala.inline
  def apply(search_metadata: Metadata, statuses: js.Array[Status]): SearchResults = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("search_metadata")(search_metadata)
    __obj.updateDynamic("statuses")(statuses)
    __obj.asInstanceOf[SearchResults]
  }
}


package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionQueryResult extends js.Object {
  /**
    * For each filter supplied in the query, a filter result will be returned in the query result.
    */
  var results: js.Array[ExtensionFilterResult]
}

object ExtensionQueryResult {
  @scala.inline
  def apply(results: js.Array[ExtensionFilterResult]): ExtensionQueryResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionQueryResult]
  }
}


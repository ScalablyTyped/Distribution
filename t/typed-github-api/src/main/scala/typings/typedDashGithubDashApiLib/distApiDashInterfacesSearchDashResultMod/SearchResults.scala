package typings
package typedDashGithubDashApiLib.distApiDashInterfacesSearchDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResults[T] extends js.Object {
  var incomplete_results: scala.Boolean
  var items: js.Array[T with SearchResult]
  var total_count: scala.Double
}


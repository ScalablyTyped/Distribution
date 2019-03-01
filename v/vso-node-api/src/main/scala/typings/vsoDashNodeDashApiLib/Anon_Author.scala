package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Author extends js.Object {
  var author: scala.Double
  var averageRating: scala.Double
  var installCount: scala.Double
  var lastUpdatedDate: scala.Double
  var publishedDate: scala.Double
  var publisher: scala.Double
  var releaseDate: scala.Double
  var relevance: scala.Double
  var title: scala.Double
  var trendingDaily: scala.Double
  var trendingMonthly: scala.Double
  var trendingWeekly: scala.Double
  var weightedRating: scala.Double
}

object Anon_Author {
  @scala.inline
  def apply(
    author: scala.Double,
    averageRating: scala.Double,
    installCount: scala.Double,
    lastUpdatedDate: scala.Double,
    publishedDate: scala.Double,
    publisher: scala.Double,
    releaseDate: scala.Double,
    relevance: scala.Double,
    title: scala.Double,
    trendingDaily: scala.Double,
    trendingMonthly: scala.Double,
    trendingWeekly: scala.Double,
    weightedRating: scala.Double
  ): Anon_Author = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("author")(author)
    __obj.updateDynamic("averageRating")(averageRating)
    __obj.updateDynamic("installCount")(installCount)
    __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate)
    __obj.updateDynamic("publishedDate")(publishedDate)
    __obj.updateDynamic("publisher")(publisher)
    __obj.updateDynamic("releaseDate")(releaseDate)
    __obj.updateDynamic("relevance")(relevance)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("trendingDaily")(trendingDaily)
    __obj.updateDynamic("trendingMonthly")(trendingMonthly)
    __obj.updateDynamic("trendingWeekly")(trendingWeekly)
    __obj.updateDynamic("weightedRating")(weightedRating)
    __obj.asInstanceOf[Anon_Author]
  }
}


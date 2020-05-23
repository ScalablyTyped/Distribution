package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Author extends js.Object {
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

object Author {
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
  ): Author = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], averageRating = averageRating.asInstanceOf[js.Any], installCount = installCount.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trendingDaily = trendingDaily.asInstanceOf[js.Any], trendingMonthly = trendingMonthly.asInstanceOf[js.Any], trendingWeekly = trendingWeekly.asInstanceOf[js.Any], weightedRating = weightedRating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Author]
  }
}


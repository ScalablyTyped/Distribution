package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthor extends js.Object {
  var author: Double
  var averageRating: Double
  var installCount: Double
  var lastUpdatedDate: Double
  var publishedDate: Double
  var publisher: Double
  var releaseDate: Double
  var relevance: Double
  var title: Double
  var trendingDaily: Double
  var trendingMonthly: Double
  var trendingWeekly: Double
  var weightedRating: Double
}

object AnonAuthor {
  @scala.inline
  def apply(
    author: Double,
    averageRating: Double,
    installCount: Double,
    lastUpdatedDate: Double,
    publishedDate: Double,
    publisher: Double,
    releaseDate: Double,
    relevance: Double,
    title: Double,
    trendingDaily: Double,
    trendingMonthly: Double,
    trendingWeekly: Double,
    weightedRating: Double
  ): AnonAuthor = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], averageRating = averageRating.asInstanceOf[js.Any], installCount = installCount.asInstanceOf[js.Any], lastUpdatedDate = lastUpdatedDate.asInstanceOf[js.Any], publishedDate = publishedDate.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], releaseDate = releaseDate.asInstanceOf[js.Any], relevance = relevance.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trendingDaily = trendingDaily.asInstanceOf[js.Any], trendingMonthly = trendingMonthly.asInstanceOf[js.Any], trendingWeekly = trendingWeekly.asInstanceOf[js.Any], weightedRating = weightedRating.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuthor]
  }
}


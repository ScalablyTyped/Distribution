package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Author extends js.Object {
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

object Anon_Author {
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
  ): Anon_Author = {
    val __obj = js.Dynamic.literal(author = author, averageRating = averageRating, installCount = installCount, lastUpdatedDate = lastUpdatedDate, publishedDate = publishedDate, publisher = publisher, releaseDate = releaseDate, relevance = relevance, title = title, trendingDaily = trendingDaily, trendingMonthly = trendingMonthly, trendingWeekly = trendingWeekly, weightedRating = weightedRating)
  
    __obj.asInstanceOf[Anon_Author]
  }
}


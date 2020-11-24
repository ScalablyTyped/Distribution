package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Author extends js.Object {
  
  var author: scala.Double = js.native
  
  var averageRating: scala.Double = js.native
  
  var installCount: scala.Double = js.native
  
  var lastUpdatedDate: scala.Double = js.native
  
  var publishedDate: scala.Double = js.native
  
  var publisher: scala.Double = js.native
  
  var releaseDate: scala.Double = js.native
  
  var relevance: scala.Double = js.native
  
  var title: scala.Double = js.native
  
  var trendingDaily: scala.Double = js.native
  
  var trendingMonthly: scala.Double = js.native
  
  var trendingWeekly: scala.Double = js.native
  
  var weightedRating: scala.Double = js.native
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
  
  @scala.inline
  implicit class AuthorOps[Self <: Author] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthor(value: scala.Double): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAverageRating(value: scala.Double): Self = this.set("averageRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallCount(value: scala.Double): Self = this.set("installCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDate(value: scala.Double): Self = this.set("lastUpdatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedDate(value: scala.Double): Self = this.set("publishedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: scala.Double): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseDate(value: scala.Double): Self = this.set("releaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelevance(value: scala.Double): Self = this.set("relevance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: scala.Double): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendingDaily(value: scala.Double): Self = this.set("trendingDaily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendingMonthly(value: scala.Double): Self = this.set("trendingMonthly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrendingWeekly(value: scala.Double): Self = this.set("trendingWeekly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedRating(value: scala.Double): Self = this.set("weightedRating", value.asInstanceOf[js.Any])
  }
}

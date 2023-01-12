package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Author extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: Author] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: scala.Double): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAverageRating(value: scala.Double): Self = StObject.set(x, "averageRating", value.asInstanceOf[js.Any])
    
    inline def setInstallCount(value: scala.Double): Self = StObject.set(x, "installCount", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDate(value: scala.Double): Self = StObject.set(x, "lastUpdatedDate", value.asInstanceOf[js.Any])
    
    inline def setPublishedDate(value: scala.Double): Self = StObject.set(x, "publishedDate", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: scala.Double): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setReleaseDate(value: scala.Double): Self = StObject.set(x, "releaseDate", value.asInstanceOf[js.Any])
    
    inline def setRelevance(value: scala.Double): Self = StObject.set(x, "relevance", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: scala.Double): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTrendingDaily(value: scala.Double): Self = StObject.set(x, "trendingDaily", value.asInstanceOf[js.Any])
    
    inline def setTrendingMonthly(value: scala.Double): Self = StObject.set(x, "trendingMonthly", value.asInstanceOf[js.Any])
    
    inline def setTrendingWeekly(value: scala.Double): Self = StObject.set(x, "trendingWeekly", value.asInstanceOf[js.Any])
    
    inline def setWeightedRating(value: scala.Double): Self = StObject.set(x, "weightedRating", value.asInstanceOf[js.Any])
  }
}

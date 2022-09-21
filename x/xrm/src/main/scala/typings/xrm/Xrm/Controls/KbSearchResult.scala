package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a knowledge base search result.
  */
trait KbSearchResult extends StObject {
  
  /**
    * The HTML markup containing the content of the article.
    */
  var answer: String
  
  /**
    * The article ID that is used as an alternate key.
    * @remarks You can use this to see if this article already exists in Microsoft Dataverse.
    */
  var articleId: String
  
  /**
    * The unique article ID. This value is used as an alternate key.
    */
  var articleUid: String
  
  /**
    * Number of attachments in the article.
    */
  var attachmentCount: Double
  
  /**
    * The date the article was created in the user's current time zone and format.
    */
  var createdOn: js.Date
  
  /**
    * The date the article was or will be expired.
    */
  var expiredDate: js.Date
  
  /**
    * The link to the folder path of the article.
    */
  var folderHref: String
  
  /**
    * The direct link to the article.
    */
  var href: String
  
  /**
    * Indicates whether the article is associated with the parent record.
    */
  var isAssociated: Boolean
  
  /**
    * Date on which the article was last modified in the current user's timezone and format.
    */
  var lastModifiedOn: js.Date
  
  /**
    * Support Portal URL of the article.
    * @remarks If the Portal URL option is turned off, this will be blank.
    */
  var publicUrl: String
  
  /**
    * Whether the Article is in published or draft state.
    */
  var published: Boolean
  
  /**
    * The title of the article.
    */
  var question: String
  
  /**
    * The rating of the article.
    */
  var rating: Double
  
  /**
    * A short snippet of article content which contains the areas where the search query was hit.
    */
  var searchBlurb: String
  
  /**
    * Link to the article. Use this link to open the article.
    */
  var serviceDeskUri: String
  
  /**
    * The number of times an article is viewed on the portal by customers.
    */
  var timesViewed: Double
}
object KbSearchResult {
  
  inline def apply(
    answer: String,
    articleId: String,
    articleUid: String,
    attachmentCount: Double,
    createdOn: js.Date,
    expiredDate: js.Date,
    folderHref: String,
    href: String,
    isAssociated: Boolean,
    lastModifiedOn: js.Date,
    publicUrl: String,
    published: Boolean,
    question: String,
    rating: Double,
    searchBlurb: String,
    serviceDeskUri: String,
    timesViewed: Double
  ): KbSearchResult = {
    val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], articleId = articleId.asInstanceOf[js.Any], articleUid = articleUid.asInstanceOf[js.Any], attachmentCount = attachmentCount.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], expiredDate = expiredDate.asInstanceOf[js.Any], folderHref = folderHref.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], isAssociated = isAssociated.asInstanceOf[js.Any], lastModifiedOn = lastModifiedOn.asInstanceOf[js.Any], publicUrl = publicUrl.asInstanceOf[js.Any], published = published.asInstanceOf[js.Any], question = question.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], searchBlurb = searchBlurb.asInstanceOf[js.Any], serviceDeskUri = serviceDeskUri.asInstanceOf[js.Any], timesViewed = timesViewed.asInstanceOf[js.Any])
    __obj.asInstanceOf[KbSearchResult]
  }
  
  extension [Self <: KbSearchResult](x: Self) {
    
    inline def setAnswer(value: String): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
    
    inline def setArticleId(value: String): Self = StObject.set(x, "articleId", value.asInstanceOf[js.Any])
    
    inline def setArticleUid(value: String): Self = StObject.set(x, "articleUid", value.asInstanceOf[js.Any])
    
    inline def setAttachmentCount(value: Double): Self = StObject.set(x, "attachmentCount", value.asInstanceOf[js.Any])
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setExpiredDate(value: js.Date): Self = StObject.set(x, "expiredDate", value.asInstanceOf[js.Any])
    
    inline def setFolderHref(value: String): Self = StObject.set(x, "folderHref", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setIsAssociated(value: Boolean): Self = StObject.set(x, "isAssociated", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedOn(value: js.Date): Self = StObject.set(x, "lastModifiedOn", value.asInstanceOf[js.Any])
    
    inline def setPublicUrl(value: String): Self = StObject.set(x, "publicUrl", value.asInstanceOf[js.Any])
    
    inline def setPublished(value: Boolean): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setQuestion(value: String): Self = StObject.set(x, "question", value.asInstanceOf[js.Any])
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setSearchBlurb(value: String): Self = StObject.set(x, "searchBlurb", value.asInstanceOf[js.Any])
    
    inline def setServiceDeskUri(value: String): Self = StObject.set(x, "serviceDeskUri", value.asInstanceOf[js.Any])
    
    inline def setTimesViewed(value: Double): Self = StObject.set(x, "timesViewed", value.asInstanceOf[js.Any])
  }
}

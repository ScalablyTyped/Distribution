package typings.twitterText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.twitterText.mod.HashtagWithIndices
  - typings.twitterText.mod.UrlWithIndices
  - typings.twitterText.mod.MentionWithIndices
  - typings.twitterText.mod.MentionOrListWithIndices
  - typings.twitterText.mod.CashtagWithIndices
*/
trait EntityWithIndices extends js.Object

object EntityWithIndices {
  @scala.inline
  def HashtagWithIndices(hashtag: String, indices: js.Tuple2[Double, Double]): EntityWithIndices = {
    val __obj = js.Dynamic.literal(hashtag = hashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityWithIndices]
  }
  @scala.inline
  def MentionWithIndices(indices: js.Tuple2[Double, Double], screenName: String): EntityWithIndices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityWithIndices]
  }
  @scala.inline
  def CashtagWithIndices(cashtag: String, indices: js.Tuple2[Double, Double]): EntityWithIndices = {
    val __obj = js.Dynamic.literal(cashtag = cashtag.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityWithIndices]
  }
  @scala.inline
  def MentionOrListWithIndices(indices: js.Tuple2[Double, Double], listSlug: String, screenName: String): EntityWithIndices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], listSlug = listSlug.asInstanceOf[js.Any], screenName = screenName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityWithIndices]
  }
  @scala.inline
  def UrlWithIndices(indices: js.Tuple2[Double, Double], url: String): EntityWithIndices = {
    val __obj = js.Dynamic.literal(indices = indices.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EntityWithIndices]
  }
}


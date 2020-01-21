package typings.yandexMoneySdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArticle extends js.Object {
  var article: js.Array[AnonMerchantArticleId]
  var bonus: js.Array[AnonSecret]
}

object AnonArticle {
  @scala.inline
  def apply(article: js.Array[AnonMerchantArticleId], bonus: js.Array[AnonSecret]): AnonArticle = {
    val __obj = js.Dynamic.literal(article = article.asInstanceOf[js.Any], bonus = bonus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArticle]
  }
}


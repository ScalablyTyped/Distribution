package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Article extends js.Object {
  var article: js.Array[MerchantArticleId]
  var bonus: js.Array[Secret]
}

object Article {
  @scala.inline
  def apply(article: js.Array[MerchantArticleId], bonus: js.Array[Secret]): Article = {
    val __obj = js.Dynamic.literal(article = article.asInstanceOf[js.Any], bonus = bonus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Article]
  }
}


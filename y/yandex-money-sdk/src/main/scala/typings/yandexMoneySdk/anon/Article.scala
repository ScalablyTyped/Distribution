package typings.yandexMoneySdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Article extends js.Object {
  var article: js.Array[MerchantArticleId] = js.native
  var bonus: js.Array[Secret] = js.native
}

object Article {
  @scala.inline
  def apply(article: js.Array[MerchantArticleId], bonus: js.Array[Secret]): Article = {
    val __obj = js.Dynamic.literal(article = article.asInstanceOf[js.Any], bonus = bonus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Article]
  }
  @scala.inline
  implicit class ArticleOps[Self <: Article] (val x: Self) extends AnyVal {
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
    def setArticleVarargs(value: MerchantArticleId*): Self = this.set("article", js.Array(value :_*))
    @scala.inline
    def setArticle(value: js.Array[MerchantArticleId]): Self = this.set("article", value.asInstanceOf[js.Any])
    @scala.inline
    def setBonusVarargs(value: Secret*): Self = this.set("bonus", js.Array(value :_*))
    @scala.inline
    def setBonus(value: js.Array[Secret]): Self = this.set("bonus", value.asInstanceOf[js.Any])
  }
  
}


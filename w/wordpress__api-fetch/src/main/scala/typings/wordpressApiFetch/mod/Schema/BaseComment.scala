package typings.wordpressApiFetch.mod.Schema

import typings.std.Record
import typings.wordpressApiFetch.anon.Dictk
import typings.wordpressApiFetch.wordpressApiFetchStrings.approved
import typings.wordpressApiFetch.wordpressApiFetchStrings.hold
import typings.wordpressApiFetch.wordpressApiFetchStrings.spam
import typings.wordpressApiFetch.wordpressApiFetchStrings.trash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseComment[T /* <: Context */] extends BaseResponse {
  var author: Double
  var author_avatar_urls: Record[Double, String]
  var author_email: String
  var author_ip: String
  var author_name: String
  var author_url: String
  var author_user_agent: String
  var content: Contextual[T, js.Object, js.Object]
  var date: String
  var date_gmt: String
  var id: Double
  var link: String
  var meta: js.Array[_]
  var parent: Double
  var post: Double
  var status: approved | hold | spam | trash
  var `type`: String
}

object BaseComment {
  @scala.inline
  def apply[T](
    _links: Record[String, js.Array[Dictk]],
    author: Double,
    author_avatar_urls: Record[Double, String],
    author_email: String,
    author_ip: String,
    author_name: String,
    author_url: String,
    author_user_agent: String,
    content: Contextual[T, js.Object, js.Object],
    date: String,
    date_gmt: String,
    id: Double,
    link: String,
    meta: js.Array[_],
    parent: Double,
    post: Double,
    status: approved | hold | spam | trash,
    `type`: String,
    _embedded: Record[String, js.Array[_]] = null
  ): BaseComment[T] = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], author_avatar_urls = author_avatar_urls.asInstanceOf[js.Any], author_email = author_email.asInstanceOf[js.Any], author_ip = author_ip.asInstanceOf[js.Any], author_name = author_name.asInstanceOf[js.Any], author_url = author_url.asInstanceOf[js.Any], author_user_agent = author_user_agent.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], date_gmt = date_gmt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_embedded != null) __obj.updateDynamic("_embedded")(_embedded.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseComment[T]]
  }
}


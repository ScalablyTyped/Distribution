package typings.wordpressApiFetch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreateposts extends js.Object {
  var create_posts: String
  var delete_others_posts: String
  var delete_post: String
  var delete_posts: String
  var delete_private_posts: String
  var delete_published_posts: String
  var edit_others_posts: String
  var edit_post: String
  var edit_posts: String
  var edit_private_posts: String
  var edit_published_posts: String
  var publish_posts: String
  var read: String
  var read_post: String
  var read_private_posts: String
}

object AnonCreateposts {
  @scala.inline
  def apply(
    create_posts: String,
    delete_others_posts: String,
    delete_post: String,
    delete_posts: String,
    delete_private_posts: String,
    delete_published_posts: String,
    edit_others_posts: String,
    edit_post: String,
    edit_posts: String,
    edit_private_posts: String,
    edit_published_posts: String,
    publish_posts: String,
    read: String,
    read_post: String,
    read_private_posts: String
  ): AnonCreateposts = {
    val __obj = js.Dynamic.literal(create_posts = create_posts.asInstanceOf[js.Any], delete_others_posts = delete_others_posts.asInstanceOf[js.Any], delete_post = delete_post.asInstanceOf[js.Any], delete_posts = delete_posts.asInstanceOf[js.Any], delete_private_posts = delete_private_posts.asInstanceOf[js.Any], delete_published_posts = delete_published_posts.asInstanceOf[js.Any], edit_others_posts = edit_others_posts.asInstanceOf[js.Any], edit_post = edit_post.asInstanceOf[js.Any], edit_posts = edit_posts.asInstanceOf[js.Any], edit_private_posts = edit_private_posts.asInstanceOf[js.Any], edit_published_posts = edit_published_posts.asInstanceOf[js.Any], publish_posts = publish_posts.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], read_post = read_post.asInstanceOf[js.Any], read_private_posts = read_private_posts.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCreateposts]
  }
}


package typings.wordpressApiFetch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Createposts extends js.Object {
  
  var create_posts: String = js.native
  
  var delete_others_posts: String = js.native
  
  var delete_post: String = js.native
  
  var delete_posts: String = js.native
  
  var delete_private_posts: String = js.native
  
  var delete_published_posts: String = js.native
  
  var edit_others_posts: String = js.native
  
  var edit_post: String = js.native
  
  var edit_posts: String = js.native
  
  var edit_private_posts: String = js.native
  
  var edit_published_posts: String = js.native
  
  var publish_posts: String = js.native
  
  var read: String = js.native
  
  var read_post: String = js.native
  
  var read_private_posts: String = js.native
}
object Createposts {
  
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
  ): Createposts = {
    val __obj = js.Dynamic.literal(create_posts = create_posts.asInstanceOf[js.Any], delete_others_posts = delete_others_posts.asInstanceOf[js.Any], delete_post = delete_post.asInstanceOf[js.Any], delete_posts = delete_posts.asInstanceOf[js.Any], delete_private_posts = delete_private_posts.asInstanceOf[js.Any], delete_published_posts = delete_published_posts.asInstanceOf[js.Any], edit_others_posts = edit_others_posts.asInstanceOf[js.Any], edit_post = edit_post.asInstanceOf[js.Any], edit_posts = edit_posts.asInstanceOf[js.Any], edit_private_posts = edit_private_posts.asInstanceOf[js.Any], edit_published_posts = edit_published_posts.asInstanceOf[js.Any], publish_posts = publish_posts.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], read_post = read_post.asInstanceOf[js.Any], read_private_posts = read_private_posts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Createposts]
  }
  
  @scala.inline
  implicit class CreatepostsOps[Self <: Createposts] (val x: Self) extends AnyVal {
    
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
    def setCreate_posts(value: String): Self = this.set("create_posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete_others_posts(value: String): Self = this.set("delete_others_posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete_post(value: String): Self = this.set("delete_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete_posts(value: String): Self = this.set("delete_posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete_private_posts(value: String): Self = this.set("delete_private_posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete_published_posts(value: String): Self = this.set("delete_published_posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit_others_posts(value: String): Self = this.set("edit_others_posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit_post(value: String): Self = this.set("edit_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit_posts(value: String): Self = this.set("edit_posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit_private_posts(value: String): Self = this.set("edit_private_posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit_published_posts(value: String): Self = this.set("edit_published_posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublish_posts(value: String): Self = this.set("publish_posts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead(value: String): Self = this.set("read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead_post(value: String): Self = this.set("read_post", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRead_private_posts(value: String): Self = this.set("read_private_posts", value.asInstanceOf[js.Any])
  }
}

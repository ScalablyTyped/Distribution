package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitAnnotatedTag extends js.Object {
  
  /**
    * The tagging Message
    */
  var message: String = js.native
  
  /**
    * The name of the annotated tag.
    */
  var name: String = js.native
  
  /**
    * The objectId (Sha1Id) of the tag.
    */
  var objectId: String = js.native
  
  /**
    * User info and date of tagging.
    */
  var taggedBy: GitUserDate = js.native
  
  /**
    * Tagged git object.
    */
  var taggedObject: GitObject = js.native
  
  var url: String = js.native
}
object GitAnnotatedTag {
  
  @scala.inline
  def apply(
    message: String,
    name: String,
    objectId: String,
    taggedBy: GitUserDate,
    taggedObject: GitObject,
    url: String
  ): GitAnnotatedTag = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any], taggedBy = taggedBy.asInstanceOf[js.Any], taggedObject = taggedObject.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitAnnotatedTag]
  }
  
  @scala.inline
  implicit class GitAnnotatedTagOps[Self <: GitAnnotatedTag] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectId(value: String): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaggedBy(value: GitUserDate): Self = this.set("taggedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaggedObject(value: GitObject): Self = this.set("taggedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitAnnotatedTag extends js.Object {
  /**
    * The tagging Message
    */
  var message: String
  /**
    * The name of the annotated tag.
    */
  var name: String
  /**
    * The objectId (Sha1Id) of the tag.
    */
  var objectId: String
  /**
    * User info and date of tagging.
    */
  var taggedBy: GitUserDate
  /**
    * Tagged git object.
    */
  var taggedObject: GitObject
  var url: String
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
}


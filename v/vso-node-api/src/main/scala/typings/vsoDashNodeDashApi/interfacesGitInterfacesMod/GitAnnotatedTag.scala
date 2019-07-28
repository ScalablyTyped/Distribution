package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
    val __obj = js.Dynamic.literal(message = message, name = name, objectId = objectId, taggedBy = taggedBy, taggedObject = taggedObject, url = url)
  
    __obj.asInstanceOf[GitAnnotatedTag]
  }
}


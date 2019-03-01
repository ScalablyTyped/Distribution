package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitAnnotatedTag extends js.Object {
  /**
    * The tagging Message
    */
  var message: java.lang.String
  /**
    * The name of the annotated tag.
    */
  var name: java.lang.String
  /**
    * The objectId (Sha1Id) of the tag.
    */
  var objectId: java.lang.String
  /**
    * User info and date of tagging.
    */
  var taggedBy: GitUserDate
  /**
    * Tagged git object.
    */
  var taggedObject: GitObject
  var url: java.lang.String
}

object GitAnnotatedTag {
  @scala.inline
  def apply(
    message: java.lang.String,
    name: java.lang.String,
    objectId: java.lang.String,
    taggedBy: GitUserDate,
    taggedObject: GitObject,
    url: java.lang.String
  ): GitAnnotatedTag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("objectId")(objectId)
    __obj.updateDynamic("taggedBy")(taggedBy)
    __obj.updateDynamic("taggedObject")(taggedObject)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitAnnotatedTag]
  }
}


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


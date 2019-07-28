package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitStatusContext extends js.Object {
  /**
    * Genre of the status. Typically name of the service/tool generating the status, can be empty.
    */
  var genre: String
  /**
    * Name identifier of the status, cannot be null or empty.
    */
  var name: String
}

object GitStatusContext {
  @scala.inline
  def apply(genre: String, name: String): GitStatusContext = {
    val __obj = js.Dynamic.literal(genre = genre, name = name)
  
    __obj.asInstanceOf[GitStatusContext]
  }
}


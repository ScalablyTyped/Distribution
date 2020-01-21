package typings.vsoNodeApi.gitInterfacesMod

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
    val __obj = js.Dynamic.literal(genre = genre.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitStatusContext]
  }
}


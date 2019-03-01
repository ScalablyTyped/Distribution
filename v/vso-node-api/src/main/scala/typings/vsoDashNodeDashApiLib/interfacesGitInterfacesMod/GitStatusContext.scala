package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitStatusContext extends js.Object {
  /**
    * Genre of the status. Typically name of the service/tool generating the status, can be empty.
    */
  var genre: java.lang.String
  /**
    * Name identifier of the status, cannot be null or empty.
    */
  var name: java.lang.String
}

object GitStatusContext {
  @scala.inline
  def apply(genre: java.lang.String, name: java.lang.String): GitStatusContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("genre")(genre)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GitStatusContext]
  }
}


package typings.yeomanGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUsername extends js.Object {
  /**
    * Retrieves GitHub's username from the GitHub API
    * @return Resolved with the GitHub username or rejected if unable to
    *         get the information
    */
  def username(): js.Promise[String]
}

object AnonUsername {
  @scala.inline
  def apply(username: () => js.Promise[String]): AnonUsername = {
    val __obj = js.Dynamic.literal(username = js.Any.fromFunction0(username))
  
    __obj.asInstanceOf[AnonUsername]
  }
}


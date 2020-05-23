package typings.yeomanGenerator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Username extends js.Object {
  /**
    * Retrieves GitHub's username from the GitHub API
    * @return Resolved with the GitHub username or rejected if unable to
    *         get the information
    */
  def username(): js.Promise[String]
}

object Username {
  @scala.inline
  def apply(username: () => js.Promise[String]): Username = {
    val __obj = js.Dynamic.literal(username = js.Any.fromFunction0(username))
    __obj.asInstanceOf[Username]
  }
}


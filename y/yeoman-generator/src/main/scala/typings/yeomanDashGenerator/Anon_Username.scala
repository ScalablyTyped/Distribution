package typings.yeomanDashGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Username extends js.Object {
  /**
    * Retrieves GitHub's username from the GitHub API
    * @return Resolved with the GitHub username or rejected if unable to
    *         get the information
    */
  def username(): js.Promise[String]
}

object Anon_Username {
  @scala.inline
  def apply(username: () => js.Promise[String]): Anon_Username = {
    val __obj = js.Dynamic.literal(username = js.Any.fromFunction0(username))
  
    __obj.asInstanceOf[Anon_Username]
  }
}


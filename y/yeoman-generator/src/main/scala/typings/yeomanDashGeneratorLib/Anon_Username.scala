package typings
package yeomanDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Username extends js.Object {
  /**
               * Retrieves GitHub's username from the GitHub API
               * @return Resolved with the GitHub username or rejected if unable to
               *         get the information
               */
  def username(): js.Promise[java.lang.String]
}


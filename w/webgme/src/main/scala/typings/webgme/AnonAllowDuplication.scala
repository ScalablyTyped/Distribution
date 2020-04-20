package typings.webgme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowDuplication extends js.Object {
  /**
    * Enables duplication of entire project with 
    * full history (requires at least mongodb 2.6).
    *   config.seedProjects.allowDuplication = true;
    */
  var allowDuplication: Boolean
  /**
    * List of directories where project seeds are stored.
    *   config.seedProjects.basePaths = ['./seeds'];
    */
  var basePaths: js.Array[String]
  /**
    * Used by the GUI when highlighting/selecting
    * the default project to seed from.
    *   config.seedProjects.defaultProject = 'EmptyProject';
    */
  var defaultProject: String
  /**
    * Enables creation of new projects using seeds.
    *   config.seedProjects.enable = true;
    */
  var enable: Boolean
}

object AnonAllowDuplication {
  @scala.inline
  def apply(allowDuplication: Boolean, basePaths: js.Array[String], defaultProject: String, enable: Boolean): AnonAllowDuplication = {
    val __obj = js.Dynamic.literal(allowDuplication = allowDuplication.asInstanceOf[js.Any], basePaths = basePaths.asInstanceOf[js.Any], defaultProject = defaultProject.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowDuplication]
  }
}


package typings
package webgmeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowDuplication extends js.Object {
  /**
    * Enables duplication of entire project with 
    * full history (requires at least mongodb 2.6).
    *   config.seedProjects.allowDuplication = true;
    */
  var allowDuplication: scala.Boolean
  /**
    * List of directories where project seeds are stored.
    *   config.seedProjects.basePaths = ['./seeds'];
    */
  var basePaths: js.Array[java.lang.String]
  /**
    * Used by the GUI when highlighting/selecting
    * the default project to seed from.
    *   config.seedProjects.defaultProject = 'EmptyProject';
    */
  var defaultProject: java.lang.String
  /**
    * Enables creation of new projects using seeds.
    *   config.seedProjects.enable = true;
    */
  var enable: scala.Boolean
}

object Anon_AllowDuplication {
  @scala.inline
  def apply(
    allowDuplication: scala.Boolean,
    basePaths: js.Array[java.lang.String],
    defaultProject: java.lang.String,
    enable: scala.Boolean
  ): Anon_AllowDuplication = {
    val __obj = js.Dynamic.literal(allowDuplication = allowDuplication, basePaths = basePaths, defaultProject = defaultProject, enable = enable)
  
    __obj.asInstanceOf[Anon_AllowDuplication]
  }
}


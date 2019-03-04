package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentPosition extends js.Object {
  /**
    * The line number of a thread's position. Starts at 1.
    */
  var line: scala.Double
  /**
    * The character offset of a thread's position inside of a line. Starts at 0.
    */
  var offset: scala.Double
}

object CommentPosition {
  @scala.inline
  def apply(line: scala.Double, offset: scala.Double): CommentPosition = {
    val __obj = js.Dynamic.literal(line = line, offset = offset)
  
    __obj.asInstanceOf[CommentPosition]
  }
}


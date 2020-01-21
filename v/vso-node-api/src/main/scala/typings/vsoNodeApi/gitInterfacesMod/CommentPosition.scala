package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentPosition extends js.Object {
  /**
    * The line number of a thread's position. Starts at 1.
    */
  var line: Double
  /**
    * The character offset of a thread's position inside of a line. Starts at 0.
    */
  var offset: Double
}

object CommentPosition {
  @scala.inline
  def apply(line: Double, offset: Double): CommentPosition = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommentPosition]
  }
}


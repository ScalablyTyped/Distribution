package typings.tstl.ipairMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPair[First, Second] extends js.Object {
  /**
    * The first element.
    */
  var first: First
  /**
    * The second element.
    */
  var second: Second
}

object IPair {
  @scala.inline
  def apply[First, Second](first: First, second: Second): IPair[First, Second] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPair[First, Second]]
  }
}


package typings.webgme.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  /** Short description of the constraint. */
  var info: String
  /** Gives instructions on how to deal with violations of the constraint. */
  var priority: Double
  /** The script which checks if the constraint is met. */
  var script: String
}

object Constraint {
  @scala.inline
  def apply(info: String, priority: Double, script: String): Constraint = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraint]
  }
}


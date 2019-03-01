package typings
package webgmeLib.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constraint extends js.Object {
  /** Short description of the constraint. */
  var info: java.lang.String
  /** Gives instructions on how to deal with violations of the constraint. */
  var priority: scala.Double
  /** The script which checks if the constraint is met. */
  var script: java.lang.String
}

object Constraint {
  @scala.inline
  def apply(info: java.lang.String, priority: scala.Double, script: java.lang.String): Constraint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("priority")(priority)
    __obj.updateDynamic("script")(script)
    __obj.asInstanceOf[Constraint]
  }
}


package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a user attribute privilege.
  */
trait Privilege extends js.Object {
  /**
    * True if the user can create.
    */
  var canCreate: scala.Boolean
  /**
    * True if the user can read.
    */
  var canRead: scala.Boolean
  /**
    * True if the user can update.
    */
  var canUpdate: scala.Boolean
}

object Privilege {
  @scala.inline
  def apply(canCreate: scala.Boolean, canRead: scala.Boolean, canUpdate: scala.Boolean): Privilege = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canCreate")(canCreate)
    __obj.updateDynamic("canRead")(canRead)
    __obj.updateDynamic("canUpdate")(canUpdate)
    __obj.asInstanceOf[Privilege]
  }
}


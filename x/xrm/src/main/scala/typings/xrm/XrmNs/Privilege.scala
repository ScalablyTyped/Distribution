package typings.xrm.XrmNs

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
  var canCreate: Boolean
  /**
    * True if the user can read.
    */
  var canRead: Boolean
  /**
    * True if the user can update.
    */
  var canUpdate: Boolean
}

object Privilege {
  @scala.inline
  def apply(canCreate: Boolean, canRead: Boolean, canUpdate: Boolean): Privilege = {
    val __obj = js.Dynamic.literal(canCreate = canCreate, canRead = canRead, canUpdate = canUpdate)
  
    __obj.asInstanceOf[Privilege]
  }
}


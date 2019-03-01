package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a privilege.
  * @deprecated Use {@link Xrm.Privilege} instead.
  */
trait Privilege
  extends xrmLib.XrmNs.Privilege

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


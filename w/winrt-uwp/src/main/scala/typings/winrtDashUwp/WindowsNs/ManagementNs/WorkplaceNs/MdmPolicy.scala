package typings.winrtDashUwp.WindowsNs.ManagementNs.WorkplaceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** MDM (Mobile Device Management) policy. */
@JSGlobal("Windows.Management.Workplace.MdmPolicy")
@js.native
abstract class MdmPolicy () extends js.Object

/* static members */
@JSGlobal("Windows.Management.Workplace.MdmPolicy")
@js.native
object MdmPolicy extends js.Object {
  /**
    * Returns true if a browser is allowed.
    * @return true if a browser is allowed.
    */
  def isBrowserAllowed(): Boolean = js.native
  /**
    * Returns true if a camera is allowed.
    * @return true if a camera is allowed.
    */
  def isCameraAllowed(): Boolean = js.native
  /**
    * Returns true if a Microsoft Account is allowed.
    * @return true if a Microsoft Account is allowed.
    */
  def isMicrosoftAccountAllowed(): Boolean = js.native
  /**
    * Returns true if a Store is allowed.
    * @return true if a Store is allowed.
    */
  def isStoreAllowed(): Boolean = js.native
}


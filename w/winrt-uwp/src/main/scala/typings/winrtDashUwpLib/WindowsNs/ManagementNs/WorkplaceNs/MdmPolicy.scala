package typings
package winrtDashUwpLib.WindowsNs.ManagementNs.WorkplaceNs

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
  def isBrowserAllowed(): scala.Boolean = js.native
  /**
    * Returns true if a camera is allowed.
    * @return true if a camera is allowed.
    */
  def isCameraAllowed(): scala.Boolean = js.native
  /**
    * Returns true if a Microsoft Account is allowed.
    * @return true if a Microsoft Account is allowed.
    */
  def isMicrosoftAccountAllowed(): scala.Boolean = js.native
  /**
    * Returns true if a Store is allowed.
    * @return true if a Store is allowed.
    */
  def isStoreAllowed(): scala.Boolean = js.native
}


package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BackgroundTransferBehavior extends js.Object

/** Defines values used to indicate if downloads and uploads within a BackgroundTransferGroup run in simultaneously or in serial. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferBehavior")
@js.native
object BackgroundTransferBehavior extends js.Object {
  /** Background Transfer operations run simultaneously. */
  @js.native
  sealed trait parallel
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferBehavior
  
  /** Background Transfer operations run in serial. */
  @js.native
  sealed trait serialized
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferBehavior
  
  val parallel: parallel with java.lang.String = js.native
  val serialized: serialized with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs.BackgroundTransferBehavior with java.lang.String
  ] = js.native
}


package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HostMessageMode extends js.Object

@JSImport("ts3-nodejs-library/lib/types/enum", "HostMessageMode")
@js.native
object HostMessageMode extends js.Object {
  /** display message in chatlog */
  @js.native
  sealed trait LOG extends HostMessageMode
  
  /** display message in modal dialog */
  @js.native
  sealed trait MODAL extends HostMessageMode
  
  /** display message in modal dialog and close connection */
  @js.native
  sealed trait MODALQUIT extends HostMessageMode
  
  /** don't display anything */
  @js.native
  sealed trait NONE extends HostMessageMode
  
  /* 1 */ val LOG: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode.LOG with Double = js.native
  /* 2 */ val MODAL: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode.MODAL with Double = js.native
  /* 3 */ val MODALQUIT: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode.MODALQUIT with Double = js.native
  /* 0 */ val NONE: typings.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode.NONE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostMessageMode with Double] = js.native
}


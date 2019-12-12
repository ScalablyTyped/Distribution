package typings.ts3DashNodejsDashLibrary.libTypesEnumMod

import org.scalablytyped.runtime.TopLevel
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode.LOG
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode.MODAL
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode.MODALQUIT
import typings.ts3DashNodejsDashLibrary.libTypesEnumMod.HostMessageMode.NONE
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HostMessageMode with Double] = js.native
  /* 1 */ @js.native
  object LOG extends TopLevel[LOG with Double]
  
  /* 2 */ @js.native
  object MODAL extends TopLevel[MODAL with Double]
  
  /* 3 */ @js.native
  object MODALQUIT extends TopLevel[MODALQUIT with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
}

